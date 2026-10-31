package gf;

import a0.h;
import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.hq;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.f4;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import s4.c1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ c(e eVar, x1[] x1VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z10) {
        this.e = eVar;
        this.f = x1VarArr;
        this.b = tLObject;
        this.c = i10;
        this.h = uri;
        this.n = context;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c1 K;
        int i10 = 0;
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                x1[] x1VarArr = (x1[]) this.f;
                TLObject tLObject = this.b;
                int i11 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z10 = this.d;
                if (eVar != null) {
                    eVar.b();
                } else {
                    try {
                        x1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    x1VarArr[0] = null;
                }
                if (tLObject instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                    vp.r1(i11).V3(webpagepreview.users, false);
                    vp.r1(i11).P3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) && webPage.cached_page != null) {
                            zs.f(i11).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            break;
                        }
                    }
                }
                f.q(context, uri, z10, false, false, null, null, false, true, false);
                break;
            default:
                h4 h4Var = (h4) this.e;
                TLObject tLObject2 = this.b;
                int i12 = this.c;
                TLRPC.WebPage webPage2 = (TLRPC.WebPage) this.f;
                jj jjVar = (jj) this.h;
                boolean z11 = this.d;
                String str = (String) this.n;
                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject3 = tLObject2;
                if (z12) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    vp.r1(i12).V3(tL_messages_webPage.users, false);
                    vp.r1(i12).P3(tL_messages_webPage.chats, false);
                    tLObject3 = tL_messages_webPage.webpage;
                }
                if (!(tLObject3 instanceof TLRPC.TL_webPage)) {
                    if (tLObject3 instanceof TLRPC.TL_webPageNotModified) {
                        TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject3;
                        TL_iv.Page page = webPage2.cached_page;
                        if (page != null) {
                            int i13 = page.views;
                            int i14 = tL_webPageNotModified.cached_page_views;
                            if (i13 != i14) {
                                page.views = i14;
                                page.flags |= 8;
                                while (true) {
                                    l3[] l3VarArr = h4Var.u0;
                                    if (i10 >= l3VarArr.length) {
                                        if (jjVar != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(jjVar.k);
                                            hs.a0(i12).h1(-2, 0, jjVar.p1 ? 1 : 0, jj.B0(jjVar.k), 0L, tL_messages_messages, false);
                                            break;
                                        }
                                    } else {
                                        f4 f4Var = l3VarArr[i10].c;
                                        if (f4Var.E == webPage2 && (K = h4Var.u0[i10].b.K(f4Var.b() - 1)) != null) {
                                            h4Var.u0[i10].c.y(K);
                                        }
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject3;
                    if (tL_webPage.cached_page != null) {
                        if (!h4Var.d0.isEmpty() && h4Var.d0.get(0) == webPage2) {
                            if (jjVar != null) {
                                jjVar.k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(jjVar.k);
                                hs.a0(i12).h1(-2, 0, jjVar.p1 ? 1 : 0, jj.B0(jjVar.k), 0L, tL_messages_messages2, false);
                            }
                            if (z11) {
                                h4Var.d0.add(tL_webPage);
                            } else {
                                h4Var.d0.set(0, tL_webPage);
                            }
                            if (h4Var.d0.size() == 1) {
                                w0.b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                h4Var.c0(z11 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    h4Var.T(str, false);
                                }
                            }
                        }
                        h hVar = new h(1);
                        hVar.k(tL_webPage, tL_webPage.id);
                        hs a02 = hs.a0(i12);
                        if (!hs.s0(hVar)) {
                            a02.a.c(new hq(a02, hVar, i10));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(h4 h4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, jj jjVar, boolean z10, String str) {
        this.e = h4Var;
        this.b = tLObject;
        this.c = i10;
        this.f = webPage;
        this.h = jjVar;
        this.d = z10;
        this.n = str;
    }
}
