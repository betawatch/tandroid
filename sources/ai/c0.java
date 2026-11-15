package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import di.x2;
import hi.c8;
import hi.l8;
import java.util.ArrayList;
import ki.c3;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.ic;
import org.telegram.messenger.kc;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.qd;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ue;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.f91;
import org.telegram.ui.jw;
import org.telegram.ui.ma0;
import org.telegram.ui.r40;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements g, RequestDelegateTimestamp, tr, kc, r4, ma0, nr, j2.g, org.telegram.ui.ActionBar.q1, r40, p4.a1, v5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(long j3, Object obj, int i7) {
        this.a = i7;
        this.b = j3;
        this.c = obj;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m2.d dVar = (m2.d) this.c;
        ic p10 = imageReceiver.p();
        if (!z10 || p10 == null) {
            return;
        }
        Bitmap bitmap = p10.c;
        if (bitmap == null) {
            Drawable drawable = p10.d;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        dVar.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        boolean u12;
        ki kiVar = (ki) this.c;
        ci ciVar = kiVar.w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.e2;
        long j3 = this.b;
        if (ciVar == chatAttachAlertPhotoLayout || ciVar == kiVar.l2) {
            u12 = kiVar.u1(z10, i7, i10, j3, kiVar.f1());
        } else {
            if (!ciVar.M(z10, i7, i10, j3, kiVar.f1())) {
                kiVar.B4 = true;
                kiVar.dismiss();
            }
            u12 = false;
        }
        ue ueVar = kiVar.c2;
        if (ueVar != null) {
            ueVar.h(!u12);
            kiVar.c2 = null;
        }
    }

    @Override // org.telegram.messenger.tr
    public void a(String str) {
        l8 l8Var = (l8) this.c;
        np.s1(l8Var.a0.a).P1().r(this.b, str, new c8(l8Var, 2));
    }

    @Override // v5.e
    public Object apply(Object obj) {
        o5.i iVar = (o5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = iVar.a;
        l5.d dVar = iVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(y5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.a);
            contentValues.put("priority", Integer.valueOf(y5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // j2.g
    public j2.h createDataSource() {
        return new q51(((u51) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.ui.ma0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                ez.C(((qd) obj).h.K1).r0(cz.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
            default:
                String str = LaunchActivity.C1;
                ez.C(((int[]) obj)[0]).r0(cz.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
        }
    }

    @Override // ai.g
    public void g(String str) {
        z10 z10Var = (z10) this.c;
        org.telegram.messenger.g0.i3(new g0(z10Var, str), Math.max(0L, (this.b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 8:
                cm0 cm0Var = ((yw) this.c).D0.e0;
                a0.h hVar = cm0Var.y0;
                long j3 = this.b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    cm0Var.y0.l(j3);
                    cm0Var.u0.remove(g0Var);
                    cm0Var.w0.remove(g0Var);
                    cm0Var.v0.remove(g0Var);
                    cm0Var.f();
                    vr.a0(cm0Var.t0).a.c(new x2(cm0Var, j3, 10));
                    break;
                }
                break;
            default:
                ((jw) this.c).a.getMediaDataController().N1(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.r40
    public void i(int i7, ArrayList arrayList) {
        f91 f91Var = (f91) this.c;
        org.telegram.ui.ActionBar.e2 e2Var = f91Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            np messagesController = e2Var.getMessagesController();
            o oVar = new o(28);
            long j3 = this.b;
            messagesController.m(j3, user, i7, null, e2Var, false, oVar, null, new c3(f91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        an anVar = ((p11) this.c).s;
        if (com.google.android.gms.internal.vision.e2.s(anVar)) {
            anVar.Ta(this.b, false);
        }
    }

    @Override // p4.a1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        return d0Var.q(vVar, h9.i0.u((e2.l0) this.c), 0, this.b);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        fi.e1 e1Var = (fi.e1) this.c;
        if (tL_error == null) {
            if (e1Var.F == null || e1Var.x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i7 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.g0.h3(new fi.x0(e1Var, 5));
            }
            if (e1Var.H == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                e1Var.H = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = np.s1(e1Var.e).z1(e1Var.b);
                e1Var.H.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i7 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i7);
                    i7++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                e1Var.H.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = e1Var.H;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = e1Var.F;
                NativeInstance.SsrcGroup[] d = fi.e1.d(tL_groupCallParticipantVideo);
                e1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, e1Var.I, m5.o(e1Var.H.peer));
            }
        }
        NativeInstance nativeInstance2 = e1Var.F;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ c0(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.r40
    public /* synthetic */ void f(TLRPC.User user) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }
}
