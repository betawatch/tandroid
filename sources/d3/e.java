package d3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import bg.d2;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import ih.a1;
import ih.f1;
import ih.v3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import kh.d9;
import kh.n9;
import mh.h3;
import of.e0;
import of.p;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.g5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.x4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
import org.telegram.ui.f60;
import org.telegram.ui.fe1;
import org.telegram.ui.kc0;
import org.telegram.ui.ox;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements f, RequestDelegateTimestamp, MessagesStorage.StringCallback, ImageReceiver.ImageReceiverDelegate, x4, kc0, MessagesStorage.BooleanCallback, l, b2, f60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(long j10, w2.i iVar) {
        this.a = 0;
        this.b = j10;
        this.c = iVar;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        boolean G1;
        ki kiVar = (ki) this.c;
        ci ciVar = kiVar.u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
        long j10 = this.b;
        if (ciVar == chatAttachAlertPhotoLayout || ciVar == kiVar.m0) {
            G1 = kiVar.G1(i9, z10, i10, kiVar.s1(), j10);
        } else {
            if (!ciVar.H(i9, z10, i10, kiVar.s1(), j10)) {
                kiVar.w2 = true;
                kiVar.dismiss();
            }
            G1 = false;
        }
        cf cfVar = kiVar.d0;
        if (cfVar != null) {
            cfVar.h(!G1);
            kiVar.d0 = null;
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
        return new f61(((k61) this.c).h.createDataSource(), this.b);
    }

    @Override // org.telegram.ui.kc0
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.I0;
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.b, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        v3 v3Var = (v3) this.c;
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
        v3Var.onComplete(new Pair(Long.valueOf(this.b), bitmap));
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 8:
                an0 an0Var = ((dy) this.c).y0.U;
                a0.h hVar = an0Var.t0;
                long j10 = this.b;
                e0 e0Var = (e0) hVar.f(j10);
                if (e0Var != null) {
                    an0Var.t0.l(j10);
                    an0Var.p0.remove(e0Var);
                    an0Var.r0.remove(e0Var);
                    an0Var.q0.remove(e0Var);
                    an0Var.l();
                    MessagesStorage.getInstance(an0Var.o0).getStorageQueue().postRunnable(new p(an0Var, j10, 0));
                    break;
                }
                break;
            default:
                ((ox) this.c).a.getMediaDataController().removePeer(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.f60
    public void j(int i9, ArrayList arrayList) {
        fe1 fe1Var = (fe1) this.c;
        o2 o2Var = fe1Var.b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            MessagesController messagesController = o2Var.getMessagesController();
            d2 d2Var = new d2(23);
            long j10 = this.b;
            messagesController.addUserToChat(j10, user, i9, null, o2Var, false, d2Var, null, new h3(fe1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        f1 f1Var = (f1) this.c;
        if (tL_error == null) {
            if (f1Var.A == null || f1Var.w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i9 = 0;
            r0 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new a1(f1Var, 5));
            }
            if (f1Var.C == null && !groupcallstreamchannels.channels.isEmpty()) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                f1Var.C = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(f1Var.e).getPeer(f1Var.b);
                f1Var.C.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i9 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i9);
                    i9++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                f1Var.C.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = f1Var.C;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = f1Var.A;
                NativeInstance.SsrcGroup[] d = f1.d(tL_groupCallParticipantVideo);
                f1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, f1Var.D, DialogObject.getPeerDialogId(f1Var.C.peer));
            }
        }
        NativeInstance nativeInstance2 = f1Var.A;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.b, r0);
        }
    }

    public /* synthetic */ e(Object obj, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        n9 n9Var = (n9) this.c;
        n9Var.S.i1().r(this.b, str, new d9(n9Var, 2));
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        qn qnVar = ((b21) this.c).h;
        if (e2.c.v(qnVar)) {
            qnVar.qa(this.b, false);
        }
    }

    @Override // org.telegram.ui.f60
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
