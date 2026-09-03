package gg;

import dg.f3;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.et;
import org.telegram.ui.g9;
import org.telegram.ui.yx0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(int i10, HashSet hashSet, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = 4;
        this.b = i10;
        this.c = hashSet;
        this.d = p2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i10);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            b6.h hVar = new b6.h();
                            hVar.c = "inapp";
                            hVar.b = str;
                            arrayList2.add(hVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.b;
                    if (isEmpty || !p0.h()) {
                        AndroidUtilities.runOnUIThread(new z(chat, i11, arrayList, callback, 0));
                        break;
                    } else {
                        BillingController.getInstance().queryProductDetails(arrayList2, new a0(arrayList, chat, i11, callback, 0));
                        break;
                    }
                }
                break;
            case 1:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$34(this.b, (String) this.d, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.c).lambda$editCallMember$90(this.b, (Runnable) this.d, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new cg.v1((g9) this.c, tLObject, this.b, (TLRPC.User) this.d, 10));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new f3(tLObject, this.b, (HashSet) this.c, tL_error, (org.telegram.ui.ActionBar.p2) this.d, 11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new cg.v1((org.telegram.ui.ActionBar.p2) this.c, tLObject, this.b, (Utilities.Callback) this.d, 17));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new cg.v1((h40) this.c, this.b, tLObject, (String) this.d, 19));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.v1((qq0) this.c, this.b, tLObject, (String) this.d, 21));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new yx0((ProfileActivity) this.c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.b);
                break;
            default:
                tf.z zVar = (tf.z) this.c;
                String str2 = (String) this.d;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new et(zVar, this.b, tLObject, str2, 16));
                break;
        }
    }

    public /* synthetic */ l0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ l0(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.a = 8;
        this.c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.b = i10;
    }
}
