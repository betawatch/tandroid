// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class hb7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hb7(int i, Object obj, Object obj2, byte b) {
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
                uc7 uc7Var = (uc7) obj2;
                String str = (String) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    if (f11.a) {
                        cc4.b("account " + uc7Var.currentAccount + " registered for push, push type: " + i2);
                    }
                    uc7Var.getUserConfig().d = true;
                    xea.f = str;
                    xea.e = i2;
                    uc7Var.getUserConfig().u(false);
                }
                hl.c3(new pa7(uc7Var, (byte) 18));
                break;
            case 1:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                pcc pccVar = (pcc) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    while (i < vector.objects.size()) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str2 = tL_premiumGiftCodeOption.store_product;
                        if (str2 != null) {
                            we3 we3Var = new we3();
                            we3Var.b = "inapp";
                            we3Var.a = str2;
                            arrayList2.add(we3Var.a());
                        }
                        i++;
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i3 = this.b;
                    if (!isEmpty && on0.j()) {
                        di0.h().o(arrayList2, new an(arrayList, chat, i3, pccVar));
                        break;
                    } else {
                        hl.c3(new gn0(chat, i3, arrayList, pccVar, (byte) 1));
                        break;
                    }
                }
                break;
            case 2:
                hl.c3(new gp6((e) obj2, tLObject, this.b, obj, (byte) 9));
                break;
            case 3:
                hl.c3(new l77((Object) tLObject, this.b, obj2, (Object) tL_error, obj, (byte) 6));
                break;
            case 4:
                gx9 gx9Var = (gx9) obj2;
                gx9Var.getClass();
                hl.c3(new gp6((c79) gx9Var, this.b, tLObject, (String) obj, (byte) 21));
                break;
            case 5:
                hl.c3(new z94((int[]) obj2, i2));
                ((RequestDelegate) obj).run(tLObject, tL_error);
                break;
            case 6:
                hb4 hb4Var = (hb4) obj2;
                gb4 gb4Var = (gb4) obj;
                hb4Var.z0 = false;
                if (!(tLObject instanceof Vector)) {
                    if (tL_error != null) {
                        if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                            hb4Var.h(0, false);
                            break;
                        } else {
                            hb4Var.u0 = false;
                            hb4Var.c(gb4Var, false, false);
                            hb4Var.q(i2);
                            break;
                        }
                    }
                } else {
                    Vector vector2 = (Vector) tLObject;
                    if (!vector2.objects.isEmpty()) {
                        if (hb4Var.q0 == null) {
                            hb4Var.q0 = new HashMap();
                        }
                        while (i < vector2.objects.size()) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector2.objects.get(i);
                            hb4Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                            i++;
                        }
                    }
                    hb4Var.q(i2);
                    break;
                }
                break;
            case 7:
                hl.c3(new gp6((e) obj2, tLObject, this.b, obj, (byte) 24));
                break;
            case 8:
                hl.c3(new gp6((c79) obj2, this.b, tLObject, (String) obj, (byte) 28));
                break;
            case 9:
                ls6 ls6Var = (ls6) obj2;
                pcc pccVar2 = (pcc) obj;
                boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i4 = this.b;
                if (!z) {
                    ls6Var.A1(i4, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new jn0(pccVar2, (byte) 8));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add((TLRPC.TL_messages_stickerSet) tLObject);
                    ls6Var.A1(i4, arrayList3, false, (int) (System.currentTimeMillis() / 1000), ls6.s(arrayList3), new jn0(pccVar2, (byte) 7));
                    break;
                }
            case 10:
                hl.c3(new y36(obj2, (Object) tLObject, this.b, obj, (byte) 11));
                break;
            case 11:
                hl.c3(new y36(obj2, this.b, (Object) tLObject, obj, (byte) 29));
                break;
            case 12:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$37(i2, (String) obj, tLObject, tL_error);
                break;
            default:
                ((VoIPService) obj2).lambda$editCallMember$87(i2, (Runnable) obj, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ hb7(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
