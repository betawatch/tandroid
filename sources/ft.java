// default package

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ft implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ft(c01 c01Var, hd[] hdVarArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        this.e = c01Var;
        this.f = hdVarArr;
        this.b = tLObject;
        this.c = i;
        this.h = uri;
        this.n = context;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s49 K;
        int i = 0;
        boolean z = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.e;
                TLObject tLObject = (TLObject) this.b;
                int i2 = this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f;
                k27 k27Var = (k27) this.h;
                boolean z2 = this.d;
                String str = (String) this.n;
                boolean z3 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z3) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    na7.q1(i2).b4(tL_messages_webPage.users, false);
                    na7.q1(i2).V3(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (!(tLObject2 instanceof TLRPC.TL_webPage)) {
                    if (tLObject2 instanceof TLRPC.TL_webPageNotModified) {
                        TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject2;
                        TL_iv.Page page = webPage.cached_page;
                        if (page != null) {
                            int i3 = page.views;
                            int i4 = tL_webPageNotModified.cached_page_views;
                            if (i3 != i4) {
                                page.views = i4;
                                page.flags |= 8;
                                while (true) {
                                    m[] mVarArr = oVar.v0;
                                    if (i >= mVarArr.length) {
                                        if (k27Var != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(k27Var.k);
                                            ad7.Y(i2).e1(-2, 0, k27Var.r1 ? 1 : 0, k27.B0(k27Var.k), 0L, tL_messages_messages, false);
                                            break;
                                        }
                                    } else {
                                        dx dxVar = mVarArr[i].c;
                                        if (dxVar.F == webPage && (K = oVar.v0[i].b.K(dxVar.b() - 1)) != null) {
                                            oVar.v0[i].c.y(K);
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                    if (tL_webPage.cached_page != null) {
                        if (!oVar.e0.isEmpty() && oVar.e0.get(0) == webPage) {
                            if (k27Var != null) {
                                k27Var.k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(k27Var.k);
                                ad7.Y(i2).e1(-2, 0, k27Var.r1 ? 1 : 0, k27.B0(k27Var.k), 0L, tL_messages_messages2, false);
                            }
                            ArrayList arrayList = oVar.e0;
                            if (z2) {
                                arrayList.add(tL_webPage);
                            } else {
                                arrayList.set(0, tL_webPage);
                            }
                            if (oVar.e0.size() == 1) {
                                a.b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                oVar.c0(z2 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    oVar.T(str, false);
                                }
                            }
                        }
                        vf6 vf6Var = new vf6(1);
                        vf6Var.k(tL_webPage, tL_webPage.id);
                        ad7 Y = ad7.Y(i2);
                        if (!ad7.p0(vf6Var)) {
                            Y.a.c(new cb7(Y, vf6Var, z ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 1:
                c01 c01Var = (c01) this.e;
                hd[] hdVarArr = (hd[]) this.f;
                TLObject tLObject3 = (TLObject) this.b;
                int i5 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z4 = this.d;
                if (c01Var != null) {
                    c01Var.b();
                } else {
                    try {
                        hdVarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    hdVarArr[0] = null;
                }
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    na7.q1(i5).b4(webpagepreview.users, false);
                    na7.q1(i5).V3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            kk7.f(i5).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            break;
                        }
                    }
                }
                d01.q(context, uri, z4, false);
                break;
            default:
                yl3 yl3Var = (yl3) this.e;
                int[] iArr = (int[]) this.b;
                String str2 = (String) this.n;
                String str3 = (String) this.f;
                boolean z5 = this.d;
                int i6 = this.c;
                Runnable runnable = (Runnable) this.h;
                if (!yl3Var.l) {
                    yl3Var.g = iArr;
                    yf yfVar = yl3Var.d;
                    ln3 ln3Var = (ln3) yfVar.c;
                    int i7 = yfVar.b;
                    xl3 xl3Var = (xl3) yfVar.d;
                    if (!ln3Var.h && i7 == ln3Var.p) {
                        String o = DictationAsr.o(str2, str3, z5);
                        ln3Var.o = o;
                        if (!o.trim().isEmpty()) {
                            yl3 yl3Var2 = ln3Var.n;
                            String str4 = yl3Var2 != null ? yl3Var2.n : null;
                            if (str4 == null) {
                                str4 = xl3Var.u();
                            }
                            ln3Var.k(str4);
                        }
                        int length = i6 <= 0 ? str2.length() : DictationAsr.o(str2, str3.substring(0, i6), z5).length();
                        if (!ln3Var.g) {
                            ln3Var.c.f(length, ln3Var.o);
                        }
                    }
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ft(yl3 yl3Var, int[] iArr, String str, String str2, boolean z, int i, Runnable runnable) {
        this.e = yl3Var;
        this.b = iArr;
        this.n = str;
        this.f = str2;
        this.d = z;
        this.c = i;
        this.h = runnable;
    }

    public /* synthetic */ ft(o oVar, TLObject tLObject, int i, TLRPC.WebPage webPage, k27 k27Var, boolean z, String str) {
        this.e = oVar;
        this.b = tLObject;
        this.c = i;
        this.f = webPage;
        this.h = k27Var;
        this.d = z;
        this.n = str;
    }
}
