package a1;

import a4.k;
import a4.l;
import ai.a0;
import ai.f0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bi.a1;
import bi.ad;
import bi.ce;
import bi.e7;
import bi.g1;
import bi.i8;
import bi.j4;
import bi.m8;
import bi.nd;
import bi.oc;
import bi.p4;
import bi.qc;
import bi.qd;
import bi.r9;
import bi.s;
import bi.sb;
import bi.sc;
import bi.v;
import bi.w1;
import bi.wb;
import bi.wc;
import bi.y2;
import c3.u;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.z;
import di.i5;
import di.m;
import e2.d0;
import fg.s1;
import gg.h2;
import gg.j2;
import gg.k2;
import gg.l1;
import gg.m1;
import gg.n2;
import gg.o1;
import gg.y1;
import h2.i;
import h2.j;
import hi.b0;
import hi.g3;
import hi.i6;
import hi.k1;
import hi.w0;
import hi.z3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import og.x1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.xk0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, i, Utilities.Callback2Return, ll0, c2, xk0, Utilities.Callback5, x1, CameraController.VideoTakeCallback, Continuation, OnCompleteListener, c3.g, du {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.xk0
    public void a() {
        ((w1) this.b).invalidate();
    }

    @Override // c3.g
    public long b(long j3) {
        return d0.i((j3 * r0.e) / 1000000, 0L, ((u) this.b).j - 1);
    }

    @Override // h2.i
    public void c(j jVar) {
        l lVar = (l) this.b;
        k kVar = (k) jVar;
        kVar.clear();
        lVar.b.add(kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // org.telegram.ui.Components.ll0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i10, View view) {
        MediaController.PhotoEntry photoEntry;
        switch (this.a) {
            case 3:
                vr0 vr0Var = ((a0) this.b).W;
                if (!vr0Var.G.C1 && (view instanceof u7)) {
                    MessageObject messageObject = ((u7) view).getMessageObject();
                    if (!vr0Var.c(messageObject)) {
                        vr0Var.e(messageObject);
                        break;
                    } else {
                        vr0Var.g(messageObject);
                        break;
                    }
                }
                break;
            default:
                p4 p4Var = (p4) this.b;
                ArrayList arrayList = p4Var.b0;
                ArrayList arrayList2 = p4Var.h0;
                if (i10 >= 2 && p4Var.W != null && (view instanceof j4)) {
                    int i11 = i10 - 2;
                    if (!p4Var.c0) {
                        if (p4Var.d0) {
                            if (i11 < 0 || i11 >= arrayList.size()) {
                                i11 -= arrayList.size();
                            }
                        }
                        if (i11 >= 0) {
                            photoEntry = (MediaController.PhotoEntry) p4Var.f0.get(i11);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(photoEntry)) {
                                }
                                AndroidUtilities.updateVisibleRows(p4Var.d);
                                p4Var.j();
                            }
                        }
                    } else if (i11 != 0) {
                        i11 = i10 - 3;
                        if (i11 >= 0 && i11 < p4Var.f0.size()) {
                            photoEntry = (MediaController.PhotoEntry) p4Var.f0.get(i11);
                            if (arrayList2.isEmpty() && !p4Var.Q) {
                                if (!arrayList2.contains(photoEntry)) {
                                    arrayList2.remove(photoEntry);
                                } else if (arrayList2.size() + 1 > p4Var.R) {
                                    int i12 = -p4Var.N;
                                    p4Var.N = i12;
                                    AndroidUtilities.shakeViewSpring(view, i12);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    break;
                                } else {
                                    arrayList2.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(p4Var.d);
                                p4Var.j();
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // og.x1
    public void e() {
        ad adVar = (ad) this.b;
        TextView textView = adVar.o1;
        boolean a2 = adVar.D0.a();
        ImageView imageView = adVar.n1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        int i11;
        switch (this.a) {
            case 4:
                ce ceVar = ((qd) ((v) this.b)).S1;
                nd ndVar = ceVar.X0;
                if (ndVar != null) {
                    ndVar.s(null, null, true);
                }
                ad adVar = ceVar.v1;
                if (adVar != null) {
                    adVar.q0();
                }
                qd qdVar = ceVar.c1;
                if (qdVar != null) {
                    qdVar.setHasRoundVideo(false);
                }
                r9 r9Var = ceVar.K1;
                if (r9Var != null) {
                    File file = r9Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        ceVar.K1.o0 = null;
                    }
                    if (ceVar.K1.p0 != null) {
                        try {
                            new File(ceVar.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        ceVar.K1.p0 = null;
                        break;
                    }
                }
                break;
            case 9:
                ((e7) this.b).a.p2.r();
                break;
            case 18:
                ((di.e) this.b).run();
                break;
            case 19:
                m mVar = (m) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = mVar.getMessagesController().getInputUser(mVar.P);
                updatestarrefprogram.commission_permille = 0;
                d2 d2Var2 = new d2(mVar.getParentActivity(), 3, null);
                d2Var2.q(150L);
                mVar.getConnectionsManager().sendRequest(updatestarrefprogram, new di.b(mVar, d2Var2, 0));
                break;
            default:
                h2 h2Var = ((y1) this.b).a;
                i11 = ((p2) h2Var).currentAccount;
                k2 f7 = k2.f(i11);
                ArrayList arrayList = h2Var.b;
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
                        j2 c10 = f7.c(((Integer) arrayList.get(i14)).intValue());
                        f7.b.remove(c10);
                        f7.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new g1(2));
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
                    messagesStorage.getStorageQueue().postRunnable(new a1(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                h2.X(h2Var);
                break;
        }
    }

    public void g(int i10) {
        b0 b0Var = (b0) this.b;
        b0Var.c = i10;
        b0Var.f(i10);
    }

    @Override // org.telegram.ui.Components.du
    public void j() {
        w0 w0Var = (w0) this.b;
        k1 k1Var = w0Var.d;
        hi.a aVar = w0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = k1Var.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = i6.f(k1Var.getText());
            }
        }
        g3 g3Var = w0Var.h;
        if (g3Var == null || w0Var.f == null) {
            return;
        }
        z3.N1(g3Var.a);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 14:
                c0.b((Intent) this.b);
                break;
            case 15:
                ((e0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        sc scVar = (sc) this.b;
        ce ceVar = scVar.a;
        m8 m8Var = ceVar.O0;
        int i10 = ceVar.c;
        if (m8Var != null) {
            m8Var.g(true);
        }
        if (ceVar.q0()) {
            ceVar.s.d();
        }
        if (ceVar.G1 == null || ceVar.B0 == null) {
            return;
        }
        ceVar.Q1 = false;
        ceVar.R1 = false;
        i8 i8Var = ceVar.C0;
        if (i8Var != null) {
            i8Var.c(false);
        }
        if (j3 <= 800) {
            ceVar.h(false, true);
            ceVar.d0(false);
            ceVar.J0.b(false, true);
            m8 m8Var2 = ceVar.O0;
            if (m8Var2 != null) {
                m8Var2.g(true);
            }
            try {
                ceVar.G1.delete();
                ceVar.G1 = null;
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
        ceVar.i0(false, true);
        r9 o9 = r9.o(ceVar.G1, str, j3);
        o9.J0 = ceVar.v0;
        o9.K0 = ceVar.w0;
        o9.B();
        ceVar.h(false, true);
        ceVar.d0(false);
        ceVar.J0.b(false, true);
        m8 m8Var3 = ceVar.O0;
        if (m8Var3 != null) {
            m8Var3.g(true);
        }
        if (!ceVar.A0.j()) {
            ceVar.K1 = o9;
            sb.a(i10, o9);
            ceVar.L1 = false;
            int videoWidth = ceVar.B0.getVideoWidth();
            int videoHeight = ceVar.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                r9 r9Var = ceVar.K1;
                r9Var.k0 = videoWidth;
                r9Var.l0 = videoHeight;
                r9Var.A();
            }
            ceVar.L(new qc(scVar, 3), 0L);
            return;
        }
        ceVar.G1 = null;
        o9.P = 1.0f;
        if (ceVar.A0.l(o9)) {
            r9 a2 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
            ceVar.K1 = a2;
            sb.a(i10, a2);
            ceVar.L1 = false;
            int videoWidth2 = ceVar.B0.getVideoWidth();
            int videoHeight2 = ceVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                r9 r9Var2 = ceVar.K1;
                r9Var2.k0 = videoWidth2;
                r9Var2.l0 = videoHeight2;
                r9Var2.A();
            }
        }
        ceVar.m0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                return;
            case 11:
                ((b1.f) this.b).invoke(obj);
                return;
            case 12:
                z zVar = (z) obj;
                if (!((FirebaseMessaging) this.b).e.n() || zVar.h.a() == null) {
                    return;
                }
                synchronized (zVar) {
                    z10 = zVar.g;
                }
                if (z10) {
                    return;
                }
                zVar.h(0L);
                return;
            case 17:
                ((b1.f) this.b).invoke(obj);
                return;
            case 21:
                ((e1.b) this.b).invoke(obj);
                return;
            default:
                ((e1.b) this.b).invoke(obj);
                return;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 7:
                oc ocVar = (oc) this.b;
                v51 v51Var = (v51) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = v51Var.d;
                r9 r9Var = (r9) v51Var.G;
                ocVar.c(false, true);
                ce ceVar = ocVar.O;
                if (r9Var != ceVar.K1 && !ceVar.X1) {
                    ceVar.d1.setSelected(i11);
                    ceVar.X1 = true;
                    s sVar = new s(ceVar, i11, 4);
                    ad adVar = ceVar.v1;
                    r9 r9Var2 = ceVar.K1;
                    if (adVar != null && r9Var2 != null) {
                        if (adVar.u0()) {
                            r9Var2.f();
                            Utilities.searchQueue.postRunnable(new wb(ceVar, adVar, r9Var2.i0, r9Var2.j0, r9Var2, adVar.O0.getPainting().E, adVar.u0(), sVar, 0));
                            break;
                        } else {
                            sVar.run();
                            break;
                        }
                    } else {
                        sVar.run();
                        break;
                    }
                }
                break;
            case 20:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((i5) this.b).V((v51) obj);
                break;
            case 23:
                m1 m1Var = (m1) this.b;
                v51 v51Var2 = (v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = v51Var2.d;
                if (i12 == -1) {
                    boolean z10 = !m1Var.e;
                    m1Var.e = z10;
                    ((x8) view).setChecked(z10);
                    m1Var.a.Y2.N(true);
                    m1Var.Y(true);
                    break;
                } else if (i12 == -2) {
                    n2 n2Var = new n2(null);
                    n2Var.n = m1Var.r;
                    n2Var.c = new y2(17, m1Var, view);
                    m1Var.presentFragment(n2Var);
                    break;
                } else if (v51Var2.a == 5 && i12 >= 0 && i12 < m1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i13 = (v51Var2.d + 6) % 7;
                        int i14 = 0;
                        for (int i15 = 0; i15 < m1Var.h[i13].size(); i15++) {
                            if (((l1) m1Var.h[i13].get(i15)).b > i14) {
                                i14 = ((l1) m1Var.h[i13].get(i15)).b;
                            }
                        }
                        int max = Math.max(0, i14 - 1439);
                        int i16 = (v51Var2.d + 1) % 7;
                        int i17 = 1440;
                        for (int i18 = 0; i18 < m1Var.h[i16].size(); i18++) {
                            if (((l1) m1Var.h[i16].get(i18)).a < i17) {
                                i17 = ((l1) m1Var.h[i16].get(i18)).a;
                            }
                        }
                        int i19 = i17 + 1439;
                        CharSequence charSequence = v51Var2.l;
                        ArrayList arrayList = m1Var.h[v51Var2.d];
                        int i20 = 0;
                        for (int i21 = 0; i21 < 7; i21++) {
                            ArrayList arrayList2 = m1Var.h[i21];
                            if (arrayList2 != null) {
                                i20 = Math.max(1, arrayList2.size()) + i20;
                            }
                        }
                        o1 o1Var = new o1(charSequence, arrayList, max, i19, 28 - i20);
                        o1Var.f = new wc(m1Var, 29);
                        o1Var.h = new s1(5, m1Var, v51Var2);
                        m1Var.presentFragment(o1Var);
                        break;
                    } else {
                        if (m1Var.h[v51Var2.d].isEmpty()) {
                            ((j5) view).setChecked(true);
                            m1Var.h[v51Var2.d].add(new l1(0, 1439));
                            m1Var.X(v51Var2.d);
                        } else {
                            m1Var.h[v51Var2.d].clear();
                            ((j5) view).setChecked(false);
                        }
                        ((j5) view).setValue(m1.a0(m1Var.h[v51Var2.d]));
                        m1Var.Y(true);
                        break;
                    }
                }
                break;
            case 24:
                final o1 o1Var2 = (o1) this.b;
                v51 v51Var3 = (v51) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = o1Var2.c;
                int i23 = o1Var2.d;
                ArrayList arrayList3 = o1Var2.b;
                int i24 = v51Var3.d;
                if (i24 == -1) {
                    o1Var2.r = !o1Var2.r;
                    arrayList3.clear();
                    if (o1Var2.r) {
                        arrayList3.add(new l1(0, 1439));
                    }
                    x8 x8Var = (x8) view2;
                    boolean z11 = o1Var2.r;
                    v51Var3.e = z11;
                    x8Var.setChecked(z11);
                    boolean z12 = o1Var2.r;
                    x8Var.b(j6.w0(null, z12 ? j6.f6 : j6.e6, false), z12);
                    o1Var2.n.Y2.N(true);
                    wc wcVar = o1Var2.f;
                    if (wcVar != null) {
                        wcVar.run();
                        break;
                    }
                } else if (i24 == -2) {
                    if (arrayList3.isEmpty() || o1Var2.U()) {
                        if (o1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new l1(clamp, Utilities.clamp(1200, i23, clamp + 1)));
                    } else {
                        int i25 = ((l1) hc.b.i(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new l1(clamp2, Utilities.clamp((i25 + 1560) / 2, i23, clamp2 + 1)));
                    }
                    wc wcVar2 = o1Var2.f;
                    if (wcVar2 != null) {
                        wcVar2.run();
                    }
                    o1Var2.n.Y2.N(true);
                    break;
                } else if (v51Var3.a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    l1 l1Var = i26 >= 0 ? (l1) arrayList3.get(i26) : null;
                    final l1 l1Var2 = (l1) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    l1 l1Var3 = i27 < arrayList3.size() ? (l1) arrayList3.get(i27) : null;
                    int i28 = v51Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = o1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = l1Var2.a;
                        if (l1Var != null) {
                            i22 = l1Var.b + 1;
                        }
                        final int i30 = 0;
                        d5.X(parentActivity, string, i29, i22, l1Var2.b - 1, new Utilities.Callback() { // from class: gg.n1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i30) {
                                    case 0:
                                        o1 o1Var3 = o1Var2;
                                        boolean V = o1Var3.V();
                                        s8 s8Var = (s8) view2;
                                        int intValue = num.intValue();
                                        l1Var2.a = intValue;
                                        s8Var.u(l1.a(intValue), true);
                                        if (V != o1Var3.V()) {
                                            o1Var3.n.Y2.N(true);
                                        }
                                        wc wcVar3 = o1Var3.f;
                                        if (wcVar3 != null) {
                                            wcVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        o1 o1Var4 = o1Var2;
                                        boolean V2 = o1Var4.V();
                                        s8 s8Var2 = (s8) view2;
                                        int intValue2 = num.intValue();
                                        l1Var2.b = intValue2;
                                        s8Var2.u(l1.a(intValue2), true);
                                        if (V2 != o1Var4.V()) {
                                            o1Var4.n.Y2.N(true);
                                        }
                                        wc wcVar4 = o1Var4.f;
                                        if (wcVar4 != null) {
                                            wcVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = o1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i31 = l1Var2.b;
                        int i32 = l1Var2.a + 1;
                        if (l1Var3 != null) {
                            i23 = l1Var3.a - 1;
                        }
                        final int i33 = 1;
                        d5.X(parentActivity2, string2, i31, i32, i23, new Utilities.Callback() { // from class: gg.n1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i33) {
                                    case 0:
                                        o1 o1Var3 = o1Var2;
                                        boolean V = o1Var3.V();
                                        s8 s8Var = (s8) view2;
                                        int intValue = num.intValue();
                                        l1Var2.a = intValue;
                                        s8Var.u(l1.a(intValue), true);
                                        if (V != o1Var3.V()) {
                                            o1Var3.n.Y2.N(true);
                                        }
                                        wc wcVar3 = o1Var3.f;
                                        if (wcVar3 != null) {
                                            wcVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        o1 o1Var4 = o1Var2;
                                        boolean V2 = o1Var4.V();
                                        s8 s8Var2 = (s8) view2;
                                        int intValue2 = num.intValue();
                                        l1Var2.b = intValue2;
                                        s8Var2.u(l1.a(intValue2), true);
                                        if (V2 != o1Var4.V()) {
                                            o1Var4.n.Y2.N(true);
                                        }
                                        wc wcVar4 = o1Var4.f;
                                        if (wcVar4 != null) {
                                            wcVar4.run();
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
                            arrayList3.add(new l1(0, 1439));
                        }
                        o1Var2.n.Y2.N(true);
                        wc wcVar3 = o1Var2.f;
                        if (wcVar3 != null) {
                            wcVar3.run();
                            break;
                        }
                    }
                }
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                n2.U((n2) this.b, (v51) obj, (View) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((n) this.b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        vr0 vr0Var = (vr0) this.b;
        if (((Integer) obj).intValue() == -1) {
            new f0(vr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ai.b(vr0Var, 0)).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
