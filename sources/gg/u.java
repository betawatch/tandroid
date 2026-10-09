package gg;

import ai.d9;
import ei.l3;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.v40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c9;
import org.telegram.ui.ea;
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(int i10, HashSet hashSet, n2 n2Var) {
        this.a = 4;
        this.b = i10;
        this.d = hashSet;
        this.c = n2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.d;
                String str = (String) this.c;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new d9(h0Var, this.b, tLObject, str, 4));
                break;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.b, (String) this.c, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new d9((c9) this.d, tLObject, this.b, (TLRPC.User) this.c, 11));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new l3(tLObject, this.b, (HashSet) this.d, tL_error, (n2) this.c, 15));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new d9((n2) this.d, tLObject, this.b, (Utilities.Callback) this.c, 18));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new d9((v40) this.d, this.b, tLObject, (String) this.c, 20));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new d9((rr0) this.d, this.b, tLObject, (String) this.c, 22));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ly0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 0), this.b);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i10);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str2 = tL_premiumGiftCodeOption.store_product;
                        if (str2 != null) {
                            c5.a aVar = new c5.a();
                            aVar.c = "inapp";
                            aVar.b = str2;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.b;
                    if (isEmpty || !tg.s.h()) {
                        AndroidUtilities.runOnUIThread(new tg.n(chat, i11, arrayList, callback, 0));
                        break;
                    } else {
                        BillingController.getInstance().queryProductDetails(arrayList2, new ea(arrayList, chat, i11, callback, 9));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ u(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    public /* synthetic */ u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.a = 8;
        this.d = profileActivity;
        this.c = tL_channels_getParticipants;
        this.b = i10;
    }
}
