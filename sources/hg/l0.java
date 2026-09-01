package hg;

import eg.d3;
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
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dt;
import org.telegram.ui.e9;
import org.telegram.ui.tx0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                AndroidUtilities.runOnUIThread(new dg.u1((e9) this.c, tLObject, this.b, (TLRPC.User) this.d, 10));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new d3(tLObject, this.b, (HashSet) this.c, tL_error, (org.telegram.ui.ActionBar.p2) this.d, 11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new dg.u1((org.telegram.ui.ActionBar.p2) this.c, tLObject, this.b, (Utilities.Callback) this.d, 17));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new dg.u1((i40) this.c, this.b, tLObject, (String) this.d, 19));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new dg.u1((rq0) this.c, this.b, tLObject, (String) this.d, 21));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new tx0((ProfileActivity) this.c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.b);
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new d3((org.telegram.ui.web.a1) this.c, tLObject, this.b, (org.telegram.ui.web.x0) this.d, tL_error, 25));
                break;
            default:
                uf.z zVar = (uf.z) this.c;
                String str2 = (String) this.d;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new dt(zVar, this.b, tLObject, str2, 15));
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
