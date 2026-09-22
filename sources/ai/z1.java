package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fd0;
import org.telegram.ui.gy;
import org.telegram.ui.pf1;
import org.telegram.ui.uy;
import org.telegram.ui.z60;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.e1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.c5, fd0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.a2, z60, s5.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(long j3, l5.i iVar) {
        this.a = 12;
        this.b = j3;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        boolean G1;
        vi viVar = (vi) this.c;
        ni niVar = viVar.y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
        long j3 = this.b;
        if (niVar == chatAttachAlertPhotoLayout || niVar == viVar.q0) {
            G1 = viVar.G1(i10, z10, i11, viVar.s1(), j3);
        } else {
            if (!niVar.I(i10, z10, i11, viVar.s1(), j3)) {
                viVar.A2 = true;
                viVar.dismiss();
            }
            G1 = false;
        }
        mf mfVar = viVar.h0;
        if (mfVar != null) {
            mfVar.h(!G1);
            viVar.h0 = null;
        }
    }

    @Override // s5.f
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

    @Override // org.telegram.ui.fd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.O0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
            default:
                Pattern pattern = LaunchActivity.B1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
        }
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new q71(((v71) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null) {
            return;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        l4Var.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // m4.e1
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        return a0Var.q(rVar, e9.i0.z((b2.k0) this.c), 0, this.b);
    }

    @Override // org.telegram.ui.z60
    public void i(int i10, ArrayList arrayList) {
        pf1 pf1Var = (pf1) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = pf1Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            MessagesController messagesController = n2Var.getMessagesController();
            f fVar = new f(18);
            long j3 = this.b;
            messagesController.addUserToChat(j3, user, i10, null, n2Var, false, fVar, null, new ei.s3(pf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 8:
                go0 go0Var = ((uy) this.c).C0.c0;
                a0.i iVar = go0Var.x0;
                long j3 = this.b;
                gg.h0 h0Var = (gg.h0) iVar.f(j3);
                if (h0Var != null) {
                    go0Var.x0.l(j3);
                    go0Var.t0.remove(h0Var);
                    go0Var.v0.remove(h0Var);
                    go0Var.u0.remove(h0Var);
                    go0Var.l();
                    MessagesStorage.getInstance(go0Var.s0).getStorageQueue().postRunnable(new gg.q(go0Var, j3, 0));
                    break;
                }
                break;
            default:
                ((gy) this.c).a.getMediaDataController().removePeer(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        d2 d2Var = (d2) this.c;
        if (tL_error == null) {
            if (d2Var.E == null || d2Var.w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new t1(d2Var, 5));
            }
            if (d2Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                d2Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(d2Var.e).getPeer(d2Var.b);
                d2Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                d2Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = d2Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = d2Var.E;
                NativeInstance.SsrcGroup[] d = d2.d(tL_groupCallParticipantVideo);
                d2Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, d2Var.H, DialogObject.getPeerDialogId(d2Var.G.peer));
            }
        }
        NativeInstance nativeInstance2 = d2Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ z1(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        ci.ba baVar = (ci.ba) this.c;
        baVar.W.i1().r(this.b, str, new ci.q9(baVar, 2));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        zn znVar = ((n31) this.c).h;
        if (com.google.android.gms.internal.vision.e2.u(znVar)) {
            znVar.qa(this.b, false);
        }
    }

    @Override // org.telegram.ui.z60
    public /* synthetic */ void g(TLRPC.User user) {
    }
}
