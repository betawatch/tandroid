package ai;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.xp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.e4;
import org.telegram.ui.g4;
import org.telegram.ui.k3;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ v(w wVar, int[] iArr, String str, String str2, boolean z10, int i7, Runnable runnable) {
        this.e = wVar;
        this.f = iArr;
        this.d = str;
        this.h = str2;
        this.c = z10;
        this.b = i7;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4.f1 K;
        int i7 = 0;
        switch (this.a) {
            case 0:
                w wVar = (w) this.e;
                int[] iArr = (int[]) this.f;
                String str = (String) this.d;
                String str2 = (String) this.h;
                boolean z10 = this.c;
                int i10 = this.b;
                Runnable runnable = (Runnable) this.n;
                if (!wVar.l) {
                    wVar.g = iArr;
                    u1 u1Var = wVar.d;
                    f2 f2Var = (f2) u1Var.c;
                    int i11 = u1Var.b;
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) u1Var.d;
                    if (!f2Var.j && i11 == f2Var.C) {
                        String q10 = DictationAsr.q(str, str2, z10);
                        f2Var.B = q10;
                        if (!q10.trim().isEmpty()) {
                            w wVar2 = f2Var.A;
                            String str3 = wVar2 != null ? wVar2.n : null;
                            if (str3 == null) {
                                str3 = a0Var.i();
                            }
                            f2Var.s(str3);
                        }
                        int length = i10 <= 0 ? str.length() : DictationAsr.q(str, str2.substring(0, i10), z10).length();
                        if (!f2Var.i) {
                            f2Var.d.l(length, f2Var.B);
                        }
                    }
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                g4 g4Var = (g4) this.e;
                TLObject tLObject = (TLObject) this.f;
                int i12 = this.b;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                gj gjVar = (gj) this.n;
                boolean z11 = this.c;
                String str4 = (String) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z12) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    np.u1(i12).f4(tL_messages_webPage.users, false);
                    np.u1(i12).Z3(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (!(tLObject2 instanceof TLRPC.TL_webPage)) {
                    if (tLObject2 instanceof TLRPC.TL_webPageNotModified) {
                        TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject2;
                        TL_iv.Page page = webPage.cached_page;
                        if (page != null) {
                            int i13 = page.views;
                            int i14 = tL_webPageNotModified.cached_page_views;
                            if (i13 != i14) {
                                page.views = i14;
                                page.flags |= 8;
                                while (true) {
                                    k3[] k3VarArr = g4Var.v0;
                                    if (i7 >= k3VarArr.length) {
                                        if (gjVar != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(gjVar.k);
                                            ur.a0(i12).h1(-2, 0, gjVar.r1 ? 1 : 0, gj.B0(gjVar.k), 0L, tL_messages_messages, false);
                                            break;
                                        }
                                    } else {
                                        e4 e4Var = k3VarArr[i7].c;
                                        if (e4Var.F == webPage && (K = g4Var.v0[i7].b.K(e4Var.b() - 1)) != null) {
                                            g4Var.v0[i7].c.y(K);
                                        }
                                        i7++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                    if (tL_webPage.cached_page != null) {
                        if (!g4Var.e0.isEmpty() && g4Var.e0.get(0) == webPage) {
                            if (gjVar != null) {
                                gjVar.k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(gjVar.k);
                                ur.a0(i12).h1(-2, 0, gjVar.r1 ? 1 : 0, gj.B0(gjVar.k), 0L, tL_messages_messages2, false);
                            }
                            if (z11) {
                                g4Var.e0.add(tL_webPage);
                            } else {
                                g4Var.e0.set(0, tL_webPage);
                            }
                            if (g4Var.e0.size() == 1) {
                                org.telegram.messenger.t0.b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                g4Var.c0(z11 ? 1 : 0, tL_webPage, false);
                                if (str4 != null) {
                                    g4Var.T(str4, false);
                                }
                            }
                        }
                        a0.h hVar = new a0.h(1);
                        hVar.k(tL_webPage, tL_webPage.id);
                        ur a02 = ur.a0(i12);
                        if (!ur.s0(hVar)) {
                            a02.a.c(new xp(a02, hVar, i7));
                            break;
                        }
                    }
                }
                break;
            default:
                vf.b bVar = (vf.b) this.e;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.f;
                TLObject tLObject3 = (TLObject) this.d;
                int i15 = this.b;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z13 = this.c;
                if (bVar != null) {
                    bVar.b();
                } else {
                    try {
                        t1VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    t1VarArr[0] = null;
                }
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    np.u1(i15).f4(webpagepreview.users, false);
                    np.u1(i15).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            ls.f(i15).k(91, tL_messageMediaWebPage.webpage, uri.toString());
                            break;
                        }
                    }
                }
                vf.c.q(context, uri, z13, false);
                break;
        }
    }

    public /* synthetic */ v(g4 g4Var, TLObject tLObject, int i7, TLRPC.WebPage webPage, gj gjVar, boolean z10, String str) {
        this.e = g4Var;
        this.f = tLObject;
        this.b = i7;
        this.h = webPage;
        this.n = gjVar;
        this.c = z10;
        this.d = str;
    }

    public /* synthetic */ v(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLObject tLObject, int i7, Uri uri, Context context, boolean z10) {
        this.e = bVar;
        this.f = t1VarArr;
        this.d = tLObject;
        this.b = i7;
        this.h = uri;
        this.n = context;
        this.c = z10;
    }
}
