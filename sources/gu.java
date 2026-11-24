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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gu implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ gu(k11 k11Var, he[] heVarArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        this.e = k11Var;
        this.f = heVarArr;
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
        u69 K;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.e;
                TLObject tLObject = (TLObject) this.b;
                int i2 = this.c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f;
                k47 k47Var = (k47) this.h;
                boolean z3 = this.d;
                String str = (String) this.n;
                boolean z4 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z4) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    oc7.r1(i2).d4(tL_messages_webPage.users, false);
                    oc7.r1(i2).X3(tL_messages_webPage.chats, false);
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
                                        if (k47Var != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(k47Var.k);
                                            cf7.Y(i2).e1(-2, 0, k47Var.r1 ? 1 : 0, k47.B0(k47Var.k), 0L, tL_messages_messages, false);
                                            break;
                                        }
                                    } else {
                                        ey eyVar = mVarArr[i].c;
                                        if (eyVar.F == webPage && (K = oVar.v0[i].b.K(eyVar.b() - 1)) != null) {
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
                            if (k47Var != null) {
                                k47Var.k.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(k47Var.k);
                                cf7.Y(i2).e1(-2, 0, k47Var.r1 ? 1 : 0, k47.B0(k47Var.k), 0L, tL_messages_messages2, false);
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
                        vh6 vh6Var = new vh6(1);
                        vh6Var.k(tL_webPage, tL_webPage.id);
                        cf7 Y = cf7.Y(i2);
                        if (!cf7.p0(vh6Var)) {
                            Y.a.c(new dd7(Y, vh6Var, z2 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 1:
                k11 k11Var = (k11) this.e;
                he[] heVarArr = (he[]) this.f;
                TLObject tLObject3 = (TLObject) this.b;
                int i5 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z5 = this.d;
                if (k11Var != null) {
                    k11Var.b();
                } else {
                    try {
                        heVarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    heVarArr[0] = null;
                }
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    oc7.r1(i5).d4(webpagepreview.users, false);
                    oc7.r1(i5).X3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            nm7.f(i5).k(92, tL_messageMediaWebPage.webpage, uri.toString());
                            String uri2 = uri.toString();
                            if (ia4.g != null && uri2.equals(ia4.h)) {
                                ia4.h = null;
                                if (!z) {
                                    la4 la4Var = ia4.g;
                                    la4Var.g = "open_link";
                                    la4Var.h = "external";
                                }
                            }
                            if (z) {
                                l11.r(context, uri, z5, false);
                                break;
                            }
                        }
                    }
                }
                z = false;
                String uri22 = uri.toString();
                if (ia4.g != null) {
                    ia4.h = null;
                    if (!z) {
                    }
                }
                if (z) {
                }
                break;
            default:
                jn3 jn3Var = (jn3) this.e;
                int[] iArr = (int[]) this.b;
                String str2 = (String) this.n;
                String str3 = (String) this.f;
                boolean z6 = this.d;
                int i6 = this.c;
                Runnable runnable = (Runnable) this.h;
                if (!jn3Var.l) {
                    jn3Var.g = iArr;
                    yg ygVar = jn3Var.d;
                    vo3 vo3Var = (vo3) ygVar.c;
                    int i7 = ygVar.b;
                    in3 in3Var = (in3) ygVar.d;
                    if (!vo3Var.h && i7 == vo3Var.p) {
                        String o = DictationAsr.o(str2, str3, z6);
                        vo3Var.o = o;
                        if (!o.trim().isEmpty()) {
                            jn3 jn3Var2 = vo3Var.n;
                            String str4 = jn3Var2 != null ? jn3Var2.n : null;
                            if (str4 == null) {
                                str4 = in3Var.t();
                            }
                            vo3Var.k(str4);
                        }
                        int length = i6 <= 0 ? str2.length() : DictationAsr.o(str2, str3.substring(0, i6), z6).length();
                        if (!vo3Var.g) {
                            vo3Var.c.f(length, vo3Var.o);
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

    public /* synthetic */ gu(jn3 jn3Var, int[] iArr, String str, String str2, boolean z, int i, Runnable runnable) {
        this.e = jn3Var;
        this.b = iArr;
        this.n = str;
        this.f = str2;
        this.d = z;
        this.c = i;
        this.h = runnable;
    }

    public /* synthetic */ gu(o oVar, TLObject tLObject, int i, TLRPC.WebPage webPage, k47 k47Var, boolean z, String str) {
        this.e = oVar;
        this.b = tLObject;
        this.c = i;
        this.f = webPage;
        this.h = k47Var;
        this.d = z;
        this.n = str;
    }
}
