package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d0(Context context, int i7, org.telegram.messenger.s9 s9Var, long j3, Runnable runnable) {
        this.a = 4;
        this.d = context;
        this.b = i7;
        this.e = s9Var;
        this.c = j3;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        int i10 = 0;
        r5 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = ((n0) obj3).a;
                boolean[] zArr = m0Var.d;
                boolean[] zArr2 = m0Var.b;
                ArrayList[] arrayListArr = m0Var.a;
                zArr[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    qp.s1(i12).Y3(starsStatus.users, false);
                    qp.s1(i12).S3(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    zArr2[i11] = !arrayListArr[i11].isEmpty() || zArr2[i11];
                    boolean[] zArr3 = m0Var.e;
                    boolean z9 = (starsStatus.flags & 1) == 0;
                    zArr3[i11] = z9;
                    m0Var.c[i11] = z9 ? null : starsStatus.next_offset;
                    qs.f(i12).k(qs.D3, Long.valueOf(j3));
                    break;
                }
                break;
            case 1:
                fi.d dVar = (fi.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i13 = this.b;
                ConnectionsManager.getInstance(i13).sendRequest(tL_fulfillStarsSubscription, new b0(i13, 1, this.c, dVar, (org.telegram.ui.ActionBar.v2[]) obj));
                break;
            case 2:
                di.y6 y6Var = (di.y6) obj3;
                TLObject tLObject2 = (TLObject) obj;
                String str = (String) obj2;
                int i14 = y6Var.a;
                HashSet hashSet = y6Var.t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    qp.s1(i14).Y3(tL_stories_stories.users, false);
                    qp.s1(i14).S3(tL_stories_stories.chats, false);
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
                y6Var.W.remove(str);
                if (storyItem == null) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str2.endsWith(":" + j3 + ":" + i11)) {
                                hashSet.remove(str2);
                            }
                        }
                    }
                    hashSet.add(str);
                    y6Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j3;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = qp.s1(i14).z1(j3);
                    tL_updateStory.story = storyItem;
                    y6Var.c0(tL_updateStory);
                    break;
                }
            case 3:
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
            default:
                new zh.b4((Context) obj3, this.b, ((org.telegram.messenger.s9) obj2).d, null, this.c, (Runnable) obj, false, false).show();
                break;
        }
    }

    public /* synthetic */ d0(di.y6 y6Var, TLObject tLObject, int i7, String str, long j3) {
        this.a = 2;
        this.d = y6Var;
        this.f = tLObject;
        this.b = i7;
        this.e = str;
        this.c = j3;
    }

    public /* synthetic */ d0(Object obj, Object obj2, int i7, Object obj3, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.f = obj3;
        this.c = j3;
    }
}
