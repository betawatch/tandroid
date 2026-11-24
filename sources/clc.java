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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class clc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ clc(int i, String str, p8c p8cVar) {
        this.a = (byte) 4;
        this.b = i;
        this.c = str;
        this.d = p8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bwc bwcVar;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                int i = this.b;
                String str = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = na7.q1(i).k4.G1.f;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "https://tonviewer.com/";
                    } else if (!str2.endsWith("/")) {
                        str2 = str2.concat("/");
                    }
                    StringBuilder k = b00.k(str2, "transaction/");
                    k.append(Uri.encode(str));
                    d01.v(context, k.toString(), false);
                    break;
                }
                break;
            case 1:
                jmc jmcVar = (jmc) this.c;
                int i2 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (jmcVar.f0 == i2) {
                    jmcVar.f(bitmapArr);
                    jmcVar.a.run();
                    break;
                }
                break;
            case 2:
                noc nocVar = (noc) this.c;
                int i3 = this.b;
                lqc lqcVar = (lqc) this.d;
                int i4 = i3 + 1;
                ArrayList arrayList = nocVar.w;
                if (i4 < arrayList.size()) {
                    ((lqc) arrayList.get(i4)).a.requestFocus();
                    break;
                } else {
                    gl.t1(lqcVar);
                    break;
                }
            case 3:
                fqc fqcVar = (fqc) this.c;
                int i5 = this.b;
                lqc lqcVar2 = (lqc) this.d;
                int i6 = i5 + 1;
                ArrayList arrayList2 = fqcVar.d;
                if (i6 < arrayList2.size()) {
                    ((lqc) arrayList2.get(i6)).a.requestFocus();
                    break;
                } else {
                    gl.t1(lqcVar2);
                    break;
                }
            case 4:
                int i7 = this.b;
                String str3 = (String) this.c;
                p8c p8cVar = (p8c) this.d;
                xqc[] xqcVarArr = xqc.f;
                xqc xqcVar = xqcVarArr[i7];
                if (xqcVar == null) {
                    xqcVar = new xqc(i7);
                    xqcVarArr[i7] = xqcVar;
                }
                xqcVar.d(str3, true, null, null, p8cVar);
                break;
            case 5:
                orc orcVar = (orc) this.c;
                int i8 = this.b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = orcVar.e;
                WallpapersListActivity wallpapersListActivity = orcVar.F;
                ArrayList arrayList3 = orcVar.d;
                if (i8 == orcVar.w) {
                    orcVar.s = 0;
                    int size = arrayList3.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        orcVar.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i9);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                nm6 nm6Var = new nm6();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), false, null, false);
                                    TLRPC.PhotoSize w2 = ba4.w(botInlineResult.photo.sizes, kk7.q5, false, null, false);
                                    if (w != null) {
                                        nm6Var.E = w.w;
                                        nm6Var.F = w.h;
                                        nm6Var.L = w;
                                        nm6Var.K = botInlineResult.photo;
                                        nm6Var.G = w.size;
                                        nm6Var.M = w2;
                                        nm6Var.B = botInlineResult.id;
                                        nm6Var.H = false;
                                        arrayList3.add(nm6Var);
                                        hashMap.put(nm6Var.B, nm6Var);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i10);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                nm6Var.E = documentAttribute.w;
                                                nm6Var.F = documentAttribute.h;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        nm6Var.D = webDocument.url;
                                    } else {
                                        nm6Var.D = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    nm6Var.C = webDocument2.url;
                                    nm6Var.G = webDocument2.size;
                                    nm6Var.B = botInlineResult.id;
                                    nm6Var.H = false;
                                    arrayList3.add(nm6Var);
                                    hashMap.put(nm6Var.B, nm6Var);
                                }
                            }
                        }
                        orcVar.f = size == arrayList3.size() || orcVar.r == null;
                    }
                    if (size != arrayList3.size()) {
                        int i11 = size % wallpapersListActivity.O;
                        float f = size;
                        int ceil = (int) Math.ceil(f / r15);
                        if (i11 != 0) {
                            orcVar.g(((int) Math.ceil(f / wallpapersListActivity.O)) - 1);
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
                if (!zVar.A && (bwcVar = zVar.R) != null) {
                    if (i12 != 13) {
                        boolean equals = "1".equals(str4);
                        if (bwcVar.z != equals) {
                            bwcVar.z = equals;
                            c6e c6eVar = bwcVar.d;
                            if (c6eVar != null) {
                                c6eVar.getClass();
                                vvc.E();
                                break;
                            }
                        }
                    } else if (bwcVar.d != null && !TextUtils.isEmpty(str4)) {
                        gl.g(str4);
                        d S = gl.C3() ? LaunchActivity.S() : null;
                        if (S != null) {
                            if (str4.length() > 80) {
                                str4 = str4.substring(0, 80).concat("…");
                            }
                            u21.b0(S).Q(R.raw.copy, 36, k96.a0(null, null, 2131742603, str4)).j();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ clc(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
