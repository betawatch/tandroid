package lh;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.AudioRecordJNI;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.er;
import org.telegram.ui.c31;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k7(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        switch (this.a) {
            case 0:
                r7.R((r7) this.c, (TLObject) this.b);
                break;
            case 1:
                z7 z7Var = (z7) this.c;
                TLObject tLObject = (TLObject) this.b;
                z7Var.e1 = 0;
                if (tLObject instanceof Vector) {
                    z7Var.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i10);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            z7Var.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 2:
                j8.R((j8) this.c, (TLObject) this.b);
                break;
            case 3:
                j8 j8Var = (j8) this.c;
                TextView textView = (TextView) this.b;
                ClipboardManager clipboardManager = (ClipboardManager) j8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.e3 e3Var = j8Var.U.b;
                boolean z10 = (TextUtils.isEmpty(e3Var.getText()) || TextUtils.equals(e3Var.getText(), "https://") || TextUtils.isEmpty(e3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                rl.o(textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f), er.h, 300L);
                break;
            case 4:
                q9 q9Var = (q9) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new k7(5, q9Var, smallGroupsParticipantsCount));
                    break;
                }
                break;
            case 5:
                q9 q9Var2 = (q9) this.c;
                HashMap hashMap = (HashMap) this.b;
                if (q9Var2.L == null) {
                    q9Var2.L = new HashMap();
                }
                q9Var2.L.putAll(hashMap);
                break;
            case 6:
                d dVar = (d) this.c;
                Runnable runnable = (Runnable) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ac acVar = (ac) this.c;
                Bitmap bitmap = (Bitmap) this.b;
                if (acVar.k && !acVar.i) {
                    acVar.d.add(new zb(acVar, bitmap));
                    acVar.k = false;
                    acVar.n.invalidate();
                    break;
                }
                break;
            case 8:
                int[] iArr = (int[]) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.b;
                int i11 = iArr[0];
                if (i11 != 0) {
                    connectionsManager.cancelRequest(i11, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 9:
                nh.k kVar = (nh.k) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.b;
                if (userFull != null) {
                    kVar.S = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.U = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.S = true;
                        kVar.U = kVar.F0();
                        kVar.T = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.T = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.U;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.H0(true);
                break;
            case 10:
                nh.b3 b3Var = (nh.b3) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.b;
                b3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    b3Var.g(botappsettings, true);
                    break;
                }
                break;
            case 11:
                nh.b3 b3Var2 = (nh.b3) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (!b3Var2.Y) {
                    if (tL_error != null) {
                        b3Var2.k(false);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(b3Var2.p0, 60000L);
                        break;
                    }
                }
                break;
            case 12:
                nh.b3 b3Var3 = (nh.b3) this.c;
                org.telegram.ui.Components.ec Q = new org.telegram.ui.Components.mc(b3Var3.l0, b3Var3.A).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.b));
                Q.j = 5000;
                Q.k(true);
                break;
            case 13:
                nh.s3 s3Var = (nh.s3) this.c;
                s3Var.getMessagesController().openApp((TLRPC.User) this.b, s3Var.getClassGuid());
                break;
            case 14:
                nh.s3 s3Var2 = (nh.s3) this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                s3Var2.getClass();
                s3Var2.presentFragment(rn.R9(connectedbotstarref.bot_id));
                break;
            case 15:
                nh.e4 e4Var = (nh.e4) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (!e4Var.P) {
                    if (tL_error2 != null) {
                        e4Var.b.dismiss();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(e4Var.Q, 60000L);
                        break;
                    }
                }
                break;
            case 16:
                nh.e4 e4Var2 = (nh.e4) this.c;
                org.telegram.ui.Components.ec Q2 = new org.telegram.ui.Components.mc(e4Var2.b.getContainer(), e4Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.b));
                Q2.j = 5000;
                Q2.k(true);
                break;
            case 17:
                oh.r rVar = (oh.r) this.c;
                ph.e eVar = (ph.e) this.b;
                rVar.getClass();
                rVar.presentFragment(rn.R9(eVar.b.id));
                break;
            case 18:
                ((oh.j0) this.c).s.presentFragment(rn.R9(((ph.e) this.b).b.id));
                break;
            case 19:
                ((VideoAds) this.c).lambda$showPremium$19((ag.g2) this.b);
                break;
            case 20:
                ((VideoAds) this.c).lambda$load$0((TLObject) this.b);
                break;
            case 21:
                ((VideoAds) this.c).lambda$show$16((Utilities.Callback) this.b);
                break;
            case 22:
                c31.T((Context) this.c, null, false, (jh.h0) this.b, null);
                break;
            case 23:
                ((AudioRecordJNI) this.c).lambda$startThread$0((ByteBuffer) this.b);
                break;
            case 24:
                ((ConferenceCall) this.c).lambda$processUpdates$4((TLRPC.Updates) this.b);
                break;
            case 25:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.c, (Point) this.b);
                break;
            case 26:
                ((VideoCapturerDevice) this.c).lambda$init$4((String) this.b);
                break;
            case 27:
                ((VoIPService) this.c).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.b);
                break;
            case 28:
                ((VoIPService) this.c).lambda$createGroupInstance$71((String) this.b);
                break;
            default:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.j0) this.b);
                break;
        }
    }
}
