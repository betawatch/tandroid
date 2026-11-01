package m4;

import ag.f3;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.as;
import org.telegram.messenger.gs;
import org.telegram.messenger.is;
import org.telegram.messenger.lc;
import org.telegram.messenger.nc;
import org.telegram.messenger.nd;
import org.telegram.messenger.o5;
import org.telegram.messenger.pz;
import org.telegram.messenger.rz;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.v61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lx;
import org.telegram.ui.p50;
import org.telegram.ui.sb0;
import org.telegram.ui.un;
import org.telegram.ui.wa1;
import org.telegram.ui.za1;
import org.telegram.ui.zx;
import vh.j6;
import vh.q8;
import vh.r6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements h1, nc, q4, sb0, as, g2.g, org.telegram.ui.ActionBar.u1, p50, s5.e, RequestDelegateTimestamp, gs {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0(long j10, l5.i iVar) {
        this.a = 11;
        this.b = j10;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        boolean t12;
        bi biVar = (bi) this.c;
        uh uhVar = biVar.s2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
        long j10 = this.b;
        if (uhVar == chatAttachAlertPhotoLayout || uhVar == biVar.h2) {
            t12 = biVar.t1(z10, i10, i11, j10, biVar.e1());
        } else {
            if (!uhVar.J(z10, i10, i11, j10, biVar.e1())) {
                biVar.x4 = true;
                biVar.dismiss();
            }
            t12 = false;
        }
        pe peVar = biVar.Y1;
        if (peVar != null) {
            peVar.g(!t12);
            biVar.Y1 = null;
        }
    }

    @Override // org.telegram.messenger.gs
    public void a(String str) {
        r6 r6Var = (r6) this.c;
        wp.r1(r6Var.W.a).O1().r(this.b, str, new j6(r6Var, 2));
    }

    @Override // s5.e
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = iVar.a;
        i5.d dVar = iVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new r61(((v61) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.ui.sb0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 3:
                float[] fArr = FragmentContextView.W0;
                rz.C(((nd) obj).h.I1).r0(pz.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
            default:
                Pattern pattern = LaunchActivity.D1;
                rz.C(((int[]) obj)[0]).r0(pz.d(messageMedia, this.b, null, null, null, null, true, 0));
                break;
        }
    }

    @Override // m4.h1
    public Object f(f0 f0Var, w wVar, int i10) {
        return f0Var.q(wVar, e9.n0.y((b2.p0) this.c), 0, this.b);
    }

    @Override // org.telegram.ui.p50
    public void g(int i10, ArrayList arrayList) {
        za1 za1Var = (za1) this.c;
        k2 k2Var = za1Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            wp messagesController = k2Var.getMessagesController();
            f3 f3Var = new f3(13);
            long j10 = this.b;
            messagesController.m(j10, user, i10, null, k2Var, false, f3Var, null, new wa1(za1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        switch (this.a) {
            case 6:
                an0 an0Var = ((zx) this.c).C0.d0;
                a0.h hVar = an0Var.x0;
                long j10 = this.b;
                zf.y yVar = (zf.y) hVar.f(j10);
                if (yVar != null) {
                    an0Var.x0.l(j10);
                    an0Var.t0.remove(yVar);
                    an0Var.v0.remove(yVar);
                    an0Var.u0.remove(yVar);
                    an0Var.f();
                    is.a0(an0Var.s0).a.c(new q8(an0Var, j10, 3));
                    break;
                }
                break;
            default:
                ((lx) this.c).a.getMediaDataController().N1(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.as
    public void i(boolean z10) {
        un unVar = ((p21) this.c).s;
        if (c3.i0.t(unVar)) {
            unVar.La(this.b, false);
        }
    }

    @Override // org.telegram.messenger.nc
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ng.d dVar = (ng.d) this.c;
        lc p5 = imageReceiver.p();
        if (!z10 || p5 == null) {
            return;
        }
        Bitmap bitmap = p5.c;
        if (bitmap == null) {
            Drawable drawable = p5.d;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        dVar.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        th.s0 s0Var = (th.s0) this.c;
        if (tL_error == null) {
            if (s0Var.E == null || s0Var.x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.i0.g3(new th.n0(s0Var, 5));
            }
            if (s0Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                s0Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = wp.r1(s0Var.e).y1(s0Var.b);
                s0Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                s0Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = s0Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = s0Var.E;
                NativeInstance.SsrcGroup[] d = th.s0.d(tL_groupCallParticipantVideo);
                s0Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, s0Var.H, o5.o(s0Var.G.peer));
            }
        }
        NativeInstance nativeInstance2 = s0Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ x0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.ui.p50
    public /* synthetic */ void e(TLRPC.User user) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }
}
