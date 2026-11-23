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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
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
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

    /* JADX WARN: Removed duplicated region for block: B:232:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x046c  */
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
                e eVar = (e) this.b;
                org.telegram.ui.Cells.f fVar = (org.telegram.ui.Cells.f) this.c;
                int i7 = eVar.J - 1;
                eVar.J = i7;
                eVar.c(i7, true);
                if (eVar.J > 0) {
                    org.telegram.messenger.g0.h3(eVar.K, 1000L);
                    break;
                } else {
                    eVar.setClickable(true);
                    fVar.run();
                    break;
                }
            case 1:
                ((y10) this.b).a((ArrayList) this.c);
                break;
            case 2:
                r1 r1Var = (r1) this.b;
                TLObject tLObject = (TLObject) this.c;
                t1 t1Var = r1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    i2 i2Var = t1Var.r;
                    int i10 = i2.C1;
                    np.u1(i2Var.a).f4(tL_contacts_resolvedPeer.users, false);
                    np.u1(i2Var.a).Z3(tL_contacts_resolvedPeer.chats, false);
                    ur.a0(i2Var.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                r1Var.n = true;
                r1Var.G();
                break;
            case 3:
                ((n2) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 4:
                k5 k5Var = (k5) this.b;
                View view = (View) this.c;
                k5Var.getClass();
                if (view instanceof tg.j) {
                    tg.j jVar = (tg.j) view;
                    jVar.m();
                    k5Var.A0(jVar, true);
                    break;
                }
                break;
            case 5:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(org.telegram.messenger.t0.b, hd.E0().y).getFromLocationName(messageMedia.title, 1);
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
            case 6:
                ((y10) this.b).a((Bitmap) this.c);
                break;
            case 7:
                v5.a((v5) this.b, (c7) this.c);
                break;
            case 8:
                h6.m mVar = (h6.m) this.b;
                c7 c7Var = (c7) this.c;
                v5 v5Var = (v5) mVar.d;
                Bitmap bitmap = v5Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (c7Var.M0 == v5Var.a) {
                        c7Var.M0 = null;
                    }
                    v5Var.a = null;
                    v5Var.invalidate();
                    break;
                }
                break;
            case 9:
                z5 z5Var = (z5) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = z5Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new u8.n(new com.google.android.gms.internal.vision.u2(context, x1Var)));
                z5Var.a(z5Var.f);
                break;
            case 10:
                ((z5) this.b).c.a((x5) this.c);
                break;
            case 11:
                r rVar = (r) this.b;
                tg.t1 t1Var2 = (tg.t1) this.c;
                h6 h6Var = rVar.a;
                if (t1Var2.getWidth() <= 0) {
                    h6Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new l(rVar, 14)).start();
                    break;
                } else {
                    float width = t1Var2.getWidth() / h6Var.getWidth();
                    ValueAnimator valueAnimator = rVar.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    rVar.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar.x.addUpdateListener(new g6(rVar, h6Var.getScaleX(), width, ((t1Var2.getWidth() / 2.0f) + t1Var2.getX()) - ((h6Var.getWidth() / 2.0f) + h6Var.getX()), ((t1Var2.getHeight() / 2.0f) + t1Var2.getY()) - ((h6Var.getHeight() / 2.0f) + h6Var.getY()), 0));
                    rVar.x.addListener(new ah.l(6, rVar, t1Var2));
                    rVar.x.setDuration(320L);
                    rVar.x.setInterpolator(nr.h);
                    rVar.w = t1Var2;
                    rVar.x.start();
                    break;
                }
            case 12:
                u6 u6Var = (u6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList = u6Var.Y1;
                u6Var.r2 = false;
                u6Var.q2 = false;
                if (tLObject2 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    np.u1(u6Var.a).f4(messages_messages.users, false);
                    np.u1(u6Var.a).Z3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Message message = arrayList2.get(i11);
                        i11++;
                        arrayList.add(new gj(u6Var.a, message, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                        z10 = true;
                    }
                    u6Var.p2 = z10;
                    u6Var.o2 = messages_messages.next_rate;
                } else {
                    u6Var.p2 = false;
                    u6Var.o2 = 0;
                }
                u6Var.l2.O(true);
                break;
            case 13:
                u6 u6Var2 = (u6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                u6Var2.G2 = false;
                u6Var2.X1.addAll(arrayList3);
                u6Var2.l2.O(true);
                break;
            case 14:
                c7 c7Var2 = (c7) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                c7Var2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    c7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
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
                            c7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 15:
                k7 k7Var = (k7) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    np.u1(k7Var.a).f4(webpagepreview.users, false);
                    np.u1(k7Var.a).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            k7Var.c2 = webPage;
                            if (k7.h1(webPage)) {
                                TLRPC.WebPage webPage2 = k7Var.c2;
                                k7Var.b2 = webPage2 == null ? 0L : webPage2.id;
                                k7Var.c2 = null;
                                j3 = 0;
                            } else {
                                j3 = 0;
                                k7Var.b2 = 0L;
                            }
                        } else {
                            j3 = 0;
                            k7Var.c2 = null;
                            k7Var.b2 = 0L;
                        }
                        k7Var.d2 = k7Var.b2 != j3;
                        f0Var = k7Var.T1;
                        if (f0Var == null) {
                            f0Var.O(true);
                            break;
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                k7Var.d2 = k7Var.b2 != j3;
                f0Var = k7Var.T1;
                if (f0Var == null) {
                }
                break;
            case 16:
                k7 k7Var2 = (k7) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) k7Var2.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.j3 j3Var = k7Var2.U1.d;
                r10 = ((TextUtils.isEmpty(j3Var.getText()) || TextUtils.equals(j3Var.getText(), "https://") || TextUtils.isEmpty(j3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                o10.o(textView.animate().alpha(r10 != 0 ? 1.0f : 0.0f).scaleX(r10 != 0 ? 1.0f : 0.7f).scaleY(r10 == 0 ? 0.7f : 1.0f), nr.h, 300L);
                break;
            case 17:
                p8 p8Var = (p8) this.b;
                HashMap h02 = ((ur) this.c).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.g0.g3(new c(18, p8Var, h02));
                    break;
                }
                break;
            case 18:
                p8 p8Var2 = (p8) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (p8Var2.K1 == null) {
                    p8Var2.K1 = new HashMap();
                }
                p8Var2.K1.putAll(hashMap);
                break;
            case 19:
                e eVar2 = (e) this.b;
                Runnable runnable = (Runnable) this.c;
                if (eVar2 != null) {
                    eVar2.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 20:
                ab abVar = (ab) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (abVar.k && !abVar.i) {
                    abVar.d.add(new za(abVar, bitmap2));
                    abVar.k = false;
                    abVar.n.invalidate();
                    break;
                }
                break;
            case 21:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 22:
                ii.m mVar2 = (ii.m) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                ii.m[] mVarArr = ii.n.b;
                int i14 = mVar2.a;
                if (mVarArr[i14] == mVar2) {
                    if (tLObject5 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                        np.u1(i14).f4(starsStatus.users, false);
                        np.u1(i14).Z3(starsStatus.chats, false);
                        ArrayList<TL_stars.StarsTransaction> arrayList4 = starsStatus.history;
                        int size2 = arrayList4.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TL_stars.StarsTransaction starsTransaction2 = arrayList4.get(i15);
                                i15++;
                                starsTransaction = starsTransaction2;
                                String str = mVar2.g;
                                if (str != null) {
                                    if (str.equals(starsTransaction.id)) {
                                    }
                                } else if (starsTransaction != null && starsTransaction.id != null && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment) && (starsAmount = starsTransaction.amount) != null && starsAmount.amount < 0 && starsTransaction.date >= mVar2.d - 120 && !ii.n.e(i14).contains(starsTransaction.id)) {
                                }
                            } else {
                                starsTransaction = null;
                            }
                        }
                        if (starsTransaction != null) {
                            if (mVar2.g == null) {
                                String str2 = starsTransaction.id;
                                mVar2.g = str2;
                                HashSet e10 = ii.n.e(i14);
                                if (e10.add(str2)) {
                                    if (e10.size() > 100) {
                                        Iterator it = e10.iterator();
                                        while (e10.size() > 100 && it.hasNext()) {
                                            if (!((String) it.next()).equals(str2)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                    np.u1(i14).h7.edit().putStringSet("gram_earnings_wallet_withdraws", new HashSet(e10)).apply();
                                }
                            }
                            di.y8 y10 = di.y8.y(i14, true);
                            int[] iArr2 = {0, 2};
                            for (int i16 = 0; i16 < 2; i16++) {
                                ArrayList arrayList5 = y10.q[iArr2[i16]];
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList5.size()) {
                                        arrayList5.add(0, starsTransaction);
                                    } else if (starsTransaction.id.equals(((TL_stars.StarsTransaction) arrayList5.get(i17)).id)) {
                                        arrayList5.set(i17, starsTransaction);
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            ls.f(i14).k(ls.B3, new Object[0]);
                            if (!starsTransaction.pending) {
                                mVar2.h = true;
                                di.y8.y(i14, true).N();
                                di.e0.g(i14).j(k10.i(i14).e(), true);
                                org.telegram.ui.Wallet.u0.D(i14).K();
                                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) mVar2.f.get();
                                if (g2Var != null && g2Var.getParentActivity() != null && LaunchActivity.Q() == g2Var) {
                                    long j10 = mVar2.c;
                                    lc b02 = lc.b0(g2Var);
                                    String a02 = hd.a0(null, null, 2131749324, org.telegram.ui.Wallet.u0.x(j10, false));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131749323, null));
                                    ii.n.f(spannableStringBuilder, "⚙", R.drawable.msg_settings, -1);
                                    ii.n.f(spannableStringBuilder, "💎", R.drawable.mini_gram_16, org.telegram.ui.ActionBar.m6.v6);
                                    gc L = b02.L(R.raw.contact_check, a02, spannableStringBuilder, hd.N0(2131747623, null), new ii.l(z10 ? 1 : 0, g2Var));
                                    L.j = 5000;
                                    L.j();
                                    break;
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new ii.g(mVar2, r10), 4000L);
                    break;
                }
                break;
            case 23:
                jg.h0 h0Var = (jg.h0) this.b;
                View view2 = (View) this.c;
                h0Var.n0 = false;
                h0Var.p0 = null;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 24:
                jg.h0 h0Var2 = (jg.h0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                int i18 = h0Var2.t0;
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
                    np.u1(i18).f4(tL_contacts_sponsoredPeers.users, true);
                    np.u1(i18).Z3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList6.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.f();
                    break;
                }
                break;
            case 25:
                jg.h0 h0Var3 = (jg.h0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    ur.a0(h0Var3.t0).b.executeFast(sb2.toString()).stepThis().dispose();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 26:
                jg.s1 s1Var = (jg.s1) this.b;
                String str3 = (String) this.c;
                s1Var.J = str3;
                if (s1Var.r) {
                    s1Var.f.g(str3, true, false, s1Var.s, s1Var.w, s1Var.y, s1Var.x, -1, 1);
                }
                int i19 = k10.t0;
                ArrayList arrayList7 = new ArrayList(org.telegram.messenger.i5.r(i19).f0);
                s1Var.E = true;
                int i20 = s1Var.G;
                s1Var.G = i20 + 1;
                s1Var.F = i20;
                s1Var.f();
                Utilities.g.c(new jg.o1(s1Var, str3, i20, arrayList7, i19, 0));
                break;
            case 27:
                jg.z1 z1Var = (jg.z1) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                int i21 = z1Var.m;
                try {
                    ur.a0(i21).b.beginTransaction();
                    SQLitePreparedStatement executeFast = ur.a0(i21).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    for (int i22 = 0; i22 < arrayList8.size() && i22 != 100; i22++) {
                        jg.x1 x1Var2 = (jg.x1) arrayList8.get(i22);
                        executeFast.requery();
                        executeFast.bindString(1, x1Var2.a);
                        executeFast.bindInteger(2, x1Var2.b);
                        executeFast.step();
                    }
                    executeFast.dispose();
                    if (arrayList8.size() > 100) {
                        SQLitePreparedStatement executeFast2 = ur.a0(i21).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (int i23 = 100; i23 < arrayList8.size(); i23++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((jg.x1) arrayList8.get(i23)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    ur.a0(i21).b.commitTransaction();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 28:
                ji.o oVar = (ji.o) this.b;
                ji.e eVar3 = (ji.e) this.c;
                if (oVar.c == 0 && oVar.K == eVar3 && eVar3.R) {
                    eVar3.R = false;
                    eVar3.f0 = -1;
                    eVar3.invalidate();
                    break;
                }
                break;
            default:
                ji.o oVar2 = (ji.o) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (oVar2.X == editTextBoldCursor) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
