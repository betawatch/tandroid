// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bnc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bnc(int i, String str, qac qacVar) {
        this.a = (byte) 4;
        this.b = i;
        this.c = str;
        this.d = qacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cyc cycVar;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                int i = this.b;
                String str = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = oc7.r1(i).l4.G1.f;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "https://tonviewer.com/";
                    } else if (!str2.endsWith("/")) {
                        str2 = str2.concat("/");
                    }
                    StringBuilder k = b10.k(str2, "transaction/");
                    k.append(Uri.encode(str));
                    l11.w(context, k.toString(), false);
                    break;
                }
                break;
            case 1:
                ioc iocVar = (ioc) this.c;
                int i2 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (iocVar.f0 == i2) {
                    iocVar.f(bitmapArr);
                    iocVar.a.run();
                    break;
                }
                break;
            case 2:
                pqc pqcVar = (pqc) this.c;
                int i3 = this.b;
                nsc nscVar = (nsc) this.d;
                int i4 = i3 + 1;
                ArrayList arrayList = pqcVar.w;
                if (i4 < arrayList.size()) {
                    ((nsc) arrayList.get(i4)).a.requestFocus();
                    break;
                } else {
                    gm.t1(nscVar);
                    break;
                }
            case 3:
                hsc hscVar = (hsc) this.c;
                int i5 = this.b;
                nsc nscVar2 = (nsc) this.d;
                int i6 = i5 + 1;
                ArrayList arrayList2 = hscVar.d;
                if (i6 < arrayList2.size()) {
                    ((nsc) arrayList2.get(i6)).a.requestFocus();
                    break;
                } else {
                    gm.t1(nscVar2);
                    break;
                }
            case 4:
                int i7 = this.b;
                String str3 = (String) this.c;
                qac qacVar = (qac) this.d;
                zsc[] zscVarArr = zsc.f;
                zsc zscVar = zscVarArr[i7];
                if (zscVar == null) {
                    zscVar = new zsc(i7);
                    zscVarArr[i7] = zscVar;
                }
                zscVar.d(str3, true, null, null, qacVar);
                break;
            case 5:
                qtc qtcVar = (qtc) this.c;
                int i8 = this.b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = qtcVar.e;
                WallpapersListActivity wallpapersListActivity = qtcVar.F;
                ArrayList arrayList3 = qtcVar.d;
                if (i8 == qtcVar.w) {
                    qtcVar.s = 0;
                    int size = arrayList3.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        qtcVar.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i9);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                no6 no6Var = new no6();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.Y0(false), false, null, false);
                                    TLRPC.PhotoSize w2 = bc4.w(botInlineResult.photo.sizes, nm7.q5, false, null, false);
                                    if (w != null) {
                                        no6Var.E = w.w;
                                        no6Var.F = w.h;
                                        no6Var.L = w;
                                        no6Var.K = botInlineResult.photo;
                                        no6Var.G = w.size;
                                        no6Var.M = w2;
                                        no6Var.B = botInlineResult.id;
                                        no6Var.H = false;
                                        arrayList3.add(no6Var);
                                        hashMap.put(no6Var.B, no6Var);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i10);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                no6Var.E = documentAttribute.w;
                                                no6Var.F = documentAttribute.h;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        no6Var.D = webDocument.url;
                                    } else {
                                        no6Var.D = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    no6Var.C = webDocument2.url;
                                    no6Var.G = webDocument2.size;
                                    no6Var.B = botInlineResult.id;
                                    no6Var.H = false;
                                    arrayList3.add(no6Var);
                                    hashMap.put(no6Var.B, no6Var);
                                }
                            }
                        }
                        qtcVar.f = size == arrayList3.size() || qtcVar.r == null;
                    }
                    if (size != arrayList3.size()) {
                        int i11 = size % wallpapersListActivity.O;
                        float f = size;
                        int ceil = (int) Math.ceil(f / r15);
                        if (i11 != 0) {
                            qtcVar.g(((int) Math.ceil(f / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.I.p(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.L.c();
                    break;
                }
                break;
            default:
                z zVar = (z) this.c;
                int i12 = this.b;
                String str4 = (String) this.d;
                if (!zVar.A && (cycVar = zVar.R) != null) {
                    if (i12 != 13) {
                        boolean equals = "1".equals(str4);
                        if (cycVar.z != equals) {
                            cycVar.z = equals;
                            f8e f8eVar = cycVar.d;
                            if (f8eVar != null) {
                                f8eVar.getClass();
                                wxc.F();
                                break;
                            }
                        }
                    } else if (cycVar.d != null && !TextUtils.isEmpty(str4)) {
                        gm.g(str4);
                        d S = gm.C3() ? LaunchActivity.S() : null;
                        if (S != null) {
                            if (str4.length() > 80) {
                                str4 = str4.substring(0, 80).concat("…");
                            }
                            c41.b0(S).Q(R.raw.copy, 36, jb6.a0(null, null, 2131742529, str4)).j();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ bnc(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
