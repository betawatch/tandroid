package ai;

import android.content.Context;
import android.content.SharedPreferences;
import ci.e9;
import ei.aa;
import ei.h9;
import gi.o8;
import gi.t8;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f3(int i3, Object obj, Object obj2) {
        this.a = i3;
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
                org.telegram.messenger.g0.h3(new k3((vp0) this.b, tL_error, (org.telegram.ui.ActionBar.d2) this.c, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new k3((w5) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 3));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new k3((ci.v) this.b, tLObject, (Context) this.c, 10));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new z3((ci.u) this.b, tLObject, (String) this.c, tL_error, 5));
                break;
            case 4:
                ci.l6 l6Var = (ci.l6) this.b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    hp.s1(l6Var.a).Y3(tL_payments_uniqueStarGift.users, false);
                    hp.s1(l6Var.a).S3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.h3(new ci.e0(2, l6Var, tL_payments_uniqueStarGift));
                        break;
                    }
                }
                org.telegram.messenger.g0.h3(new ci.e0(3, s1Var, tL_error));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new z3((ci.l6) this.b, tLObject, (k3) this.c, tL_error, 9));
                break;
            case 6:
                ci.l6 l6Var2 = (ci.l6) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    hp.s1(l6Var2.a).Y3(updates.users, false);
                    hp.s1(l6Var2.a).S3(updates.chats, false);
                }
                org.telegram.messenger.g0.h3(new z3(l6Var2, tL_error, tLObject, inputSavedStarGift, 10));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new k3(tLObject, (ci.o0) this.b, (String) this.c, 19));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new k3((e9) this.b, tLObject, tL_error, (u10) this.c, 20));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new k3((e9) this.b, tLObject, (Runnable) this.c, 21));
                break;
            case 10:
                ei.g1 g1Var = (ei.g1) this.b;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    hp.s1(g1Var.e).O3(updates2, false);
                    break;
                }
                break;
            case 11:
                ei.b4 b4Var = (ei.b4) this.b;
                t8 t8Var = (t8) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    hp.s1(b4Var.x.m2).O3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new ei.y3(t8Var, 0));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new k3((ei.k6) this.b, tLObject, (Runnable) this.c, 29));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new z3((ei.n6) this.b, tLObject, (u10) this.c, tL_error, 14));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new h9((aa) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 1));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new h9((gi.x1) this.b, (String) this.c, tLObject, 4));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new h9((gi.c3) this.b, tLObject, (hp) this.c, 7));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new h9((o8) this.b, tLObject, (hp) this.c, 10));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new h9((boolean[]) this.b, tLObject, (ii.p1) this.c, 14));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new h9((ii.q3) this.b, tLObject, (org.telegram.ui.ActionBar.s1) this.c, 17));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new h9((kg.e1) this.b, (String) this.c, tLObject, 23));
                break;
            case 21:
                kg.w1 w1Var = (kg.w1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.h3(new h9(w1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 26));
                    break;
                }
                break;
            case 22:
                org.telegram.messenger.g0.h3(new h9((lg.z) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 29));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new ii.e(23, (lg.j0) this.b, (org.telegram.ui.Components.o2) this.c));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new lg.y((lg.y1) this.b, tLObject, (SharedPreferences) this.c, 4));
                break;
            case 25:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 26:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 27:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 28:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.c, tLObject, tL_error);
                break;
            default:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList4 = null;
                    int i3 = 0;
                    while (true) {
                        boolean z10 = true;
                        if (i3 >= size) {
                            org.telegram.messenger.g0.h3(new ci.v6(d6Var, arrayList4, z10, 13));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i3);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    w7.G(h10.t0);
                                    File K = w7.K(tL_wallPaper.document, str, true, true);
                                    int size2 = arrayList3.size();
                                    String str2 = str;
                                    ?? r14 = str2;
                                    int i10 = 0;
                                    ?? r13 = str2;
                                    while (i10 < size2) {
                                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) arrayList3.get(i10);
                                        if (g6Var.o.equals(tL_wallPaper.slug)) {
                                            if (r14 == null) {
                                                r14 = Boolean.valueOf(K.exists());
                                            }
                                            if (r13 != 0 || r14.booleanValue()) {
                                                arrayList2 = arrayList3;
                                                r13 = org.telegram.ui.ActionBar.d6.b(r13, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), K, g6Var);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(g6Var);
                                            } else {
                                                String r5 = w7.r(null, tL_wallPaper.document);
                                                if (d6Var.b == null) {
                                                    d6Var.b = new HashMap();
                                                }
                                                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) d6Var.b.get(r5);
                                                if (c6Var == null) {
                                                    c6Var = new org.telegram.ui.ActionBar.c6();
                                                    arrayList2 = arrayList3;
                                                    c6Var.b = new ArrayList();
                                                    c6Var.a = tL_wallPaper;
                                                    d6Var.b.put(r5, c6Var);
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                c6Var.b.add(g6Var);
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
                                    i3++;
                                    arrayList3 = arrayList;
                                    str = null;
                                }
                            }
                            arrayList = arrayList3;
                            i3++;
                            arrayList3 = arrayList;
                            str = null;
                        }
                    }
                }
                break;
        }
    }
}
