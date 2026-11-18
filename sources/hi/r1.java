package hi;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04f8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        long j3;
        di.f0 f0Var;
        TL_stars.StarsTransaction starsTransaction;
        TL_stars.StarsAmount starsAmount;
        boolean z10 = false;
        z10 = false;
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                TLObject tLObject = (TLObject) this.c;
                u1 u1Var = s1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    j2 j2Var = u1Var.r;
                    int i7 = j2.C1;
                    mp.u1(j2Var.a).f4(tL_contacts_resolvedPeer.users, false);
                    mp.u1(j2Var.a).Z3(tL_contacts_resolvedPeer.chats, false);
                    tr.a0(j2Var.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                s1Var.n = true;
                s1Var.G();
                break;
            case 1:
                ((o2) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 2:
                l5 l5Var = (l5) this.b;
                View view = (View) this.c;
                l5Var.getClass();
                if (view instanceof tg.j) {
                    tg.j jVar = (tg.j) view;
                    jVar.m();
                    l5Var.A0(jVar, true);
                    break;
                }
                break;
            case 3:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(org.telegram.messenger.t0.b, gd.E0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        break;
                    } else {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((x10) this.b).a((Bitmap) this.c);
                break;
            case 5:
                w5.a((w5) this.b, (d7) this.c);
                break;
            case 6:
                h6.m mVar = (h6.m) this.b;
                d7 d7Var = (d7) this.c;
                w5 w5Var = (w5) mVar.d;
                Bitmap bitmap = w5Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (d7Var.M0 == w5Var.a) {
                        d7Var.M0 = null;
                    }
                    w5Var.a = null;
                    w5Var.invalidate();
                    break;
                }
                break;
            case 7:
                a6 a6Var = (a6) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = a6Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new u8.n(new com.google.android.gms.internal.vision.u2(context, x1Var)));
                a6Var.a(a6Var.f);
                break;
            case 8:
                ((a6) this.b).c.a((y5) this.c);
                break;
            case 9:
                q qVar = (q) this.b;
                tg.r1 r1Var = (tg.r1) this.c;
                i6 i6Var = qVar.a;
                if (r1Var.getWidth() <= 0) {
                    i6Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new k(qVar, 14)).start();
                    break;
                } else {
                    float width = r1Var.getWidth() / i6Var.getWidth();
                    ValueAnimator valueAnimator = qVar.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qVar.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar.x.addUpdateListener(new h6(qVar, i6Var.getScaleX(), width, ((r1Var.getWidth() / 2.0f) + r1Var.getX()) - ((i6Var.getWidth() / 2.0f) + i6Var.getX()), ((r1Var.getHeight() / 2.0f) + r1Var.getY()) - ((i6Var.getHeight() / 2.0f) + i6Var.getY()), 0));
                    qVar.x.addListener(new ah.l(6, qVar, r1Var));
                    qVar.x.setDuration(320L);
                    qVar.x.setInterpolator(lr.h);
                    qVar.w = r1Var;
                    qVar.x.start();
                    break;
                }
            case 10:
                v6 v6Var = (v6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList = v6Var.Y1;
                v6Var.r2 = false;
                v6Var.q2 = false;
                if (tLObject2 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    mp.u1(v6Var.a).f4(messages_messages.users, false);
                    mp.u1(v6Var.a).Z3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Message message = arrayList2.get(i10);
                        i10++;
                        arrayList.add(new fj(v6Var.a, message, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                        z10 = true;
                    }
                    v6Var.p2 = z10;
                    v6Var.o2 = messages_messages.next_rate;
                } else {
                    v6Var.p2 = false;
                    v6Var.o2 = 0;
                }
                v6Var.l2.O(true);
                break;
            case 11:
                v6 v6Var2 = (v6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                v6Var2.G2 = false;
                v6Var2.X1.addAll(arrayList3);
                v6Var2.l2.O(true);
                break;
            case 12:
                d7 d7Var2 = (d7) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                d7Var2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    d7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            d7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 13:
                l7 l7Var = (l7) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    mp.u1(l7Var.a).f4(webpagepreview.users, false);
                    mp.u1(l7Var.a).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            l7Var.c2 = webPage;
                            if (l7.h1(webPage)) {
                                TLRPC.WebPage webPage2 = l7Var.c2;
                                l7Var.b2 = webPage2 == null ? 0L : webPage2.id;
                                l7Var.c2 = null;
                                j3 = 0;
                            } else {
                                j3 = 0;
                                l7Var.b2 = 0L;
                            }
                        } else {
                            j3 = 0;
                            l7Var.c2 = null;
                            l7Var.b2 = 0L;
                        }
                        l7Var.d2 = l7Var.b2 != j3;
                        f0Var = l7Var.T1;
                        if (f0Var == null) {
                            f0Var.O(true);
                            break;
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                l7Var.d2 = l7Var.b2 != j3;
                f0Var = l7Var.T1;
                if (f0Var == null) {
                }
                break;
            case 14:
                l7 l7Var2 = (l7) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) l7Var2.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.j3 j3Var = l7Var2.U1.d;
                boolean z11 = (TextUtils.isEmpty(j3Var.getText()) || TextUtils.equals(j3Var.getText(), "https://") || TextUtils.isEmpty(j3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                n10.o(textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.7f).scaleY(z11 ? 1.0f : 0.7f), lr.h, 300L);
                break;
            case 15:
                q8 q8Var = (q8) this.b;
                HashMap h02 = ((tr) this.c).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.g0.g3(new r1(16, q8Var, h02));
                    break;
                }
                break;
            case 16:
                q8 q8Var2 = (q8) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (q8Var2.K1 == null) {
                    q8Var2.K1 = new HashMap();
                }
                q8Var2.K1.putAll(hashMap);
                break;
            case 17:
                d dVar = (d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 18:
                bb bbVar = (bb) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (bbVar.k && !bbVar.i) {
                    bbVar.d.add(new ab(bbVar, bitmap2));
                    bbVar.k = false;
                    bbVar.n.invalidate();
                    break;
                }
                break;
            case 19:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 20:
                ii.m mVar2 = (ii.m) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                ii.m[] mVarArr = ii.n.b;
                int i13 = mVar2.a;
                if (mVarArr[i13] == mVar2) {
                    if (tLObject5 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                        mp.u1(i13).f4(starsStatus.users, false);
                        mp.u1(i13).Z3(starsStatus.chats, false);
                        ArrayList<TL_stars.StarsTransaction> arrayList4 = starsStatus.history;
                        int size2 = arrayList4.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                TL_stars.StarsTransaction starsTransaction2 = arrayList4.get(i14);
                                i14++;
                                starsTransaction = starsTransaction2;
                                String str = mVar2.g;
                                if (str != null) {
                                    if (str.equals(starsTransaction.id)) {
                                    }
                                } else if (starsTransaction != null && starsTransaction.id != null && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment) && (starsAmount = starsTransaction.amount) != null && starsAmount.amount < 0 && starsTransaction.date >= mVar2.d - 120 && !ii.n.e(i13).contains(starsTransaction.id)) {
                                }
                            } else {
                                starsTransaction = null;
                            }
                        }
                        if (starsTransaction != null) {
                            if (mVar2.g == null) {
                                String str2 = starsTransaction.id;
                                mVar2.g = str2;
                                HashSet e10 = ii.n.e(i13);
                                if (e10.add(str2)) {
                                    if (e10.size() > 100) {
                                        Iterator it = e10.iterator();
                                        while (e10.size() > 100 && it.hasNext()) {
                                            if (!((String) it.next()).equals(str2)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                    mp.u1(i13).h7.edit().putStringSet("gram_earnings_wallet_withdraws", new HashSet(e10)).apply();
                                }
                            }
                            di.x8 y10 = di.x8.y(i13, true);
                            int[] iArr2 = {0, 2};
                            for (int i15 = 0; i15 < 2; i15++) {
                                ArrayList arrayList5 = y10.q[iArr2[i15]];
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= arrayList5.size()) {
                                        arrayList5.add(0, starsTransaction);
                                    } else if (starsTransaction.id.equals(((TL_stars.StarsTransaction) arrayList5.get(i16)).id)) {
                                        arrayList5.set(i16, starsTransaction);
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            ks.f(i13).k(ks.B3, new Object[0]);
                            if (!starsTransaction.pending) {
                                mVar2.h = true;
                                di.x8.y(i13, true).N();
                                di.e0.g(i13).j(j10.i(i13).e(), true);
                                org.telegram.ui.Wallet.u0.D(i13).K();
                                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) mVar2.f.get();
                                if (h2Var != null && h2Var.getParentActivity() != null && LaunchActivity.Q() == h2Var) {
                                    long j10 = mVar2.c;
                                    lc b02 = lc.b0(h2Var);
                                    String a02 = gd.a0(null, null, 2131749325, org.telegram.ui.Wallet.u0.x(j10, false));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131749324, null));
                                    ii.n.f(spannableStringBuilder, "⚙", R.drawable.msg_settings, -1);
                                    ii.n.f(spannableStringBuilder, "💎", R.drawable.mini_gram_16, org.telegram.ui.ActionBar.n6.v6);
                                    gc L = b02.L(R.raw.contact_check, a02, spannableStringBuilder, gd.M0(2131747624, null), new ii.l(z10 ? 1 : 0, h2Var));
                                    L.j = 5000;
                                    L.j();
                                    break;
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new ii.g(mVar2, 1), 4000L);
                    break;
                }
                break;
            case 21:
                jg.h0 h0Var = (jg.h0) this.b;
                View view2 = (View) this.c;
                h0Var.n0 = false;
                h0Var.p0 = null;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 22:
                jg.h0 h0Var2 = (jg.h0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                int i17 = h0Var2.t0;
                ArrayList arrayList6 = h0Var2.L;
                h0Var2.T = 0;
                if (tLObject6 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList6.isEmpty()) {
                        arrayList6.clear();
                        h0Var2.f();
                        break;
                    }
                } else if (tLObject6 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject6;
                    mp.u1(i17).f4(tL_contacts_sponsoredPeers.users, true);
                    mp.u1(i17).Z3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList6.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.f();
                    break;
                }
                break;
            case 23:
                jg.h0 h0Var3 = (jg.h0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    tr.a0(h0Var3.t0).b.executeFast(sb2.toString()).stepThis().dispose();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 24:
                jg.s1 s1Var2 = (jg.s1) this.b;
                String str3 = (String) this.c;
                s1Var2.J = str3;
                if (s1Var2.r) {
                    s1Var2.f.g(str3, true, false, s1Var2.s, s1Var2.w, s1Var2.y, s1Var2.x, -1, 1);
                }
                int i18 = j10.t0;
                ArrayList arrayList7 = new ArrayList(org.telegram.messenger.i5.r(i18).f0);
                s1Var2.E = true;
                int i19 = s1Var2.G;
                s1Var2.G = i19 + 1;
                s1Var2.F = i19;
                s1Var2.f();
                Utilities.g.c(new jg.o1(s1Var2, str3, i19, arrayList7, i18, 0));
                break;
            case 25:
                jg.z1 z1Var = (jg.z1) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                int i20 = z1Var.m;
                try {
                    tr.a0(i20).b.beginTransaction();
                    SQLitePreparedStatement executeFast = tr.a0(i20).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    for (int i21 = 0; i21 < arrayList8.size() && i21 != 100; i21++) {
                        jg.x1 x1Var2 = (jg.x1) arrayList8.get(i21);
                        executeFast.requery();
                        executeFast.bindString(1, x1Var2.a);
                        executeFast.bindInteger(2, x1Var2.b);
                        executeFast.step();
                    }
                    executeFast.dispose();
                    if (arrayList8.size() > 100) {
                        SQLitePreparedStatement executeFast2 = tr.a0(i20).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (int i22 = 100; i22 < arrayList8.size(); i22++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((jg.x1) arrayList8.get(i22)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    tr.a0(i20).b.commitTransaction();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 26:
                ji.m mVar3 = (ji.m) this.b;
                ji.e eVar = (ji.e) this.c;
                if (mVar3.c == 0 && mVar3.K == eVar && eVar.R) {
                    eVar.R = false;
                    eVar.f0 = -1;
                    eVar.invalidate();
                    break;
                }
                break;
            case 27:
                ji.m mVar4 = (ji.m) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (mVar4.X == editTextBoldCursor) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            case 28:
                ji.m mVar5 = (ji.m) this.b;
                String str4 = (String) this.c;
                mVar5.i0 = false;
                if (mVar5.c == 0) {
                    ji.e eVar2 = mVar5.K;
                    if (eVar2 != null) {
                        eVar2.setBusy(false);
                        break;
                    }
                } else if (str4 != null && !str4.trim().isEmpty()) {
                    mVar5.e0 = str4.trim();
                    mVar5.f0 = mVar5.c().size();
                    ji.e eVar3 = mVar5.K;
                    if (eVar3 != null) {
                        eVar3.setRevertShown(true);
                        mVar5.K.setRebuildNext(true);
                    }
                    mVar5.p();
                    ji.e eVar4 = mVar5.K;
                    if (eVar4 != null) {
                        eVar4.setRebuildNext(false);
                        mVar5.K.setBusy(false);
                        break;
                    }
                } else {
                    Log.d("VoiceLive", "field: style failed");
                    ji.e eVar5 = mVar5.K;
                    if (eVar5 != null) {
                        eVar5.setBusy(false);
                        break;
                    }
                }
                break;
            default:
                kg.f fVar = (kg.f) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                fVar.e = false;
                TL_account.connectedBots connectedbots = tLObject7 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject7 : null;
                fVar.c = connectedbots;
                if (connectedbots != null) {
                    mp.u1(fVar.a).f4(fVar.c.users, false);
                }
                fVar.b = System.currentTimeMillis();
                fVar.f = true;
                fVar.d();
                break;
        }
    }
}
