package a1;

import a3.l0;
import ai.g0;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.x1;
import bi.aa;
import bi.e8;
import bi.f3;
import bi.g8;
import bi.h2;
import bi.i8;
import bi.i9;
import bi.je;
import bi.k2;
import bi.ke;
import bi.m3;
import bi.p8;
import bi.q8;
import bi.r7;
import bi.r9;
import bi.rb;
import bi.t;
import bi.u3;
import com.google.android.gms.internal.vision.u2;
import e2.d0;
import i2.a0;
import i2.b0;
import i2.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.p;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.wr;
import pg.b2;
import pg.j;
import r8.n;
import v0.i;
import v0.o;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.b, (p) this.c);
                return;
            case 2:
                of.b bVar = (of.b) this.b;
                x1 x1Var = (x1) this.c;
                l0 l0Var = (l0) bVar.c;
                String str = d0.a;
                e0 e0Var = ((b0) l0Var).a;
                e0Var.h0 = x1Var;
                e0Var.m.e(25, new a0(x1Var));
                return;
            case 3:
                of.b bVar2 = (of.b) this.b;
                Exception exc = (Exception) this.c;
                l0 l0Var2 = (l0) bVar2.c;
                String str2 = d0.a;
                j2.e eVar = ((b0) l0Var2).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1030, new i0.b(p5, exc, 7));
                return;
            case 4:
                of.b bVar3 = (of.b) this.b;
                String str3 = (String) this.c;
                l0 l0Var3 = (l0) bVar3.c;
                String str4 = d0.a;
                j2.e eVar2 = ((b0) l0Var3).a.s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1019, new i0.b(p10, str3, 14));
                return;
            case 5:
                g0 g0Var = (g0) this.b;
                String str5 = (String) this.c;
                ArrayList arrayList = g0Var.f;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                    } else if (!TextUtils.equals(((s4) arrayList.get(i13)).E, str5)) {
                        i13++;
                    }
                }
                if (i13 >= 0) {
                    g0Var.r.d(str5.hashCode(), i13 + 1);
                    return;
                }
                return;
            case 6:
                ViewGroup container = (ViewGroup) this.b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 7:
                ((i) this.b).onError(this.c);
                return;
            case 8:
                ((i) this.b).onResult((o) this.c);
                return;
            case 9:
                bi.d dVar = (bi.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i14 = dVar.F - 1;
                dVar.F = i14;
                dVar.b(i14, true);
                if (dVar.F > 0) {
                    AndroidUtilities.runOnUIThread(dVar.G, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    gVar.run();
                    return;
                }
            case 10:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                return;
            case 11:
                h2 h2Var = (h2) this.b;
                TLObject tLObject = (TLObject) this.c;
                k2 k2Var = h2Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    f3 f3Var = k2Var.r;
                    i10 = ((h3) f3Var).currentAccount;
                    MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                    i11 = ((h3) f3Var).currentAccount;
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    i12 = ((h3) f3Var).currentAccount;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                h2Var.n = true;
                h2Var.G();
                return;
            case 12:
                ((m3) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 13:
                r7 r7Var = (r7) this.b;
                View view = (View) this.c;
                r7Var.getClass();
                if (view instanceof j) {
                    j jVar = (j) view;
                    jVar.m();
                    r7Var.D0(jVar, true);
                    return;
                }
                return;
            case 14:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                return;
            case 16:
                e8.a((e8) this.b, (r9) this.c);
                return;
            case 17:
                aa.a aVar = (aa.a) this.b;
                r9 r9Var = (r9) this.c;
                e8 e8Var = (e8) aVar.d;
                Bitmap bitmap = e8Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (r9Var.M0 == e8Var.a) {
                        r9Var.M0 = null;
                    }
                    e8Var.a = null;
                    e8Var.invalidate();
                    return;
                }
                return;
            case 18:
                i8 i8Var = (i8) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = i8Var.a;
                com.google.android.gms.internal.vision.x1 x1Var2 = new com.google.android.gms.internal.vision.x1();
                x1Var2.a = 256;
                atomicReference.set(new n(new u2(context, x1Var2)));
                i8Var.a(i8Var.f);
                return;
            case 19:
                ((i8) this.b).c.run((g8) this.c);
                return;
            case 20:
                t tVar = (t) this.b;
                b2 b2Var = (b2) this.c;
                q8 q8Var = tVar.a;
                if (b2Var.getWidth() <= 0) {
                    q8Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new a3.d(tVar, 26)).start();
                    return;
                }
                float width = b2Var.getWidth() / q8Var.getWidth();
                ValueAnimator valueAnimator = tVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                tVar.w.addUpdateListener(new p8(tVar, q8Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((q8Var.getWidth() / 2.0f) + q8Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((q8Var.getHeight() / 2.0f) + q8Var.getY()), 0));
                tVar.w.addListener(new u3(2, tVar, b2Var));
                tVar.w.setDuration(320L);
                tVar.w.setInterpolator(wr.h);
                tVar.v = b2Var;
                tVar.w.start();
                return;
            case 21:
                i9 i9Var = (i9) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                i9Var.L0 = false;
                i9Var.b0.addAll(arrayList2);
                i9Var.q0.N(true);
                return;
            case 22:
                i9.S((i9) this.b, (TLObject) this.c);
                return;
            case 23:
                r9 r9Var2 = (r9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                r9Var2.e1 = 0;
                if (tLObject2 instanceof Vector) {
                    r9Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject2;
                    for (int i15 = 0; i15 < vector.objects.size(); i15++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i15);
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
                            r9Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 24:
                aa.R((aa) this.b, (TLObject) this.c);
                return;
            case 25:
                aa aaVar = (aa) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) aaVar.getContext().getSystemService("clipboard");
                g3 g3Var = aaVar.Y.b;
                boolean z10 = (TextUtils.isEmpty(g3Var.getText()) || TextUtils.equals(g3Var.getText(), "https://") || TextUtils.isEmpty(g3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                em.q(textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f), wr.h, 300L);
                return;
            case 26:
                rb rbVar = (rb) this.b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new e(27, rbVar, smallGroupsParticipantsCount));
                return;
            case 27:
                rb rbVar2 = (rb) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (rbVar2.P == null) {
                    rbVar2.P = new HashMap();
                }
                rbVar2.P.putAll(hashMap);
                return;
            case 28:
                bi.d dVar2 = (bi.d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar2 != null) {
                    dVar2.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ke keVar = (ke) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (!keVar.k || keVar.i) {
                    return;
                }
                keVar.d.add(new je(keVar, bitmap2));
                keVar.k = false;
                keVar.n.invalidate();
                return;
        }
    }
}
