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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class et implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ et(l01 l01Var, id[] idVarArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        this.e = l01Var;
        this.f = idVarArr;
        this.b = tLObject;
        this.c = i;
        this.h = uri;
        this.n = context;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        f89 L;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.e;
                TLObject tLObject = (TLObject) this.b;
                int i2 = this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f;
                r47 r47Var = (r47) this.h;
                boolean z3 = this.d;
                String str = (String) this.n;
                boolean z4 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z4) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    uc7.s1(i2).j4(tL_messages_webPage.users, false);
                    uc7.s1(i2).c4(tL_messages_webPage.chats, false);
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
                                        if (r47Var != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(r47Var.k);
                                            kf7.a0(i2).i1(-2, 0, r47Var.r1 ? 1 : 0, r47.B0(r47Var.k), 0L, tL_messages_messages, false);
                                            break;
                                        }
                                    } else {
                                        ex exVar = mVarArr[i].c;
                                        if (exVar.F == webPage && (L = oVar.v0[i].b.L(exVar.b() - 1)) != null) {
                                            oVar.v0[i].c.y(L);
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
                            if (r47Var != null) {
                                r47Var.k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(r47Var.k);
                                kf7.a0(i2).i1(-2, 0, r47Var.r1 ? 1 : 0, r47.B0(r47Var.k), 0L, tL_messages_messages2, false);
                            }
                            ArrayList arrayList = oVar.e0;
                            if (z3) {
                                arrayList.add(tL_webPage);
                            } else {
                                arrayList.set(0, tL_webPage);
                            }
                            if (oVar.e0.size() == 1) {
                                a.b.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                oVar.c0(z3 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    oVar.T(str, false);
                                }
                            }
                        }
                        zh6 zh6Var = new zh6(1);
                        zh6Var.k(tL_webPage.id, tL_webPage);
                        kf7 a0 = kf7.a0(i2);
                        if (!kf7.s0(zh6Var)) {
                            a0.a.c(new cd7(a0, zh6Var, z2 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 1:
                l01 l01Var = (l01) this.e;
                id[] idVarArr = (id[]) this.f;
                TLObject tLObject3 = (TLObject) this.b;
                int i5 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z5 = this.d;
                if (l01Var != null) {
                    l01Var.b();
                } else {
                    try {
                        idVarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    idVarArr[0] = null;
                }
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    uc7.s1(i5).j4(webpagepreview.users, false);
                    uc7.s1(i5).c4(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            jn7.f(i5).k(92, tL_messageMediaWebPage.webpage, uri.toString());
                            String uri2 = uri.toString();
                            if (ea4.h != null && uri2.equals(ea4.i)) {
                                ea4.i = null;
                                if (!z) {
                                    ha4 ha4Var = ea4.h;
                                    ha4Var.g = "open_link";
                                    ha4Var.h = "external";
                                }
                            }
                            if (z) {
                                m01.r(context, uri, z5, false);
                                break;
                            }
                        }
                    }
                }
                z = false;
                String uri22 = uri.toString();
                if (ea4.h != null) {
                    ea4.i = null;
                    if (!z) {
                    }
                }
                if (z) {
                }
                break;
            default:
                qm3 qm3Var = (qm3) this.e;
                int[] iArr = (int[]) this.b;
                String str2 = (String) this.n;
                String str3 = (String) this.f;
                boolean z6 = this.d;
                int i6 = this.c;
                Runnable runnable = (Runnable) this.h;
                if (!qm3Var.l) {
                    qm3Var.g = iArr;
                    bf bfVar = qm3Var.d;
                    co3 co3Var = (co3) bfVar.c;
                    int i7 = bfVar.b;
                    pm3 pm3Var = (pm3) bfVar.d;
                    if (!co3Var.h && i7 == co3Var.p) {
                        String p = DictationAsr.p(str2, str3, z6);
                        co3Var.o = p;
                        if (!p.trim().isEmpty()) {
                            qm3 qm3Var2 = co3Var.n;
                            String str4 = qm3Var2 != null ? qm3Var2.n : null;
                            if (str4 == null) {
                                str4 = pm3Var.t();
                            }
                            co3Var.k(str4);
                        }
                        int length = i6 <= 0 ? str2.length() : DictationAsr.p(str2, str3.substring(0, i6), z6).length();
                        if (!co3Var.g) {
                            co3Var.c.h(length, co3Var.o);
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

    public /* synthetic */ et(qm3 qm3Var, int[] iArr, String str, String str2, boolean z, int i, Runnable runnable) {
        this.e = qm3Var;
        this.b = iArr;
        this.n = str;
        this.f = str2;
        this.d = z;
        this.c = i;
        this.h = runnable;
    }

    public /* synthetic */ et(o oVar, TLObject tLObject, int i, TLRPC.WebPage webPage, r47 r47Var, boolean z, String str) {
        this.e = oVar;
        this.b = tLObject;
        this.c = i;
        this.f = webPage;
        this.h = r47Var;
        this.d = z;
        this.n = str;
    }
}
