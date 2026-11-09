package bi;

import android.content.Context;
import android.os.RemoteException;
import java.nio.charset.StandardCharsets;
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
import org.telegram.ui.q31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d0(Context context, int i7, org.telegram.messenger.s9 s9Var, long j3, Runnable runnable) {
        this.a = 5;
        this.d = context;
        this.b = i7;
        this.e = s9Var;
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
                n0 n0Var = (n0) this.d;
                m0 m0Var = (m0) this.e;
                int i10 = this.b;
                TLObject tLObject = (TLObject) this.f;
                long j3 = this.c;
                int i11 = n0Var.a;
                boolean[] zArr = m0Var.d;
                boolean[] zArr2 = m0Var.b;
                ArrayList[] arrayListArr = m0Var.a;
                zArr[i10] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    qp.s1(i11).Y3(starsStatus.users, false);
                    qp.s1(i11).S3(starsStatus.chats, false);
                    arrayListArr[i10].addAll(starsStatus.history);
                    zArr2[i10] = !arrayListArr[i10].isEmpty() || zArr2[i10];
                    boolean[] zArr3 = m0Var.e;
                    boolean z9 = (starsStatus.flags & 1) == 0;
                    zArr3[i10] = z9;
                    m0Var.c[i10] = z9 ? null : starsStatus.next_offset;
                    qs.f(i11).k(qs.D3, Long.valueOf(j3));
                    break;
                }
                break;
            case 1:
                fi.d dVar = (fi.d) this.d;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.e;
                int i12 = this.b;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.f;
                long j10 = this.c;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = starsSubscription.id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i12).sendRequest(tL_fulfillStarsSubscription, new b0(i12, 1, j10, dVar, v2VarArr));
                break;
            case 2:
                di.z6 z6Var = (di.z6) this.d;
                TLObject tLObject2 = (TLObject) this.f;
                int i13 = this.b;
                String str = (String) this.e;
                long j11 = this.c;
                int i14 = z6Var.a;
                HashSet hashSet = z6Var.t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    qp.s1(i14).Y3(tL_stories_stories.users, false);
                    qp.s1(i14).S3(tL_stories_stories.chats, false);
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
                z6Var.W.remove(str);
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
                    z6Var.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                    break;
                } else {
                    storyItem.dialogId = j11;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = qp.s1(i14).z1(j11);
                    tL_updateStory.story = storyItem;
                    z6Var.c0(tL_updateStory);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i15 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                long j12 = this.c;
                if (user == null) {
                    if (chat == null) {
                        q1Var.k7[i15].k(j12, "", "", null);
                        break;
                    } else {
                        q1Var.k7[i15].q(chat);
                        q1Var.j7[i15].i0(chat, q1Var.k7[i15], null);
                        break;
                    }
                } else {
                    q1Var.k7[i15].r(user);
                    q1Var.j7[i15].i0(user, q1Var.k7[i15], null);
                    break;
                }
            case 4:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.d;
                long j13 = this.c;
                int i16 = this.b;
                String str3 = (String) this.e;
                String str4 = (String) this.f;
                if (!i1Var.w) {
                    i1Var.v = j13;
                    int i17 = i1Var.G;
                    if (i17 != i16 && i17 > 0) {
                        org.telegram.utils.twidget.r0 r0Var = i1Var.c;
                        float f10 = i17 / i1Var.l;
                        org.telegram.utils.twidget.o0 o0Var = (org.telegram.utils.twidget.o0) r0Var.e.get(Long.valueOf(j13));
                        org.telegram.utils.twidget.b h12 = o0Var == null ? null : o0Var.h1();
                        if (h12 != null) {
                            try {
                                h12.G0(o0Var.d, f10);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                    if (!i1Var.B.equals(str3)) {
                        org.telegram.utils.twidget.r0 r0Var2 = i1Var.c;
                        byte[] bytes = i1Var.B.getBytes(StandardCharsets.UTF_8);
                        org.telegram.utils.twidget.o0 o0Var2 = (org.telegram.utils.twidget.o0) r0Var2.e.get(Long.valueOf(j13));
                        org.telegram.utils.twidget.b h13 = o0Var2 == null ? null : o0Var2.h1();
                        if (h13 != null) {
                            try {
                                h13.e0(o0Var2.d, bytes);
                            } catch (RemoteException unused2) {
                            }
                        }
                    }
                    if (i1Var.k != null && !i1Var.k.equals(str4)) {
                        org.telegram.utils.twidget.r0 r0Var3 = i1Var.c;
                        byte[] bytes2 = i1Var.k.getBytes(StandardCharsets.UTF_8);
                        org.telegram.utils.twidget.o0 o0Var3 = (org.telegram.utils.twidget.o0) r0Var3.e.get(Long.valueOf(j13));
                        org.telegram.utils.twidget.b h14 = o0Var3 == null ? null : o0Var3.h1();
                        if (h14 != null) {
                            try {
                                h14.d1(o0Var3.d, bytes2);
                            } catch (RemoteException unused3) {
                            }
                        }
                    }
                    i1Var.C = true;
                    org.telegram.utils.twidget.r0 r0Var4 = i1Var.c;
                    boolean z10 = i1Var.F;
                    org.telegram.utils.twidget.o0 o0Var4 = (org.telegram.utils.twidget.o0) r0Var4.e.get(Long.valueOf(j13));
                    org.telegram.utils.twidget.b h15 = o0Var4 != null ? o0Var4.h1() : null;
                    if (h15 != null) {
                        try {
                            h15.u0(o0Var4.d, z10);
                        } catch (RemoteException unused4) {
                        }
                    }
                    i1Var.d();
                    break;
                } else {
                    org.telegram.utils.twidget.a1.a.execute(new q31(i1Var, j13, 2));
                    break;
                }
                break;
            default:
                new zh.b4((Context) this.d, this.b, ((org.telegram.messenger.s9) this.e).d, null, this.c, (Runnable) this.f, false, false).show();
                break;
        }
    }

    public /* synthetic */ d0(di.z6 z6Var, TLObject tLObject, int i7, String str, long j3) {
        this.a = 2;
        this.d = z6Var;
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

    public /* synthetic */ d0(org.telegram.utils.twidget.i1 i1Var, long j3, int i7, String str, String str2) {
        this.a = 4;
        this.d = i1Var;
        this.c = j3;
        this.b = i7;
        this.e = str;
        this.f = str2;
    }
}
