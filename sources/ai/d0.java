package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import bi.w3;
import bi.y3;
import hi.c8;
import hi.l8;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.jc;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.pd;
import org.telegram.messenger.rr;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.j91;
import org.telegram.ui.ma0;
import org.telegram.ui.mw;
import org.telegram.ui.u40;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements f, RequestDelegateTimestamp, rr, jc, z4, ma0, lr, j2.g, org.telegram.ui.ActionBar.r1, u40, p4.c1, v5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(long j3, o5.i iVar) {
        this.a = 14;
        this.b = j3;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        boolean v12;
        si siVar = (si) this.c;
        ki kiVar = siVar.w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.e2;
        long j3 = this.b;
        if (kiVar == chatAttachAlertPhotoLayout || kiVar == siVar.l2) {
            v12 = siVar.v1(z10, i7, i10, j3, siVar.g1());
        } else {
            if (!kiVar.M(z10, i7, i10, j3, siVar.g1())) {
                siVar.B4 = true;
                siVar.dismiss();
            }
            v12 = false;
        }
        df dfVar = siVar.c2;
        if (dfVar != null) {
            dfVar.h(!v12);
            siVar.c2 = null;
        }
    }

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        l8 l8Var = (l8) this.c;
        mp.u1(l8Var.a0.a).R1().r(this.b, str, new c8(l8Var, 2));
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

    @Override // org.telegram.ui.ma0
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                zy.C(((pd) obj).h.K1).r0(xy.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
            default:
                String str = LaunchActivity.C1;
                zy.C(((int[]) obj)[0]).r0(xy.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
        }
    }

    @Override // ai.f
    public void c(TLRPC.TL_error tL_error, String str) {
        x10 x10Var = (x10) this.c;
        if (str == null) {
            n0.E(tL_error);
        }
        org.telegram.messenger.g0.h3(new h0(x10Var, str), Math.max(0L, (this.b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override // j2.g
    public j2.h createDataSource() {
        return new b61(((f61) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.messenger.lr
    public void d(boolean z10) {
        bn bnVar = ((z11) this.c).s;
        if (com.google.android.gms.internal.vision.e2.s(bnVar)) {
            bnVar.Ta(this.b, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 8:
                km0 km0Var = ((cx) this.c).D0.e0;
                a0.h hVar = km0Var.y0;
                long j3 = this.b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    km0Var.y0.l(j3);
                    km0Var.u0.remove(g0Var);
                    km0Var.w0.remove(g0Var);
                    km0Var.v0.remove(g0Var);
                    km0Var.f();
                    tr.a0(km0Var.t0).a.c(new y3(km0Var, j3, 11));
                    break;
                }
                break;
            default:
                ((mw) this.c).a.getMediaDataController().S1(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.u40
    public void i(int i7, ArrayList arrayList) {
        j91 j91Var = (j91) this.c;
        org.telegram.ui.ActionBar.h2 h2Var = j91Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            mp messagesController = h2Var.getMessagesController();
            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
            long j3 = this.b;
            messagesController.m(j3, user, i7, null, h2Var, false, j2Var, null, new w3(j91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // p4.c1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        return d0Var.q(vVar, h9.i0.u((e2.l0) this.c), 0, this.b);
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi.e0 e0Var = (oi.e0) this.c;
        hc p10 = imageReceiver.p();
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
        e0Var.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        fi.c1 c1Var = (fi.c1) this.c;
        if (tL_error == null) {
            if (c1Var.F == null || c1Var.x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i7 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.g0.g3(new fi.w0(c1Var, 5));
            }
            if (c1Var.H == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                c1Var.H = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = mp.u1(c1Var.e).B1(c1Var.b);
                c1Var.H.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i7 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i7);
                    i7++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                c1Var.H.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = c1Var.H;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = c1Var.F;
                NativeInstance.SsrcGroup[] d = fi.c1.d(tL_groupCallParticipantVideo);
                c1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, c1Var.I, n5.o(c1Var.H.peer));
            }
        }
        NativeInstance nativeInstance2 = c1Var.F;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ d0(n0 n0Var, long j3, x10 x10Var) {
        this.a = 0;
        this.b = j3;
        this.c = x10Var;
    }

    public /* synthetic */ d0(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.u40
    public /* synthetic */ void f(TLRPC.User user) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
