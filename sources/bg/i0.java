package bg;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z11;
import org.telegram.ui.bn;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ i0(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.e = conferenceCall;
        this.f = getgroupcallchainblocks;
        this.b = j3;
        this.c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.n = atomicInteger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bn bnVar;
        TLRPC.FileLocation[] fileLocationArr;
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        int i7 = this.a;
        long j3 = this.b;
        Object obj = this.n;
        Object obj2 = this.e;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i7) {
            case 0:
                bn bnVar2 = (bn) obj2;
                TLObject tLObject = (TLObject) obj6;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj4;
                String str = (String) obj;
                TLRPC.FileLocation[] fileLocationArr3 = (TLRPC.FileLocation[]) obj3;
                if (((TLRPC.TL_error) obj5) == null) {
                    TLRPC.User c22 = bnVar2.getMessagesController().c2(Long.valueOf(bnVar2.getUserConfig().e()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = w7.w(arrayList, ks.g2, false, null, false);
                    TLRPC.PhotoSize w11 = w7.w(arrayList, 800, false, null, false);
                    TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : w7.x(1000, tL_photos_photo.photo.video_sizes);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    c22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 == null || fileLocationArr2[0] == null) {
                        bnVar = bnVar2;
                        fileLocationArr = fileLocationArr3;
                        z10 = true;
                    } else {
                        w7.G(bnVar2.getCurrentAccount());
                        File J = w7.J(w10, null, true, true);
                        w7.G(bnVar2.getCurrentAccount());
                        w7.J(fileLocationArr2[0], null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr2[0].volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(fileLocationArr2[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        bnVar = bnVar2;
                        fileLocationArr = fileLocationArr3;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ec.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), fc.m(bnVar.getCurrentAccount(), 1, c22));
                    }
                    if (x10 != null && str != null) {
                        w7.G(bnVar.getCurrentAccount());
                        new File(str).renameTo(w7.J(x10, "mp4", z10, z10));
                    } else if (w11 != null && fileLocationArr[0] != null) {
                        w7.G(bnVar.getCurrentAccount());
                        File J2 = w7.J(w11, null, true, true);
                        w7.G(bnVar.getCurrentAccount());
                        w7.J(fileLocationArr[0], null, true, true).renameTo(J2);
                    }
                    bnVar.getMessagesController().W0(c22.id);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c22);
                    bnVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    TLRPC.UserFull d2 = bnVar.getMessagesController().d2(j3);
                    d2.profile_photo = tL_photos_photo.photo;
                    bnVar.getMessagesStorage().j2(d2, false);
                    bn bnVar3 = bnVar;
                    lc.b0(bnVar3).V(Collections.singletonList(c22), org.telegram.messenger.g0.W2(gd.M0(2131754217, null)), org.telegram.messenger.g0.T2(gd.M0(2131754218, null), new k0(j3, bnVar3)), null).j();
                    break;
                }
                break;
            case 1:
                ((ConferenceCall) obj2).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj4, this.b, (TLObject) obj6, (TLRPC.TL_error) obj5, (AtomicBoolean) obj3, (AtomicInteger) obj);
                break;
            case 2:
                x50 x50Var = (x50) obj5;
                ((u1) obj2).c(400L);
                x50.N0((Context) obj6, x50Var.a, -j3, ((TLRPC.TL_chatInviteExported) obj4).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj3, (TLRPC.ChannelParticipant) obj, x50Var.J0);
                break;
            case 3:
                final z11 z11Var = (z11) obj5;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj2;
                z0 z0Var = (z0) obj6;
                final y60 y60Var = (y60) obj4;
                final TLRPC.User user = (TLRPC.User) obj3;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                final boolean z11 = (channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages;
                z0Var.setVisibility(0);
                z0Var.setText(gd.M0(z11 ? 2131743675 : 2131753724, null));
                final long j10 = this.b;
                z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        z11 z11Var2 = z11.this;
                        int i10 = z11Var2.e;
                        y60Var.v();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            org.telegram.messenger.mp.u1(i10).g0(j10, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = org.telegram.messenger.mp.p1(user2);
                        tL_channels_editBanned.channel = org.telegram.messenger.mp.k1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_editBanned, new e2(z11Var2, 14));
                    }
                });
                break;
            default:
                Activity activity = (Activity) obj5;
                i6 i6Var = (i6) obj4;
                qy0 qy0Var = new qy0(activity, i6Var, this.b, (byte[]) obj3);
                qy0Var.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) obj6));
                qy0Var.v1 = new xi.e((bn) obj2, activity, i6Var, (fj) obj);
                qy0Var.show();
                break;
        }
    }

    public /* synthetic */ i0(TLObject tLObject, Activity activity, i6 i6Var, long j3, byte[] bArr, bn bnVar, fj fjVar) {
        this.c = tLObject;
        this.d = activity;
        this.f = i6Var;
        this.b = j3;
        this.h = bArr;
        this.e = bnVar;
        this.n = fjVar;
    }

    public /* synthetic */ i0(TLRPC.TL_error tL_error, bn bnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.d = tL_error;
        this.e = bnVar;
        this.c = tLObject;
        this.f = fileLocationArr;
        this.n = str;
        this.h = fileLocationArr2;
        this.b = j3;
    }

    public /* synthetic */ i0(x50 x50Var, u1 u1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = x50Var;
        this.e = u1Var;
        this.c = context;
        this.b = j3;
        this.f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.n = channelParticipant;
    }

    public /* synthetic */ i0(z11 z11Var, TLRPC.ChannelParticipant channelParticipant, z0 z0Var, y60 y60Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = z11Var;
        this.e = channelParticipant;
        this.c = z0Var;
        this.f = y60Var;
        this.b = j3;
        this.h = user;
        this.n = chat;
    }
}
