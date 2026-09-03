package f3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import cg.n0;
import g5.l;
import g5.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import mg.w;
import nh.e1;
import nh.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.j5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cf1;
import org.telegram.ui.cy;
import org.telegram.ui.qy;
import org.telegram.ui.v60;
import org.telegram.ui.xc0;
import org.telegram.ui.ze1;
import org.telegram.ui.zn;
import ph.r7;
import ph.y7;
import tf.n;
import tf.y;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements f, RequestDelegateTimestamp, ImageReceiver.ImageReceiverDelegate, y4, xc0, MessagesStorage.BooleanCallback, l, c2, v60, MessagesStorage.StringCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(long j10, y2.i iVar) {
        this.a = 0;
        this.b = j10;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        boolean G1;
        li liVar = (li) this.c;
        di diVar = liVar.v0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
        long j10 = this.b;
        if (diVar == chatAttachAlertPhotoLayout || diVar == liVar.n0) {
            G1 = liVar.G1(i10, z4, i11, liVar.s1(), j10);
        } else {
            if (!diVar.H(i10, z4, i11, liVar.s1(), j10)) {
                liVar.x2 = true;
                liVar.dismiss();
            }
            G1 = false;
        }
        cf cfVar = liVar.e0;
        if (cfVar != null) {
            cfVar.h(!G1);
            liVar.e0 = null;
        }
    }

    @Override // f3.f
    public Object apply(Object obj) {
        y2.i iVar = (y2.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = iVar.a;
        v2.d dVar = iVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(i3.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.a);
            contentValues.put("priority", Integer.valueOf(i3.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // org.telegram.ui.xc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 4:
                float[] fArr = FragmentContextView.J0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
            default:
                Pattern pattern = LaunchActivity.y1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
        }
    }

    @Override // g5.l
    public m createDataSource() {
        return new d71(((i71) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        w wVar = (w) this.c;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z4 || bitmapSafe == null) {
            return;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        wVar.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.v60
    public void i(int i10, ArrayList arrayList) {
        cf1 cf1Var = (cf1) this.c;
        p2 p2Var = cf1Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            MessagesController messagesController = p2Var.getMessagesController();
            n0 n0Var = new n0(21);
            long j10 = this.b;
            messagesController.addUserToChat(j10, user, i10, null, p2Var, false, n0Var, null, new ze1(cf1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(d2 d2Var, int i10) {
        switch (this.a) {
            case 7:
                vn0 vn0Var = ((qy) this.c).z0.V;
                a0.h hVar = vn0Var.u0;
                long j10 = this.b;
                y yVar = (y) hVar.f(j10);
                if (yVar != null) {
                    vn0Var.u0.l(j10);
                    vn0Var.q0.remove(yVar);
                    vn0Var.s0.remove(yVar);
                    vn0Var.r0.remove(yVar);
                    vn0Var.l();
                    MessagesStorage.getInstance(vn0Var.p0).getStorageQueue().postRunnable(new n(vn0Var, j10, 0));
                    break;
                }
                break;
            default:
                ((cy) this.c).a.getMediaDataController().removePeer(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        e1 e1Var = (e1) this.c;
        if (tL_error == null) {
            if (e1Var.B == null || e1Var.w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new z0(e1Var, 5));
            }
            if (e1Var.D == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                e1Var.D = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(e1Var.e).getPeer(e1Var.b);
                e1Var.D.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                e1Var.D.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = e1Var.D;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = e1Var.B;
                NativeInstance.SsrcGroup[] d = e1.d(tL_groupCallParticipantVideo);
                e1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, e1Var.E, DialogObject.getPeerDialogId(e1Var.D.peer));
            }
        }
        NativeInstance nativeInstance2 = e1Var.B;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ e(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        y7 y7Var = (y7) this.c;
        y7Var.T.i1().r(this.b, str, new r7(y7Var, 2));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        zn znVar = ((w21) this.c).h;
        if (e2.c.s(znVar)) {
            znVar.qa(this.b, false);
        }
    }

    @Override // org.telegram.ui.v60
    public /* synthetic */ void h(TLRPC.User user) {
    }
}
