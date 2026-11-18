package jg;

import android.graphics.RectF;
import bi.u4;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.f30;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c9;
import org.telegram.ui.cu0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(int i7, HashSet hashSet, h2 h2Var) {
        this.a = 4;
        this.b = i7;
        this.d = hashSet;
        this.c = h2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                h0 h0Var = (h0) obj2;
                h0Var.getClass();
                org.telegram.messenger.g0.g3(new u4(h0Var, this.b, tLObject, (String) obj, 7));
                break;
            case 1:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$34(i10, (String) obj, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) obj2).lambda$editCallMember$90(i10, (Runnable) obj, tLObject, tL_error);
                break;
            case 3:
                org.telegram.messenger.g0.g3(new u4((c9) obj2, tLObject, this.b, (TLRPC.User) obj, 16));
                break;
            case 4:
                org.telegram.messenger.g0.g3(new ai.g1(tLObject, this.b, (HashSet) obj2, tL_error, (h2) obj, 11));
                break;
            case 5:
                org.telegram.messenger.g0.g3(new u4((h2) obj2, tLObject, this.b, (x10) obj, 24));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new u4((f30) obj2, this.b, tLObject, (String) obj, 26));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new u4((cp0) obj2, this.b, tLObject, (String) obj, 28));
                break;
            case 8:
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.h3(new cu0((ProfileActivity) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 0), i10);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                x10 x10Var = (x10) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i11);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            f5.a aVar = new f5.a();
                            aVar.c = "inapp";
                            aVar.b = str;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i12 = this.b;
                    if (isEmpty || !wg.s.h()) {
                        org.telegram.messenger.g0.g3(new wg.m(chat, i12, arrayList, x10Var, 1));
                        break;
                    } else {
                        org.telegram.messenger.r1.i().o(arrayList2, new bg.g0(arrayList, chat, i12, x10Var, 10));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ u(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = obj2;
    }

    public /* synthetic */ u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i7) {
        this.a = 8;
        this.d = profileActivity;
        this.c = tL_channels_getParticipants;
        this.b = i7;
    }
}
