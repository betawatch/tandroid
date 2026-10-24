package e1;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b2.d1;
import b2.f;
import b2.t0;
import b2.t1;
import b2.y0;
import c3.g;
import ci.d6;
import com.google.android.gms.tasks.OnSuccessListener;
import e2.m0;
import e2.o;
import e2.x;
import e9.l1;
import e9.q1;
import e9.s;
import ei.a8;
import ei.bc;
import ei.jb;
import ei.lb;
import ei.m3;
import ei.ma;
import ei.o1;
import ei.oa;
import ei.q3;
import ei.qa;
import ei.r;
import ei.s9;
import ei.u5;
import ei.v6;
import ei.vb;
import ei.w0;
import ei.w9;
import ei.xa;
import ei.z6;
import f2.w;
import gi.l;
import gi.s4;
import hi.t;
import i2.b0;
import ig.e1;
import ig.g1;
import ig.n1;
import ig.w1;
import ig.y1;
import j4.c0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ol0;
import qg.u1;
import u2.d0;
import u2.v;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, l1, z1, ol0, cm0, Utilities.Callback5, u1, CameraController.VideoTakeCallback, g, o, w {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(j2.a aVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ol0
    public void a() {
        ((o1) this.b).invalidate();
    }

    @Override // f2.w
    public void b(long j10, x xVar) {
        switch (this.a) {
            case 28:
                c3.b.c(j10, xVar, ((c0) this.b).c);
                break;
            default:
                c3.b.d(j10, xVar, ((c0) this.b).c);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        q3 q3Var = (q3) this.b;
        ArrayList arrayList = q3Var.b0;
        ArrayList arrayList2 = q3Var.h0;
        if (i10 < 2 || q3Var.W == null || !(view instanceof m3)) {
            return false;
        }
        int i11 = i10 - 2;
        if (q3Var.c0) {
            if (i11 == 0) {
                return false;
            }
            i11 = i10 - 3;
        } else if (q3Var.d0) {
            if (i11 >= 0 && i11 < arrayList.size()) {
                return false;
            }
            i11 -= arrayList.size();
        }
        if (i11 < 0 || i11 >= q3Var.f0.size()) {
            return false;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f0.get(i11);
        if (!arrayList2.isEmpty() || q3Var.Q) {
            return false;
        }
        if (arrayList2.contains(photoEntry)) {
            arrayList2.remove(photoEntry);
        } else {
            if (arrayList2.size() + 1 > q3Var.R) {
                int i12 = -q3Var.N;
                q3Var.N = i12;
                AndroidUtilities.shakeViewSpring(view, i12);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return true;
            }
            arrayList2.add(photoEntry);
        }
        AndroidUtilities.updateVisibleRows(q3Var.d);
        q3Var.j();
        return true;
    }

    @Override // qg.u1
    public void e() {
        xa xaVar = (xa) this.b;
        TextView textView = xaVar.o1;
        boolean a2 = xaVar.D0.a();
        ImageView imageView = xaVar.n1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        int i11;
        switch (this.a) {
            case 2:
                vb vbVar = ((lb) ((r) this.b)).S1;
                jb jbVar = vbVar.X0;
                if (jbVar != null) {
                    jbVar.s(null, null, true);
                }
                xa xaVar = vbVar.v1;
                if (xaVar != null) {
                    xaVar.o0();
                }
                lb lbVar = vbVar.c1;
                if (lbVar != null) {
                    lbVar.setHasRoundVideo(false);
                }
                a8 a8Var = vbVar.K1;
                if (a8Var != null) {
                    File file = a8Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        vbVar.K1.o0 = null;
                    }
                    if (vbVar.K1.p0 != null) {
                        try {
                            new File(vbVar.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        vbVar.K1.p0 = null;
                        break;
                    }
                }
                break;
            case 7:
                ((u5) this.b).a.p2.s();
                break;
            case 10:
                ((gi.e) this.b).run();
                break;
            case 11:
                l lVar = (l) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.R);
                updatestarrefprogram.commission_permille = 0;
                c2 c2Var2 = new c2(lVar.getParentActivity(), 3, null);
                c2Var2.r(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new gi.b(lVar, c2Var2, 0));
                break;
            default:
                w1 w1Var = ((n1) this.b).a;
                i11 = ((o2) w1Var).currentAccount;
                ig.z1 f7 = ig.z1.f(i11);
                ArrayList arrayList = w1Var.b;
                int i12 = f7.a;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (f7.c(((Integer) arrayList.get(i13)).intValue()) == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        y1 c10 = f7.c(((Integer) arrayList.get(i14)).intValue());
                        f7.b.remove(c10);
                        f7.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new d6(6));
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
                    f7.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    messagesStorage.getStorageQueue().postRunnable(new w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                w1.X(w1Var);
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 14:
                ((d1) obj).onAudioAttributesChanged((f) this.b);
                break;
            case 15:
                ((d1) obj).onTrackSelectionParametersChanged((t1) this.b);
                break;
            case 16:
                ((d1) obj).onCues((d2.c) this.b);
                break;
            case 17:
                ((d1) obj).onMediaMetadataChanged(((b0) this.b).a.Q);
                break;
            case 18:
                ((d1) obj).onMetadata((t0) this.b);
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                ((j2.b) obj).b((d0) this.b);
                break;
            case 24:
                ((j2.b) obj).h((y0) this.b);
                break;
            case 25:
                ((j2.b) obj).onSeekStarted((j2.a) this.b);
                break;
            case 26:
                ((j2.b) obj).a((i2.e) this.b);
                break;
        }
    }

    @Override // c3.g
    public long k(long j10) {
        return m0.j((j10 * r0.e) / 1000000, 0L, ((c3.w) this.b).j - 1);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        qa qaVar = (qa) this.b;
        vb vbVar = qaVar.a;
        z6 z6Var = vbVar.O0;
        int i10 = vbVar.c;
        if (z6Var != null) {
            z6Var.g(true);
        }
        if (vbVar.p0()) {
            vbVar.s.d();
        }
        if (vbVar.G1 == null || vbVar.B0 == null) {
            return;
        }
        vbVar.Q1 = false;
        vbVar.R1 = false;
        v6 v6Var = vbVar.C0;
        if (v6Var != null) {
            v6Var.c(false);
        }
        if (j10 <= 800) {
            vbVar.g(false, true);
            vbVar.c0(false);
            vbVar.J0.b(false, true);
            z6 z6Var2 = vbVar.O0;
            if (z6Var2 != null) {
                z6Var2.g(true);
            }
            try {
                vbVar.G1.delete();
                vbVar.G1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            return;
        }
        vbVar.h0(false, true);
        a8 o10 = a8.o(vbVar.G1, str, j10);
        o10.J0 = vbVar.v0;
        o10.K0 = vbVar.w0;
        o10.B();
        vbVar.g(false, true);
        vbVar.c0(false);
        vbVar.J0.b(false, true);
        z6 z6Var3 = vbVar.O0;
        if (z6Var3 != null) {
            z6Var3.g(true);
        }
        if (!vbVar.A0.j()) {
            vbVar.K1 = o10;
            s9.a(i10, o10);
            vbVar.L1 = false;
            int videoWidth = vbVar.B0.getVideoWidth();
            int videoHeight = vbVar.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                a8 a8Var = vbVar.K1;
                a8Var.k0 = videoWidth;
                a8Var.l0 = videoHeight;
                a8Var.A();
            }
            vbVar.K(new oa(qaVar, 3), 0L);
            return;
        }
        vbVar.G1 = null;
        o10.P = 1.0f;
        if (vbVar.A0.l(o10)) {
            a8 a2 = a8.a(vbVar.A0.getLayout(), vbVar.A0.getContent());
            vbVar.K1 = a2;
            s9.a(i10, a2);
            vbVar.L1 = false;
            int videoWidth2 = vbVar.B0.getVideoWidth();
            int videoHeight2 = vbVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                a8 a8Var2 = vbVar.K1;
                a8Var2.k0 = videoWidth2;
                a8Var2.l0 = videoHeight2;
                a8Var2.A();
            }
        }
        vbVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((b) this.b).invoke(obj);
                break;
            default:
                ((b) this.b).invoke(obj);
                break;
        }
    }

    @Override // e9.l1
    public Object q(Object obj, Object obj2) {
        return s.x((List) ((Collection) obj2), new n4.s(16, ((q1) this.b).f, obj));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 5:
                ma maVar = (ma) this.b;
                m61 m61Var = (m61) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = m61Var.d;
                a8 a8Var = (a8) m61Var.G;
                maVar.c(false, true);
                vb vbVar = maVar.O;
                if (a8Var != vbVar.K1 && !vbVar.X1) {
                    vbVar.d1.setSelected(i11);
                    vbVar.X1 = true;
                    ah.g gVar = new ah.g(vbVar, i11, 9);
                    xa xaVar = vbVar.v1;
                    a8 a8Var2 = vbVar.K1;
                    if (xaVar != null && a8Var2 != null) {
                        if (xaVar.s0()) {
                            a8Var2.f();
                            Utilities.searchQueue.postRunnable(new w9(vbVar, xaVar, a8Var2.i0, a8Var2.j0, a8Var2, xaVar.O0.getPainting().E, xaVar.s0(), gVar, 0));
                            break;
                        } else {
                            gVar.run();
                            break;
                        }
                    } else {
                        gVar.run();
                        break;
                    }
                }
                break;
            case 12:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((s4) this.b).V((m61) obj);
                break;
            case 20:
                e1 e1Var = (e1) this.b;
                m61 m61Var2 = (m61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = m61Var2.d;
                if (i12 == -1) {
                    boolean z10 = !e1Var.f;
                    e1Var.f = z10;
                    ((w8) view).setChecked(z10);
                    e1Var.a.Z2.N(true);
                    e1Var.Y(true);
                    break;
                } else if (i12 == -2) {
                    ig.c2 c2Var = new ig.c2(null);
                    c2Var.n = e1Var.s;
                    c2Var.c = new ai.o2(24, e1Var, view);
                    e1Var.presentFragment(c2Var);
                    break;
                } else if (m61Var2.a == 5 && i12 >= 0 && i12 < e1Var.n.length) {
                    if (!LocaleController.isRTL ? floatValue < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i13 = (m61Var2.d + 6) % 7;
                        int i14 = 0;
                        for (int i15 = 0; i15 < e1Var.n[i13].size(); i15++) {
                            if (((ig.d1) e1Var.n[i13].get(i15)).b > i14) {
                                i14 = ((ig.d1) e1Var.n[i13].get(i15)).b;
                            }
                        }
                        int max = Math.max(0, i14 - 1439);
                        int i16 = (m61Var2.d + 1) % 7;
                        int i17 = 1440;
                        for (int i18 = 0; i18 < e1Var.n[i16].size(); i18++) {
                            if (((ig.d1) e1Var.n[i16].get(i18)).a < i17) {
                                i17 = ((ig.d1) e1Var.n[i16].get(i18)).a;
                            }
                        }
                        int i19 = i17 + 1439;
                        CharSequence charSequence = m61Var2.l;
                        ArrayList arrayList = e1Var.n[m61Var2.d];
                        int i20 = 0;
                        for (int i21 = 0; i21 < 7; i21++) {
                            ArrayList arrayList2 = e1Var.n[i21];
                            if (arrayList2 != null) {
                                i20 = Math.max(1, arrayList2.size()) + i20;
                            }
                        }
                        g1 g1Var = new g1(charSequence, arrayList, max, i19, 28 - i20);
                        g1Var.f = new bc(e1Var, 22);
                        g1Var.h = new t(6, e1Var, m61Var2);
                        e1Var.presentFragment(g1Var);
                        break;
                    } else {
                        if (e1Var.n[m61Var2.d].isEmpty()) {
                            ((i5) view).setChecked(true);
                            e1Var.n[m61Var2.d].add(new ig.d1(0, 1439));
                            e1Var.X(m61Var2.d);
                        } else {
                            e1Var.n[m61Var2.d].clear();
                            ((i5) view).setChecked(false);
                        }
                        ((i5) view).setValue(e1.a0(e1Var.n[m61Var2.d]));
                        e1Var.Y(true);
                        break;
                    }
                }
                break;
            case 21:
                final g1 g1Var2 = (g1) this.b;
                m61 m61Var3 = (m61) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = g1Var2.c;
                int i23 = g1Var2.d;
                ArrayList arrayList3 = g1Var2.b;
                int i24 = m61Var3.d;
                if (i24 == -1) {
                    g1Var2.r = !g1Var2.r;
                    arrayList3.clear();
                    if (g1Var2.r) {
                        arrayList3.add(new ig.d1(0, 1439));
                    }
                    w8 w8Var = (w8) view2;
                    boolean z11 = g1Var2.r;
                    m61Var3.e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = g1Var2.r;
                    w8Var.b(k6.x0(null, z12 ? k6.f6 : k6.e6, false), z12);
                    g1Var2.n.Z2.N(true);
                    bc bcVar = g1Var2.f;
                    if (bcVar != null) {
                        bcVar.run();
                        break;
                    }
                } else if (i24 == -2) {
                    if (arrayList3.isEmpty() || g1Var2.U()) {
                        if (g1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new ig.d1(clamp, Utilities.clamp(1200, i23, clamp + 1)));
                    } else {
                        int i25 = ((ig.d1) i2.o1.i(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new ig.d1(clamp2, Utilities.clamp((i25 + 1560) / 2, i23, clamp2 + 1)));
                    }
                    bc bcVar2 = g1Var2.f;
                    if (bcVar2 != null) {
                        bcVar2.run();
                    }
                    g1Var2.n.Z2.N(true);
                    break;
                } else if (m61Var3.a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    ig.d1 d1Var = i26 >= 0 ? (ig.d1) arrayList3.get(i26) : null;
                    final ig.d1 d1Var2 = (ig.d1) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    ig.d1 d1Var3 = i27 < arrayList3.size() ? (ig.d1) arrayList3.get(i27) : null;
                    int i28 = m61Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = g1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = d1Var2.a;
                        if (d1Var != null) {
                            i22 = d1Var.b + 1;
                        }
                        final int i30 = 0;
                        f5.X(parentActivity, string, i29, i22, d1Var2.b - 1, new Utilities.Callback() { // from class: ig.f1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i30) {
                                    case 0:
                                        g1 g1Var3 = g1Var2;
                                        boolean V = g1Var3.V();
                                        r8 r8Var = (r8) view2;
                                        int intValue = num.intValue();
                                        d1Var2.a = intValue;
                                        r8Var.w(d1.a(intValue), true);
                                        if (V != g1Var3.V()) {
                                            g1Var3.n.Z2.N(true);
                                        }
                                        bc bcVar3 = g1Var3.f;
                                        if (bcVar3 != null) {
                                            bcVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        g1 g1Var4 = g1Var2;
                                        boolean V2 = g1Var4.V();
                                        r8 r8Var2 = (r8) view2;
                                        int intValue2 = num.intValue();
                                        d1Var2.b = intValue2;
                                        r8Var2.w(d1.a(intValue2), true);
                                        if (V2 != g1Var4.V()) {
                                            g1Var4.n.Z2.N(true);
                                        }
                                        bc bcVar4 = g1Var4.f;
                                        if (bcVar4 != null) {
                                            bcVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = g1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i31 = d1Var2.b;
                        int i32 = d1Var2.a + 1;
                        if (d1Var3 != null) {
                            i23 = d1Var3.a - 1;
                        }
                        final int i33 = 1;
                        f5.X(parentActivity2, string2, i31, i32, i23, new Utilities.Callback() { // from class: ig.f1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i33) {
                                    case 0:
                                        g1 g1Var3 = g1Var2;
                                        boolean V = g1Var3.V();
                                        r8 r8Var = (r8) view2;
                                        int intValue = num.intValue();
                                        d1Var2.a = intValue;
                                        r8Var.w(d1.a(intValue), true);
                                        if (V != g1Var3.V()) {
                                            g1Var3.n.Z2.N(true);
                                        }
                                        bc bcVar3 = g1Var3.f;
                                        if (bcVar3 != null) {
                                            bcVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        g1 g1Var4 = g1Var2;
                                        boolean V2 = g1Var4.V();
                                        r8 r8Var2 = (r8) view2;
                                        int intValue2 = num.intValue();
                                        d1Var2.b = intValue2;
                                        r8Var2.w(d1.a(intValue2), true);
                                        if (V2 != g1Var4.V()) {
                                            g1Var4.n.Z2.N(true);
                                        }
                                        bc bcVar4 = g1Var4.f;
                                        if (bcVar4 != null) {
                                            bcVar4.run();
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
                            arrayList3.add(new ig.d1(0, 1439));
                        }
                        g1Var2.n.Z2.N(true);
                        bc bcVar3 = g1Var2.f;
                        if (bcVar3 != null) {
                            bcVar3.run();
                            break;
                        }
                    }
                }
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ig.c2.U((ig.c2) this.b, (m61) obj, (View) obj2);
                break;
        }
    }

    public /* synthetic */ c(j2.a aVar, v vVar, d0 d0Var, IOException iOException, boolean z10) {
        this.a = 27;
        this.b = d0Var;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
