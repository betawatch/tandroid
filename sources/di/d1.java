package di;

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
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.mc0;
import org.telegram.ui.me1;
import org.telegram.ui.o60;
import org.telegram.ui.ox;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements RequestDelegateTimestamp, MessagesStorage.StringCallback, m4.h1, ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.e5, mc0, MessagesStorage.BooleanCallback, g2.g, org.telegram.ui.ActionBar.b2, o60, t5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d1(long j10, m5.i iVar) {
        this.a = 13;
        this.b = j10;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        boolean N1;
        ti tiVar = (ti) this.c;
        li liVar = tiVar.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
        long j10 = this.b;
        if (liVar == chatAttachAlertPhotoLayout || liVar == tiVar.q0) {
            N1 = tiVar.N1(i10, z10, i11, tiVar.x1(), j10);
        } else {
            if (!liVar.K(i10, z10, i11, tiVar.x1(), j10)) {
                tiVar.G2 = true;
                tiVar.dismiss();
            }
            N1 = false;
        }
        mf mfVar = tiVar.h0;
        if (mfVar != null) {
            mfVar.g(!N1);
            tiVar.h0 = null;
        }
    }

    @Override // t5.e
    public Object apply(Object obj) {
        m5.i iVar = (m5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = iVar.a;
        j5.d dVar = iVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(w5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.a);
            contentValues.put("priority", Integer.valueOf(w5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // m4.h1
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        return f0Var.q(wVar, f9.i0.y((b2.p0) this.c), 0, this.b);
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new o81(((t81) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.ui.mc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.W0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
            default:
                Pattern pattern = LaunchActivity.D1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m4.s0 s0Var = (m4.s0) this.c;
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
        s0Var.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.o60
    public void f(int i10, ArrayList arrayList) {
        me1 me1Var = (me1) this.c;
        org.telegram.ui.ActionBar.r2 r2Var = me1Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            MessagesController messagesController = r2Var.getMessagesController();
            ag.c cVar = new ag.c(25);
            long j10 = this.b;
            messagesController.addUserToChat(j10, user, i10, null, r2Var, false, cVar, null, new hi.r3(me1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 8:
                xo0 xo0Var = ((ey) this.c).C0.d0;
                a0.h hVar = xo0Var.x0;
                long j10 = this.b;
                ig.h0 h0Var = (ig.h0) hVar.f(j10);
                if (h0Var != null) {
                    xo0Var.x0.l(j10);
                    xo0Var.t0.remove(h0Var);
                    xo0Var.v0.remove(h0Var);
                    xo0Var.u0.remove(h0Var);
                    xo0Var.l();
                    MessagesStorage.getInstance(xo0Var.s0).getStorageQueue().postRunnable(new bi.r3(xo0Var, j10, 10));
                    break;
                }
                break;
            default:
                ((ox) this.c).a.getMediaDataController().removePeer(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        h1 h1Var = (h1) this.c;
        if (tL_error == null) {
            if (h1Var.E == null || h1Var.w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new b1(h1Var, 5));
            }
            if (h1Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                h1Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(h1Var.e).getPeer(h1Var.b);
                h1Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                h1Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = h1Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = h1Var.E;
                NativeInstance.SsrcGroup[] d = h1.d(tL_groupCallParticipantVideo);
                h1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, h1Var.H, DialogObject.getPeerDialogId(h1Var.G.peer));
            }
        }
        NativeInstance nativeInstance2 = h1Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ d1(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        fi.g9 g9Var = (fi.g9) this.c;
        g9Var.W.j1().r(this.b, str, new fi.x8(g9Var, 2));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        wn wnVar = ((f41) this.c).h;
        if (c3.h0.t(wnVar)) {
            wnVar.Da(this.b, false);
        }
    }

    @Override // org.telegram.ui.o60
    public /* synthetic */ void e(TLRPC.User user) {
    }
}
