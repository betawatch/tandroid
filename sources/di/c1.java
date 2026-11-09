package di;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.jc;
import org.telegram.messenger.lc;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.rd;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.wr;
import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.j91;
import org.telegram.ui.jw;
import org.telegram.ui.oa0;
import org.telegram.ui.t40;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements RequestDelegateTimestamp, wr, lc, org.telegram.ui.Components.t4, oa0, qr, j2.g, org.telegram.ui.ActionBar.r1, t40, p4.a1, v5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c1(long j3, o5.i iVar) {
        this.a = 13;
        this.b = j3;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        boolean u12;
        di diVar = (di) this.c;
        vh vhVar = diVar.s2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.a2;
        long j3 = this.b;
        if (vhVar == chatAttachAlertPhotoLayout || vhVar == diVar.h2) {
            u12 = diVar.u1(z9, i7, i10, j3, diVar.f1());
        } else {
            if (!vhVar.L(z9, i7, i10, j3, diVar.f1())) {
                diVar.x4 = true;
                diVar.dismiss();
            }
            u12 = false;
        }
        ue ueVar = diVar.Y1;
        if (ueVar != null) {
            ueVar.g(!u12);
            diVar.Y1 = null;
        }
    }

    @Override // org.telegram.messenger.wr
    public void a(String str) {
        fi.n8 n8Var = (fi.n8) this.c;
        qp.s1(n8Var.W.a).P1().r(this.b, str, new fi.e8(n8Var, 2));
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
        return new p51(((u51) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.ui.oa0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 4:
                float[] fArr = FragmentContextView.W0;
                gz.C(((rd) obj).h.I1).r0(ez.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
            default:
                String str = LaunchActivity.B1;
                gz.C(((int[]) obj)[0]).r0(ez.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
        }
    }

    @Override // org.telegram.ui.t40
    public void f(int i7, ArrayList arrayList) {
        j91 j91Var = (j91) this.c;
        org.telegram.ui.ActionBar.f2 f2Var = j91Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            qp messagesController = f2Var.getMessagesController();
            ai.m0 m0Var = new ai.m0(24);
            long j3 = this.b;
            messagesController.m(j3, user, i7, null, f2Var, false, m0Var, null, new hi.f3(j91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ni.c cVar = (ni.c) this.c;
        jc p10 = imageReceiver.p();
        if (!z9 || p10 == null) {
            return;
        }
        Bitmap bitmap = p10.c;
        if (bitmap == null) {
            Drawable drawable = p10.d;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        cVar.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 7:
                zl0 zl0Var = ((yw) this.c).C0.d0;
                a0.h hVar = zl0Var.x0;
                long j3 = this.b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    zl0Var.x0.l(j3);
                    zl0Var.t0.remove(g0Var);
                    zl0Var.v0.remove(g0Var);
                    zl0Var.u0.remove(g0Var);
                    zl0Var.f();
                    yr.a0(zl0Var.s0).a.c(new bi.r3(zl0Var, j3, 12));
                    break;
                }
                break;
            default:
                ((jw) this.c).a.getMediaDataController().N1(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        cn cnVar = ((n11) this.c).s;
        if (com.google.android.recaptcha.internal.a.u(cnVar)) {
            cnVar.Sa(this.b, false);
        }
    }

    @Override // p4.a1
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        return d0Var.q(vVar, h9.i0.u((e2.l0) this.c), 0, this.b);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        g1 g1Var = (g1) this.c;
        if (tL_error == null) {
            if (g1Var.E == null || g1Var.x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i7 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.g0.h3(new x0(g1Var, 5));
            }
            if (g1Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                g1Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = qp.s1(g1Var.e).z1(g1Var.b);
                g1Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i7 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i7);
                    i7++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                g1Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = g1Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = g1Var.E;
                NativeInstance.SsrcGroup[] d = g1.d(tL_groupCallParticipantVideo);
                g1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, g1Var.H, org.telegram.messenger.m5.o(g1Var.G.peer));
            }
        }
        NativeInstance nativeInstance2 = g1Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ c1(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.t40
    public /* synthetic */ void e(TLRPC.User user) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
