// default package

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d0;
import org.telegram.ui.e0;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class kq8 implements ipa, n8c, CameraView.CameraViewDelegate, Continuation, d39, et3, kf9, kg7, dz0, jo9, ed, eq6, QuickAckDelegate, sc7, us2, e39, he8, or8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kq8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ipa
    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        pq8 pq8Var = (pq8) this.b;
        pq8Var.e.l.remove((TL_stars.SavedStarGift) this.c);
        pq8Var.f(true);
        int i = pq8Var.b;
        long e = y6c.h(i).e();
        lca lcaVar = pq8Var.a;
        if (j == e) {
            u21 b0 = u21.b0(lcaVar.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = k96.M0(2131752875, null);
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            m21 O = b0.O(document, M0, k96.a0(null, null, 2131752876, ls6.m(tL_starGiftUnique.num, ',', sb)));
            O.r = false;
            O.j();
        } else {
            m21 O2 = u21.b0(lcaVar.a).O(tL_starGiftUnique.getDocument(), k96.M0(2131752873, null), k96.a0(null, null, 2131752874, cf3.r(i, j)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.w0.c(true);
        }
    }

    @Override // us2
    public final void accept(Object obj) {
        pab pabVar = (pab) this.b;
        AtomicLong atomicLong = (AtomicLong) this.c;
        x33 x33Var = (x33) obj;
        oab oabVar = new oab(x33Var.b, i2f.l3(x33Var.a, x33Var.c));
        pabVar.c.add(oabVar);
        long j = x33Var.d;
        if (j != -9223372036854775807L) {
            atomicLong.set(atomicLong.get() == -9223372036854775807L ? j : Math.max(atomicLong.get(), j));
        }
        long j2 = pabVar.l;
        if (j2 == -9223372036854775807L || j >= j2) {
            pabVar.g(oabVar);
        }
    }

    @Override // jo9
    public final Object apply(Object obj) {
        lo9 lo9Var = (lo9) this.b;
        ra0 ra0Var = (ra0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        q90 q90Var = lo9Var.d;
        ArrayList d = lo9Var.d(sQLiteDatabase, ra0Var, q90Var.b);
        for (cj8 cj8Var : cj8.values()) {
            if (cj8Var != ra0Var.c) {
                int size = q90Var.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(lo9Var.d(sQLiteDatabase, ra0Var.b(cj8Var), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < d.size(); i++) {
            sb.append(((ea0) d.get(i)).a);
            if (i < d.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new ko9(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            ea0 ea0Var = (ea0) listIterator.next();
            long j2 = ea0Var.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                o90 c = ea0Var.c.c();
                for (ko9 ko9Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.a(ko9Var.a, ko9Var.b);
                }
                listIterator.set(new ea0(j2, ea0Var.b, c.b()));
            }
        }
        return d;
    }

    @Override // kg7
    public final void b(Canvas canvas) {
        kh9 kh9Var = (kh9) this.b;
        View view = (View) this.c;
        qh9 qh9Var = kh9Var.X;
        AtomicReference atomicReference = qh9Var.E;
        StaticLayout staticLayout = qh9Var.b;
        ArrayList arrayList = qh9Var.x;
        qla.g(view, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        gm.drawAnimatedEmojis(canvas, qh9Var.b, qh9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // he8
    public final void c(TLRPC.MessageMedia messageMedia) {
        jpb jpbVar = (jpb) this.b;
        mu1 mu1Var = (mu1) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = jpbVar.H.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        jpbVar.H.k.media = messageMedia;
        mu1Var.getSendMessagesHelper().s(jpbVar.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override // dz0
    public final void cancel() {
        ao9 ao9Var = (ao9) this.b;
        ao9Var.b.removeCallbacks((tn9) this.c);
    }

    @Override // e39
    public final boolean d(int i, View view) {
        d0 d0Var = (d0) this.b;
        e0 e0Var = (e0) this.c;
        ThemeActivity themeActivity = d0Var.e;
        if (i >= 0 && i < e0Var.e.size()) {
            zjb zjbVar = (zjb) e0Var.e.get(i);
            if (zjbVar.a >= 100 && !zjbVar.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = k96.M0(2131747604, "OpenInEditor");
                String M02 = k96.M0(2131745234, "ShareTheme");
                TLRPC.TL_theme tL_theme = zjbVar.r;
                CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : k96.M0(2131743904, "ThemeSetUrl"), k96.M0(2131751474, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                rl5 rl5Var = new rl5(d0Var, zjbVar, e0Var, (byte) 1);
                hd hdVar = alertDialog$Builder.a;
                hdVar.Q = charSequenceArr;
                hdVar.R = iArr;
                hdVar.N = rl5Var;
                themeActivity.showDialog(hdVar);
                hdVar.l(hdVar.O0.size() - 1, bkb.w0(null, bkb.p7, false), bkb.w0(null, bkb.o7, false));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [ed, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r3;
        boolean z;
        boolean z2;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i2 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 6:
                y99 y99Var = (y99) this.b;
                x99 x99Var = (x99) this.c;
                c4c G = y99Var.d2.G(i - 1);
                if (G != null) {
                    Object obj = G.H;
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        boolean z3 = G.s;
                        if (TextUtils.isEmpty(starGift.gift_address) || !y99Var.c2 || na7.q1(y99Var.a).k4.w.f) {
                            if (!z3) {
                                ArrayList arrayList2 = x99Var.b.l;
                                int size = arrayList2.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 < size) {
                                        Object obj2 = arrayList2.get(i3);
                                        i3++;
                                        savedStarGift = (TL_stars.SavedStarGift) obj2;
                                        if (savedStarGift.gift == starGift) {
                                        }
                                    } else {
                                        savedStarGift = null;
                                    }
                                }
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(y99Var.a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(y99Var.getContext());
                                    r3 = 0;
                                    alertDialog$Builder.a.S = k96.M0(2131749739, null);
                                    alertDialog$Builder.a.U = gl.S2(k96.a0(null, null, 2131749740, k96.x(savedStarGift.can_craft_at, true)));
                                }
                            } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.H;
                                hd hdVar = new hd(3, null, y99Var.getContext());
                                hdVar.q(400L);
                                long e = y6c.h(y99Var.a).e();
                                oj ojVar = tL_starGiftUnique.resale_ton_only ? oj.b : oj.a;
                                gta.u(y99Var.a, ojVar).E(tL_starGiftUnique, e, null, true, new zz7(y99Var, hdVar, ojVar, tL_starGiftUnique, e));
                                break;
                            }
                            y99Var.a2.a(starGift);
                            y99Var.dismiss();
                            break;
                        } else {
                            alertDialog$Builder = new AlertDialog$Builder(0, y99Var.J0, y99Var.getContext());
                            r3 = 0;
                            alertDialog$Builder.a.S = k96.M0(2131749776, null);
                            alertDialog$Builder.a.U = k96.M0(2131749777, null);
                        }
                        b00.t(r3, 2131747638, alertDialog$Builder, r3);
                        break;
                    }
                }
                break;
            case 21:
                t5b t5bVar = (t5b) this.b;
                Context context = (Context) this.c;
                ArrayList arrayList3 = t5bVar.M;
                vf6 vf6Var = t5bVar.b;
                n5b n5bVar = t5bVar.y;
                HashMap hashMap = t5bVar.d;
                ArrayList arrayList4 = t5bVar.c;
                y5b y5bVar = t5bVar.a0;
                ww0 ww0Var = y5bVar.c;
                if (i >= 0 && i < arrayList3.size()) {
                    j5b j5bVar = (j5b) arrayList3.get(i);
                    int i4 = j5bVar.a;
                    if (i4 != 3) {
                        if (i4 != 7) {
                            if (i4 == 9) {
                                byte b = j5bVar.q;
                                if (b != 0) {
                                    byte b2 = 5;
                                    if (b != 1) {
                                        if (b != 5) {
                                            if (b == 6) {
                                                y5bVar.A1 = false;
                                                t5bVar.h(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = t5bVar.getContext();
                                            int i5 = y5b.X1;
                                            hd hdVar2 = new hd(3, y5bVar.J0, context2);
                                            hdVar2.q(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = y5bVar.m1;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            ConnectionsManager.getInstance(y5bVar.a).sendRequest(getgroupcallstreamrtmpurl, new ck8((Object) t5bVar, (Object) hdVar2, (Object) getgroupcallstreamrtmpurl, (byte) 22));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = y5bVar.m1;
                                        long m = inputPeer2 != null ? cf3.m(inputPeer2) : y6c.h(y5bVar.a).e();
                                        int i6 = y5b.X1;
                                        cs5 G2 = cs5.G(t5bVar, y5bVar.J0, view);
                                        G2.b(R.drawable.msg_addfolder, k96.M0(2131744548, null), new sma(t5bVar, m, b2), false);
                                        G2.j();
                                        cs5.e(G2, na7.q1(y5bVar.a).M1().A(m, true), y5bVar.u1, false, null, new nu9(t5bVar, G2, (byte) 13));
                                        G2.a0();
                                        break;
                                    }
                                } else {
                                    d6b d6bVar = y5bVar.W1;
                                    if (d6bVar != null) {
                                        d6bVar.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof wgb) {
                            wgb wgbVar = (wgb) view;
                            wgbVar.setChecked(!wgbVar.d());
                            j5bVar.k = wgbVar.d();
                            byte b3 = j5bVar.c;
                            if (b3 != 0) {
                                if (b3 != 1) {
                                    if (b3 == 2) {
                                        y5bVar.v1 = wgbVar.d();
                                        t5bVar.h(true);
                                        break;
                                    }
                                } else {
                                    boolean d = wgbVar.d();
                                    y5bVar.x1 = d;
                                    boolean z4 = y5bVar.m1 instanceof TLRPC.TL_inputPeerChannel;
                                    wjb wjbVar = y5bVar.J0;
                                    if (d) {
                                        m21 G3 = new u21(ww0Var, wjbVar).G(R.raw.msg_story_keep, 4, k96.M0(z4 ? 2131744467 : 2131744431, null));
                                        G3.j = 5000;
                                        z = true;
                                        G3.k(true);
                                    } else {
                                        m21 G4 = new u21(ww0Var, wjbVar).G(R.raw.fire_on, 4, k96.M0(z4 ? 2131744468 : 2131744445, null));
                                        G4.j = 5000;
                                        z = true;
                                        G4.k(true);
                                    }
                                    t5bVar.h(z);
                                    break;
                                }
                            } else {
                                boolean d2 = wgbVar.d();
                                y5bVar.w1 = d2;
                                boolean z5 = y5bVar.H1 == 4;
                                wjb wjbVar2 = y5bVar.J0;
                                if (!d2) {
                                    m21 G5 = new u21(ww0Var, wjbVar2).G(R.raw.passcode_lock_close, 4, k96.M0(z5 ? 2131744443 : 2131744444, null));
                                    G5.j = 5000;
                                    G5.k(true);
                                    break;
                                } else {
                                    m21 G6 = new u21(ww0Var, wjbVar2).G(R.raw.ic_save_to_gallery, 4, k96.M0(z5 ? 2131744429 : 2131744430, null));
                                    G6.j = 5000;
                                    G6.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!j5bVar.n || !y5bVar.z1) {
                        byte b4 = j5bVar.i;
                        if (b4 != 1) {
                            if (b4 != 3) {
                                if (b4 != 2) {
                                    if (b4 != 4) {
                                        if (b4 > 0) {
                                            arrayList4.clear();
                                            hashMap.clear();
                                            y5bVar.H1 = j5bVar.i;
                                            n5bVar.d.a();
                                            z2 = true;
                                        } else {
                                            TLRPC.Chat chat = j5bVar.h;
                                            if (chat != null) {
                                                long j = chat.id;
                                                int i7 = y5b.X1;
                                                if (y5bVar.J0(chat) > 200) {
                                                    try {
                                                        t5bVar.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, y5bVar.J0, t5bVar.getContext());
                                                    alertDialog$Builder2.a.S = k96.M0(2131749202, null);
                                                    alertDialog$Builder2.a.U = k96.M0(2131749201, null);
                                                    b00.t(null, 2131747638, alertDialog$Builder2, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j))) {
                                                    ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j));
                                                    if (arrayList5 != null) {
                                                        int size2 = arrayList5.size();
                                                        while (i2 < size2) {
                                                            Object obj3 = arrayList5.get(i2);
                                                            i2++;
                                                            vf6Var.k(Boolean.FALSE, ((Long) obj3).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j));
                                                    t5bVar.j(true);
                                                } else {
                                                    TLRPC.Chat K0 = na7.q1(y5bVar.a).K0(Long.valueOf(j));
                                                    TLRPC.ChatFull L0 = na7.q1(y5bVar.a).L0(j);
                                                    if (L0 == null || (chatParticipants = L0.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || L0.participants.participants.size() < L0.participants_count - 1) {
                                                        hd hdVar3 = t5bVar.H;
                                                        if (hdVar3 != null) {
                                                            hdVar3.dismiss();
                                                            t5bVar.H = null;
                                                        }
                                                        t5bVar.I = j;
                                                        hd hdVar4 = new hd(3, y5bVar.J0, t5bVar.getContext());
                                                        t5bVar.H = hdVar4;
                                                        hdVar4.q(50L);
                                                        ad7 Y = ad7.Y(y5bVar.a);
                                                        Y.a.c(new mx8(t5bVar, K0, Y, j));
                                                    } else {
                                                        t5bVar.e(j, L0.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(t5bVar.J)) {
                                                        n5bVar.setText("");
                                                        t5bVar.J = null;
                                                        t5bVar.h(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = j5bVar.g;
                                                if (user != null) {
                                                    if (t5bVar.a == 0) {
                                                        y5bVar.H1 = 0;
                                                    }
                                                    long j2 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList4);
                                                    if (arrayList4.contains(Long.valueOf(j2))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j2))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j2));
                                                        vf6Var.k(Boolean.FALSE, j2);
                                                    } else {
                                                        Iterator it2 = hashMap.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j2))) {
                                                                it2.remove();
                                                                hashSet.addAll((Collection) entry2.getValue());
                                                            }
                                                        }
                                                        hashSet.add(Long.valueOf(j2));
                                                        if (!TextUtils.isEmpty(t5bVar.J)) {
                                                            n5bVar.setText("");
                                                            t5bVar.J = null;
                                                            t5bVar.h(false);
                                                        }
                                                        vf6Var.k(Boolean.TRUE, j2);
                                                    }
                                                    arrayList4.clear();
                                                    arrayList4.addAll(hashSet);
                                                    z2 = true;
                                                    t5bVar.j(true);
                                                }
                                            }
                                            z2 = true;
                                        }
                                        t5bVar.g(z2);
                                        t5bVar.f(z2);
                                        n5bVar.M = z2;
                                        break;
                                    } else {
                                        if (y5bVar.H1 == 4) {
                                            y5bVar.G1 = 4;
                                            y5bVar.l1.E(1);
                                        }
                                        y5bVar.H1 = 4;
                                        t5bVar.g(true);
                                        break;
                                    }
                                } else {
                                    if (y5bVar.H1 == 2) {
                                        y5bVar.G1 = 2;
                                        y5bVar.l1.E(1);
                                    }
                                    y5bVar.H1 = 2;
                                    t5bVar.g(true);
                                    break;
                                }
                            } else {
                                if (y5bVar.H1 == 3 || (y5bVar.r1.isEmpty() && y5bVar.s1.isEmpty())) {
                                    y5bVar.G1 = 3;
                                    y5bVar.l1.E(1);
                                }
                                y5bVar.H1 = 3;
                                t5bVar.g(true);
                                break;
                            }
                        } else {
                            if (y5bVar.H1 == 1 || y5bVar.H0().isEmpty()) {
                                y5bVar.G1 = 1;
                                y5bVar.l1.E(1);
                            }
                            y5bVar.H1 = 1;
                            t5bVar.g(true);
                            break;
                        }
                    } else {
                        new g5b(context, y5bVar.a, y5bVar.E1, y5bVar.m1, new m5b(t5bVar, objArr == true ? 1 : 0), y5bVar.J0).show();
                        break;
                    }
                }
                break;
            default:
                ((ThemeActivity) this.b).y0((Context) this.c, view, i, f);
                break;
        }
    }

    @Override // eq6
    public final void f(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (!((dq6) arrayList.get(i)).a.startsWith("animated_")) {
                    String c = vu3.c(((dq6) arrayList.get(i)).a);
                    if (vu3.g(c) != null) {
                        linkedHashSet.add(c);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // or8
    public final void h(vm7 vm7Var) {
        tvb tvbVar = (tvb) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        wvb wvbVar = tvbVar.a;
        wvbVar.e.add(Integer.valueOf(tL_forumTopic.id));
        wvbVar.Z();
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        sq8 sq8Var = (sq8) this.b;
        u41 u41Var = (u41) this.c;
        View view = (View) obj2;
        long j = ((TL_stars.SavedStarGift) ((c4c) obj).H).gift.id;
        if (sq8Var.l1 == j) {
            sq8Var.l1 = 0L;
            j = 0;
        } else {
            sq8Var.l1 = j;
        }
        u41Var.setEnabled(j != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof g08) {
                    g08 g08Var = (g08) childAt;
                    g08Var.b(sq8Var.l1 == g08Var.getGiftId(), true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sc7
    public final void k(boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 19:
                nfa nfaVar = (nfa) obj2;
                d dVar = nfaVar.y1;
                dVar.finishFragment();
                dVar.getNotificationCenter().n((gk7) dVar, 4);
                dVar.getNotificationCenter().k(4, new Object[0]);
                dVar.getNotificationCenter().k(kk7.J2, Long.valueOf(nfaVar.m1), (TLRPC.User) obj, null, Boolean.valueOf(z));
                dVar.getMessagesController().T4(false);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                qvb qvbVar = ((bvb) obj2).b;
                qvbVar.getNotificationCenter().n(qvbVar, 4);
                qvbVar.getNotificationCenter().k(4, new Object[0]);
                qvbVar.finishFragment();
                qvbVar.getNotificationCenter().k(kk7.J2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z));
                break;
        }
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // et3
    public final void m() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                ((sb9) obj2).i();
                ((rb9) obj).E1();
                break;
            default:
                ii9 ii9Var = (ii9) obj2;
                li9 li9Var = (li9) obj;
                TL_iv.pageTableCell pagetablecell = li9Var.b;
                if (pagetablecell != null) {
                    ffb.d(pagetablecell, li9Var.a.getText());
                }
                ge9 ge9Var = ii9Var.F;
                if (ge9Var != null && ii9Var.a != null) {
                    ge9Var.a.W3();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        yv8 yv8Var = (yv8) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (yv8Var.W || yv8Var.i0 || yv8Var.m0) {
            return;
        }
        yv8Var.i0 = true;
        yv8Var.h0.postDelayed(yv8Var.z0, 150L);
    }

    @Override // d39
    public final boolean q(View view) {
        byte b = this.a;
        return false;
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public final void run() {
        z3a z3aVar = (z3a) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        gl.c3(new w1a(z3aVar, message, message.id, (byte) 1));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        sk4 sk4Var = (sk4) this.b;
        String str = (String) this.c;
        synchronized (sk4Var) {
            ((ps) sk4Var.c).remove(str);
        }
        return task;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        boolean z;
        ui5 ui5Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 14:
                hi3 hi3Var = (hi3) obj2;
                hi3Var.getClass();
                hdVar.dismiss();
                hi3Var.M0.getDownloadController().j((ArrayList) obj);
                hi3Var.R(false);
                break;
            case 17:
                iy9 iy9Var = (iy9) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    iy9Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    io9 io9Var = new io9(iy9Var, user, twoStepVerificationActivity, (byte) 2);
                    twoStepVerificationActivity.a0 = (byte) 0;
                    twoStepVerificationActivity.c0 = io9Var;
                    S.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 20:
                ((Runnable) obj2).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = hq6.b0((TLRPC.StickerSet) obj);
                ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_stickers_deleteStickerSet, new ce2((byte) 9));
                break;
            case 23:
                ((ThemeActivity) obj2).x0((a5b) obj);
                break;
            default:
                d0 d0Var = (d0) obj2;
                akb akbVar = (akb) obj;
                d0Var.getClass();
                na7.q1(akbVar.F).A4(akbVar, null, akbVar == bkb.J, true);
                HashMap hashMap = bkb.H;
                if (akbVar.b == null) {
                    z = false;
                } else {
                    if (bkb.I == akbVar) {
                        bkb.t(bkb.L, true, false);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (akbVar == bkb.J) {
                        bkb.J = (akb) hashMap.get("Dark Blue");
                    }
                    akbVar.s();
                    bkb.G.remove(akbVar);
                    hashMap.remove(akbVar.a);
                    vjb vjbVar = akbVar.j0;
                    if (vjbVar != null) {
                        vjbVar.a();
                    }
                    bkb.F.remove(akbVar);
                    new File(akbVar.b).delete();
                    bkb.w1(true, false);
                }
                if (z) {
                    ui5Var = ((d) d0Var.e).parentLayout;
                    ((ActionBarLayout) ui5Var).W(true, true);
                }
                kk7.e().k(kk7.q4, new Object[0]);
                break;
        }
    }

    @Override // kf9
    public final void run(long j) {
        ve9 ve9Var = (ve9) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        ve9Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    @Override // or8
    public final void n() {
    }

    private final void g(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }

    private final void o(View view, float f, float f2) {
    }
}
