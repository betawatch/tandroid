package bi;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
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
                org.telegram.messenger.g0.h3(new aa.s((z) this.b, tLObject, (Context) this.c, 7));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ai.d0((y) this.b, tLObject, (String) this.c, tL_error, 3));
                break;
            case 2:
                k7 k7Var = (k7) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    qp.s1(k7Var.a).Y3(tL_payments_uniqueStarGift.users, false);
                    qp.s1(k7Var.a).S3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.h3(new a1.e(25, k7Var, tL_payments_uniqueStarGift));
                        break;
                    }
                }
                org.telegram.messenger.g0.h3(new a1.e(26, u1Var, tL_error));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.d0((k7) this.b, tLObject, (aa.s) this.c, tL_error, 7));
                break;
            case 4:
                k7 k7Var2 = (k7) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(k7Var2.a).Y3(updates.users, false);
                    qp.s1(k7Var2.a).S3(updates.chats, false);
                }
                org.telegram.messenger.g0.h3(new ai.d0(k7Var2, tL_error, tLObject, inputSavedStarGift, 8));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new aa.s((Object) tLObject, this.b, (String) this.c, 16));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new aa.s((ea) this.b, tLObject, tL_error, (c20) this.c, 17));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new aa.s((ea) this.b, tLObject, (Runnable) this.c, 18));
                break;
            case 8:
                di.z3 z3Var = (di.z3) this.b;
                fi.s8 s8Var = (fi.s8) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    qp.s1(z3Var.x.l2).O3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new di.w3(s8Var, 0));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new aa.s((di.j6) this.b, tLObject, (Runnable) this.c, 27));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new ai.d0((di.m6) this.b, tLObject, (c20) this.c, tL_error));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new aa.s((di.y9) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 29));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new fi.x1((fi.y1) this.b, (String) this.c, tLObject, 0));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new fi.x1((fi.e3) this.b, tLObject, (qp) this.c, false, 3));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new fi.x1((fi.n8) this.b, tLObject, (qp) this.c, false, 6));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new fi.x1((boolean[]) this.b, tLObject, (hi.o1) this.c, false, 12));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new fi.x1((hi.q3) this.b, tLObject, (org.telegram.ui.ActionBar.u1) this.c, false, 15));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new fi.x1((jg.i1) this.b, (String) this.c, tLObject, 18));
                break;
            case 18:
                jg.b2 b2Var = (jg.b2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.h3(new fi.x1(b2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 21));
                    break;
                }
                break;
            case 19:
                org.telegram.messenger.g0.h3(new fi.x1((kg.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, false, 24));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new ha.b(17, (kg.i0) this.b, (org.telegram.ui.Components.r2) this.c));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new fi.x1((kg.x1) this.b, tLObject, (SharedPreferences) this.c, false, 29));
                break;
            case 22:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.c, (Runnable) this.b, tLObject, tL_error);
                break;
            case 23:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 24:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 25:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.c, tLObject, tL_error);
                break;
            case 26:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList4 = null;
                    int i7 = 0;
                    while (true) {
                        boolean z9 = true;
                        if (i7 >= size) {
                            org.telegram.messenger.g0.h3(new u7(e6Var, arrayList4, z9, 13));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i7);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    org.telegram.messenger.w7.G(p10.s0);
                                    File J = org.telegram.messenger.w7.J(tL_wallPaper.document, str, true, true);
                                    int size2 = arrayList3.size();
                                    String str2 = str;
                                    ?? r14 = str2;
                                    int i10 = 0;
                                    ?? r13 = str2;
                                    while (i10 < size2) {
                                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList3.get(i10);
                                        if (h6Var.o.equals(tL_wallPaper.slug)) {
                                            if (r14 == null) {
                                                r14 = Boolean.valueOf(J.exists());
                                            }
                                            if (r13 != 0 || r14.booleanValue()) {
                                                arrayList2 = arrayList3;
                                                r13 = org.telegram.ui.ActionBar.e6.b(r13, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, h6Var);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(h6Var);
                                            } else {
                                                String r10 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                                                if (e6Var.b == null) {
                                                    e6Var.b = new HashMap();
                                                }
                                                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) e6Var.b.get(r10);
                                                if (d6Var == null) {
                                                    d6Var = new org.telegram.ui.ActionBar.d6();
                                                    arrayList2 = arrayList3;
                                                    d6Var.b = new ArrayList();
                                                    d6Var.a = tL_wallPaper;
                                                    e6Var.b.put(r10, d6Var);
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                d6Var.b.add(h6Var);
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
            case 27:
                org.telegram.messenger.g0.h3(new l2.z0((org.telegram.ui.ActionBar.j6) this.b, tLObject, (org.telegram.ui.ActionBar.j6) this.c, 21));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6((org.telegram.ui.h8) this.b, tL_error, tLObject, (Calendar) this.c, 2));
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.o1((org.telegram.ui.pc) this.b, tLObject, (org.telegram.ui.ActionBar.j6) this.c, 10));
                break;
        }
    }

    public /* synthetic */ j(Context context, Runnable runnable) {
        this.a = 22;
        this.c = context;
        this.b = runnable;
    }
}
