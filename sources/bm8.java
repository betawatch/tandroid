// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bm8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bm8(t3a t3aVar, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.a = (byte) 17;
        this.c = t3aVar;
        this.e = tL_error;
        this.d = tL_stickers_createStickerSet;
        this.b = tLObject;
    }

    private final void a() {
        vqa vqaVar = (vqa) this.c;
        k27 k27Var = (k27) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
        vqaVar.j3 = true;
        vqaVar.l2(k27Var, null);
        vqaVar.z2(0, true, null);
        qh4 qh4Var = vqaVar.V1;
        if (qh4Var != null) {
            qh4Var.c(true);
        }
        gta.v(vqaVar.a, false).L();
        xsa D = gta.v(vqaVar.a, false).D(y6c.h(vqaVar.a).e(), false);
        if (D != null) {
            D.l(arrayList, starGift);
        }
    }

    private final void b() {
        vqa vqaVar = (vqa) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLObject tLObject = (TLObject) this.b;
        TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
        if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
            vqaVar.j().g0(tL_error, false);
            return;
        }
        vqaVar.m2 = true;
        vqaVar.q3 = null;
        vqaVar.c1(inputSavedStarGift, (TLRPC.Updates) tLObject, new nna(vqaVar, (byte) 14));
        Utilities.d.c(new t7a((Object) vqaVar, (Object) tLObject, (byte) 17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:356:0x098b, code lost:
    
        if (r7 == null) goto L297;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int indexOf;
        int a;
        String str = null;
        r7 = null;
        SQLiteCursor sQLiteCursor = null;
        str = null;
        char c = 1;
        r9 = true;
        boolean z = true;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLObject tLObject = (TLObject) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                RectF rectF = ProfileActivity.Z6;
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    xo4.a(profileActivity.getParentActivity(), 0, tL_username.username, profileActivity.e1 != 0 ? profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1)) : profileActivity.getMessagesController().K0(Long.valueOf(profileActivity.f1)), (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.A0);
                    return;
                } else {
                    u21.e0(tL_error);
                    return;
                }
            case 1:
                rn8 rn8Var = (rn8) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                y6c y6cVar = (y6c) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity2 = rn8Var.b;
                profileActivity2.o0.d1--;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    profileActivity2.getMessagesController().b4(tL_photos_photo.users, false);
                    TLRPC.User V1 = profileActivity2.getMessagesController().V1(Long.valueOf(y6cVar.n));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity2.o0.W0;
                        if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(indexOf, photo2);
                        }
                        if (V1 != null) {
                            V1.photo.photo_id = tL_photos_photo.photo.id;
                            y6cVar.v(V1);
                            y6cVar.u(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                co8 co8Var = (co8) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                ProfileActivity profileActivity3 = co8Var.c.e;
                profileActivity3.v3(null);
                if (!(tLObject3 instanceof TL_fragment.TL_collectibleInfo)) {
                    u21.e0(tL_error2);
                    return;
                }
                TLObject V12 = profileActivity3.e1 != 0 ? profileActivity3.getMessagesController().V1(Long.valueOf(profileActivity3.e1)) : profileActivity3.getMessagesController().K0(Long.valueOf(profileActivity3.f1));
                if (profileActivity3.getParentActivity() != null) {
                    xo4.a(profileActivity3.getParentActivity(), 0, tL_username2.username, V12, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity3.A0);
                    return;
                }
                return;
            case 3:
                final pq8 pq8Var = (pq8) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.b;
                nv4 nv4Var = (nv4) this.d;
                final View view = (View) this.e;
                lca lcaVar = pq8Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    nv4Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = pq8Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(pq8Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z2 = savedStarGift.pinned_to_top;
                final boolean z3 = !z2;
                if (pq8Var.e.q(savedStarGift, z3, false)) {
                    new sq8(pq8Var.getContext(), lcaVar.c, savedStarGift, pq8Var.c, new h8c() { // from class: iq8
                        @Override // h8c
                        public final Object run() {
                            ((nv4) view).d(z3, true);
                            pq8 pq8Var2 = pq8.this;
                            pq8Var2.f.w0(0);
                            return u21.b0(pq8Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z2) {
                    ir2.v(null, 2131749864, u21.b0(lcaVar.a), R.raw.ic_unpin, 36);
                } else {
                    u21.b0(lcaVar.a).I(R.raw.ic_pin, k96.M0(2131750060, null), k96.M0(2131750061, null)).j();
                }
                ((nv4) view).d(z3, true);
                pq8Var.f.w0(0);
                return;
            case 4:
                n5c n5cVar = (n5c) this.c;
                yv8 yv8Var = (yv8) this.b;
                q8c q8cVar = (q8c) this.d;
                p8c p8cVar = (p8c) this.e;
                if (yv8.d(n5cVar.getParentActivity())) {
                    yv8Var.e();
                    g48 g48Var = new g48(10, false, false, null);
                    g48Var.H = (byte) 1;
                    g48Var.I = false;
                    g48Var.y = false;
                    g48Var.W = new xl3((Object) q8cVar, (Object) n5cVar, (Object) p8cVar, (byte) 25);
                    n5cVar.presentFragment(g48Var);
                    return;
                }
                return;
            case 5:
                String str2 = (String) this.c;
                q8c q8cVar2 = (q8c) this.b;
                d dVar = (d) this.d;
                p8c p8cVar2 = (p8c) this.e;
                try {
                    Point b1 = gl.b1();
                    Bitmap G = fl5.G(str2, null, b1.x, b1.y, true);
                    if (G != null) {
                        str = yv8.l(G, q8cVar2);
                        G.recycle();
                    }
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
                gl.c3(new wv8(dVar, str, p8cVar2));
                return;
            case 6:
                ox8 ox8Var = (ox8) this.c;
                ad7 ad7Var = (ad7) this.b;
                nx8 nx8Var = (nx8) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = ad7Var.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(nx8Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList2.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    gl.c3(new bm8((Object) ox8Var, (Object) arrayList2, (Object) nx8Var, (Object) tL_messages_sendQuickReplyMessages, (byte) 7));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 7:
                ox8 ox8Var2 = (ox8) this.c;
                ArrayList<Integer> arrayList3 = (ArrayList) this.b;
                nx8 nx8Var2 = (nx8) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i = ox8Var2.a;
                if (arrayList3.isEmpty() || arrayList3.size() < nx8Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = nx8Var2.a;
                    ConnectionsManager.getInstance(i).sendRequest(tL_messages_getQuickReplyMessages, new ck8((Object) ox8Var2, (Object) arrayList3, (Object) tL_messages_sendQuickReplyMessages2, (byte) 5));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList3;
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(i).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 8:
                w06 w06Var = (w06) this.c;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str3 = (String) this.d;
                q69 q69Var = (q69) this.e;
                if (w06Var != null && ((g16) w06Var).b.compareTo(v06.c) >= 0) {
                    e.c(iOnDoneCallback, str3, q69Var);
                    return;
                }
                e.f(iOnDoneCallback, str3, new IllegalStateException("Lifecycle is not at least created when dispatching " + q69Var));
                return;
            case 9:
                z99 z99Var = (z99) this.c;
                cs5 cs5Var = (cs5) this.b;
                wf2 wf2Var = (wf2) this.d;
                a8[] a8VarArr = (a8[]) this.e;
                cs5Var.q0 = true;
                q99 q99Var = z99Var.d;
                wf2Var.a(q99Var.k(), true);
                a8 a8Var = a8VarArr[1];
                if (a8Var != null) {
                    a8Var.setChecked(q99Var.r);
                }
                a8 a8Var2 = a8VarArr[2];
                if (a8Var2 != null) {
                    a8Var2.setChecked(q99Var.s);
                }
                a8 a8Var3 = a8VarArr[3];
                if (a8Var3 != null) {
                    a8Var3.setChecked(q99Var.t);
                    return;
                }
                return;
            case 10:
                jk9 jk9Var = (jk9) this.c;
                nl9 nl9Var = (nl9) this.b;
                nl9 nl9Var2 = (nl9) this.d;
                Handler handler = (Handler) this.e;
                if (jk9Var.r0 && jk9Var.W == 0 && jk9Var.T) {
                    jk9Var.N.f(jk9Var.L, jk9Var.D, false);
                    jk9Var.U = false;
                    jk9Var.V = false;
                    jk9Var.c0 = 0.0f;
                    jk9Var.W = (byte) 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    jk9Var.X = elapsedRealtimeNanos;
                    jk9Var.Y = elapsedRealtimeNanos;
                    jk9Var.d0 = nl9Var;
                    jk9Var.e0 = nl9Var2;
                    String[] strArr = xl9.a;
                    synchronized (xl9.class) {
                        xl9.b();
                        if (nl9Var == nl9Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a = xl9.a(nl9Var == nl9.b ? 0 : 1);
                    }
                    jk9Var.b0 = a;
                    jk9Var.Z = ((Math.max(210, Math.min(kk7.W4, 300 - ((Math.max(0, a - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    jk9Var.a0 = (r4 - r5) * 1000000;
                    jk9Var.i.b("synthetic camera switch started: from=" + nl9Var + ", to=" + nl9Var2 + ", expectedWaitMs=" + jk9Var.b0 + ", targetBlurRadiusPx=" + (((jk9Var.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((jk9Var.Z + jk9Var.a0) / 1000000));
                    jk9Var.Q = -1L;
                    handler.removeCallbacks(jk9Var.y0);
                    handler.post(jk9Var.y0);
                    return;
                }
                return;
            case 11:
                vp9 vp9Var = (vp9) this.c;
                tp9 tp9Var = vp9Var.n;
                TLObject tLObject4 = (TLObject) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                ArrayList arrayList5 = vp9Var.i;
                ArrayList arrayList6 = vp9Var.c;
                int i3 = vp9Var.a;
                boolean z4 = vp9Var.b;
                if (tLObject4 instanceof TLRPC.TL_messages_savedDialogs) {
                    vp9Var.e = true;
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject4;
                    na7.q1(i3).b4(tL_messages_savedDialogs.users, false);
                    na7.q1(i3).V3(tL_messages_savedDialogs.chats, false);
                    ad7.Y(i3).j1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
                    ad7.Y(i3).g1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
                    for (int i4 = 0; i4 < tL_messages_savedDialogs.dialogs.size(); i4++) {
                        up9 b = up9.b(i3, tL_messages_savedDialogs.dialogs.get(i4), tL_messages_savedDialogs.messages);
                        int i5 = 0;
                        while (true) {
                            if (i5 < arrayList6.size()) {
                                if (((up9) arrayList6.get(i5)).a == b.a) {
                                    b.e = ((up9) arrayList6.get(i5)).e;
                                    ((up9) arrayList6.get(i5)).b = b.b;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList5.size()) {
                                arrayList5.add(b);
                                if (b.d()) {
                                    vp9Var.h++;
                                }
                            } else if (((up9) arrayList5.get(i6)).a != b.a) {
                                i6++;
                            }
                        }
                    }
                    vp9Var.f = true;
                    vp9Var.g = tL_messages_savedDialogs.dialogs.size();
                    vp9Var.l();
                    gl.r(tp9Var);
                    gl.d3(tp9Var, 450L);
                    vp9Var.b = false;
                } else if (tLObject4 instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    vp9Var.e = true;
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject4;
                    na7.q1(i3).b4(tL_messages_savedDialogsSlice.users, false);
                    na7.q1(i3).V3(tL_messages_savedDialogsSlice.chats, false);
                    ad7.Y(i3).j1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                    ad7.Y(i3).g1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
                    for (int i7 = 0; i7 < tL_messages_savedDialogsSlice.dialogs.size(); i7++) {
                        up9 b2 = up9.b(i3, tL_messages_savedDialogsSlice.dialogs.get(i7), tL_messages_savedDialogsSlice.messages);
                        int i8 = 0;
                        while (true) {
                            if (i8 < arrayList6.size()) {
                                if (((up9) arrayList6.get(i8)).a == b2.a) {
                                    b2.e = ((up9) arrayList6.get(i8)).e;
                                    ((up9) arrayList6.get(i8)).b = b2.b;
                                } else {
                                    i8++;
                                }
                            }
                        }
                        int i9 = 0;
                        while (true) {
                            if (i9 >= arrayList5.size()) {
                                arrayList5.add(b2);
                                if (b2.d()) {
                                    vp9Var.h++;
                                }
                            } else if (((up9) arrayList5.get(i9)).a != b2.a) {
                                i9++;
                            }
                        }
                    }
                    vp9Var.g = tL_messages_savedDialogsSlice.count;
                    ArrayList arrayList7 = vp9Var.j;
                    int i10 = 0;
                    for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                        if (((up9) arrayList7.get(i11)).b) {
                            i10++;
                        }
                    }
                    if (arrayList5.size() + i10 < vp9Var.g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                        z = false;
                    }
                    vp9Var.f = z;
                    vp9Var.l();
                    gl.r(tp9Var);
                    gl.d3(tp9Var, 450L);
                    vp9Var.b = false;
                } else if (tLObject4 instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    vp9Var.e = true;
                    arrayList5.addAll(arrayList4);
                    vp9Var.g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject4).count;
                    vp9Var.h = 0;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        if (((up9) arrayList4.get(i12)).d()) {
                            vp9Var.h++;
                        }
                    }
                    boolean z5 = vp9Var.f;
                    boolean z6 = arrayList5.size() >= vp9Var.g;
                    vp9Var.f = z6;
                    vp9Var.b = false;
                    if (z6 && !z5) {
                        vp9Var.l();
                    }
                } else if (tL_error3 != null) {
                    vp9Var.e = true;
                    if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error3.text)) {
                        vp9Var.b = true;
                    }
                }
                if (vp9Var.b != z4) {
                    na7.q1(i3).X3.edit().putBoolean("savedMessagesUnsupported", vp9Var.b).apply();
                }
                vp9Var.d = false;
                return;
            case 12:
                mt9 mt9Var = (mt9) this.c;
                cj3 cj3Var = (cj3) this.b;
                Activity activity = (Activity) this.d;
                cs5 cs5Var2 = (cs5) this.e;
                cj3Var.showDialog(new wb5(activity, cj3Var.getResourceProvider(), new tj9(mt9Var, cj3Var, (byte) 14)));
                cs5Var2.u();
                return;
            case 13:
                mt9 mt9Var2 = (mt9) this.c;
                cj3 cj3Var2 = (cj3) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.d;
                cs5 cs5Var3 = (cs5) this.e;
                byte[] bArr = tL_sponsoredPeer.random_id;
                wjb resourceProvider = cj3Var2.getResourceProvider();
                tj9 tj9Var = new tj9(mt9Var2, tL_sponsoredPeer, (byte) 13);
                int i13 = b89.v1;
                int currentAccount = cj3Var2.getCurrentAccount();
                Activity parentActivity = cj3Var2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ot(parentActivity, resourceProvider, bArr, cj3Var2, tj9Var, currentAccount));
                }
                cs5Var3.u();
                return;
            case 14:
                z3a z3aVar = (z3a) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                k3a k3aVar = (k3a) this.d;
                String str4 = (String) this.e;
                if (tLObject5 != null) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    hq6 mediaDataController = z3aVar.getMediaDataController();
                    mediaDataController.getClass();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        mediaDataController.J.k(tL_messages_stickerSet, stickerSet.id);
                        String str5 = tL_messages_stickerSet.set.short_name;
                        if (str5 != null) {
                            mediaDataController.O.put(str5.toLowerCase(), tL_messages_stickerSet);
                        }
                    }
                    TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) k3aVar.h;
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
                    tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
                } else {
                    c = 0;
                }
                ArrayList arrayList8 = (ArrayList) z3aVar.a.remove(str4);
                if (arrayList8 == null || arrayList8.isEmpty()) {
                    return;
                }
                if (c != 0) {
                    z3aVar.getMessagesStorage().o1(((k3a) arrayList8.get(0)).m.k, null, null, false);
                }
                bu9 secretChatHelper = z3aVar.getSecretChatHelper();
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) k3aVar.d;
                k27 k27Var = k3aVar.m;
                secretChatHelper.j(decryptedMessage, k27Var.k, k3aVar.n, null, null, k27Var);
                return;
            case 15:
                z3a z3aVar2 = (z3a) this.c;
                k3a k3aVar2 = (k3a) this.b;
                File file = (File) this.d;
                k27 k27Var2 = (k27) this.e;
                TLRPC.Document F0 = k3aVar2.m.F0();
                if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    try {
                        Bitmap G2 = fl5.G(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                        if (G2 != null) {
                            F0.thumbs.clear();
                            F0.thumbs.add(fl5.U(G2, 90.0f, 90.0f, 55, k3aVar2.d != null));
                            G2.recycle();
                        }
                    } catch (Exception e2) {
                        F0.thumbs.clear();
                        fa4.g(e2, true);
                    }
                }
                gl.c3(new ex7((Object) z3aVar2, (Object) k3aVar2, (Object) file, (Object) F0, (Object) k27Var2, (byte) 22));
                return;
            case 16:
                m3a m3aVar = (m3a) this.c;
                TLObject tLObject6 = (TLObject) this.b;
                TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                boolean z7 = tLObject6 instanceof TLRPC.TL_messages_historyImport;
                p3a p3aVar = m3aVar.b;
                z3a z3aVar3 = p3aVar.q;
                if (!z7) {
                    z3aVar3.E.l(p3aVar.j);
                    z3aVar3.getNotificationCenter().k(kk7.u1, Long.valueOf(p3aVar.j), tL_messages_initHistoryImport, tL_error4);
                    return;
                }
                p3aVar.k = ((TLRPC.TL_messages_historyImport) tLObject6).id;
                ArrayList arrayList9 = p3aVar.f;
                HashSet hashSet = p3aVar.c;
                hashSet.remove(p3aVar.a);
                z3aVar3.getNotificationCenter().k(kk7.u1, Long.valueOf(p3aVar.j));
                if (hashSet.isEmpty()) {
                    TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
                    tL_messages_startHistoryImport.peer = p3aVar.g;
                    tL_messages_startHistoryImport.import_id = p3aVar.k;
                    z3aVar3.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new o3a(p3aVar, tL_messages_startHistoryImport));
                }
                p3aVar.n = SystemClock.elapsedRealtime();
                int size = arrayList9.size();
                for (int i14 = 0; i14 < size; i14++) {
                    z3aVar3.getFileLoader().h0(false, 67108864, (String) arrayList9.get(i14), true);
                }
                return;
            case 17:
                t3a t3aVar = (t3a) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                u3a u3aVar = t3aVar.b;
                z3a z3aVar4 = u3aVar.o;
                z3aVar4.G.remove(u3aVar.e);
                if (tL_error5 == null) {
                    z3aVar4.getNotificationCenter().k(kk7.v1, u3aVar.e);
                } else {
                    z3aVar4.getNotificationCenter().k(kk7.v1, u3aVar.e, tL_stickers_createStickerSet, tL_error5);
                }
                if (tLObject7 instanceof TLRPC.TL_messages_stickerSet) {
                    if (z3aVar4.getNotificationCenter().a.indexOfKey(kk7.w1) >= 0) {
                        z3aVar4.getNotificationCenter().k(kk7.w1, tLObject7);
                        return;
                    } else {
                        z3aVar4.getMediaDataController().h2(null, tLObject7, 2, null, false, false);
                        return;
                    }
                }
                return;
            case 18:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                hd hdVar = (hd) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.e;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.d;
                sessionsActivity.getClass();
                try {
                    hdVar.dismiss();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                if (tL_error6 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.q0();
                    g7a g7aVar = sessionsActivity.a;
                    if (g7aVar != null) {
                        g7aVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.c;
                hd hdVar2 = (hd) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.e;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                sessionsActivity2.getClass();
                try {
                    hdVar2.dismiss();
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
                if (tL_error7 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.q0();
                    g7a g7aVar2 = sessionsActivity2.a;
                    if (g7aVar2 != null) {
                        g7aVar2.f();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                f7a f7aVar = (f7a) this.c;
                TLObject tLObject8 = (TLObject) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.e;
                u91 u91Var = (u91) this.d;
                f7aVar.a = tLObject8;
                f7aVar.b = tL_error8;
                u91Var.run();
                return;
            case 21:
                ((d8a) this.c).d0((TLRPC.TL_error) this.e, (TLObject) this.b, (String) this.d);
                return;
            case 22:
                TLObject tLObject9 = (TLObject) this.b;
                boolean[] zArr = (boolean[]) this.c;
                pt0 pt0Var = (pt0) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject9 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    pt0Var.a(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                pt0Var.a(Boolean.TRUE, "allowed");
                return;
            case 23:
                taa taaVar = (taa) this.c;
                AtomicReference atomicReference = (AtomicReference) this.b;
                caa caaVar = (caa) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                atomicReference.set(null);
                caaVar.didReceivedNotification(kk7.s5, taaVar.a, Long.valueOf(-dialog.id));
                return;
            case 24:
                vqa vqaVar = (vqa) this.c;
                boolean[] zArr2 = (boolean[]) this.b;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.d;
                q41[] q41VarArr = (q41[]) this.e;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_stars.StarGift r1 = vqaVar.r1();
                kt4.c(vqaVar.a).j(r1.gift_id, new yt0(vqaVar, r1, starGiftAttribute, q41VarArr, zArr2, (byte) 8));
                return;
            case 25:
                vqa vqaVar2 = (vqa) this.c;
                TLObject tLObject10 = (TLObject) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.d;
                String str6 = (String) this.e;
                if (tLObject10 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject10;
                    if ((tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) && !vqaVar2.J && vqaVar2.a3 == nftitem && TextUtils.equals(vqaVar2.D2, str6)) {
                        na7.q1(vqaVar2.a).b4(tL_payments_uniqueStarGift.users, false);
                        na7.q1(vqaVar2.a).V3(tL_payments_uniqueStarGift.chats, false);
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
                        nftitem.gift = tL_starGiftUnique;
                        vqaVar2.m2(str6, tL_starGiftUnique, vqaVar2.B2);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                vqa vqaVar3 = (vqa) this.c;
                TLObject tLObject11 = (TLObject) this.b;
                q3a q3aVar = (q3a) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.e;
                if (!(tLObject11 instanceof TLRPC.TL_messages_chatFull)) {
                    m21 Z = vqaVar3.j().Z(tL_error9);
                    Z.t = true;
                    Z.j();
                    return;
                }
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject11;
                na7.q1(vqaVar3.a).b4(tL_messages_chatFull.users, false);
                na7.q1(vqaVar3.a).V3(tL_messages_chatFull.chats, false);
                na7.q1(vqaVar3.a).U3(tL_messages_chatFull.full_chat);
                if (tL_messages_chatFull.full_chat.stargifts_available) {
                    q3aVar.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqaVar3.J0, vqaVar3.getContext());
                alertDialog$Builder.a.S = k96.M0(2131750246, null);
                alertDialog$Builder.a.U = k96.M0(2131750247, null);
                b00.t(null, 2131747638, alertDialog$Builder, null);
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                upa upaVar = (upa) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                hn hnVar = upaVar.I;
                upaVar.i0 = false;
                if (starGift != null) {
                    gl.c3(runnable);
                    return;
                }
                ry8 ry8Var = upaVar.m0;
                if (ry8Var != null) {
                    ry8Var.d();
                    gl.d3(new am6((byte) 28), 750L);
                }
                upaVar.R.animate().alpha(0.0f).start();
                upaVar.T.animate().alpha(1.0f).start();
                upaVar.H.animate().alpha(1.0f).start();
                upaVar.S.animate().alpha(0.0f).start();
                upaVar.Q.animate().alpha(1.0f).start();
                upaVar.N.setText(gl.S2(k96.G(arrayList10.size(), "GiftCraftFailedText", new Object[0])));
                hnVar.setText(k96.M0(2131749779, null));
                hnVar.setTranslationY(gl.L(6.0f));
                upaVar.J.setAlpha(0.0f);
                if (upaVar.P != null) {
                    int i15 = 0;
                    while (true) {
                        nv4[] nv4VarArr = upaVar.P;
                        if (i15 < nv4VarArr.length) {
                            gl.B2(nv4VarArr[i15]);
                            i15++;
                        } else {
                            upaVar.P = null;
                        }
                    }
                }
                upaVar.P = new nv4[arrayList10.size()];
                int i16 = 0;
                while (i16 < arrayList10.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList10.get(i16);
                    nv4 nv4Var2 = new nv4(upaVar.a0, upaVar.a, upaVar.getContext());
                    nv4Var2.h(starGift2, false, false, false, false, true);
                    nv4Var2.y.setVisibility(8);
                    nv4Var2.setRibbonColor(-3065286);
                    be0 be0Var = nv4Var2.E;
                    FrameLayout.LayoutParams e5 = nme.e(42, 42, 17);
                    nv4Var2.F = e5;
                    be0Var.setLayoutParams(e5);
                    int i17 = i16 + 1;
                    Object[] objArr = i17 >= arrayList10.size();
                    LinearLayout linearLayout = upaVar.O;
                    upaVar.P[i16] = nv4Var2;
                    linearLayout.addView(nv4Var2, nme.q(74, 74, 0.0f, 51, 0, 0, objArr != false ? 0 : 6, 0));
                    i16 = i17;
                }
                return;
        }
    }

    public /* synthetic */ bm8(gk7 gk7Var, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.e = tL_error;
        this.b = tLObject;
        this.d = obj;
    }

    public /* synthetic */ bm8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ bm8(Object obj, Object obj2, TLRPC.TL_error tL_error, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.e = tL_error;
        this.d = obj3;
    }

    public /* synthetic */ bm8(TLObject tLObject, boolean[] zArr, pt0 pt0Var, TLRPC.UserFull userFull) {
        this.a = (byte) 22;
        this.b = tLObject;
        this.c = zArr;
        this.d = pt0Var;
        this.e = userFull;
    }
}
