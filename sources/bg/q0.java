package bg;

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
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b9;
import org.telegram.ui.hx0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q0(int i9, HashSet hashSet, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = 5;
        this.b = i9;
        this.c = hashSet;
        this.d = o2Var;
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
                    for (int i9 = 0; i9 < vector.objects.size(); i9++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i9);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            b9.c cVar = new b9.c();
                            cVar.c = "inapp";
                            cVar.b = str;
                            arrayList2.add(cVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i10 = this.b;
                    if (isEmpty || !u0.h()) {
                        AndroidUtilities.runOnUIThread(new c0(chat, i10, arrayList, callback, 0));
                        break;
                    } else {
                        BillingController.getInstance().queryProductDetails(arrayList2, new d0(arrayList, chat, i10, callback, 0));
                        break;
                    }
                }
                break;
            case 1:
                of.f0 f0Var = (of.f0) this.c;
                String str2 = (String) this.d;
                f0Var.getClass();
                AndroidUtilities.runOnUIThread(new c3.d(f0Var, this.b, tLObject, str2, 6));
                break;
            case 2:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$34(this.b, (String) this.d, tLObject, tL_error);
                break;
            case 3:
                ((VoIPService) this.c).lambda$editCallMember$90(this.b, (Runnable) this.d, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new c3.d((b9) this.c, tLObject, this.b, (TLRPC.User) this.d, 11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new fh.g1(tLObject, this.b, (HashSet) this.c, tL_error, (org.telegram.ui.ActionBar.o2) this.d, 14));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new c3.d((org.telegram.ui.ActionBar.o2) this.c, tLObject, this.b, (Utilities.Callback) this.d, 18));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new c3.d((o30) this.c, this.b, tLObject, (String) this.d, 20));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new c3.d((wp0) this.c, this.b, tLObject, (String) this.d, 22));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new hx0((ProfileActivity) this.c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new fh.g1((org.telegram.ui.web.y0) this.c, tLObject, this.b, (org.telegram.ui.web.v0) this.d, tL_error, 28));
                break;
        }
    }

    public /* synthetic */ q0(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
    }

    public /* synthetic */ q0(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i9) {
        this.a = 9;
        this.c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.b = i9;
    }
}
