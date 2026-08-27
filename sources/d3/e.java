package d3;

import ag.l3;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import jh.d1;
import jh.y0;
import jh.z1;
import lh.a9;
import lh.k9;
import nh.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.i5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ge1;
import org.telegram.ui.gy;
import org.telegram.ui.j60;
import org.telegram.ui.oc0;
import org.telegram.ui.rn;
import org.telegram.ui.rx;
import pf.n;
import pf.y;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements f, RequestDelegateTimestamp, MessagesStorage.StringCallback, ImageReceiver.ImageReceiverDelegate, x4, oc0, MessagesStorage.BooleanCallback, l, a2, j60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(long j10, w2.i iVar) {
        this.a = 0;
        this.b = j10;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        boolean G1;
        gi giVar = (gi) this.c;
        yh yhVar = giVar.u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f0;
        long j10 = this.b;
        if (yhVar == chatAttachAlertPhotoLayout || yhVar == giVar.m0) {
            G1 = giVar.G1(i10, z10, i11, giVar.s1(), j10);
        } else {
            if (!yhVar.I(i10, z10, i11, giVar.s1(), j10)) {
                giVar.w2 = true;
                giVar.dismiss();
            }
            G1 = false;
        }
        ye yeVar = giVar.d0;
        if (yeVar != null) {
            yeVar.h(!G1);
            giVar.d0 = null;
        }
    }

    @Override // d3.f
    public Object apply(Object obj) {
        w2.i iVar = (w2.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = iVar.a;
        t2.d dVar = iVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(g3.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.a);
            contentValues.put("priority", Integer.valueOf(g3.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public m createDataSource() {
        return new h61(((m61) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.ui.oc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 5:
                float[] fArr = FragmentContextView.I0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        z1 z1Var = (z1) this.c;
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
        z1Var.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 8:
                cn0 cn0Var = ((gy) this.c).y0.U;
                a0.h hVar = cn0Var.t0;
                long j10 = this.b;
                y yVar = (y) hVar.f(j10);
                if (yVar != null) {
                    cn0Var.t0.l(j10);
                    cn0Var.p0.remove(yVar);
                    cn0Var.r0.remove(yVar);
                    cn0Var.q0.remove(yVar);
                    cn0Var.l();
                    MessagesStorage.getInstance(cn0Var.o0).getStorageQueue().postRunnable(new n(cn0Var, j10, 0));
                    break;
                }
                break;
            default:
                ((rx) this.c).a.getMediaDataController().removePeer(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.j60
    public void j(int i10, ArrayList arrayList) {
        ge1 ge1Var = (ge1) this.c;
        n2 n2Var = ge1Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            MessagesController messagesController = n2Var.getMessagesController();
            l3 l3Var = new l3(22);
            long j10 = this.b;
            messagesController.addUserToChat(j10, user, i10, null, n2Var, false, l3Var, null, new g3(ge1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        d1 d1Var = (d1) this.c;
        if (tL_error == null) {
            if (d1Var.A == null || d1Var.w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new y0(d1Var, 5));
            }
            if (d1Var.C == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                d1Var.C = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(d1Var.e).getPeer(d1Var.b);
                d1Var.C.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                d1Var.C.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = d1Var.C;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = d1Var.A;
                NativeInstance.SsrcGroup[] d = d1.d(tL_groupCallParticipantVideo);
                d1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, d1Var.D, DialogObject.getPeerDialogId(d1Var.C.peer));
            }
        }
        NativeInstance nativeInstance2 = d1Var.A;
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
        k9 k9Var = (k9) this.c;
        k9Var.S.i1().r(this.b, str, new a9(k9Var, 2));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        rn rnVar = ((d21) this.c).h;
        if (com.google.android.recaptcha.internal.a.u(rnVar)) {
            rnVar.qa(this.b, false);
        }
    }

    @Override // org.telegram.ui.j60
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
