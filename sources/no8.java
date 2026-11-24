// default package

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.e;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class no8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ no8(a6a a6aVar, m5a m5aVar, File file, k47 k47Var) {
        this.a = (byte) 15;
        this.b = a6aVar;
        this.c = m5aVar;
        this.e = file;
        this.d = k47Var;
    }

    private final void a() {
        wsa wsaVar = (wsa) this.b;
        TLObject tLObject = (TLObject) this.c;
        hw9 hw9Var = (hw9) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            u31 Z = wsaVar.j().Z(tL_error);
            Z.u = true;
            Z.j();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        oc7.r1(wsaVar.a).d4(tL_messages_chatFull.users, false);
        oc7.r1(wsaVar.a).X3(tL_messages_chatFull.chats, false);
        oc7.r1(wsaVar.a).W3(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            hw9Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
        String M0 = jb6.M0(2131750195, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131750196, null);
        b10.t(null, 2131747564, alertDialog$Builder, null);
    }

    private final void b() {
        wsa wsaVar = (wsa) this.b;
        k47 k47Var = (k47) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
        wsaVar.j3 = true;
        wsaVar.l2(k47Var, null);
        wsaVar.z2(0, true, null);
        uj4 uj4Var = wsaVar.V1;
        if (uj4Var != null) {
            uj4Var.c(true);
        }
        jva.v(wsaVar.a, false).L();
        ava D = jva.v(wsaVar.a, false).D(z8c.h(wsaVar.a).e(), false);
        if (D != null) {
            D.l(arrayList, starGift);
        }
    }

    private final void c() {
        wsa wsaVar = (wsa) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
        if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
            wsaVar.j().g0(tL_error, false);
            return;
        }
        wsaVar.m2 = true;
        wsaVar.q3 = null;
        wsaVar.c1(inputSavedStarGift, (TLRPC.Updates) tLObject, new npa(wsaVar, (byte) 14));
        Utilities.d.c(new e6a((Object) wsaVar, (Object) tLObject, (byte) 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x0911, code lost:
    
        if (r5 == null) goto L291;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Uri fromFile;
        int indexOf;
        int a;
        String str = null;
        r5 = null;
        SQLiteCursor sQLiteCursor = null;
        str = null;
        char c = 1;
        r7 = true;
        boolean z = true;
        switch (this.a) {
            case 0:
                he heVar = (he) this.b;
                boolean[] zArr = (boolean[]) this.c;
                Activity activity = (Activity) this.d;
                File file = (File) this.e;
                RectF rectF = ProfileActivity.e7;
                try {
                    heVar.dismiss();
                } catch (Exception unused) {
                }
                if (!zArr[0]) {
                    if (activity != null) {
                        Toast.makeText(activity, jb6.M0(2131751042, null), 0).show();
                        return;
                    }
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    a.d();
                    fromFile = FileProvider.c(activity, "org.telegram.messenger.beta.provider", file);
                } else {
                    fromFile = Uri.fromFile(file);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                if (i >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + jb6.D0().y0().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", fromFile);
                if (activity != null) {
                    try {
                        activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            case 1:
                sp8 sp8Var = (sp8) this.b;
                TLObject tLObject = (TLObject) this.c;
                z8c z8cVar = (z8c) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity = sp8Var.b;
                profileActivity.o0.d1--;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    profileActivity.getMessagesController().d4(tL_photos_photo.users, false);
                    TLRPC.User W1 = profileActivity.getMessagesController().W1(Long.valueOf(z8cVar.n));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity.o0.W0;
                        if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(indexOf, photo2);
                        }
                        if (W1 != null) {
                            W1.photo.photo_id = tL_photos_photo.photo.id;
                            z8cVar.v(W1);
                            z8cVar.u(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                dq8 dq8Var = (dq8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                ProfileActivity profileActivity2 = dq8Var.c.e;
                profileActivity2.z3(null);
                if (!(tLObject2 instanceof TL_fragment.TL_collectibleInfo)) {
                    c41.e0(tL_error);
                    return;
                }
                TLObject W12 = profileActivity2.e1 != 0 ? profileActivity2.getMessagesController().W1(Long.valueOf(profileActivity2.e1)) : profileActivity2.getMessagesController().L0(Long.valueOf(profileActivity2.f1));
                if (profileActivity2.getParentActivity() != null) {
                    yq4.a(profileActivity2.getParentActivity(), 0, tL_username.username, W12, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.A0);
                    return;
                }
                return;
            case 3:
                final rs8 rs8Var = (rs8) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                ox4 ox4Var = (ox4) this.d;
                final View view = (View) this.e;
                lea leaVar = rs8Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    ox4Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = rs8Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(rs8Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z2 = savedStarGift.pinned_to_top;
                final boolean z3 = !z2;
                if (rs8Var.e.q(savedStarGift, z3, false)) {
                    new us8(rs8Var.getContext(), leaVar.c, savedStarGift, rs8Var.c, new iac() { // from class: ls8
                        @Override // iac
                        public final Object run() {
                            ((ox4) view).d(z3, true);
                            rs8 rs8Var2 = rs8.this;
                            rs8Var2.f.w0(0);
                            return c41.b0(rs8Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z2) {
                    ts2.u(null, 2131749813, c41.b0(leaVar.a), R.raw.ic_unpin, 36);
                } else {
                    c41.b0(leaVar.a).I(R.raw.ic_pin, jb6.M0(2131750009, null), jb6.M0(2131750010, null)).j();
                }
                ((ox4) view).d(z3, true);
                rs8Var.f.w0(0);
                return;
            case 4:
                n7c n7cVar = (n7c) this.b;
                zx8 zx8Var = (zx8) this.c;
                rac racVar = (rac) this.d;
                qac qacVar = (qac) this.e;
                if (zx8.d(n7cVar.getParentActivity())) {
                    zx8Var.e();
                    j68 j68Var = new j68(10, false, false, null);
                    j68Var.H = (byte) 1;
                    j68Var.I = false;
                    j68Var.y = false;
                    j68Var.W = new in3((Object) racVar, (Object) n7cVar, (Object) qacVar, (byte) 25);
                    n7cVar.presentFragment(j68Var);
                    return;
                }
                return;
            case 5:
                String str2 = (String) this.b;
                rac racVar2 = (rac) this.c;
                d dVar = (d) this.d;
                qac qacVar2 = (qac) this.e;
                try {
                    Point b1 = gm.b1();
                    Bitmap G = fn5.G(str2, null, b1.x, b1.y, true);
                    if (G != null) {
                        str = zx8.l(G, racVar2);
                        G.recycle();
                    }
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                gm.c3(new xx8(dVar, str, qacVar2));
                return;
            case 6:
                pz8 pz8Var = (pz8) this.b;
                cf7 cf7Var = (cf7) this.c;
                oz8 oz8Var = (oz8) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = cf7Var.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(oz8Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList2.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    gm.c3(new no8((Object) pz8Var, (Object) arrayList2, (Object) oz8Var, (Object) tL_messages_sendQuickReplyMessages, (byte) 7));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 7:
                pz8 pz8Var2 = (pz8) this.b;
                ArrayList<Integer> arrayList3 = (ArrayList) this.c;
                oz8 oz8Var2 = (oz8) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i2 = pz8Var2.a;
                if (arrayList3.isEmpty() || arrayList3.size() < oz8Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = oz8Var2.a;
                    ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getQuickReplyMessages, new fm8((Object) pz8Var2, (Object) arrayList3, (Object) tL_messages_sendQuickReplyMessages2, (byte) 5));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList3;
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(i2).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 8:
                w26 w26Var = (w26) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str3 = (String) this.d;
                s89 s89Var = (s89) this.e;
                if (w26Var != null && ((g36) w26Var).b.compareTo(v26.c) >= 0) {
                    e.c(iOnDoneCallback, str3, s89Var);
                    return;
                }
                e.f(iOnDoneCallback, str3, new IllegalStateException("Lifecycle is not at least created when dispatching " + s89Var));
                return;
            case 9:
                zb9 zb9Var = (zb9) this.b;
                bu5 bu5Var = (bu5) this.c;
                jh2 jh2Var = (jh2) this.d;
                a8[] a8VarArr = (a8[]) this.e;
                bu5Var.q0 = true;
                qb9 qb9Var = zb9Var.d;
                jh2Var.a(qb9Var.k(), true);
                a8 a8Var = a8VarArr[1];
                if (a8Var != null) {
                    a8Var.setChecked(qb9Var.r);
                }
                a8 a8Var2 = a8VarArr[2];
                if (a8Var2 != null) {
                    a8Var2.setChecked(qb9Var.s);
                }
                a8 a8Var3 = a8VarArr[3];
                if (a8Var3 != null) {
                    a8Var3.setChecked(qb9Var.t);
                    return;
                }
                return;
            case 10:
                km9 km9Var = (km9) this.b;
                nn9 nn9Var = (nn9) this.c;
                nn9 nn9Var2 = (nn9) this.d;
                Handler handler = (Handler) this.e;
                if (km9Var.r0 && km9Var.W == 0 && km9Var.T) {
                    km9Var.N.f(km9Var.L, km9Var.D, false);
                    km9Var.U = false;
                    km9Var.V = false;
                    km9Var.c0 = 0.0f;
                    km9Var.W = (byte) 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    km9Var.X = elapsedRealtimeNanos;
                    km9Var.Y = elapsedRealtimeNanos;
                    km9Var.d0 = nn9Var;
                    km9Var.e0 = nn9Var2;
                    String[] strArr = xn9.a;
                    synchronized (xn9.class) {
                        xn9.b();
                        if (nn9Var == nn9Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a = xn9.a(nn9Var == nn9.b ? 0 : 1);
                    }
                    km9Var.b0 = a;
                    km9Var.Z = ((Math.max(nm7.n3, Math.min(nm7.W4, 300 - ((Math.max(0, a - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    km9Var.a0 = (r2 - r4) * 1000000;
                    km9Var.i.b("synthetic camera switch started: from=" + nn9Var + ", to=" + nn9Var2 + ", expectedWaitMs=" + km9Var.b0 + ", targetBlurRadiusPx=" + (((km9Var.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((km9Var.Z + km9Var.a0) / 1000000));
                    km9Var.Q = -1L;
                    handler.removeCallbacks(km9Var.y0);
                    handler.post(km9Var.y0);
                    return;
                }
                return;
            case 11:
                wr9 wr9Var = (wr9) this.b;
                ur9 ur9Var = wr9Var.n;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                ArrayList arrayList5 = wr9Var.i;
                ArrayList arrayList6 = wr9Var.c;
                int i4 = wr9Var.a;
                boolean z4 = wr9Var.b;
                if (tLObject3 instanceof TLRPC.TL_messages_savedDialogs) {
                    wr9Var.e = true;
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject3;
                    oc7.r1(i4).d4(tL_messages_savedDialogs.users, false);
                    oc7.r1(i4).X3(tL_messages_savedDialogs.chats, false);
                    cf7.Y(i4).j1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
                    cf7.Y(i4).g1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
                    for (int i5 = 0; i5 < tL_messages_savedDialogs.dialogs.size(); i5++) {
                        vr9 b = vr9.b(i4, tL_messages_savedDialogs.dialogs.get(i5), tL_messages_savedDialogs.messages);
                        int i6 = 0;
                        while (true) {
                            if (i6 < arrayList6.size()) {
                                if (((vr9) arrayList6.get(i6)).a == b.a) {
                                    b.e = ((vr9) arrayList6.get(i6)).e;
                                    ((vr9) arrayList6.get(i6)).b = b.b;
                                } else {
                                    i6++;
                                }
                            }
                        }
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList5.size()) {
                                arrayList5.add(b);
                                if (b.d()) {
                                    wr9Var.h++;
                                }
                            } else if (((vr9) arrayList5.get(i7)).a != b.a) {
                                i7++;
                            }
                        }
                    }
                    wr9Var.f = true;
                    wr9Var.g = tL_messages_savedDialogs.dialogs.size();
                    wr9Var.l();
                    gm.r(ur9Var);
                    gm.d3(ur9Var, 450L);
                    wr9Var.b = false;
                } else if (tLObject3 instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    wr9Var.e = true;
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject3;
                    oc7.r1(i4).d4(tL_messages_savedDialogsSlice.users, false);
                    oc7.r1(i4).X3(tL_messages_savedDialogsSlice.chats, false);
                    cf7.Y(i4).j1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                    cf7.Y(i4).g1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
                    for (int i8 = 0; i8 < tL_messages_savedDialogsSlice.dialogs.size(); i8++) {
                        vr9 b2 = vr9.b(i4, tL_messages_savedDialogsSlice.dialogs.get(i8), tL_messages_savedDialogsSlice.messages);
                        int i9 = 0;
                        while (true) {
                            if (i9 < arrayList6.size()) {
                                if (((vr9) arrayList6.get(i9)).a == b2.a) {
                                    b2.e = ((vr9) arrayList6.get(i9)).e;
                                    ((vr9) arrayList6.get(i9)).b = b2.b;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList5.size()) {
                                arrayList5.add(b2);
                                if (b2.d()) {
                                    wr9Var.h++;
                                }
                            } else if (((vr9) arrayList5.get(i10)).a != b2.a) {
                                i10++;
                            }
                        }
                    }
                    wr9Var.g = tL_messages_savedDialogsSlice.count;
                    ArrayList arrayList7 = wr9Var.j;
                    int i11 = 0;
                    for (int i12 = 0; i12 < arrayList7.size(); i12++) {
                        if (((vr9) arrayList7.get(i12)).b) {
                            i11++;
                        }
                    }
                    if (arrayList5.size() + i11 < wr9Var.g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                        z = false;
                    }
                    wr9Var.f = z;
                    wr9Var.l();
                    gm.r(ur9Var);
                    gm.d3(ur9Var, 450L);
                    wr9Var.b = false;
                } else if (tLObject3 instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    wr9Var.e = true;
                    arrayList5.addAll(arrayList4);
                    wr9Var.g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject3).count;
                    wr9Var.h = 0;
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if (((vr9) arrayList4.get(i13)).d()) {
                            wr9Var.h++;
                        }
                    }
                    boolean z5 = wr9Var.f;
                    boolean z6 = arrayList5.size() >= wr9Var.g;
                    wr9Var.f = z6;
                    wr9Var.b = false;
                    if (z6 && !z5) {
                        wr9Var.l();
                    }
                } else if (tL_error2 != null) {
                    wr9Var.e = true;
                    if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error2.text)) {
                        wr9Var.b = true;
                    }
                }
                if (wr9Var.b != z4) {
                    oc7.r1(i4).X3.edit().putBoolean("savedMessagesUnsupported", wr9Var.b).apply();
                }
                wr9Var.d = false;
                return;
            case 12:
                ov9 ov9Var = (ov9) this.b;
                nk3 nk3Var = (nk3) this.c;
                Activity activity2 = (Activity) this.d;
                bu5 bu5Var2 = (bu5) this.e;
                nk3Var.showDialog(new ud5(activity2, nk3Var.getResourceProvider(), new il9(ov9Var, nk3Var, (byte) 16)));
                bu5Var2.u();
                return;
            case 13:
                ov9 ov9Var2 = (ov9) this.b;
                nk3 nk3Var2 = (nk3) this.c;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.d;
                bu5 bu5Var3 = (bu5) this.e;
                byte[] bArr = tL_sponsoredPeer.random_id;
                ylb resourceProvider = nk3Var2.getResourceProvider();
                il9 il9Var = new il9(ov9Var2, tL_sponsoredPeer, (byte) 15);
                int i14 = da9.v1;
                int currentAccount = nk3Var2.getCurrentAccount();
                Activity parentActivity = nk3Var2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ou(parentActivity, resourceProvider, bArr, nk3Var2, il9Var, currentAccount));
                }
                bu5Var3.u();
                return;
            case 14:
                a6a a6aVar = (a6a) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                m5a m5aVar = (m5a) this.d;
                String str4 = (String) this.e;
                if (tLObject4 != null) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    hs6 mediaDataController = a6aVar.getMediaDataController();
                    mediaDataController.getClass();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        mediaDataController.J.k(tL_messages_stickerSet, stickerSet.id);
                        String str5 = tL_messages_stickerSet.set.short_name;
                        if (str5 != null) {
                            mediaDataController.O.put(str5.toLowerCase(), tL_messages_stickerSet);
                        }
                    }
                    TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) m5aVar.h;
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
                    tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
                } else {
                    c = 0;
                }
                ArrayList arrayList8 = (ArrayList) a6aVar.a.remove(str4);
                if (arrayList8 == null || arrayList8.isEmpty()) {
                    return;
                }
                if (c != 0) {
                    a6aVar.getMessagesStorage().o1(((m5a) arrayList8.get(0)).m.k, null, null, false);
                }
                dw9 secretChatHelper = a6aVar.getSecretChatHelper();
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) m5aVar.d;
                k47 k47Var = m5aVar.m;
                secretChatHelper.j(decryptedMessage, k47Var.k, m5aVar.n, null, null, k47Var);
                return;
            case 15:
                a6a a6aVar2 = (a6a) this.b;
                m5a m5aVar2 = (m5a) this.c;
                File file2 = (File) this.e;
                k47 k47Var2 = (k47) this.d;
                TLRPC.Document F0 = m5aVar2.m.F0();
                if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    try {
                        Bitmap G2 = fn5.G(file2.getAbsolutePath(), null, 90.0f, 90.0f, true);
                        if (G2 != null) {
                            F0.thumbs.clear();
                            F0.thumbs.add(fn5.U(G2, 90.0f, 90.0f, 55, m5aVar2.d != null));
                            G2.recycle();
                        }
                    } catch (Exception e3) {
                        F0.thumbs.clear();
                        fc4.g(e3, true);
                    }
                }
                gm.c3(new hz7((Object) a6aVar2, (Object) m5aVar2, (Object) file2, (Object) F0, (Object) k47Var2, (byte) 22));
                return;
            case 16:
                o5a o5aVar = (o5a) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                boolean z7 = tLObject5 instanceof TLRPC.TL_messages_historyImport;
                r5a r5aVar = o5aVar.b;
                a6a a6aVar3 = r5aVar.q;
                if (!z7) {
                    a6aVar3.E.l(r5aVar.j);
                    a6aVar3.getNotificationCenter().k(nm7.v1, Long.valueOf(r5aVar.j), tL_messages_initHistoryImport, tL_error3);
                    return;
                }
                r5aVar.k = ((TLRPC.TL_messages_historyImport) tLObject5).id;
                ArrayList arrayList9 = r5aVar.f;
                HashSet hashSet = r5aVar.c;
                hashSet.remove(r5aVar.a);
                a6aVar3.getNotificationCenter().k(nm7.v1, Long.valueOf(r5aVar.j));
                if (hashSet.isEmpty()) {
                    TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
                    tL_messages_startHistoryImport.peer = r5aVar.g;
                    tL_messages_startHistoryImport.import_id = r5aVar.k;
                    a6aVar3.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new q5a(r5aVar, tL_messages_startHistoryImport));
                }
                r5aVar.n = SystemClock.elapsedRealtime();
                int size = arrayList9.size();
                for (int i15 = 0; i15 < size; i15++) {
                    a6aVar3.getFileLoader().h0(false, 67108864, (String) arrayList9.get(i15), true);
                }
                return;
            case 17:
                u5a u5aVar = (u5a) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                v5a v5aVar = u5aVar.b;
                a6a a6aVar4 = v5aVar.o;
                a6aVar4.G.remove(v5aVar.e);
                if (tL_error4 == null) {
                    a6aVar4.getNotificationCenter().k(nm7.w1, v5aVar.e);
                } else {
                    a6aVar4.getNotificationCenter().k(nm7.w1, v5aVar.e, tL_stickers_createStickerSet, tL_error4);
                }
                if (tLObject6 instanceof TLRPC.TL_messages_stickerSet) {
                    if (a6aVar4.getNotificationCenter().a.indexOfKey(nm7.x1) >= 0) {
                        a6aVar4.getNotificationCenter().k(nm7.x1, tLObject6);
                        return;
                    } else {
                        a6aVar4.getMediaDataController().h2(null, tLObject6, 2, null, false, false);
                        return;
                    }
                }
                return;
            case 18:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                he heVar2 = (he) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                sessionsActivity.getClass();
                try {
                    heVar2.dismiss();
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    h9a h9aVar = sessionsActivity.a;
                    if (h9aVar != null) {
                        h9aVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.c;
                he heVar3 = (he) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                sessionsActivity2.getClass();
                try {
                    heVar3.dismiss();
                } catch (Exception e5) {
                    fc4.g(e5, true);
                }
                if (tL_error6 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    h9a h9aVar2 = sessionsActivity2.a;
                    if (h9aVar2 != null) {
                        h9aVar2.f();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                g9a g9aVar = (g9a) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                db1 db1Var = (db1) this.e;
                g9aVar.a = tLObject7;
                g9aVar.b = tL_error7;
                db1Var.run();
                return;
            case 21:
                ((daa) this.b).e0((TLRPC.TL_error) this.c, (TLObject) this.d, (String) this.e);
                return;
            case 22:
                TLObject tLObject8 = (TLObject) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                yu0 yu0Var = (yu0) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    yu0Var.a(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                yu0Var.a(Boolean.TRUE, "allowed");
                return;
            case 23:
                tca tcaVar = (tca) this.b;
                AtomicReference atomicReference = (AtomicReference) this.c;
                cca ccaVar = (cca) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                atomicReference.set(null);
                ccaVar.didReceivedNotification(nm7.u5, tcaVar.a, Long.valueOf(-dialog.id));
                return;
            case 24:
                wsa wsaVar = (wsa) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.d;
                x51[] x51VarArr = (x51[]) this.e;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                TL_stars.StarGift r1 = wsaVar.r1();
                lv4.c(wsaVar.a).j(r1.gift_id, new hv0(wsaVar, r1, starGiftAttribute, x51VarArr, zArr3, (byte) 8));
                return;
            case 25:
                wsa wsaVar2 = (wsa) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.d;
                String str6 = (String) this.e;
                if (tLObject9 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject9;
                    if ((tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) && !wsaVar2.J && wsaVar2.a3 == nftitem && TextUtils.equals(wsaVar2.D2, str6)) {
                        oc7.r1(wsaVar2.a).d4(tL_payments_uniqueStarGift.users, false);
                        oc7.r1(wsaVar2.a).X3(tL_payments_uniqueStarGift.chats, false);
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
                        nftitem.gift = tL_starGiftUnique;
                        wsaVar2.m2(str6, tL_starGiftUnique, wsaVar2.B2);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                ura uraVar = (ura) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                io ioVar = uraVar.I;
                uraVar.i0 = false;
                if (starGift != null) {
                    gm.c3(runnable);
                    return;
                }
                s09 s09Var = uraVar.m0;
                if (s09Var != null) {
                    s09Var.d();
                    gm.d3(new bo6((byte) 28), 750L);
                }
                uraVar.R.animate().alpha(0.0f).start();
                uraVar.T.animate().alpha(1.0f).start();
                uraVar.H.animate().alpha(1.0f).start();
                uraVar.S.animate().alpha(0.0f).start();
                uraVar.Q.animate().alpha(1.0f).start();
                uraVar.N.setText(gm.S2(jb6.G(arrayList10.size(), "GiftCraftFailedText", new Object[0])));
                ioVar.setText(jb6.M0(2131749728, null));
                ioVar.setTranslationY(gm.L(6.0f));
                uraVar.J.setAlpha(0.0f);
                if (uraVar.P != null) {
                    int i16 = 0;
                    while (true) {
                        ox4[] ox4VarArr = uraVar.P;
                        if (i16 < ox4VarArr.length) {
                            gm.B2(ox4VarArr[i16]);
                            i16++;
                        } else {
                            uraVar.P = null;
                        }
                    }
                }
                uraVar.P = new ox4[arrayList10.size()];
                int i17 = 0;
                while (i17 < arrayList10.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList10.get(i17);
                    ox4 ox4Var2 = new ox4(uraVar.a0, uraVar.a, uraVar.getContext());
                    ox4Var2.h(starGift2, false, false, false, false, true);
                    ox4Var2.y.setVisibility(8);
                    ox4Var2.setRibbonColor(-3065286);
                    bf0 bf0Var = ox4Var2.E;
                    FrameLayout.LayoutParams e6 = qoe.e(42, 42, 17);
                    ox4Var2.F = e6;
                    bf0Var.setLayoutParams(e6);
                    int i18 = i17 + 1;
                    Object[] objArr = i18 >= arrayList10.size();
                    LinearLayout linearLayout = uraVar.O;
                    uraVar.P[i17] = ox4Var2;
                    linearLayout.addView(ox4Var2, qoe.q(74, 74, 0.0f, 51, 0, 0, objArr != false ? 0 : 6, 0));
                    i17 = i18;
                }
                return;
        }
    }

    public /* synthetic */ no8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ no8(SessionsActivity sessionsActivity, he heVar, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.c = sessionsActivity;
        this.b = heVar;
        this.d = tL_error;
        this.e = tLObject;
    }
}
