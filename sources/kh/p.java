package kh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.File;
import java.util.ArrayList;
import mh.m2;
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
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ai1;
import org.telegram.ui.dy;
import org.telegram.ui.eb0;
import org.telegram.ui.we1;
import org.telegram.ui.wx;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements org.telegram.ui.ActionBar.b2, ck0, ok0, Utilities.Callback5, xf.s1, CameraController.VideoTakeCallback, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.j1, m3.c, kt, qh.l0, wx, qh.g5, k3.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        q3 q3Var = (q3) this.b;
        ArrayList arrayList = q3Var.U;
        ArrayList arrayList2 = q3Var.d0;
        if (i9 < 2 || q3Var.S == null || !(view instanceof m3)) {
            return false;
        }
        int i10 = i9 - 2;
        if (q3Var.V) {
            if (i10 == 0) {
                return false;
            }
            i10 = i9 - 3;
        } else if (q3Var.W) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                return false;
            }
            i10 -= arrayList.size();
        }
        if (i10 < 0 || i10 >= q3Var.b0.size()) {
            return false;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.b0.get(i10);
        if (!arrayList2.isEmpty() || q3Var.M) {
            return false;
        }
        if (arrayList2.contains(photoEntry)) {
            arrayList2.remove(photoEntry);
        } else {
            if (arrayList2.size() + 1 > q3Var.N) {
                int i11 = -q3Var.J;
                q3Var.J = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return true;
            }
            arrayList2.add(photoEntry);
        }
        AndroidUtilities.updateVisibleRows(q3Var.d);
        q3Var.j();
        return true;
    }

    @Override // org.telegram.ui.Components.ck0
    public void b() {
        ((q1) this.b).invalidate();
    }

    @Override // m3.c
    public long c(long j10) {
        return ((FlacStreamMetadata) this.b).getSampleNumber(j10);
    }

    @Override // k3.j
    public void d(k3.k kVar) {
        s4.i iVar = (s4.i) this.b;
        s4.h hVar = (s4.h) kVar;
        hVar.clear();
        iVar.b.add(hVar);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.a) {
            case 10:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.b).lambda$readParams$0(inputSerializedData, i9, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.b).lambda$readParams$0(inputSerializedData, i9, z10);
                return lambda$readParams$02;
        }
    }

    @Override // xf.s1
    public void e() {
        ya yaVar = (ya) this.b;
        TextView textView = yaVar.k1;
        boolean a2 = yaVar.z0.a();
        ImageView imageView = yaVar.j1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        switch (this.a) {
            case 0:
                wb wbVar = ((mb) ((s) this.b)).O1;
                kb kbVar = wbVar.T0;
                if (kbVar != null) {
                    kbVar.s(null, null, true);
                }
                ya yaVar = wbVar.r1;
                if (yaVar != null) {
                    yaVar.q0();
                }
                mb mbVar = wbVar.Y0;
                if (mbVar != null) {
                    mbVar.setHasRoundVideo(false);
                }
                a8 a8Var = wbVar.G1;
                if (a8Var != null) {
                    File file = a8Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        wbVar.G1.o0 = null;
                    }
                    if (wbVar.G1.p0 != null) {
                        try {
                            new File(wbVar.G1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        wbVar.G1.p0 = null;
                        break;
                    }
                }
                break;
            case 5:
                ((v5) this.b).a.l2.r();
                break;
            case 7:
                ((mh.e) this.b).run();
                break;
            case 8:
                mh.l lVar = (mh.l) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.L);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(lVar.getParentActivity(), 3, null);
                c2Var2.q(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new mh.b(lVar, c2Var2, 0));
                break;
            case 14:
                ((org.telegram.ui.web.y) this.b).run();
                break;
            case 18:
                pf.n1 n1Var = ((pf.g1) this.b).a;
                i10 = ((org.telegram.ui.ActionBar.o2) n1Var).currentAccount;
                pf.r1 f10 = pf.r1.f(i10);
                ArrayList arrayList = n1Var.b;
                int i11 = f10.a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        pf.q1 c10 = f10.c(((Integer) arrayList.get(i13)).intValue());
                        f10.b.remove(c10);
                        f10.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new ih.q5(20));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f10.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                    messagesStorage.getStorageQueue().postRunnable(new x0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                pf.n1.W(n1Var);
                break;
            default:
                ((bg.d) this.b).run();
                break;
        }
    }

    @Override // qh.l0
    public x60 g(qh.d1 d1Var) {
        return x60.H((qh.x1) ((n5.e0) this.b).b, d1Var);
    }

    public void h(int i9) {
        qh.y yVar = (qh.y) this.b;
        yVar.c = i9;
        yVar.f(i9);
    }

    @Override // org.telegram.ui.Components.kt
    public void m1() {
        switch (this.a) {
            case 21:
                qh.q0 q0Var = (qh.q0) this.b;
                qh.d1 d1Var = q0Var.d;
                qh.a aVar = q0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = d1Var.A;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = qh.u5.f(d1Var.getText());
                    }
                }
                qh.w2 w2Var = q0Var.h;
                if (w2Var != null && q0Var.f != null) {
                    qh.o3.O1(w2Var.a);
                    break;
                }
                break;
            case 26:
                ((qh.x4) this.b).h();
                break;
            default:
                qh.f5 f5Var = (qh.f5) this.b;
                qh.a aVar2 = f5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = f5Var.r.A;
                }
                f5Var.u();
                qh.v2 v2Var = f5Var.A;
                if (v2Var != null && f5Var.a != null) {
                    qh.o3.O1(v2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        ra raVar = (ra) this.b;
        wb wbVar = raVar.a;
        z6 z6Var = wbVar.K0;
        int i9 = wbVar.c;
        if (z6Var != null) {
            z6Var.g(true);
        }
        if (wbVar.q0()) {
            wbVar.s.d();
        }
        if (wbVar.C1 == null || wbVar.x0 == null) {
            return;
        }
        wbVar.M1 = false;
        wbVar.N1 = false;
        v6 v6Var = wbVar.y0;
        if (v6Var != null) {
            v6Var.c(false);
        }
        if (j10 <= 800) {
            wbVar.h(false, true);
            wbVar.d0(false);
            wbVar.F0.b(false, true);
            z6 z6Var2 = wbVar.K0;
            if (z6Var2 != null) {
                z6Var2.g(true);
            }
            try {
                wbVar.C1.delete();
                wbVar.C1 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            }
            return;
        }
        wbVar.i0(false, true);
        a8 o6 = a8.o(wbVar.C1, str, j10);
        o6.J0 = wbVar.r0;
        o6.K0 = wbVar.s0;
        o6.B();
        wbVar.h(false, true);
        wbVar.d0(false);
        wbVar.F0.b(false, true);
        z6 z6Var3 = wbVar.K0;
        if (z6Var3 != null) {
            z6Var3.g(true);
        }
        if (!wbVar.w0.j()) {
            wbVar.G1 = o6;
            u9.a(i9, o6);
            wbVar.H1 = false;
            int videoWidth = wbVar.x0.getVideoWidth();
            int videoHeight = wbVar.x0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                a8 a8Var = wbVar.G1;
                a8Var.k0 = videoWidth;
                a8Var.l0 = videoHeight;
                a8Var.A();
            }
            wbVar.L(new pa(raVar, 3), 0L);
            return;
        }
        wbVar.C1 = null;
        o6.P = 1.0f;
        if (wbVar.w0.l(o6)) {
            a8 a2 = a8.a(wbVar.w0.getLayout(), wbVar.w0.getContent());
            wbVar.G1 = a2;
            u9.a(i9, a2);
            wbVar.H1 = false;
            int videoWidth2 = wbVar.x0.getVideoWidth();
            int videoHeight2 = wbVar.x0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                a8 a8Var2 = wbVar.G1;
                a8Var2.k0 = videoWidth2;
                a8Var2.l0 = videoHeight2;
                a8Var2.A();
            }
        }
        wbVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i9;
        switch (this.a) {
            case 3:
                na naVar = (na) this.b;
                l41 l41Var = (l41) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = l41Var.d;
                a8 a8Var = (a8) l41Var.G;
                naVar.c(false, true);
                wb wbVar = naVar.K;
                if (a8Var != wbVar.G1 && !wbVar.T1) {
                    wbVar.Z0.setSelected(i10);
                    wbVar.T1 = true;
                    bg.c2 c2Var = new bg.c2(wbVar, i10, 11);
                    ya yaVar = wbVar.r1;
                    a8 a8Var2 = wbVar.G1;
                    if (yaVar != null && a8Var2 != null) {
                        if (yaVar.u0()) {
                            a8Var2.f();
                            Utilities.searchQueue.postRunnable(new y9(wbVar, yaVar, a8Var2.i0, a8Var2.j0, a8Var2, yaVar.K0.getPainting().E, yaVar.u0(), c2Var, 0));
                            break;
                        } else {
                            c2Var.run();
                            break;
                        }
                    } else {
                        c2Var.run();
                        break;
                    }
                }
                break;
            case 9:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((mh.r4) this.b).U((l41) obj);
                break;
            case 16:
                pf.y0 y0Var = (pf.y0) this.b;
                l41 l41Var2 = (l41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = l41Var2.d;
                if (i11 == -1) {
                    boolean z10 = !y0Var.e;
                    y0Var.e = z10;
                    ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                    y0Var.a.U2.N(true);
                    y0Var.X(true);
                    break;
                } else if (i11 == -2) {
                    pf.t1 t1Var = new pf.t1(null);
                    t1Var.n = y0Var.r;
                    t1Var.c = new eb0(19, y0Var, view);
                    y0Var.presentFragment(t1Var);
                    break;
                } else if (l41Var2.a == 5 && i11 >= 0 && i11 < y0Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i12 = (l41Var2.d + 6) % 7;
                        int i13 = 0;
                        for (int i14 = 0; i14 < y0Var.h[i12].size(); i14++) {
                            if (((pf.x0) y0Var.h[i12].get(i14)).b > i13) {
                                i13 = ((pf.x0) y0Var.h[i12].get(i14)).b;
                            }
                        }
                        int max = Math.max(0, i13 - 1439);
                        int i15 = (l41Var2.d + 1) % 7;
                        int i16 = 1440;
                        for (int i17 = 0; i17 < y0Var.h[i15].size(); i17++) {
                            if (((pf.x0) y0Var.h[i15].get(i17)).a < i16) {
                                i16 = ((pf.x0) y0Var.h[i15].get(i17)).a;
                            }
                        }
                        int i18 = i16 + 1439;
                        CharSequence charSequence = l41Var2.l;
                        ArrayList arrayList = y0Var.h[l41Var2.d];
                        int i19 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = y0Var.h[i20];
                            if (arrayList2 != null) {
                                i19 = Math.max(1, arrayList2.size()) + i19;
                            }
                        }
                        pf.a1 a1Var = new pf.a1(charSequence, arrayList, max, i18, 28 - i19);
                        a1Var.f = new mh.m2(y0Var, 28);
                        a1Var.h = new ai1(15, y0Var, l41Var2);
                        y0Var.presentFragment(a1Var);
                        break;
                    } else {
                        if (y0Var.h[l41Var2.d].isEmpty()) {
                            ((org.telegram.ui.Cells.j5) view).setChecked(true);
                            y0Var.h[l41Var2.d].add(new pf.x0(0, 1439));
                            y0Var.W(l41Var2.d);
                        } else {
                            y0Var.h[l41Var2.d].clear();
                            ((org.telegram.ui.Cells.j5) view).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.j5) view).setValue(pf.y0.Z(y0Var.h[l41Var2.d]));
                        y0Var.X(true);
                        break;
                    }
                }
                break;
            case 17:
                final pf.a1 a1Var2 = (pf.a1) this.b;
                l41 l41Var3 = (l41) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = a1Var2.c;
                int i22 = a1Var2.d;
                ArrayList arrayList3 = a1Var2.b;
                int i23 = l41Var3.d;
                if (i23 == -1) {
                    a1Var2.r = !a1Var2.r;
                    arrayList3.clear();
                    if (a1Var2.r) {
                        arrayList3.add(new pf.x0(0, 1439));
                    }
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view2;
                    boolean z11 = a1Var2.r;
                    l41Var3.e = z11;
                    t8Var.setChecked(z11);
                    boolean z12 = a1Var2.r;
                    t8Var.b(org.telegram.ui.ActionBar.f6.w0(null, z12 ? org.telegram.ui.ActionBar.f6.f6 : org.telegram.ui.ActionBar.f6.e6, false), z12);
                    a1Var2.n.U2.N(true);
                    mh.m2 m2Var = a1Var2.f;
                    if (m2Var != null) {
                        m2Var.run();
                        break;
                    }
                } else if (i23 == -2) {
                    if (arrayList3.isEmpty() || a1Var2.T()) {
                        if (a1Var2.T()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new pf.x0(clamp, Utilities.clamp(1200, i22, clamp + 1)));
                    } else {
                        int i24 = ((pf.x0) j3.r0.j(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new pf.x0(clamp2, Utilities.clamp((i24 + 1560) / 2, i22, clamp2 + 1)));
                    }
                    mh.m2 m2Var2 = a1Var2.f;
                    if (m2Var2 != null) {
                        m2Var2.run();
                    }
                    a1Var2.n.U2.N(true);
                    break;
                } else if (l41Var3.a == 3 && (i9 = i23 / 3) >= 0 && i9 < arrayList3.size()) {
                    int i25 = i9 - 1;
                    pf.x0 x0Var = i25 >= 0 ? (pf.x0) arrayList3.get(i25) : null;
                    final pf.x0 x0Var2 = (pf.x0) arrayList3.get(i9);
                    int i26 = i9 + 1;
                    pf.x0 x0Var3 = i26 < arrayList3.size() ? (pf.x0) arrayList3.get(i26) : null;
                    int i27 = l41Var3.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = a1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = x0Var2.a;
                        if (x0Var != null) {
                            i21 = x0Var.b + 1;
                        }
                        final int i29 = 0;
                        org.telegram.ui.Components.y4.X(parentActivity, string, i28, i21, x0Var2.b - 1, new Utilities.Callback() { // from class: pf.z0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i29) {
                                    case 0:
                                        a1 a1Var3 = a1Var2;
                                        boolean U = a1Var3.U();
                                        p8 p8Var = (p8) view2;
                                        int intValue = num.intValue();
                                        x0Var2.a = intValue;
                                        p8Var.u(x0.a(intValue), true);
                                        if (U != a1Var3.U()) {
                                            a1Var3.n.U2.N(true);
                                        }
                                        m2 m2Var3 = a1Var3.f;
                                        if (m2Var3 != null) {
                                            m2Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        a1 a1Var4 = a1Var2;
                                        boolean U2 = a1Var4.U();
                                        p8 p8Var2 = (p8) view2;
                                        int intValue2 = num.intValue();
                                        x0Var2.b = intValue2;
                                        p8Var2.u(x0.a(intValue2), true);
                                        if (U2 != a1Var4.U()) {
                                            a1Var4.n.U2.N(true);
                                        }
                                        m2 m2Var4 = a1Var4.f;
                                        if (m2Var4 != null) {
                                            m2Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i27 == 1) {
                        Activity parentActivity2 = a1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = x0Var2.b;
                        int i31 = x0Var2.a + 1;
                        if (x0Var3 != null) {
                            i22 = x0Var3.a - 1;
                        }
                        final int i32 = 1;
                        org.telegram.ui.Components.y4.X(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() { // from class: pf.z0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i32) {
                                    case 0:
                                        a1 a1Var3 = a1Var2;
                                        boolean U = a1Var3.U();
                                        p8 p8Var = (p8) view2;
                                        int intValue = num.intValue();
                                        x0Var2.a = intValue;
                                        p8Var.u(x0.a(intValue), true);
                                        if (U != a1Var3.U()) {
                                            a1Var3.n.U2.N(true);
                                        }
                                        m2 m2Var3 = a1Var3.f;
                                        if (m2Var3 != null) {
                                            m2Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        a1 a1Var4 = a1Var2;
                                        boolean U2 = a1Var4.U();
                                        p8 p8Var2 = (p8) view2;
                                        int intValue2 = num.intValue();
                                        x0Var2.b = intValue2;
                                        p8Var2.u(x0.a(intValue2), true);
                                        if (U2 != a1Var4.U()) {
                                            a1Var4.n.U2.N(true);
                                        }
                                        m2 m2Var4 = a1Var4.f;
                                        if (m2Var4 != null) {
                                            m2Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i27 == 2) {
                        arrayList3.remove(i9);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new pf.x0(0, 1439));
                        }
                        a1Var2.n.U2.N(true);
                        mh.m2 m2Var3 = a1Var2.f;
                        if (m2Var3 != null) {
                            m2Var3.run();
                            break;
                        }
                    }
                }
                break;
            case 19:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                pf.t1.T((pf.t1) this.b, (l41) obj, (View) obj2);
                break;
            default:
                View view3 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f10 = (Float) obj4;
                Float f11 = (Float) obj5;
                if (((qh.o3[]) this.b)[0] != null) {
                    num.intValue();
                    f10.floatValue();
                    f11.floatValue();
                    if (view3 instanceof qh.s5) {
                        ((qh.s5) view3).B();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        qh.z3 z3Var = (qh.z3) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        z3Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        dyVar.finishFragment();
        return true;
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i9) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new p61(3, tVar, bitmap));
    }
}
