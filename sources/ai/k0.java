package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k0(Context context, int i3, m9 m9Var, long j10, Runnable runnable) {
        this.a = 0;
        this.d = context;
        this.b = i3;
        this.e = m9Var;
        this.c = j10;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.c;
        int i10 = 0;
        r4 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                new d7((Context) obj3, this.b, ((m9) obj2).d, null, this.c, (Runnable) obj, false, false).show();
                break;
            case 1:
                ci.h0 h0Var = (ci.h0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = ((ci.i0) obj3).a;
                boolean[] zArr = h0Var.d;
                boolean[] zArr2 = h0Var.b;
                ArrayList[] arrayListArr = h0Var.a;
                zArr[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    hp.s1(i12).Y3(starsStatus.users, false);
                    hp.s1(i12).S3(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    zArr2[i11] = !arrayListArr[i11].isEmpty() || zArr2[i11];
                    boolean[] zArr3 = h0Var.e;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr3[i11] = z10;
                    h0Var.c[i11] = z10 ? null : starsStatus.next_offset;
                    hs.f(i12).k(hs.D3, Long.valueOf(j10));
                    break;
                }
                break;
            case 2:
                gi.d dVar = (gi.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i13 = this.b;
                ConnectionsManager.getInstance(i13).sendRequest(tL_fulfillStarsSubscription, new ci.x(i13, 1, this.c, dVar, (org.telegram.ui.ActionBar.t2[]) obj));
                break;
            case 3:
                ei.z6 z6Var = (ei.z6) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                int i14 = z6Var.a;
                HashSet hashSet = z6Var.t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    hp.s1(i14).Y3(tL_stories_stories.users, false);
                    hp.s1(i14).S3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i10 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i10).id == i11) {
                                storyItem = tL_stories_stories.stories.get(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                z6Var.W.remove(str);
                if (storyItem == null) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str2.endsWith(":" + j10 + ":" + i11)) {
                                hashSet.remove(str2);
                            }
                        }
                    }
                    hashSet.add(str);
                    z6Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = hp.s1(i14).z1(j10);
                    tL_updateStory.story = storyItem;
                    z6Var.c0(tL_updateStory);
                    break;
                }
            default:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (user == null) {
                    if (chat == null) {
                        q1Var.k7[i11].k(this.c, "", "", null);
                        break;
                    } else {
                        q1Var.k7[i11].q(chat);
                        q1Var.j7[i11].i0(chat, q1Var.k7[i11], null);
                        break;
                    }
                } else {
                    q1Var.k7[i11].r(user);
                    q1Var.j7[i11].i0(user, q1Var.k7[i11], null);
                    break;
                }
        }
    }

    public /* synthetic */ k0(Object obj, Object obj2, int i3, Object obj3, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
        this.f = obj3;
        this.c = j10;
    }
}
