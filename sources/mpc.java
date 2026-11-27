// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mpc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mpc(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        q0d q0dVar;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                int i = this.b;
                gpc gpcVar = (gpc) this.c;
                c cVar = (c) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new ic(objArr == true ? 1 : 0), new p((Object) gpcVar, (Object) cVar, (Object) connectionsManager, (byte) 27));
                break;
            case 1:
                Context context = (Context) this.c;
                int i2 = this.b;
                String str = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = uc7.s1(i2).l4.O1.f;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "https://tonviewer.com/";
                    } else if (!str2.endsWith("/")) {
                        str2 = str2.concat("/");
                    }
                    StringBuilder l = c00.l(str2, "transaction/");
                    l.append(Uri.encode(str));
                    m01.w(context, l.toString(), false);
                    break;
                }
                break;
            case 2:
                wqc wqcVar = (wqc) this.c;
                int i3 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (wqcVar.f0 == i3) {
                    wqcVar.f(bitmapArr);
                    wqcVar.a.run();
                    break;
                }
                break;
            case 3:
                atc atcVar = (atc) this.c;
                int i4 = this.b;
                zuc zucVar = (zuc) this.d;
                int i5 = i4 + 1;
                ArrayList arrayList = atcVar.w;
                if (i5 < arrayList.size()) {
                    ((zuc) arrayList.get(i5)).a.requestFocus();
                    break;
                } else {
                    hl.t1(zucVar);
                    break;
                }
            case 4:
                tuc tucVar = (tuc) this.c;
                int i6 = this.b;
                zuc zucVar2 = (zuc) this.d;
                int i7 = i6 + 1;
                ArrayList arrayList2 = tucVar.d;
                if (i7 < arrayList2.size()) {
                    ((zuc) arrayList2.get(i7)).a.requestFocus();
                    break;
                } else {
                    hl.t1(zucVar2);
                    break;
                }
            case 5:
                int i8 = this.b;
                String str3 = (String) this.c;
                pcc pccVar = (pcc) this.d;
                lvc[] lvcVarArr = lvc.f;
                lvc lvcVar = lvcVarArr[i8];
                if (lvcVar == null) {
                    lvcVar = new lvc(i8);
                    lvcVarArr[i8] = lvcVar;
                }
                lvcVar.d(str3, true, null, null, pccVar);
                break;
            case 6:
                cwc cwcVar = (cwc) this.c;
                int i9 = this.b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = cwcVar.e;
                WallpapersListActivity wallpapersListActivity = cwcVar.F;
                ArrayList arrayList3 = cwcVar.d;
                if (i9 == cwcVar.w) {
                    cwcVar.s = 0;
                    int size = arrayList3.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        cwcVar.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                ro6 ro6Var = new ro6();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, false);
                                    TLRPC.PhotoSize w2 = xb4.w(botInlineResult.photo.sizes, jn7.q5, false, null, false);
                                    if (w != null) {
                                        ro6Var.E = w.w;
                                        ro6Var.F = w.h;
                                        ro6Var.L = w;
                                        ro6Var.K = botInlineResult.photo;
                                        ro6Var.G = w.size;
                                        ro6Var.M = w2;
                                        ro6Var.B = botInlineResult.id;
                                        ro6Var.H = false;
                                        arrayList3.add(ro6Var);
                                        hashMap.put(ro6Var.B, ro6Var);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i11);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                ro6Var.E = documentAttribute.w;
                                                ro6Var.F = documentAttribute.h;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        ro6Var.D = webDocument.url;
                                    } else {
                                        ro6Var.D = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    ro6Var.C = webDocument2.url;
                                    ro6Var.G = webDocument2.size;
                                    ro6Var.B = botInlineResult.id;
                                    ro6Var.H = false;
                                    arrayList3.add(ro6Var);
                                    hashMap.put(ro6Var.B, ro6Var);
                                }
                            }
                        }
                        cwcVar.f = size == arrayList3.size() || cwcVar.r == null;
                    }
                    if (size != arrayList3.size()) {
                        int i12 = size % wallpapersListActivity.O;
                        float f = size;
                        int ceil = (int) Math.ceil(f / r15);
                        if (i12 != 0) {
                            cwcVar.g(((int) Math.ceil(f / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.I.p(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.L.c();
                    break;
                }
                break;
            default:
                z zVar = (z) this.c;
                int i13 = this.b;
                String str4 = (String) this.d;
                if (!zVar.A && (q0dVar = zVar.R) != null) {
                    if (i13 != 13) {
                        boolean equals = "1".equals(str4);
                        if (q0dVar.z != equals) {
                            q0dVar.z = equals;
                            z3f z3fVar = q0dVar.d;
                            if (z3fVar != null) {
                                z3fVar.getClass();
                                k0d.F();
                                break;
                            }
                        }
                    } else if (q0dVar.d != null && !TextUtils.isEmpty(str4)) {
                        hl.g(str4);
                        e S = hl.C3() ? LaunchActivity.S() : null;
                        if (S != null) {
                            if (str4.length() > 80) {
                                str4 = str4.substring(0, 80).concat("…");
                            }
                            d31.b0(S).Q(R.raw.copy, 36, ob6.a0(null, null, 2131742497, str4)).j();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ mpc(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
