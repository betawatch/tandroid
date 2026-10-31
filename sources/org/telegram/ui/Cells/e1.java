package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e1(Context context, int i10, org.telegram.messenger.t9 t9Var, long j10, Runnable runnable) {
        this.a = 1;
        this.d = context;
        this.b = i10;
        this.e = t9Var;
        this.c = j10;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        r3 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = 0;
        int i12 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                q1 q1Var = (q1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (user == null) {
                    if (chat == null) {
                        q1Var.j7[i12].k(this.c, "", "", null);
                        break;
                    } else {
                        q1Var.j7[i12].q(chat);
                        q1Var.i7[i12].i0(chat, q1Var.j7[i12], null);
                        break;
                    }
                } else {
                    q1Var.j7[i12].r(user);
                    q1Var.i7[i12].i0(user, q1Var.j7[i12], null);
                    break;
                }
            case 1:
                new ph.g4((Context) obj3, this.b, ((org.telegram.messenger.t9) obj2).d, null, this.c, (Runnable) obj, false, false).show();
                break;
            case 2:
                rh.q qVar = (rh.q) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = ((rh.r) obj3).a;
                boolean[] zArr = qVar.d;
                boolean[] zArr2 = qVar.b;
                ArrayList[] arrayListArr = qVar.a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    vp.r1(i13).V3(starsStatus.users, false);
                    vp.r1(i13).P3(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr2[i12] = !arrayListArr[i12].isEmpty() || zArr2[i12];
                    boolean[] zArr3 = qVar.e;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr3[i12] = z10;
                    qVar.c[i12] = z10 ? null : starsStatus.next_offset;
                    zs.f(i13).k(zs.D3, Long.valueOf(j10));
                    break;
                }
                break;
            case 3:
                vh.d dVar = (vh.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i14 = this.b;
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new org.telegram.ui.Components.o2(i14, 3, this.c, dVar, (org.telegram.ui.ActionBar.z2[]) obj));
                break;
            default:
                th.e5 e5Var = (th.e5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                int i15 = e5Var.a;
                HashSet hashSet = e5Var.t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    vp.r1(i15).V3(tL_stories_stories.users, false);
                    vp.r1(i15).P3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                e5Var.W.remove(str);
                if (storyItem == null) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str2.endsWith(":" + j10 + ":" + i12)) {
                                hashSet.remove(str2);
                            }
                        }
                    }
                    hashSet.add(str);
                    e5Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = vp.r1(i15).y1(j10);
                    tL_updateStory.story = storyItem;
                    e5Var.c0(tL_updateStory);
                    break;
                }
        }
    }

    public /* synthetic */ e1(Object obj, Object obj2, int i10, Object obj3, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = j10;
    }
}
