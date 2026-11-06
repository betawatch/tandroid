package bg;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.an;
import org.telegram.ui.oy0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h0(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
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
        an anVar;
        TLRPC.FileLocation[] fileLocationArr;
        boolean z9;
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
                an anVar2 = (an) obj2;
                TLObject tLObject = (TLObject) obj6;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj4;
                String str = (String) obj;
                TLRPC.FileLocation[] fileLocationArr3 = (TLRPC.FileLocation[]) obj3;
                if (((TLRPC.TL_error) obj5) == null) {
                    TLRPC.User a22 = anVar2.getMessagesController().a2(Long.valueOf(anVar2.getUserConfig().e()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = w7.w(arrayList, qs.g2, false, null, false);
                    TLRPC.PhotoSize w11 = w7.w(arrayList, 800, false, null, false);
                    TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : w7.x(1000, tL_photos_photo.photo.video_sizes);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    a22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 == null || fileLocationArr2[0] == null) {
                        anVar = anVar2;
                        fileLocationArr = fileLocationArr3;
                        z9 = true;
                    } else {
                        w7.G(anVar2.getCurrentAccount());
                        File J = w7.J(w10, null, true, true);
                        w7.G(anVar2.getCurrentAccount());
                        w7.J(fileLocationArr2[0], null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr2[0].volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(fileLocationArr2[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        anVar = anVar2;
                        fileLocationArr = fileLocationArr3;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z9 = true;
                        gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), hc.m(anVar.getCurrentAccount(), 1, a22));
                    }
                    if (x10 != null && str != null) {
                        w7.G(anVar.getCurrentAccount());
                        new File(str).renameTo(w7.J(x10, "mp4", z9, z9));
                    } else if (w11 != null && fileLocationArr[0] != null) {
                        w7.G(anVar.getCurrentAccount());
                        File J2 = w7.J(w11, null, true, true);
                        w7.G(anVar.getCurrentAccount());
                        w7.J(fileLocationArr[0], null, true, true).renameTo(J2);
                    }
                    anVar.getMessagesController().U0(a22.id);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a22);
                    anVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    TLRPC.UserFull b22 = anVar.getMessagesController().b2(j3);
                    b22.profile_photo = tL_photos_photo.photo;
                    anVar.getMessagesStorage().j2(b22, false);
                    an anVar3 = anVar;
                    org.telegram.ui.Components.hc.a0(anVar3).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(hd.M0(2131754219, null)), org.telegram.messenger.g0.U2(hd.M0(2131754220, null), new j0(j3, anVar3)), null).j();
                    break;
                }
                break;
            case 1:
                ((ConferenceCall) obj2).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj4, this.b, (TLObject) obj6, (TLRPC.TL_error) obj5, (AtomicBoolean) obj3, (AtomicInteger) obj);
                break;
            case 2:
                m50 m50Var = (m50) obj5;
                ((u1) obj2).c(400L);
                m50.M0((Context) obj6, m50Var.a, -j3, ((TLRPC.TL_chatInviteExported) obj4).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj3, (TLRPC.ChannelParticipant) obj, m50Var.I0);
                break;
            case 3:
                final m11 m11Var = (m11) obj5;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj2;
                z0 z0Var = (z0) obj6;
                final k60 k60Var = (k60) obj4;
                final TLRPC.User user = (TLRPC.User) obj3;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                final boolean z10 = (channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages;
                z0Var.setVisibility(0);
                z0Var.setText(hd.M0(z10 ? 2131743913 : 2131753726, null));
                final long j10 = this.b;
                z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x01
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m11 m11Var2 = m11.this;
                        int i10 = m11Var2.e;
                        k60Var.u();
                        boolean z11 = z10;
                        TLRPC.User user2 = user;
                        if (!z11) {
                            org.telegram.messenger.qp.s1(i10).g0(j10, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = org.telegram.messenger.qp.n1(user2);
                        tL_channels_editBanned.channel = org.telegram.messenger.qp.i1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_editBanned, new x1(m11Var2, 14));
                    }
                });
                break;
            default:
                Activity activity = (Activity) obj5;
                f6 f6Var = (f6) obj4;
                oy0 oy0Var = new oy0(activity, f6Var, this.b, (byte[]) obj3);
                oy0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) obj6));
                oy0Var.r1 = new ab.b0((an) obj2, activity, f6Var, (ij) obj, 10);
                oy0Var.show();
                break;
        }
    }

    public /* synthetic */ h0(TLObject tLObject, Activity activity, f6 f6Var, long j3, byte[] bArr, an anVar, ij ijVar) {
        this.c = tLObject;
        this.d = activity;
        this.f = f6Var;
        this.b = j3;
        this.h = bArr;
        this.e = anVar;
        this.n = ijVar;
    }

    public /* synthetic */ h0(TLRPC.TL_error tL_error, an anVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.d = tL_error;
        this.e = anVar;
        this.c = tLObject;
        this.f = fileLocationArr;
        this.n = str;
        this.h = fileLocationArr2;
        this.b = j3;
    }

    public /* synthetic */ h0(m50 m50Var, u1 u1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = m50Var;
        this.e = u1Var;
        this.c = context;
        this.b = j3;
        this.f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.n = channelParticipant;
    }

    public /* synthetic */ h0(m11 m11Var, TLRPC.ChannelParticipant channelParticipant, z0 z0Var, k60 k60Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = m11Var;
        this.e = channelParticipant;
        this.c = z0Var;
        this.f = k60Var;
        this.b = j3;
        this.h = user;
        this.n = chat;
    }
}
