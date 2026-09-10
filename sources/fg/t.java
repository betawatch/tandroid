package fg;

import di.o3;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d9;
import org.telegram.ui.ea;
import org.telegram.ui.py0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t(int i10, HashSet hashSet, p2 p2Var) {
        this.a = 4;
        this.b = i10;
        this.d = hashSet;
        this.c = p2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.d;
                String str = (String) this.c;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new di.q(h0Var, this.b, tLObject, str, 3));
                break;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.b, (String) this.c, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new di.q((d9) this.d, tLObject, this.b, (TLRPC.User) this.c, 11));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new o3(tLObject, this.b, (HashSet) this.d, tL_error, (p2) this.c, 14));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new di.q((p2) this.d, tLObject, this.b, (Utilities.Callback) this.c, 18));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new di.q((o40) this.d, this.b, tLObject, (String) this.c, 20));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new di.q((xq0) this.d, this.b, tLObject, (String) this.c, 22));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new py0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 0), this.b);
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
                            aVar.b = "inapp";
                            aVar.a = str2;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.b;
                    if (isEmpty || !sg.s.h()) {
                        AndroidUtilities.runOnUIThread(new sg.n(chat, i11, arrayList, callback, 0));
                        break;
                    } else {
                        BillingController.getInstance().queryProductDetails(arrayList2, new ea(arrayList, chat, i11, callback, 9));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ t(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    public /* synthetic */ t(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.a = 8;
        this.d = profileActivity;
        this.c = tL_channels_getParticipants;
        this.b = i10;
    }
}
