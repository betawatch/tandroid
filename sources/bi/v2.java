package bi;

import android.content.Context;
import android.content.SharedPreferences;
import di.u8;
import hi.l8;
import hi.q8;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Boolean] */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new aa.r((wp0) this.b, tL_error, (org.telegram.ui.ActionBar.e2) this.c, 6));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new aa.r((o5) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 9));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new aa.r((di.t) this.b, tLObject, (Context) this.c, 13));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.r(this.b, (Object) tLObject, (String) this.c, (Object) tL_error, 6));
                break;
            case 4:
                di.c6 c6Var = (di.c6) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    np.s1(c6Var.a).Y3(tL_payments_uniqueStarGift.users, false);
                    np.s1(c6Var.a).S3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.h3(new c1.c(27, c6Var, tL_payments_uniqueStarGift));
                        break;
                    }
                }
                org.telegram.messenger.g0.h3(new c1.c(28, t1Var, tL_error));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new ai.r((di.c6) this.b, tLObject, (aa.r) this.c, tL_error, 10));
                break;
            case 6:
                di.c6 c6Var2 = (di.c6) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.s1(c6Var2.a).Y3(updates.users, false);
                    np.s1(c6Var2.a).S3(updates.chats, false);
                }
                org.telegram.messenger.g0.h3(new ai.r(c6Var2, tL_error, tLObject, inputSavedStarGift, 11));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new aa.r((Object) tLObject, this.b, (String) this.c, 22));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new aa.r((u8) this.b, tLObject, tL_error, (z10) this.c, 23));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new aa.r((u8) this.b, tLObject, (Runnable) this.c, 24));
                break;
            case 10:
                fi.t3 t3Var = (fi.t3) this.b;
                q8 q8Var = (q8) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    np.s1(t3Var.x.m2).O3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new fi.q3(q8Var, 0));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new fi.s5((fi.c6) this.b, tLObject, (Runnable) this.c, 2));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new ai.r((fi.g6) this.b, tLObject, (z10) this.c, tL_error, 15));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new fi.s5(this.b, (Object) tLObject, this.c, 4));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new fi.s5(this.b, this.c, tLObject, 7));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new fi.s5((hi.c3) this.b, tLObject, (np) this.c, 10));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new fi.s5((l8) this.b, tLObject, (np) this.c, 13));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new fi.s5(this.b, this.c, tLObject, 18));
                break;
            case 18:
                jg.a2 a2Var = (jg.a2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.h3(new fi.s5((Object) a2Var, (Object) tL_messages_searchStickerSets, tLObject, 21));
                    break;
                }
                break;
            case 19:
                org.telegram.messenger.g0.h3(new fi.s5(this.b, (Object) tLObject, this.c, 24));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new hi.h4(27, (kg.i0) this.b, (org.telegram.ui.Components.a2) this.c));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new fi.s5((kg.z1) this.b, tLObject, (SharedPreferences) this.c, 29));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new ki.n((boolean[]) this.b, tLObject, (ki.p1) this.c, 1));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new ki.n((ki.n3) this.b, tLObject, (org.telegram.ui.ActionBar.t1) this.c, 4));
                break;
            case 24:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 25:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 26:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 27:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.c, tLObject, tL_error);
                break;
            case 28:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList4 = null;
                    int i7 = 0;
                    while (true) {
                        boolean z10 = true;
                        if (i7 >= size) {
                            org.telegram.messenger.g0.h3(new di.m6(d6Var, arrayList4, z10, 13));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i7);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    w7.G(m10.t0);
                                    File J = w7.J(tL_wallPaper.document, str, true, true);
                                    int size2 = arrayList3.size();
                                    String str2 = str;
                                    ?? r14 = str2;
                                    int i10 = 0;
                                    ?? r13 = str2;
                                    while (i10 < size2) {
                                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) arrayList3.get(i10);
                                        if (g6Var.o.equals(tL_wallPaper.slug)) {
                                            if (r14 == null) {
                                                r14 = Boolean.valueOf(J.exists());
                                            }
                                            if (r13 != 0 || r14.booleanValue()) {
                                                arrayList2 = arrayList3;
                                                r13 = org.telegram.ui.ActionBar.d6.b(r13, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, g6Var);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(g6Var);
                                            } else {
                                                String r10 = w7.r(null, tL_wallPaper.document);
                                                if (d6Var.b == null) {
                                                    d6Var.b = new HashMap();
                                                }
                                                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) d6Var.b.get(r10);
                                                if (c6Var3 == null) {
                                                    c6Var3 = new org.telegram.ui.ActionBar.c6();
                                                    arrayList2 = arrayList3;
                                                    c6Var3.b = new ArrayList();
                                                    c6Var3.a = tL_wallPaper;
                                                    d6Var.b.put(r10, c6Var3);
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                c6Var3.b.add(g6Var);
                                            }
                                        } else {
                                            arrayList2 = arrayList3;
                                        }
                                        i10++;
                                        arrayList3 = arrayList2;
                                        r13 = r13;
                                    }
                                    arrayList = arrayList3;
                                    if (r13 != 0) {
                                        r13.recycle();
                                    }
                                    i7++;
                                    arrayList3 = arrayList;
                                    str = null;
                                }
                            }
                            arrayList = arrayList3;
                            i7++;
                            arrayList3 = arrayList;
                            str = null;
                        }
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new ki.n((org.telegram.ui.ActionBar.i6) this.b, tLObject, (org.telegram.ui.ActionBar.i6) this.c, 22));
                break;
        }
    }
}
