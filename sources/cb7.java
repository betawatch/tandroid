// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cb7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cb7(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = 0;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) obj2;
                String str = (String) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    if (e21.a) {
                        fc4.b("account " + oc7Var.currentAccount + " registered for push, push type: " + i2);
                    }
                    oc7Var.getUserConfig().d = true;
                    gda.f = str;
                    gda.e = i2;
                    oc7Var.getUserConfig().u(false);
                }
                gm.c3(new g87(oc7Var, (byte) 2));
                break;
            case 1:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                qac qacVar = (qac) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    while (i < vector.objects.size()) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str2 = tL_premiumGiftCodeOption.store_product;
                        if (str2 != null) {
                            i5 i5Var = new i5();
                            i5Var.b = "inapp";
                            i5Var.a = str2;
                            arrayList2.add(i5Var.a());
                        }
                        i++;
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i3 = this.b;
                    if (!isEmpty && oo0.j()) {
                        cj0.h().o(arrayList2, new zn(arrayList, chat, i3, qacVar));
                        break;
                    } else {
                        gm.c3(new go0(chat, i3, arrayList, qacVar, (byte) 1));
                        break;
                    }
                }
                break;
            case 2:
                gm.c3(new up6((d) obj2, tLObject, this.b, obj, (byte) 9));
                break;
            case 3:
                gm.c3(new i77((Object) tLObject, this.b, obj2, (Object) tL_error, obj, (byte) 6));
                break;
            case 4:
                ov9 ov9Var = (ov9) obj2;
                ov9Var.getClass();
                gm.c3(new up6((q59) ov9Var, this.b, tLObject, (String) obj, (byte) 21));
                break;
            case 5:
                gm.c3(new da4((int[]) obj2, i2));
                ((RequestDelegate) obj).run(tLObject, tL_error);
                break;
            case 6:
                lb4 lb4Var = (lb4) obj2;
                kb4 kb4Var = (kb4) obj;
                lb4Var.z0 = false;
                if (!(tLObject instanceof Vector)) {
                    if (tL_error != null) {
                        if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                            lb4Var.h(0, false);
                            break;
                        } else {
                            lb4Var.u0 = false;
                            lb4Var.c(kb4Var, false, false);
                            lb4Var.q(i2);
                            break;
                        }
                    }
                } else {
                    Vector vector2 = (Vector) tLObject;
                    if (!vector2.objects.isEmpty()) {
                        if (lb4Var.q0 == null) {
                            lb4Var.q0 = new HashMap();
                        }
                        while (i < vector2.objects.size()) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector2.objects.get(i);
                            lb4Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                            i++;
                        }
                    }
                    lb4Var.q(i2);
                    break;
                }
                break;
            case 7:
                gm.c3(new up6((d) obj2, tLObject, this.b, obj, (byte) 24));
                break;
            case 8:
                gm.c3(new up6((q59) obj2, this.b, tLObject, (String) obj, (byte) 28));
                break;
            case 9:
                hs6 hs6Var = (hs6) obj2;
                qac qacVar2 = (qac) obj;
                boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i4 = this.b;
                if (!z) {
                    hs6Var.A1(i4, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new mo0(qacVar2, (byte) 8));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add((TLRPC.TL_messages_stickerSet) tLObject);
                    hs6Var.A1(i4, arrayList3, false, (int) (System.currentTimeMillis() / 1000), hs6.s(arrayList3), new mo0(qacVar2, (byte) 7));
                    break;
                }
            case 10:
                gm.c3(new v36(obj2, (Object) tLObject, this.b, obj, (byte) 10));
                break;
            case 11:
                gm.c3(new v36(obj2, this.b, (Object) tLObject, obj, (byte) 28));
                break;
            case 12:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$37(i2, (String) obj, tLObject, tL_error);
                break;
            default:
                ((VoIPService) obj2).lambda$editCallMember$86(i2, (Runnable) obj, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ cb7(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
