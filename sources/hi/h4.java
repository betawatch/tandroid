package hi;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0387  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        di.f0 f0Var;
        int i7;
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.b;
                View view = (View) this.c;
                m5Var.getClass();
                if (view instanceof tg.j) {
                    tg.j jVar = (tg.j) view;
                    jVar.m();
                    m5Var.A0(jVar, true);
                    break;
                }
                break;
            case 1:
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
            case 2:
                ((z10) this.b).a((Bitmap) this.c);
                break;
            case 3:
                x5.a((x5) this.b, (d7) this.c);
                break;
            case 4:
                h6.m mVar = (h6.m) this.b;
                d7 d7Var = (d7) this.c;
                x5 x5Var = (x5) mVar.d;
                Bitmap bitmap = x5Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (d7Var.M0 == x5Var.a) {
                        d7Var.M0 = null;
                    }
                    x5Var.a = null;
                    x5Var.invalidate();
                    break;
                }
                break;
            case 5:
                b6 b6Var = (b6) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = b6Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new u8.n(new com.google.android.gms.internal.vision.u2(context, x1Var)));
                b6Var.a(b6Var.f);
                break;
            case 6:
                ((b6) this.b).c.a((z5) this.c);
                break;
            case 7:
                p pVar = (p) this.b;
                tg.r1 r1Var = (tg.r1) this.c;
                j6 j6Var = pVar.a;
                if (r1Var.getWidth() <= 0) {
                    j6Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new e1(pVar, 10)).start();
                    break;
                } else {
                    float width = r1Var.getWidth() / j6Var.getWidth();
                    ValueAnimator valueAnimator = pVar.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pVar.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pVar.x.addUpdateListener(new i6(pVar, j6Var.getScaleX(), width, ((r1Var.getWidth() / 2.0f) + r1Var.getX()) - ((j6Var.getWidth() / 2.0f) + j6Var.getX()), ((r1Var.getHeight() / 2.0f) + r1Var.getY()) - ((j6Var.getHeight() / 2.0f) + j6Var.getY()), 0));
                    pVar.x.addListener(new ah.l(6, pVar, r1Var));
                    pVar.x.setDuration(320L);
                    pVar.x.setInterpolator(er.h);
                    pVar.w = r1Var;
                    pVar.x.start();
                    break;
                }
            case 8:
                v6 v6Var = (v6) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = v6Var.Y1;
                v6Var.r2 = false;
                v6Var.q2 = false;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    np.s1(v6Var.a).Y3(messages_messages.users, false);
                    np.s1(v6Var.a).S3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Message message = arrayList2.get(i11);
                        i11++;
                        arrayList.add(new gj(v6Var.a, message, false, true));
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
            case 9:
                v6 v6Var2 = (v6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                v6Var2.G2 = false;
                v6Var2.X1.addAll(arrayList3);
                v6Var2.l2.O(true);
                break;
            case 10:
                d7 d7Var2 = (d7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                d7Var2.e1 = 0;
                if (tLObject2 instanceof Vector) {
                    d7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject2;
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
                            d7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 11:
                l7 l7Var = (l7) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    np.s1(l7Var.a).Y3(webpagepreview.users, false);
                    np.s1(l7Var.a).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            l7Var.c2 = webPage;
                            if (l7.g1(webPage)) {
                                TLRPC.WebPage webPage2 = l7Var.c2;
                                l7Var.b2 = webPage2 == null ? 0L : webPage2.id;
                                l7Var.c2 = null;
                            } else {
                                l7Var.b2 = 0L;
                            }
                        } else {
                            l7Var.c2 = null;
                            l7Var.b2 = 0L;
                        }
                        l7Var.d2 = l7Var.b2 != 0;
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
                l7Var.d2 = l7Var.b2 != 0;
                f0Var = l7Var.T1;
                if (f0Var == null) {
                }
                break;
            case 12:
                l7 l7Var2 = (l7) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) l7Var2.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.i3 i3Var = l7Var2.U1.d;
                boolean z11 = (TextUtils.isEmpty(i3Var.getText()) || TextUtils.equals(i3Var.getText(), "https://") || TextUtils.isEmpty(i3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                i20.n(textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.7f).scaleY(z11 ? 1.0f : 0.7f), er.h, 300L);
                break;
            case 13:
                q8 q8Var = (q8) this.b;
                HashMap h02 = ((vr) this.c).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.g0.h3(new h4(14, q8Var, h02));
                    break;
                }
                break;
            case 14:
                q8 q8Var2 = (q8) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (q8Var2.K1 == null) {
                    q8Var2.K1 = new HashMap();
                }
                q8Var2.K1.putAll(hashMap);
                break;
            case 15:
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
            case 16:
                ab abVar = (ab) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (abVar.k && !abVar.i) {
                    abVar.d.add(new za(abVar, bitmap2));
                    abVar.k = false;
                    abVar.n.invalidate();
                    break;
                }
                break;
            case 17:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 18:
                jg.h0 h0Var = (jg.h0) this.b;
                View view2 = (View) this.c;
                h0Var.n0 = false;
                h0Var.p0 = null;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 19:
                jg.h0 h0Var2 = (jg.h0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                int i14 = h0Var2.t0;
                ArrayList arrayList4 = h0Var2.L;
                h0Var2.T = 0;
                if (tLObject4 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList4.isEmpty()) {
                        arrayList4.clear();
                        h0Var2.f();
                        break;
                    }
                } else if (tLObject4 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject4;
                    np.s1(i14).Y3(tL_contacts_sponsoredPeers.users, true);
                    np.s1(i14).S3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList4.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.f();
                    break;
                }
                break;
            case 20:
                jg.h0 h0Var3 = (jg.h0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    vr.a0(h0Var3.t0).b.executeFast(sb2.toString()).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 21:
                jg.s1 s1Var = (jg.s1) this.b;
                String str = (String) this.c;
                s1Var.J = str;
                if (s1Var.r) {
                    s1Var.f.g(str, true, false, s1Var.s, s1Var.w, s1Var.y, s1Var.x, -1, 1);
                }
                int i15 = m10.t0;
                ArrayList arrayList5 = new ArrayList(org.telegram.messenger.g5.r(i15).f0);
                s1Var.E = true;
                int i16 = s1Var.G;
                s1Var.G = i16 + 1;
                s1Var.F = i16;
                s1Var.f();
                Utilities.g.c(new jg.o1(s1Var, str, i16, arrayList5, i15, 0));
                break;
            case 22:
                jg.z1 z1Var = (jg.z1) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                int i17 = z1Var.m;
                try {
                    vr.a0(i17).b.beginTransaction();
                    SQLitePreparedStatement executeFast = vr.a0(i17).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i10 < arrayList6.size() && i10 != 100) {
                            jg.x1 x1Var2 = (jg.x1) arrayList6.get(i10);
                            executeFast.requery();
                            executeFast.bindString(1, x1Var2.a);
                            executeFast.bindInteger(2, x1Var2.b);
                            executeFast.step();
                            i10++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList6.size() > 100) {
                        SQLitePreparedStatement executeFast2 = vr.a0(i17).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i7 = 100; i7 < arrayList6.size(); i7++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((jg.x1) arrayList6.get(i7)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    vr.a0(i17).b.commitTransaction();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            case 23:
                ji.m mVar2 = (ji.m) this.b;
                ji.e eVar = (ji.e) this.c;
                if (mVar2.c == 0 && mVar2.K == eVar && eVar.R) {
                    eVar.R = false;
                    eVar.f0 = -1;
                    eVar.invalidate();
                    break;
                }
                break;
            case 24:
                ji.m mVar3 = (ji.m) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (mVar3.X == editTextBoldCursor) {
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    break;
                }
                break;
            case 25:
                ji.m mVar4 = (ji.m) this.b;
                String str2 = (String) this.c;
                mVar4.i0 = false;
                if (mVar4.c == 0) {
                    ji.e eVar2 = mVar4.K;
                    if (eVar2 != null) {
                        eVar2.setBusy(false);
                        break;
                    }
                } else if (str2 != null && !str2.trim().isEmpty()) {
                    mVar4.e0 = str2.trim();
                    mVar4.f0 = mVar4.c().size();
                    ji.e eVar3 = mVar4.K;
                    if (eVar3 != null) {
                        eVar3.setRevertShown(true);
                        mVar4.K.setRebuildNext(true);
                    }
                    mVar4.n();
                    ji.e eVar4 = mVar4.K;
                    if (eVar4 != null) {
                        eVar4.setRebuildNext(false);
                        mVar4.K.setBusy(false);
                        break;
                    }
                } else {
                    Log.d("VoiceLive", "field: style failed");
                    ji.e eVar5 = mVar4.K;
                    if (eVar5 != null) {
                        eVar5.setBusy(false);
                        break;
                    }
                }
                break;
            case 26:
                kg.f fVar = (kg.f) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                fVar.e = false;
                TL_account.connectedBots connectedbots = tLObject5 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject5 : null;
                fVar.c = connectedbots;
                if (connectedbots != null) {
                    np.s1(fVar.a).Y3(fVar.c.users, false);
                }
                fVar.b = System.currentTimeMillis();
                fVar.f = true;
                fVar.d();
                break;
            case 27:
                kg.i0 i0Var = (kg.i0) this.b;
                org.telegram.ui.Components.a2 a2Var = (org.telegram.ui.Components.a2) this.c;
                kg.f.a(i0Var.a).b();
                a2Var.run();
                i0Var.dismiss();
                break;
            case 28:
                np.s1(((kg.q0) this.b).currentAccount).O3((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            default:
                kg.c1 c1Var = (kg.c1) this.b;
                b41 b41Var = (b41) this.c;
                c1Var.getClass();
                c1Var.c0(b41Var.d);
                break;
        }
    }
}
