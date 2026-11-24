// default package

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b97 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b97(int i, HashSet hashSet, d dVar) {
        this.a = (byte) 3;
        this.b = i;
        this.c = hashSet;
        this.d = dVar;
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
                na7 na7Var = (na7) obj2;
                String str = (String) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    if (w01.a) {
                        fa4.b("account " + na7Var.currentAccount + " registered for push, push type: " + i2);
                    }
                    na7Var.getUserConfig().d = true;
                    gba.f = str;
                    gba.e = i2;
                    na7Var.getUserConfig().u(false);
                }
                gl.d3(new f67(na7Var, (byte) 10));
                break;
            case 1:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                p8c p8cVar = (p8c) obj;
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
                    if (!isEmpty && on0.j()) {
                        ci0.h().o(arrayList2, new zm(arrayList, chat, i3, p8cVar));
                        break;
                    } else {
                        gl.d3(new gn0(chat, i3, arrayList, p8cVar, (byte) 1));
                        break;
                    }
                }
                break;
            case 2:
                gl.d3(new tn6((d) obj2, tLObject, this.b, obj, (byte) 9));
                break;
            case 3:
                gl.d3(new i57((Object) tLObject, this.b, obj2, (Object) tL_error, obj, (byte) 6));
                break;
            case 4:
                mt9 mt9Var = (mt9) obj2;
                mt9Var.getClass();
                gl.d3(new tn6((n39) mt9Var, this.b, tLObject, (String) obj, (byte) 21));
                break;
            case 5:
                l94 l94Var = (l94) obj2;
                k94 k94Var = (k94) obj;
                l94Var.z0 = false;
                if (!(tLObject instanceof Vector)) {
                    if (tL_error != null) {
                        if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                            l94Var.h(0, false);
                            break;
                        } else {
                            l94Var.u0 = false;
                            l94Var.c(k94Var, false, false);
                            l94Var.q(i2);
                            break;
                        }
                    }
                } else {
                    Vector vector2 = (Vector) tLObject;
                    if (!vector2.objects.isEmpty()) {
                        if (l94Var.q0 == null) {
                            l94Var.q0 = new HashMap();
                        }
                        while (i < vector2.objects.size()) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector2.objects.get(i);
                            l94Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                            i++;
                        }
                    }
                    l94Var.q(i2);
                    break;
                }
                break;
            case 6:
                gl.d3(new tn6((d) obj2, tLObject, this.b, obj, (byte) 23));
                break;
            case 7:
                gl.d3(new tn6((n39) obj2, this.b, tLObject, (String) obj, (byte) 27));
                break;
            case 8:
                hq6 hq6Var = (hq6) obj2;
                p8c p8cVar2 = (p8c) obj;
                boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i4 = this.b;
                if (!z) {
                    hq6Var.A1(i4, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new mn0(p8cVar2, (byte) 8));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add((TLRPC.TL_messages_stickerSet) tLObject);
                    hq6Var.A1(i4, arrayList3, false, (int) (System.currentTimeMillis() / 1000), hq6.s(arrayList3), new mn0(p8cVar2, (byte) 7));
                    break;
                }
            case 9:
                gl.d3(new q76(obj2, (Object) tLObject, this.b, obj, (byte) 5));
                break;
            case 10:
                gl.d3(new q76(obj2, this.b, (Object) tLObject, obj, (byte) 27));
                break;
            case 11:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$37(i2, (String) obj, tLObject, tL_error);
                break;
            default:
                ((VoIPService) obj2).lambda$editCallMember$86(i2, (Runnable) obj, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ b97(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
