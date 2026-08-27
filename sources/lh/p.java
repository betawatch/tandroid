package lh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.gy;
import org.telegram.ui.ib0;
import org.telegram.ui.we1;
import org.telegram.ui.zh1;
import org.telegram.ui.zx;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements org.telegram.ui.ActionBar.a2, ek0, rk0, Utilities.Callback5, yf.r1, CameraController.VideoTakeCallback, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.j1, m3.c, jt, rh.l0, zx, rh.h5, k3.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // m3.c
    public long B(long j10) {
        return ((FlacStreamMetadata) this.b).getSampleNumber(j10);
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean K(gy gyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        p3 p3Var = (p3) this.b;
        ArrayList arrayList = p3Var.U;
        ArrayList arrayList2 = p3Var.d0;
        if (i10 < 2 || p3Var.S == null || !(view instanceof l3)) {
            return false;
        }
        int i11 = i10 - 2;
        if (p3Var.V) {
            if (i11 == 0) {
                return false;
            }
            i11 = i10 - 3;
        } else if (p3Var.W) {
            if (i11 >= 0 && i11 < arrayList.size()) {
                return false;
            }
            i11 -= arrayList.size();
        }
        if (i11 < 0 || i11 >= p3Var.b0.size()) {
            return false;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p3Var.b0.get(i11);
        if (!arrayList2.isEmpty() || p3Var.M) {
            return false;
        }
        if (arrayList2.contains(photoEntry)) {
            arrayList2.remove(photoEntry);
        } else {
            if (arrayList2.size() + 1 > p3Var.N) {
                int i12 = -p3Var.J;
                p3Var.J = i12;
                AndroidUtilities.shakeViewSpring(view, i12);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return true;
            }
            arrayList2.add(photoEntry);
        }
        AndroidUtilities.updateVisibleRows(p3Var.d);
        p3Var.j();
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public void b() {
        ((o1) this.b).invalidate();
    }

    @Override // k3.j
    public void c(k3.k kVar) {
        s4.i iVar = (s4.i) this.b;
        s4.h hVar = (s4.h) kVar;
        hVar.clear();
        iVar.b.add(hVar);
    }

    public void d(int i10) {
        rh.y yVar = (rh.y) this.b;
        yVar.c = i10;
        yVar.f(i10);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 10:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override // rh.l0
    public b70 e(rh.d1 d1Var) {
        return b70.H((rh.x1) ((m5.o) this.b).b, d1Var);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.a) {
            case 0:
                sb sbVar = ((ib) ((s) this.b)).O1;
                hb hbVar = sbVar.T0;
                if (hbVar != null) {
                    hbVar.s(null, null, true);
                }
                va vaVar = sbVar.r1;
                if (vaVar != null) {
                    vaVar.q0();
                }
                ib ibVar = sbVar.Y0;
                if (ibVar != null) {
                    ibVar.setHasRoundVideo(false);
                }
                z7 z7Var = sbVar.G1;
                if (z7Var != null) {
                    File file = z7Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        sbVar.G1.o0 = null;
                    }
                    if (sbVar.G1.p0 != null) {
                        try {
                            new File(sbVar.G1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        sbVar.G1.p0 = null;
                        break;
                    }
                }
                break;
            case 5:
                ((u5) this.b).a.l2.s();
                break;
            case 7:
                ((nh.e) this.b).run();
                break;
            case 8:
                nh.k kVar = (nh.k) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().getInputUser(kVar.L);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(kVar.getParentActivity(), 3, null);
                b2Var2.q(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new nh.b(kVar, b2Var2, 0));
                break;
            case 14:
                ((org.telegram.ui.web.z) this.b).run();
                break;
            case 18:
                qf.n1 n1Var = ((qf.g1) this.b).a;
                i11 = ((org.telegram.ui.ActionBar.n2) n1Var).currentAccount;
                qf.q1 f10 = qf.q1.f(i11);
                ArrayList arrayList = n1Var.b;
                int i12 = f10.a;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i13)).intValue()) == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        qf.p1 c10 = f10.c(((Integer) arrayList.get(i14)).intValue());
                        f10.b.remove(c10);
                        f10.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new jh.m5(20));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i12).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i12).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f10.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    messagesStorage.getStorageQueue().postRunnable(new w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                qf.n1.X(n1Var);
                break;
            default:
                ((cg.c) this.b).run();
                break;
        }
    }

    @Override // yf.r1
    public void g() {
        va vaVar = (va) this.b;
        TextView textView = vaVar.k1;
        boolean a2 = vaVar.z0.a();
        ImageView imageView = vaVar.j1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.Components.jt
    public void k1() {
        switch (this.a) {
            case 21:
                rh.q0 q0Var = (rh.q0) this.b;
                rh.d1 d1Var = q0Var.d;
                rh.a aVar = q0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = d1Var.A;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = rh.v5.f(d1Var.getText());
                    }
                }
                rh.x2 x2Var = q0Var.h;
                if (x2Var != null && q0Var.f != null) {
                    rh.p3.O1(x2Var.a);
                    break;
                }
                break;
            case 26:
                ((rh.y4) this.b).h();
                break;
            default:
                rh.g5 g5Var = (rh.g5) this.b;
                rh.a aVar2 = g5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = g5Var.r.A;
                }
                g5Var.u();
                rh.w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.a != null) {
                    rh.p3.O1(w2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        oa oaVar = (oa) this.b;
        sb sbVar = oaVar.a;
        y6 y6Var = sbVar.K0;
        int i10 = sbVar.c;
        if (y6Var != null) {
            y6Var.g(true);
        }
        if (sbVar.q0()) {
            sbVar.s.d();
        }
        if (sbVar.C1 == null || sbVar.x0 == null) {
            return;
        }
        sbVar.M1 = false;
        sbVar.N1 = false;
        u6 u6Var = sbVar.y0;
        if (u6Var != null) {
            u6Var.c(false);
        }
        if (j10 <= 800) {
            sbVar.h(false, true);
            sbVar.d0(false);
            sbVar.F0.b(false, true);
            y6 y6Var2 = sbVar.K0;
            if (y6Var2 != null) {
                y6Var2.g(true);
            }
            try {
                sbVar.C1.delete();
                sbVar.C1 = null;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        sbVar.i0(false, true);
        z7 o10 = z7.o(sbVar.C1, str, j10);
        o10.J0 = sbVar.r0;
        o10.K0 = sbVar.s0;
        o10.B();
        sbVar.h(false, true);
        sbVar.d0(false);
        sbVar.F0.b(false, true);
        y6 y6Var3 = sbVar.K0;
        if (y6Var3 != null) {
            y6Var3.g(true);
        }
        if (!sbVar.w0.j()) {
            sbVar.G1 = o10;
            r9.a(i10, o10);
            sbVar.H1 = false;
            int videoWidth = sbVar.x0.getVideoWidth();
            int videoHeight = sbVar.x0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                z7 z7Var = sbVar.G1;
                z7Var.k0 = videoWidth;
                z7Var.l0 = videoHeight;
                z7Var.A();
            }
            sbVar.L(new ma(oaVar, 3), 0L);
            return;
        }
        sbVar.C1 = null;
        o10.P = 1.0f;
        if (sbVar.w0.l(o10)) {
            z7 a2 = z7.a(sbVar.w0.getLayout(), sbVar.w0.getContent());
            sbVar.G1 = a2;
            r9.a(i10, a2);
            sbVar.H1 = false;
            int videoWidth2 = sbVar.x0.getVideoWidth();
            int videoHeight2 = sbVar.x0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                z7 z7Var2 = sbVar.G1;
                z7Var2.k0 = videoWidth2;
                z7Var2.l0 = videoHeight2;
                z7Var2.A();
            }
        }
        sbVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 3:
                ka kaVar = (ka) this.b;
                n41 n41Var = (n41) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = n41Var.d;
                z7 z7Var = (z7) n41Var.G;
                kaVar.c(false, true);
                sb sbVar = kaVar.K;
                if (z7Var != sbVar.G1 && !sbVar.T1) {
                    sbVar.Z0.setSelected(i11);
                    sbVar.T1 = true;
                    cg.w1 w1Var = new cg.w1(sbVar, i11, 11);
                    va vaVar = sbVar.r1;
                    z7 z7Var2 = sbVar.G1;
                    if (vaVar != null && z7Var2 != null) {
                        if (vaVar.u0()) {
                            z7Var2.f();
                            Utilities.searchQueue.postRunnable(new v9(sbVar, vaVar, z7Var2.i0, z7Var2.j0, z7Var2, vaVar.K0.getPainting().E, vaVar.u0(), w1Var, 0));
                            break;
                        } else {
                            w1Var.run();
                            break;
                        }
                    } else {
                        w1Var.run();
                        break;
                    }
                }
                break;
            case 9:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((nh.p4) this.b).V((n41) obj);
                break;
            case 16:
                qf.y0 y0Var = (qf.y0) this.b;
                n41 n41Var2 = (n41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = n41Var2.d;
                if (i12 == -1) {
                    boolean z10 = !y0Var.e;
                    y0Var.e = z10;
                    ((org.telegram.ui.Cells.p8) view).setChecked(z10);
                    y0Var.a.U2.N(true);
                    y0Var.Y(true);
                    break;
                } else if (i12 == -2) {
                    qf.s1 s1Var = new qf.s1(null);
                    s1Var.n = y0Var.r;
                    s1Var.c = new ib0(19, y0Var, view);
                    y0Var.presentFragment(s1Var);
                    break;
                } else if (n41Var2.a == 5 && i12 >= 0 && i12 < y0Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i13 = (n41Var2.d + 6) % 7;
                        int i14 = 0;
                        for (int i15 = 0; i15 < y0Var.h[i13].size(); i15++) {
                            if (((qf.x0) y0Var.h[i13].get(i15)).b > i14) {
                                i14 = ((qf.x0) y0Var.h[i13].get(i15)).b;
                            }
                        }
                        int max = Math.max(0, i14 - 1439);
                        int i16 = (n41Var2.d + 1) % 7;
                        int i17 = 1440;
                        for (int i18 = 0; i18 < y0Var.h[i16].size(); i18++) {
                            if (((qf.x0) y0Var.h[i16].get(i18)).a < i17) {
                                i17 = ((qf.x0) y0Var.h[i16].get(i18)).a;
                            }
                        }
                        int i19 = i17 + 1439;
                        CharSequence charSequence = n41Var2.l;
                        ArrayList arrayList = y0Var.h[n41Var2.d];
                        int i20 = 0;
                        for (int i21 = 0; i21 < 7; i21++) {
                            ArrayList arrayList2 = y0Var.h[i21];
                            if (arrayList2 != null) {
                                i20 = Math.max(1, arrayList2.size()) + i20;
                            }
                        }
                        qf.a1 a1Var = new qf.a1(charSequence, arrayList, max, i19, 28 - i20);
                        a1Var.f = new qf.b(y0Var, 5);
                        a1Var.h = new zh1(21, y0Var, n41Var2);
                        y0Var.presentFragment(a1Var);
                        break;
                    } else {
                        if (y0Var.h[n41Var2.d].isEmpty()) {
                            ((org.telegram.ui.Cells.g5) view).setChecked(true);
                            y0Var.h[n41Var2.d].add(new qf.x0(0, 1439));
                            y0Var.X(n41Var2.d);
                        } else {
                            y0Var.h[n41Var2.d].clear();
                            ((org.telegram.ui.Cells.g5) view).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.g5) view).setValue(qf.y0.a0(y0Var.h[n41Var2.d]));
                        y0Var.Y(true);
                        break;
                    }
                }
                break;
            case 17:
                final qf.a1 a1Var2 = (qf.a1) this.b;
                n41 n41Var3 = (n41) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = a1Var2.c;
                int i23 = a1Var2.d;
                ArrayList arrayList3 = a1Var2.b;
                int i24 = n41Var3.d;
                if (i24 == -1) {
                    a1Var2.r = !a1Var2.r;
                    arrayList3.clear();
                    if (a1Var2.r) {
                        arrayList3.add(new qf.x0(0, 1439));
                    }
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view2;
                    boolean z11 = a1Var2.r;
                    n41Var3.e = z11;
                    p8Var.setChecked(z11);
                    boolean z12 = a1Var2.r;
                    p8Var.b(org.telegram.ui.ActionBar.g6.w0(null, z12 ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6, false), z12);
                    a1Var2.n.U2.N(true);
                    qf.b bVar = a1Var2.f;
                    if (bVar != null) {
                        bVar.run();
                        break;
                    }
                } else if (i24 == -2) {
                    if (arrayList3.isEmpty() || a1Var2.U()) {
                        if (a1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new qf.x0(clamp, Utilities.clamp(1200, i23, clamp + 1)));
                    } else {
                        int i25 = ((qf.x0) i0.a.i(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new qf.x0(clamp2, Utilities.clamp((i25 + 1560) / 2, i23, clamp2 + 1)));
                    }
                    qf.b bVar2 = a1Var2.f;
                    if (bVar2 != null) {
                        bVar2.run();
                    }
                    a1Var2.n.U2.N(true);
                    break;
                } else if (n41Var3.a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    qf.x0 x0Var = i26 >= 0 ? (qf.x0) arrayList3.get(i26) : null;
                    final qf.x0 x0Var2 = (qf.x0) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    qf.x0 x0Var3 = i27 < arrayList3.size() ? (qf.x0) arrayList3.get(i27) : null;
                    int i28 = n41Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = a1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = x0Var2.a;
                        if (x0Var != null) {
                            i22 = x0Var.b + 1;
                        }
                        final int i30 = 0;
                        org.telegram.ui.Components.y4.X(parentActivity, string, i29, i22, x0Var2.b - 1, new Utilities.Callback() { // from class: qf.z0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i30) {
                                    case 0:
                                        a1 a1Var3 = a1Var2;
                                        boolean V = a1Var3.V();
                                        l8 l8Var = (l8) view2;
                                        int intValue = num.intValue();
                                        x0Var2.a = intValue;
                                        l8Var.u(x0.a(intValue), true);
                                        if (V != a1Var3.V()) {
                                            a1Var3.n.U2.N(true);
                                        }
                                        b bVar3 = a1Var3.f;
                                        if (bVar3 != null) {
                                            bVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        a1 a1Var4 = a1Var2;
                                        boolean V2 = a1Var4.V();
                                        l8 l8Var2 = (l8) view2;
                                        int intValue2 = num.intValue();
                                        x0Var2.b = intValue2;
                                        l8Var2.u(x0.a(intValue2), true);
                                        if (V2 != a1Var4.V()) {
                                            a1Var4.n.U2.N(true);
                                        }
                                        b bVar4 = a1Var4.f;
                                        if (bVar4 != null) {
                                            bVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = a1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i31 = x0Var2.b;
                        int i32 = x0Var2.a + 1;
                        if (x0Var3 != null) {
                            i23 = x0Var3.a - 1;
                        }
                        final int i33 = 1;
                        org.telegram.ui.Components.y4.X(parentActivity2, string2, i31, i32, i23, new Utilities.Callback() { // from class: qf.z0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i33) {
                                    case 0:
                                        a1 a1Var3 = a1Var2;
                                        boolean V = a1Var3.V();
                                        l8 l8Var = (l8) view2;
                                        int intValue = num.intValue();
                                        x0Var2.a = intValue;
                                        l8Var.u(x0.a(intValue), true);
                                        if (V != a1Var3.V()) {
                                            a1Var3.n.U2.N(true);
                                        }
                                        b bVar3 = a1Var3.f;
                                        if (bVar3 != null) {
                                            bVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        a1 a1Var4 = a1Var2;
                                        boolean V2 = a1Var4.V();
                                        l8 l8Var2 = (l8) view2;
                                        int intValue2 = num.intValue();
                                        x0Var2.b = intValue2;
                                        l8Var2.u(x0.a(intValue2), true);
                                        if (V2 != a1Var4.V()) {
                                            a1Var4.n.U2.N(true);
                                        }
                                        b bVar4 = a1Var4.f;
                                        if (bVar4 != null) {
                                            bVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new qf.x0(0, 1439));
                        }
                        a1Var2.n.U2.N(true);
                        qf.b bVar3 = a1Var2.f;
                        if (bVar3 != null) {
                            bVar3.run();
                            break;
                        }
                    }
                }
                break;
            case 19:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                qf.s1.U((qf.s1) this.b, (n41) obj, (View) obj2);
                break;
            default:
                View view3 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f10 = (Float) obj4;
                Float f11 = (Float) obj5;
                if (((rh.p3[]) this.b)[0] != null) {
                    num.intValue();
                    f10.floatValue();
                    f11.floatValue();
                    if (view3 instanceof rh.t5) {
                        ((rh.t5) view3).B();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.zx
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        rh.a4 a4Var = (rh.a4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        a4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        gyVar.finishFragment();
        return true;
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new r61(3, tVar, bitmap));
    }
}
