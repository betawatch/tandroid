package mh;

import ag.j0;
import ag.k0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b2.x;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import k2.m0;
import kg.i1;
import o2.q;
import oh.p;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.voip.p0;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g01;
import org.telegram.ui.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        int i10 = 4;
        int i11 = 10;
        int i12 = 3;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        ?? r13 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                lVar.b.add((String) this.c);
                lVar.invalidate();
                break;
            case 1:
                n2.d dVar = (n2.d) this.b;
                x xVar = (x) this.c;
                n2.e eVar = dVar.d;
                if (eVar.E != 0 && !dVar.c) {
                    Looper looper = eVar.I;
                    looper.getClass();
                    dVar.b = eVar.b(looper, dVar.a, xVar, false);
                    eVar.y.add(dVar);
                    break;
                }
                break;
            case 2:
                q qVar = (q) this.b;
                o2.j jVar = (o2.j) this.c;
                m0 m0Var = qVar.c;
                Uri uri = jVar.y;
                p2.c cVar = (p2.c) ((o2.k) m0Var.a).b.d.get(uri);
                if (cVar != null) {
                    p2.c.b(cVar, uri, true);
                    break;
                }
                break;
            case 3:
                of.c cVar2 = (of.c) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar2.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar2.e;
                        if (!cVar2.f) {
                            cVar2.f(false);
                            cVar2.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList3.get(i14);
                            i14++;
                            of.b bVar = (of.b) obj;
                            if (bVar.b != null && (document = bVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar.b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar2.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            TLRPC.Document document3 = arrayList2.get(i15);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i15, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i15, str);
                            }
                            of.b bVar2 = new of.b();
                            bVar2.a = document3;
                            bVar2.b = str;
                            int i16 = cVar2.d;
                            cVar2.d = i16 + 1;
                            bVar2.c = i16;
                            arrayList3.add(bVar2);
                        }
                        edit.apply();
                        zs.f(cVar2.c).k(zs.e5, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar2.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        of.c.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        of.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar2.b();
                    break;
                }
                break;
            case 4:
                of.c cVar3 = (of.c) this.b;
                ?? r22 = (ArrayList) this.c;
                while (r13 < r22.size()) {
                    of.b bVar3 = (of.b) r22.get(r13);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null)) {
                        b8.G(cVar3.c);
                        File I = b8.I(document2);
                        if (I == null || !I.exists()) {
                            i0.g3(new k(5, cVar3, document2));
                        }
                    }
                    r13++;
                }
                break;
            case 5:
                of.c cVar4 = (of.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                b8.G(cVar4.c).X(document4, document4, 0, 0);
                break;
            case 6:
                of.d dVar2 = (of.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i17 = dVar2.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    zs.e().k(zs.P4, 4, cd.a0("TooLongError", null, 2131744066, new Object[0]), cd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(vp.r1(i17).l4)));
                    break;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    zs.e().k(zs.P4, 4, cd.a0("TooLargeError", null, 2131744067, new Object[0]), cd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(vp.r1(i17).m4 / 1024)));
                    break;
                } else {
                    zs.e().k(zs.P4, 4, cd.a0("InvalidFormatError", null, 2131749191, new Object[0]), cd.L0(2131751104, null));
                    break;
                }
            case 7:
                ((ag.l) this.b).a((TLRPC.Chat) this.c);
                break;
            case 8:
                oh.q qVar2 = (oh.q) this.b;
                i5 i5Var = (i5) this.c;
                int i18 = qVar2.k;
                k2 k2Var = qVar2.g;
                TLRPC.TL_chatInviteImporter importer = i5Var.getImporter();
                qVar2.r = importer;
                LongSparseArray longSparseArray = qVar2.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    k2Var.getMessagesController().U3(user, false, false);
                    Point point = i0.q;
                    boolean z10 = point.x > point.y;
                    if (user.photo != null && !z10) {
                        if (qVar2.s == null) {
                            p pVar = new p(qVar2, k2Var.getParentActivity(), (tk0) i5Var.getParent(), k2Var.getResourceProvider(), qVar2.a);
                            qVar2.s = pVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = qVar2.r;
                            g9 avatarImageView = i5Var.getAvatarImageView();
                            TextView textView = pVar.e;
                            ug0 ug0Var = pVar.h;
                            pVar.r = tL_chatInviteImporter;
                            pVar.w = avatarImageView;
                            TLRPC.User Z1 = vp.r1(i18).Z1(Long.valueOf(tL_chatInviteImporter.user_id));
                            ic m10 = ic.m(i18, 0, Z1);
                            ic m11 = ic.m(i18, 1, Z1);
                            if (vp.r1(i18).a2(tL_chatInviteImporter.user_id) == null) {
                                vp.r1(i18).e3(Z1, false, 0);
                            }
                            ug0Var.setParentAvatarImage(avatarImageView);
                            ug0Var.M(tL_chatInviteImporter.user_id, true);
                            ug0Var.H(null, m10, m11, true);
                            pVar.d.setText(h20.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            pVar.D.requestLayout();
                            qVar2.s.setOnDismissListener(new ag.x(qVar2, 6));
                            qVar2.s.show();
                            break;
                        }
                    } else {
                        qVar2.b = true;
                        k2Var.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        k2Var.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 9:
                ((VideoAds) this.b).lambda$showPremium$19((i1) this.c);
                break;
            case 10:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                break;
            case 11:
                ((VideoAds) this.b).lambda$show$16((q20) this.c);
                break;
            case 12:
                g01.d1((Context) this.b, null, false, (ro0) this.c, null);
                break;
            case 13:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                break;
            case 14:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                break;
            case 15:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                break;
            case 16:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                break;
            case 17:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                break;
            case 18:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((p0) this.c);
                break;
            case 19:
                ((VoIPService) this.b).lambda$startScreenCapture$58((TLRPC.Updates) this.c);
                break;
            case 20:
                ((AudioManager) this.b).setCommunicationDevice((AudioDeviceInfo) this.c);
                break;
            case 21:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$4((j20) this.c);
                break;
            case 22:
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) this.b;
                boolean canScrollVertically = ((in0) this.c).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (lVar2.B1 != z11) {
                    ValueAnimator valueAnimator = lVar2.D1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f7 = lVar2.C1;
                    lVar2.B1 = z11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, canScrollVertically ? 0.0f : 1.0f);
                    lVar2.D1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar2, i10));
                    lVar2.D1.addListener(new org.telegram.ui.ActionBar.c(lVar2, z11, i13));
                    lVar2.D1.setDuration(320L);
                    lVar2.D1.setInterpolator(gr.h);
                    lVar2.D1.start();
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ActionBar.l lVar3 = (org.telegram.ui.ActionBar.l) this.b;
                boolean canScrollVertically2 = ((RecyclerView) this.c).canScrollVertically(-1);
                boolean z12 = !canScrollVertically2;
                if (lVar3.B1 != z12) {
                    ValueAnimator valueAnimator2 = lVar3.D1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f10 = lVar3.C1;
                    lVar3.B1 = z12;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, canScrollVertically2 ? 0.0f : 1.0f);
                    lVar3.D1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar3, i12));
                    lVar3.D1.addListener(new org.telegram.ui.ActionBar.c(lVar3, z12, r13));
                    lVar3.D1.setDuration(320L);
                    lVar3.D1.setInterpolator(gr.h);
                    lVar3.D1.start();
                    break;
                }
                break;
            case 24:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                k2 k2Var2 = (k2) this.c;
                Drawable drawable = ActionBarLayout.v1;
                actionBarLayout.d0(k2Var2, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.H0;
                if (view != null) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 25:
                k2 k2Var3 = (k2) this.b;
                k2 k2Var4 = (k2) this.c;
                Drawable drawable2 = ActionBarLayout.v1;
                if (k2Var3 != null) {
                    k2Var3.onTransitionAnimationEnd(false, false);
                }
                k2Var4.onTransitionAnimationEnd(true, false);
                k2Var4.onBecomeFullyVisible();
                break;
            case 26:
                o6 o6Var = (o6) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int size2 = arrayList4.size();
                int i19 = 0;
                while (i19 < size2) {
                    r6 r6Var = (r6) arrayList4.get(i19);
                    File e = r6Var.e();
                    if (e == null || e.length() <= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(r6Var.o)) {
                            arrayList.add(r6Var.o);
                        }
                    } else {
                        arrayList4.remove(i19);
                        i19--;
                        size2--;
                    }
                    i19++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size3 = arrayList.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i20);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(o6Var.a).sendRequest(getmultiwallpapers, new k0(i11, o6Var, arrayList4));
                    break;
                }
                break;
            case 27:
                o6 o6Var2 = (o6) this.b;
                n6 n6Var = (n6) this.c;
                TLRPC.TL_wallPaper tL_wallPaper = n6Var.a;
                b8.G(d20.s0);
                File K = b8.K(tL_wallPaper.document, null, true, true);
                ArrayList arrayList5 = n6Var.b;
                int size4 = arrayList5.size();
                ArrayList arrayList6 = null;
                for (int i21 = 0; i21 < size4; i21++) {
                    r6 r6Var2 = (r6) arrayList5.get(i21);
                    if (r6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = o6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), K, r6Var2);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            arrayList6.add(r6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                i0.g3(new j0(o6Var2, arrayList6, (boolean) r13, i11));
                break;
            case 28:
                s6 s6Var = (s6) this.b;
                s6Var.d((File) this.c, s6Var.h0);
                i0.g3(new fg.d(s6Var, i13));
                break;
            default:
                ((n) this.b).b0((TLRPC.TL_messages_archivedStickers) this.c);
                break;
        }
    }
}
