package ei;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cc;
import org.telegram.messenger.ec;
import org.telegram.messenger.hp;
import org.telegram.messenger.ir;
import org.telegram.messenger.kd;
import org.telegram.messenger.or;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.th;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ew;
import org.telegram.ui.ia0;
import org.telegram.ui.m40;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.y81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements RequestDelegateTimestamp, or, o4.f1, ec, org.telegram.ui.Components.r4, ia0, ir, i2.g, org.telegram.ui.ActionBar.p1, m40, u5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c1(long j10, n5.i iVar) {
        this.a = 13;
        this.b = j10;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        boolean u12;
        bi biVar = (bi) this.c;
        th thVar = biVar.t2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.b2;
        long j10 = this.b;
        if (thVar == chatAttachAlertPhotoLayout || thVar == biVar.i2) {
            u12 = biVar.u1(z10, i3, i10, j10, biVar.f1());
        } else {
            if (!thVar.L(z10, i3, i10, j10, biVar.f1())) {
                biVar.y4 = true;
                biVar.dismiss();
            }
            u12 = false;
        }
        se seVar = biVar.Z1;
        if (seVar != null) {
            seVar.g(!u12);
            biVar.Z1 = null;
        }
    }

    @Override // org.telegram.messenger.or
    public void a(String str) {
        gi.o8 o8Var = (gi.o8) this.c;
        hp.s1(o8Var.a0.a).P1().r(this.b, str, new gi.d8(o8Var, 2));
    }

    @Override // u5.e
    public Object apply(Object obj) {
        n5.i iVar = (n5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = iVar.a;
        k5.d dVar = iVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(x5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.a);
            contentValues.put("priority", Integer.valueOf(x5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // i2.g
    public i2.h createDataSource() {
        return new i51(((m51) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.ui.ia0
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                yy.C(((kd) obj).h.I1).r0(wy.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
            default:
                String str = LaunchActivity.E1;
                yy.C(((int[]) obj)[0]).r0(wy.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 8:
                bm0 bm0Var = ((uw) this.c).D0.e0;
                a0.h hVar = bm0Var.y0;
                long j10 = this.b;
                kg.d0 d0Var = (kg.d0) hVar.f(j10);
                if (d0Var != null) {
                    bm0Var.y0.l(j10);
                    bm0Var.u0.remove(d0Var);
                    bm0Var.w0.remove(d0Var);
                    bm0Var.v0.remove(d0Var);
                    bm0Var.f();
                    qr.a0(bm0Var.t0).a.c(new ci.e3(bm0Var, j10, 12));
                    break;
                }
                break;
            default:
                ((ew) this.c).a.getMediaDataController().N1(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.m40
    public void h(int i3, ArrayList arrayList) {
        y81 y81Var = (y81) this.c;
        org.telegram.ui.ActionBar.d2 d2Var = y81Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            hp messagesController = d2Var.getMessagesController();
            ai.y1 y1Var = new ai.y1(26);
            long j10 = this.b;
            messagesController.m(j10, user, i3, null, d2Var, false, y1Var, null, new ii.f3(y81Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // o4.f1
    public Object i(o4.e0 e0Var, o4.v vVar, int i3) {
        return e0Var.q(vVar, g9.i0.u((d2.n0) this.c), 0, this.b);
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mi.d4 d4Var = (mi.d4) this.c;
        cc p10 = imageReceiver.p();
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
        d4Var.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        wm wmVar = ((g11) this.c).s;
        if (com.google.android.recaptcha.internal.a.u(wmVar)) {
            wmVar.Qa(this.b, false);
        }
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        g1 g1Var = (g1) this.c;
        if (tL_error == null) {
            if (g1Var.F == null || g1Var.x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i3 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.g0.h3(new a1(g1Var, 5));
            }
            if (g1Var.H == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                g1Var.H = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = hp.s1(g1Var.e).z1(g1Var.b);
                g1Var.H.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i3 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i3);
                    i3++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                g1Var.H.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = g1Var.H;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = g1Var.F;
                NativeInstance.SsrcGroup[] d = g1.d(tL_groupCallParticipantVideo);
                g1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, g1Var.I, org.telegram.messenger.m5.o(g1Var.H.peer));
            }
        }
        NativeInstance nativeInstance2 = g1Var.F;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ c1(Object obj, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.m40
    public /* synthetic */ void e(TLRPC.User user) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
