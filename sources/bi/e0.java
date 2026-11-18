package bi;

import android.content.Context;
import android.text.TextUtils;
import di.o9;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lc;
import org.telegram.ui.qx0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e0(ai.v1 v1Var, int i7, long j3, org.telegram.ui.ActionBar.h2 h2Var, t4 t4Var) {
        this.a = 6;
        this.d = v1Var;
        this.c = i7;
        this.b = j3;
        this.e = h2Var;
        this.f = t4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        switch (this.a) {
            case 0:
                new a9((Context) this.d, this.c, ((q9) this.e).d, null, this.b, (Runnable) this.f, false, false).show();
                break;
            case 1:
                c1.c cVar = (c1.c) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
                long j3 = this.b;
                String str = (String) this.f;
                int i10 = this.c;
                cVar.run();
                v4.s(tL_starGiftUnique, j3 != 0 ? gd.a0(null, null, 2131749656, str, org.telegram.messenger.n5.s(i10, j3)) : gd.a0(null, null, 2131749657, str));
                break;
            case 2:
                di.k1 k1Var = (di.k1) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.e;
                String str2 = (String) this.f;
                int i11 = this.c;
                long j10 = this.b;
                k1Var.run();
                v4.s(tL_starGiftUnique2, gd.a0(null, null, 2131749651, str2));
                String str3 = tL_starGiftUnique2.slug;
                if (!TextUtils.isEmpty(str3)) {
                    org.telegram.messenger.g0.h3(new k4(i11, 0, j10, str3, true), v4.a[0]);
                    break;
                }
                break;
            case 3:
                di.e0 e0Var = (di.e0) this.d;
                di.d0 d0Var = (di.d0) this.e;
                int i12 = this.c;
                TLObject tLObject = (TLObject) this.f;
                long j11 = this.b;
                int i13 = e0Var.a;
                boolean[] zArr = d0Var.d;
                boolean[] zArr2 = d0Var.b;
                ArrayList[] arrayListArr = d0Var.a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    mp.u1(i13).f4(starsStatus.users, false);
                    mp.u1(i13).Z3(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr2[i12] = !arrayListArr[i12].isEmpty() || zArr2[i12];
                    boolean[] zArr3 = d0Var.e;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr3[i12] = z10;
                    d0Var.c[i12] = z10 ? null : starsStatus.next_offset;
                    ks.f(i13).k(ks.F3, Long.valueOf(j11));
                    break;
                }
                break;
            case 4:
                hi.d dVar = (hi.d) this.d;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.e;
                int i14 = this.c;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.f;
                long j12 = this.b;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = starsSubscription.id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new di.v(i14, 1, j12, dVar, x2VarArr));
                break;
            case 5:
                fi.p6 p6Var = (fi.p6) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                int i15 = this.c;
                String str4 = (String) this.f;
                long j13 = this.b;
                int i16 = p6Var.a;
                HashSet hashSet = p6Var.t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    mp.u1(i16).f4(tL_stories_stories.users, false);
                    mp.u1(i16).Z3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i7 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i7).id == i15) {
                                storyItem = tL_stories_stories.stories.get(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                p6Var.W.remove(str4);
                if (storyItem == null) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str5 = (String) it.next();
                            if (str5.endsWith(":" + j13 + ":" + i15)) {
                                hashSet.remove(str5);
                            }
                        }
                    }
                    hashSet.add(str4);
                    p6Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j13;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = mp.u1(i16).B1(j13);
                    tL_updateStory.story = storyItem;
                    p6Var.c0(tL_updateStory);
                    break;
                }
            case 6:
                ai.v1 v1Var = (ai.v1) this.d;
                int i17 = this.c;
                long j14 = this.b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.e;
                t4 t4Var = (t4) this.f;
                v1Var.a(Boolean.TRUE);
                lc.Y().Q(R.raw.contact_check, 36, gd.M0(2131749333, null)).j();
                ii.n.a(i17, j14, 180000 + System.currentTimeMillis(), 0, new o9(v1Var, h2Var, i17, t4Var, 1));
                break;
            case 7:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i18 = this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                long j15 = this.b;
                if (user == null) {
                    if (chat == null) {
                        q1Var.l7[i18].k(j15, "", "", null);
                        break;
                    } else {
                        q1Var.l7[i18].q(chat);
                        q1Var.k7[i18].i0(chat, q1Var.l7[i18], null);
                        break;
                    }
                } else {
                    q1Var.l7[i18].r(user);
                    q1Var.k7[i18].i0(user, q1Var.l7[i18], null);
                    break;
                }
            default:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) this.d;
                long j16 = this.b;
                int i19 = this.c;
                String str6 = (String) this.e;
                String str7 = (String) this.f;
                if (!p1Var.A) {
                    p1Var.v = j16;
                    int i20 = p1Var.M;
                    if (i20 != i19 && i20 > 0) {
                        p1Var.c.p(j16, i20 / p1Var.l);
                    }
                    if (!p1Var.H.equals(str6)) {
                        p1Var.c.k(j16, p1Var.H.getBytes(StandardCharsets.UTF_8));
                    }
                    if (p1Var.k != null && !p1Var.k.equals(str7)) {
                        p1Var.c.j(j16, p1Var.k.getBytes(StandardCharsets.UTF_8));
                    }
                    p1Var.I = true;
                    p1Var.c.o(j16, p1Var.L);
                    p1Var.e();
                    break;
                } else {
                    org.telegram.utils.twidget.i1.a.execute(new qx0(p1Var, j16, 3));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e0(Context context, int i7, q9 q9Var, long j3, Runnable runnable) {
        this.a = 0;
        this.d = context;
        this.c = i7;
        this.e = q9Var;
        this.b = j3;
        this.f = runnable;
    }

    public /* synthetic */ e0(c1.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, String str, int i7) {
        this.a = 1;
        this.d = cVar;
        this.e = tL_starGiftUnique;
        this.b = j3;
        this.f = str;
        this.c = i7;
    }

    public /* synthetic */ e0(di.k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, int i7, long j3) {
        this.a = 2;
        this.d = k1Var;
        this.e = tL_starGiftUnique;
        this.f = str;
        this.c = i7;
        this.b = j3;
    }

    public /* synthetic */ e0(Object obj, Object obj2, int i7, Object obj3, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = i7;
        this.f = obj3;
        this.b = j3;
    }

    public /* synthetic */ e0(org.telegram.utils.twidget.p1 p1Var, long j3, int i7, String str, String str2) {
        this.a = 8;
        this.d = p1Var;
        this.b = j3;
        this.c = i7;
        this.e = str;
        this.f = str2;
    }
}
