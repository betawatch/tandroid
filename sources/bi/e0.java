package bi;

import android.content.Context;
import android.os.RemoteException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.n31;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e0(Context context, int i7, r9 r9Var, long j3, Runnable runnable) {
        this.a = 0;
        this.d = context;
        this.b = i7;
        this.e = r9Var;
        this.c = j3;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        switch (this.a) {
            case 0:
                new u6((Context) this.d, this.b, ((r9) this.e).d, null, this.c, (Runnable) this.f, false, false).show();
                break;
            case 1:
                di.e0 e0Var = (di.e0) this.d;
                di.d0 d0Var = (di.d0) this.e;
                int i10 = this.b;
                TLObject tLObject = (TLObject) this.f;
                long j3 = this.c;
                int i11 = e0Var.a;
                boolean[] zArr = d0Var.d;
                boolean[] zArr2 = d0Var.b;
                ArrayList[] arrayListArr = d0Var.a;
                zArr[i10] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    np.s1(i11).Y3(starsStatus.users, false);
                    np.s1(i11).S3(starsStatus.chats, false);
                    arrayListArr[i10].addAll(starsStatus.history);
                    zArr2[i10] = !arrayListArr[i10].isEmpty() || zArr2[i10];
                    boolean[] zArr3 = d0Var.e;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr3[i10] = z10;
                    d0Var.c[i10] = z10 ? null : starsStatus.next_offset;
                    ns.f(i11).k(ns.D3, Long.valueOf(j3));
                    break;
                }
                break;
            case 2:
                hi.d dVar = (hi.d) this.d;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.e;
                int i12 = this.b;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.f;
                long j10 = this.c;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = starsSubscription.id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i12).sendRequest(tL_fulfillStarsSubscription, new di.v(i12, 1, j10, dVar, u2VarArr));
                break;
            case 3:
                fi.s6 s6Var = (fi.s6) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                int i13 = this.b;
                String str = (String) this.f;
                long j11 = this.c;
                int i14 = s6Var.a;
                HashSet hashSet = s6Var.t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    np.s1(i14).Y3(tL_stories_stories.users, false);
                    np.s1(i14).S3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i7 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i7).id == i13) {
                                storyItem = tL_stories_stories.stories.get(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                s6Var.W.remove(str);
                if (storyItem == null) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str2.endsWith(":" + j11 + ":" + i13)) {
                                hashSet.remove(str2);
                            }
                        }
                    }
                    hashSet.add(str);
                    s6Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j11;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = np.s1(i14).z1(j11);
                    tL_updateStory.story = storyItem;
                    s6Var.c0(tL_updateStory);
                    break;
                }
            case 4:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i15 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                long j12 = this.c;
                if (user == null) {
                    if (chat == null) {
                        q1Var.l7[i15].k(j12, "", "", null);
                        break;
                    } else {
                        q1Var.l7[i15].q(chat);
                        q1Var.k7[i15].i0(chat, q1Var.l7[i15], null);
                        break;
                    }
                } else {
                    q1Var.l7[i15].r(user);
                    q1Var.k7[i15].i0(user, q1Var.l7[i15], null);
                    break;
                }
            default:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.d;
                long j13 = this.c;
                int i16 = this.b;
                String str3 = (String) this.e;
                String str4 = (String) this.f;
                if (!l1Var.w) {
                    l1Var.v = j13;
                    int i17 = l1Var.G;
                    if (i17 != i16 && i17 > 0) {
                        org.telegram.utils.twidget.u0 u0Var = l1Var.c;
                        float f10 = i17 / l1Var.l;
                        org.telegram.utils.twidget.r0 r0Var = (org.telegram.utils.twidget.r0) u0Var.e.get(Long.valueOf(j13));
                        org.telegram.utils.twidget.b h12 = r0Var == null ? null : r0Var.h1();
                        if (h12 != null) {
                            try {
                                h12.H0(r0Var.d, f10);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                    if (!l1Var.B.equals(str3)) {
                        org.telegram.utils.twidget.u0 u0Var2 = l1Var.c;
                        byte[] bytes = l1Var.B.getBytes(StandardCharsets.UTF_8);
                        org.telegram.utils.twidget.r0 r0Var2 = (org.telegram.utils.twidget.r0) u0Var2.e.get(Long.valueOf(j13));
                        org.telegram.utils.twidget.b h13 = r0Var2 == null ? null : r0Var2.h1();
                        if (h13 != null) {
                            try {
                                h13.f0(r0Var2.d, bytes);
                            } catch (RemoteException unused2) {
                            }
                        }
                    }
                    if (l1Var.k != null && !l1Var.k.equals(str4)) {
                        org.telegram.utils.twidget.u0 u0Var3 = l1Var.c;
                        byte[] bytes2 = l1Var.k.getBytes(StandardCharsets.UTF_8);
                        org.telegram.utils.twidget.r0 r0Var3 = (org.telegram.utils.twidget.r0) u0Var3.e.get(Long.valueOf(j13));
                        org.telegram.utils.twidget.b h14 = r0Var3 == null ? null : r0Var3.h1();
                        if (h14 != null) {
                            try {
                                h14.d1(r0Var3.d, bytes2);
                            } catch (RemoteException unused3) {
                            }
                        }
                    }
                    l1Var.C = true;
                    org.telegram.utils.twidget.u0 u0Var4 = l1Var.c;
                    boolean z11 = l1Var.F;
                    org.telegram.utils.twidget.r0 r0Var4 = (org.telegram.utils.twidget.r0) u0Var4.e.get(Long.valueOf(j13));
                    org.telegram.utils.twidget.b h15 = r0Var4 != null ? r0Var4.h1() : null;
                    if (h15 != null) {
                        try {
                            h15.v0(r0Var4.d, z11);
                        } catch (RemoteException unused4) {
                        }
                    }
                    l1Var.d();
                    break;
                } else {
                    org.telegram.utils.twidget.d1.a.execute(new n31(l1Var, j13, 2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e0(Object obj, Object obj2, int i7, Object obj3, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.f = obj3;
        this.c = j3;
    }

    public /* synthetic */ e0(org.telegram.utils.twidget.l1 l1Var, long j3, int i7, String str, String str2) {
        this.a = 5;
        this.d = l1Var;
        this.c = j3;
        this.b = i7;
        this.e = str;
        this.f = str2;
    }
}
