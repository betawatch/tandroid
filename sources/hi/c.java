package hi;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0435  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Runnable runnable;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        di.f0 f0Var;
        TL_stars.StarsTransaction starsTransaction;
        TL_stars.StarsAmount starsAmount;
        boolean z10 = false;
        r9 = null;
        r9 = null;
        Object[] objArr = null;
        z10 = false;
        int i7 = 1;
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                org.telegram.ui.Cells.f fVar = (org.telegram.ui.Cells.f) this.c;
                int i10 = eVar.J - 1;
                eVar.J = i10;
                eVar.c(i10, true);
                if (eVar.J > 0) {
                    org.telegram.messenger.g0.h3(eVar.K, 1000L);
                    break;
                } else {
                    eVar.setClickable(true);
                    fVar.run();
                    break;
                }
            case 1:
                a0 a0Var = (a0) this.b;
                tg.d dVar = (tg.d) this.c;
                a0Var.b.i();
                if (dVar.getParent() != null) {
                    a0Var.a.V0(dVar);
                    break;
                }
                break;
            case 2:
                ((w10) this.b).a((ArrayList) this.c);
                break;
            case 3:
                z1 z1Var = (z1) this.b;
                TLObject tLObject = (TLObject) this.c;
                b2 b2Var = z1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    r2 r2Var = b2Var.r;
                    int i11 = r2.D1;
                    mp.u1(r2Var.a).f4(tL_contacts_resolvedPeer.users, false);
                    mp.u1(r2Var.a).Z3(tL_contacts_resolvedPeer.chats, false);
                    tr.a0(r2Var.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                z1Var.n = true;
                z1Var.G();
                break;
            case 4:
                ((w2) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 5:
                v5 v5Var = (v5) this.b;
                View view = (View) this.c;
                v5Var.getClass();
                if (view instanceof tg.n) {
                    tg.n nVar = (tg.n) view;
                    nVar.m();
                    v5Var.D0(nVar, true);
                    break;
                }
                break;
            case 6:
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
            case 7:
                ((w10) this.b).a((Bitmap) this.c);
                break;
            case 8:
                f6.a((f6) this.b, (x7) this.c);
                break;
            case 9:
                h6.m mVar = (h6.m) this.b;
                x7 x7Var = (x7) this.c;
                f6 f6Var = (f6) mVar.d;
                Bitmap bitmap = f6Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (x7Var.M0 == f6Var.a) {
                        x7Var.M0 = null;
                    }
                    f6Var.a = null;
                    f6Var.invalidate();
                    break;
                }
                break;
            case 10:
                j6 j6Var = (j6) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = j6Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new u8.n(new com.google.android.gms.internal.vision.u2(context, x1Var)));
                j6Var.a(j6Var.f);
                break;
            case 11:
                ((j6) this.b).c.a((h6) this.c);
                break;
            case 12:
                q qVar = (q) this.b;
                tg.w1 w1Var = (tg.w1) this.c;
                r6 r6Var = qVar.a;
                if (w1Var.getWidth() <= 0) {
                    r6Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new w(qVar, 15)).start();
                    break;
                } else {
                    float width = w1Var.getWidth() / r6Var.getWidth();
                    ValueAnimator valueAnimator = qVar.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qVar.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar.x.addUpdateListener(new q6(qVar, r6Var.getScaleX(), width, ((w1Var.getWidth() / 2.0f) + w1Var.getX()) - ((r6Var.getWidth() / 2.0f) + r6Var.getX()), ((w1Var.getHeight() / 2.0f) + w1Var.getY()) - ((r6Var.getHeight() / 2.0f) + r6Var.getY()), 0));
                    qVar.x.addListener(new ah.l(6, qVar, w1Var));
                    qVar.x.setDuration(320L);
                    qVar.x.setInterpolator(kr.h);
                    qVar.w = w1Var;
                    qVar.x.start();
                    break;
                }
            case 13:
                e7 e7Var = (e7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList = e7Var.Y1;
                e7Var.r2 = false;
                e7Var.q2 = false;
                if (tLObject2 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    mp.u1(e7Var.a).f4(messages_messages.users, false);
                    mp.u1(e7Var.a).Z3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Message message = arrayList2.get(i12);
                        i12++;
                        arrayList.add(new fj(e7Var.a, message, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                        z10 = true;
                    }
                    e7Var.p2 = z10;
                    e7Var.o2 = messages_messages.next_rate;
                } else {
                    e7Var.p2 = false;
                    e7Var.o2 = 0;
                }
                e7Var.l2.O(true);
                break;
            case 14:
                e7 e7Var2 = (e7) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                e7Var2.G2 = false;
                e7Var2.X1.addAll(arrayList3);
                e7Var2.l2.O(true);
                break;
            case 15:
                r7 r7Var = (r7) this.b;
                android.support.v4.media.session.a0 a0Var2 = (android.support.v4.media.session.a0) this.c;
                if (a0Var2 != null) {
                    r7.z = r7Var.b;
                    r7.A = a0Var2;
                }
                if (!r7Var.h) {
                    r7Var.f = a0Var2;
                    if (a0Var2 != null && (runnable = r7Var.e) != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 16:
                x7 x7Var2 = (x7) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                x7Var2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    x7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
                    for (int i13 = 0; i13 < vector.objects.size(); i13++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i13);
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
                            x7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 17:
                f8 f8Var = (f8) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    mp.u1(f8Var.a).f4(webpagepreview.users, false);
                    mp.u1(f8Var.a).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            f8Var.c2 = webPage;
                            if (f8.h1(webPage)) {
                                TLRPC.WebPage webPage2 = f8Var.c2;
                                f8Var.b2 = webPage2 == null ? 0L : webPage2.id;
                                f8Var.c2 = null;
                            } else {
                                f8Var.b2 = 0L;
                            }
                        } else {
                            f8Var.c2 = null;
                            f8Var.b2 = 0L;
                        }
                        f8Var.d2 = f8Var.b2 != 0;
                        f0Var = f8Var.T1;
                        if (f0Var == null) {
                            f0Var.O(true);
                            break;
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                f8Var.d2 = f8Var.b2 != 0;
                f0Var = f8Var.T1;
                if (f0Var == null) {
                }
                break;
            case 18:
                f8 f8Var2 = (f8) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) f8Var2.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.j3 j3Var = f8Var2.U1.d;
                if ((TextUtils.isEmpty(j3Var.getText()) || TextUtils.equals(j3Var.getText(), "https://") || TextUtils.isEmpty(j3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    objArr = 1;
                }
                m10.o(textView.animate().alpha(objArr != null ? 1.0f : 0.0f).scaleX(objArr != null ? 1.0f : 0.7f).scaleY(objArr == null ? 0.7f : 1.0f), kr.h, 300L);
                break;
            case 19:
                k9 k9Var = (k9) this.b;
                HashMap h02 = ((tr) this.c).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.g0.g3(new c(20, k9Var, h02));
                    break;
                }
                break;
            case 20:
                k9 k9Var2 = (k9) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (k9Var2.K1 == null) {
                    k9Var2.K1 = new HashMap();
                }
                k9Var2.K1.putAll(hashMap);
                break;
            case 21:
                e eVar2 = (e) this.b;
                Runnable runnable2 = (Runnable) this.c;
                if (eVar2 != null) {
                    eVar2.setLoading(false);
                }
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 22:
                vb vbVar = (vb) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (vbVar.k && !vbVar.i) {
                    vbVar.d.add(new ub(vbVar, bitmap2));
                    vbVar.k = false;
                    vbVar.n.invalidate();
                    break;
                }
                break;
            case 23:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i14 = iArr[0];
                if (i14 != 0) {
                    connectionsManager.cancelRequest(i14, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 24:
                ii.m mVar2 = (ii.m) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                ii.m[] mVarArr = ii.n.b;
                int i15 = mVar2.a;
                if (mVarArr[i15] == mVar2) {
                    if (tLObject5 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                        mp.u1(i15).f4(starsStatus.users, false);
                        mp.u1(i15).Z3(starsStatus.chats, false);
                        ArrayList<TL_stars.StarsTransaction> arrayList4 = starsStatus.history;
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TL_stars.StarsTransaction starsTransaction2 = arrayList4.get(i16);
                                i16++;
                                starsTransaction = starsTransaction2;
                                String str = mVar2.g;
                                if (str != null) {
                                    if (str.equals(starsTransaction.id)) {
                                    }
                                } else if (starsTransaction != null && starsTransaction.id != null && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment) && (starsAmount = starsTransaction.amount) != null && starsAmount.amount < 0 && starsTransaction.date >= mVar2.d - 120 && !ii.n.e(i15).contains(starsTransaction.id)) {
                                }
                            } else {
                                starsTransaction = null;
                            }
                        }
                        if (starsTransaction != null) {
                            if (mVar2.g == null) {
                                String str2 = starsTransaction.id;
                                mVar2.g = str2;
                                HashSet e10 = ii.n.e(i15);
                                if (e10.add(str2)) {
                                    if (e10.size() > 100) {
                                        Iterator it = e10.iterator();
                                        while (e10.size() > 100 && it.hasNext()) {
                                            if (!((String) it.next()).equals(str2)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                    mp.u1(i15).h7.edit().putStringSet("gram_earnings_wallet_withdraws", new HashSet(e10)).apply();
                                }
                            }
                            di.y8 y10 = di.y8.y(i15, true);
                            int[] iArr2 = {0, 2};
                            for (int i17 = 0; i17 < 2; i17++) {
                                ArrayList arrayList5 = y10.q[iArr2[i17]];
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList5.size()) {
                                        arrayList5.add(0, starsTransaction);
                                    } else if (starsTransaction.id.equals(((TL_stars.StarsTransaction) arrayList5.get(i18)).id)) {
                                        arrayList5.set(i18, starsTransaction);
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                            ks.f(i15).k(ks.B3, new Object[0]);
                            if (!starsTransaction.pending) {
                                mVar2.h = true;
                                di.y8.y(i15, true).N();
                                di.e0.g(i15).j(i10.i(i15).e(), true);
                                org.telegram.ui.Wallet.v0.D(i15).K();
                                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) mVar2.f.get();
                                if (g2Var != null && g2Var.getParentActivity() != null && LaunchActivity.Q() == g2Var) {
                                    long j3 = mVar2.c;
                                    org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(g2Var);
                                    String a02 = gd.a0(null, null, 2131749324, org.telegram.ui.Wallet.v0.x(j3, false));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131749323, null));
                                    ii.n.f(spannableStringBuilder, "⚙", R.drawable.msg_settings, -1);
                                    ii.n.f(spannableStringBuilder, "💎", R.drawable.mini_gram_16, org.telegram.ui.ActionBar.n6.v6);
                                    org.telegram.ui.Components.fc L = b02.L(R.raw.contact_check, a02, spannableStringBuilder, gd.N0(2131747623, null), new ii.l(z10 ? 1 : 0, g2Var));
                                    L.j = 5000;
                                    L.j();
                                    break;
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new ii.g(mVar2, i7), 4000L);
                    break;
                }
                break;
            case 25:
                jg.h0 h0Var = (jg.h0) this.b;
                View view2 = (View) this.c;
                h0Var.n0 = false;
                h0Var.p0 = null;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 26:
                jg.h0 h0Var2 = (jg.h0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                int i19 = h0Var2.t0;
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
                    mp.u1(i19).f4(tL_contacts_sponsoredPeers.users, true);
                    mp.u1(i19).Z3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList6.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.f();
                    break;
                }
                break;
            case 27:
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
            case 28:
                jg.s1 s1Var = (jg.s1) this.b;
                String str3 = (String) this.c;
                s1Var.J = str3;
                if (s1Var.r) {
                    s1Var.f.g(str3, true, false, s1Var.s, s1Var.w, s1Var.y, s1Var.x, -1, 1);
                }
                int i20 = i10.t0;
                ArrayList arrayList7 = new ArrayList(org.telegram.messenger.i5.r(i20).f0);
                s1Var.E = true;
                int i21 = s1Var.G;
                s1Var.G = i21 + 1;
                s1Var.F = i21;
                s1Var.f();
                Utilities.g.c(new jg.o1(s1Var, str3, i21, arrayList7, i20, 0));
                break;
            default:
                jg.z1 z1Var2 = (jg.z1) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                int i22 = z1Var2.m;
                try {
                    tr.a0(i22).b.beginTransaction();
                    SQLitePreparedStatement executeFast = tr.a0(i22).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    for (int i23 = 0; i23 < arrayList8.size() && i23 != 100; i23++) {
                        jg.x1 x1Var2 = (jg.x1) arrayList8.get(i23);
                        executeFast.requery();
                        executeFast.bindString(1, x1Var2.a);
                        executeFast.bindInteger(2, x1Var2.b);
                        executeFast.step();
                    }
                    executeFast.dispose();
                    if (arrayList8.size() > 100) {
                        SQLitePreparedStatement executeFast2 = tr.a0(i22).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (int i24 = 100; i24 < arrayList8.size(); i24++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((jg.x1) arrayList8.get(i24)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    tr.a0(i22).b.commitTransaction();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}
