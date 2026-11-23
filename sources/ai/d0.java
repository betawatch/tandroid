package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import bi.a4;
import bi.c4;
import hi.b8;
import hi.k8;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.az;
import org.telegram.messenger.ic;
import org.telegram.messenger.kc;
import org.telegram.messenger.mr;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.qd;
import org.telegram.messenger.sr;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.y10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.j91;
import org.telegram.ui.mw;
import org.telegram.ui.na0;
import org.telegram.ui.u40;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements f, RequestDelegateTimestamp, sr, kc, a5, na0, mr, j2.g, org.telegram.ui.ActionBar.q1, u40, p4.c1, v5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(long j3, o5.i iVar) {
        this.a = 14;
        this.b = j3;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        boolean v12;
        ui uiVar = (ui) this.c;
        mi miVar = uiVar.w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.e2;
        long j3 = this.b;
        if (miVar == chatAttachAlertPhotoLayout || miVar == uiVar.l2) {
            v12 = uiVar.v1(z10, i7, i10, j3, uiVar.g1());
        } else {
            if (!miVar.M(z10, i7, i10, j3, uiVar.g1())) {
                uiVar.B4 = true;
                uiVar.dismiss();
            }
            v12 = false;
        }
        df dfVar = uiVar.c2;
        if (dfVar != null) {
            dfVar.h(!v12);
            uiVar.c2 = null;
        }
    }

    @Override // org.telegram.messenger.sr
    public void a(String str) {
        k8 k8Var = (k8) this.c;
        np.u1(k8Var.a0.a).R1().r(this.b, str, new b8(k8Var, 2));
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

    @Override // org.telegram.ui.na0
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                az.C(((qd) obj).h.K1).r0(yy.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
            default:
                String str = LaunchActivity.C1;
                az.C(((int[]) obj)[0]).r0(yy.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
        }
    }

    @Override // ai.f
    public void c(TLRPC.TL_error tL_error, String str) {
        y10 y10Var = (y10) this.c;
        if (str == null) {
            p0.G(tL_error);
        }
        org.telegram.messenger.g0.h3(new i0(y10Var, str), Math.max(0L, (this.b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override // j2.g
    public j2.h createDataSource() {
        return new e61(((i61) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.messenger.mr
    public void d(boolean z10) {
        bn bnVar = ((a21) this.c).s;
        if (com.google.android.gms.internal.vision.e2.s(bnVar)) {
            bnVar.Ta(this.b, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 8:
                nm0 nm0Var = ((cx) this.c).D0.e0;
                a0.h hVar = nm0Var.y0;
                long j3 = this.b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    nm0Var.y0.l(j3);
                    nm0Var.u0.remove(g0Var);
                    nm0Var.w0.remove(g0Var);
                    nm0Var.v0.remove(g0Var);
                    nm0Var.f();
                    ur.a0(nm0Var.t0).a.c(new c4(nm0Var, j3, 11));
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
        org.telegram.ui.ActionBar.g2 g2Var = j91Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            np messagesController = g2Var.getMessagesController();
            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
            long j3 = this.b;
            messagesController.m(j3, user, i7, null, g2Var, false, j2Var, null, new a4(j91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // p4.c1
    public Object k(p4.e0 e0Var, p4.v vVar, int i7) {
        return e0Var.q(vVar, h9.i0.u((e2.l0) this.c), 0, this.b);
    }

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi.f0 f0Var = (oi.f0) this.c;
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
        f0Var.onComplete(new Pair(Long.valueOf(this.b), bitmap));
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
                tL_groupCallParticipant.peer = np.u1(c1Var.e).B1(c1Var.b);
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

    public /* synthetic */ d0(p0 p0Var, long j3, y10 y10Var) {
        this.a = 0;
        this.b = j3;
        this.c = y10Var;
    }

    public /* synthetic */ d0(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.u40
    public /* synthetic */ void f(TLRPC.User user) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
