package ig;

import bi.sb;
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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h9;
import org.telegram.ui.o9;
import org.telegram.ui.vx0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(int i10, HashSet hashSet, o9 o9Var) {
        this.a = 4;
        this.b = i10;
        this.d = hashSet;
        this.c = o9Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj2;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new ai.h1((Object) i0Var, this.b, (Object) tLObject, (String) obj, 7));
                break;
            case 1:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$34(i11, (String) obj, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) obj2).lambda$editCallMember$90(i11, (Runnable) obj, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.h1((h9) obj2, tLObject, this.b, (TLRPC.User) obj, 15));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new sb(tLObject, this.b, (HashSet) obj2, tL_error, (o9) obj));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.h1((r2) obj2, tLObject, this.b, (Utilities.Callback) obj, 23));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.h1(obj2, this.b, (Object) tLObject, (String) obj, 25));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.h1(obj2, this.b, (Object) tLObject, (String) obj, 27));
                break;
            case 8:
                int i12 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new vx0((ProfileActivity) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 0), i11);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < vector.objects.size(); i13++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i13);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            d5.a aVar = new d5.a();
                            aVar.b = "inapp";
                            aVar.a = str;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i14 = this.b;
                    if (isEmpty || !vg.s.h()) {
                        AndroidUtilities.runOnUIThread(new vg.o(chat, i14, arrayList, callback, 0));
                        break;
                    } else {
                        BillingController.getInstance().queryProductDetails(arrayList2, new ag.k0(arrayList, chat, i14, callback, 11));
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
