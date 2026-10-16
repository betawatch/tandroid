package ji;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.net.Uri;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.n41;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        k2.e eVar;
        n4.s sVar;
        n4.s sVar2;
        m4.s1 s1Var;
        int i10 = -1;
        int i11 = 0;
        View view = null;
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.b;
                e2 e2Var = (e2) this.c;
                x3Var.getClass();
                long j10 = e2Var.a;
                int i12 = e2Var.d;
                int i13 = e2Var.c;
                ArrayList arrayList = x3Var.j3;
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList.size()) {
                        if (((a) arrayList.get(i14)).a == j10) {
                            i10 = i14;
                        } else {
                            i14++;
                        }
                    }
                }
                if (i10 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = x3Var.V2.m(i10);
                if (m10 instanceof i6) {
                    i6 i6Var = (i6) m10;
                    i6Var.B();
                    h1 editText = i6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i13, length)), Math.max(0, Math.min(i12, length)));
                    return;
                }
                if (!(m10 instanceof u5)) {
                    if (m10 instanceof l0) {
                        h1 captionEditText = ((l0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i13, length2)), Math.max(0, Math.min(i12, length2)));
                        return;
                    }
                    return;
                }
                u5 u5Var = (u5) m10;
                h1 l4 = u5Var.l(e2Var.b);
                if (l4 == null) {
                    l4 = u5Var.l(0);
                }
                if (l4 == null) {
                    return;
                }
                l4.r();
                int length3 = l4.length();
                l4.setSelection(Math.max(0, Math.min(i13, length3)), Math.max(0, Math.min(i12, length3)));
                return;
            case 1:
                o3 o3Var = (o3) this.b;
                a aVar = (a) this.c;
                if (aVar == null) {
                    o3Var.getClass();
                } else {
                    view = o3Var.e.A1(aVar);
                }
                if (view instanceof i6) {
                    i6 i6Var2 = (i6) view;
                    i6Var2.B();
                    i6Var2.getEditText().setSelection(i6Var2.getEditText().length());
                    return;
                }
                return;
            case 2:
                e5 e5Var = (e5) this.b;
                TLObject tLObject = (TLObject) this.c;
                boolean z10 = e5Var.e;
                boolean z11 = e5Var.d;
                d5 d5Var = e5Var.s;
                if (e5Var.w) {
                    return;
                }
                e5Var.y = 0;
                if (e5Var.c || z11 || z10) {
                    if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (!z10) {
                            if (z11) {
                                e5Var.x = true;
                                e5Var.e();
                                d5Var.e(document);
                                return;
                            } else {
                                e5Var.x = true;
                                e5Var.e();
                                d5Var.c(document);
                                return;
                            }
                        }
                        int i15 = e5Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            e5Var.x = true;
                            e5Var.e();
                            d5Var.onError();
                            return;
                        }
                        e5Var.x = true;
                        e5Var.e();
                        if (!TextUtils.isEmpty(e5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i15).setLocalPathTo(closestPhotoSizeWithSize, e5Var.F);
                            AndroidUtilities.copyFileSafe(new File(e5Var.F), FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        d5Var.d(document);
                        return;
                    }
                } else if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                    e5Var.x = true;
                    e5Var.e();
                    d5Var.b(photo);
                    return;
                }
                e5Var.x = true;
                e5Var.e();
                d5Var.onError();
                return;
            case 3:
                e5 e5Var2 = (e5) this.b;
                String str = (String) this.c;
                if (e5Var2.w || e5Var2.x) {
                    return;
                }
                e5Var2.a(str);
                return;
            case 4:
                x5 m11 = ((u5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m11 == null) {
                    return;
                }
                h1 h1Var = m11.a;
                h1Var.r();
                h1Var.setSelection(h1Var.length());
                return;
            case 5:
                qf.b bVar = (qf.b) this.b;
                String str2 = (String) this.c;
                k2.u uVar = (k2.u) bVar.c;
                String str3 = e2.m0.a;
                j2.f fVar = ((i2.b0) uVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1012, new j2.e(p5, str2, 10));
                return;
            case 6:
                qf.b bVar2 = (qf.b) this.b;
                i2.c cVar = (i2.c) this.c;
                k2.u uVar2 = (k2.u) bVar2.c;
                String str4 = e2.m0.a;
                n4.s.h(((i2.b0) uVar2).a.F, cVar);
                return;
            case 7:
                k2.d0.a((k2.d0) this.b, (AudioRouting) this.c);
                return;
            case 8:
                k2.d0 d0Var = (k2.d0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (d0Var.d == null || (eVar = ((k2.j0) d0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                b2.f fVar2 = eVar.j;
                List a2 = eVar.a();
                e9.x1 x1Var = k2.b.e;
                eVar.b(k2.b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
                return;
            case 9:
                ((gi.m0) this.b).run((SpannableString) this.c);
                return;
            case 10:
                li.q qVar = (li.q) this.b;
                li.o oVar = (li.o) this.c;
                synchronized (qVar.a) {
                    try {
                        if (qVar.s) {
                            return;
                        }
                        ArrayList arrayList2 = (ArrayList) qVar.n.get(oVar);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj = arrayList2.get(i16);
                                i16++;
                                if (((li.p) obj).a != null) {
                                    li.m mVar = (li.m) qVar.h.get(oVar);
                                    if (mVar != null) {
                                        sVar2 = mVar.a;
                                    } else {
                                        int i17 = 26;
                                        if (qVar.a()) {
                                            try {
                                                com.google.android.gms.internal.play_billing.s0 c10 = qVar.v.a.c(oVar.a, oVar.b);
                                                c10.b();
                                                sVar = new n4.s(i17, c10, view);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e) {
                                                if (qVar.c != null) {
                                                    try {
                                                        FileLog.e(e);
                                                    } catch (LinkageError | RuntimeException unused) {
                                                    }
                                                }
                                                sVar = new n4.s(i17, view, e);
                                            }
                                            sVar2 = sVar;
                                        } else {
                                            sVar2 = new n4.s(i17, view, qVar.w);
                                        }
                                    }
                                    synchronized (qVar.a) {
                                        try {
                                            if (qVar.s) {
                                                return;
                                            }
                                            if (mVar == null && ((Throwable) sVar2.c) == null) {
                                                qVar.c(oVar, sVar2);
                                            }
                                            ArrayList arrayList3 = (ArrayList) qVar.n.remove(oVar);
                                            if (arrayList3 == null) {
                                                return;
                                            }
                                            int size2 = arrayList3.size();
                                            while (i11 < size2) {
                                                Object obj2 = arrayList3.get(i11);
                                                i11++;
                                                li.p pVar = (li.p) obj2;
                                                try {
                                                    li.n nVar = pVar.a;
                                                    pVar.a = null;
                                                    if (nVar != null) {
                                                        nVar.i(sVar2);
                                                    }
                                                } catch (LinkageError | RuntimeException e7) {
                                                    if (qVar.c != null) {
                                                        try {
                                                            FileLog.e(e7);
                                                        } catch (LinkageError | RuntimeException unused2) {
                                                        }
                                                    }
                                                }
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                        qVar.n.remove(oVar);
                        return;
                    } finally {
                    }
                }
            case 11:
                ((m4.e0) this.b).u(null, (m4.m1) this.c);
                return;
            case 12:
                m4.e0 e0Var = (m4.e0) this.b;
                Runnable runnable = (Runnable) this.c;
                e0Var.getClass();
                runnable.run();
                return;
            case 13:
                ((c0.i) this.c).a(Boolean.valueOf(((m4.e0) this.b).o()));
                return;
            case 14:
                j9.w wVar = (j9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    s1Var = (m4.s1) wVar.a;
                    u6.l(s1Var, "SessionResult must not be null");
                } catch (InterruptedException e10) {
                    e = e10;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    s1Var = new m4.s1(-1);
                } catch (CancellationException e11) {
                    e2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e11);
                    s1Var = new m4.s1(1);
                } catch (ExecutionException e12) {
                    e = e12;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    s1Var = new m4.s1(-1);
                }
                resultReceiver.send(s1Var.a, s1Var.b);
                return;
            case 15:
                m4.i1 i1Var = (m4.i1) this.b;
                m4.l lVar = (m4.l) this.c;
                pi.e eVar2 = i1Var.b;
                m4.v n10 = eVar2.n(lVar.asBinder());
                if (n10 != null) {
                    eVar2.C(n10);
                    return;
                }
                return;
            case 16:
                ((m4.i1) this.b).b.j((m4.v) this.c);
                return;
            case 17:
                n2.d dVar = (n2.d) this.b;
                b2.x xVar = (b2.x) this.c;
                n2.e eVar3 = dVar.d;
                if (eVar3.E == 0 || dVar.c) {
                    return;
                }
                Looper looper = eVar3.I;
                looper.getClass();
                dVar.b = eVar3.a(looper, dVar.a, xVar, false);
                eVar3.x.add(dVar);
                return;
            case 18:
                o2.q qVar2 = (o2.q) this.b;
                o2.j jVar = (o2.j) this.c;
                w4 w4Var = qVar2.c;
                Uri uri = jVar.x;
                p2.c cVar2 = (p2.c) ((o2.k) w4Var.b).b.d.get(uri);
                if (cVar2 != null) {
                    p2.c.b(cVar2, uri, true);
                    return;
                }
                return;
            case 19:
                oe.b bVar3 = (oe.b) this.b;
                View view2 = (View) this.c;
                oe.a aVar2 = bVar3.a;
                if ((bVar3.c & 2) != 0) {
                    if (!aVar2.onLongPressRequestedAt(view2, bVar3.d, bVar3.e)) {
                        bVar3.c |= 8;
                        return;
                    }
                    bVar3.c &= -3;
                    bVar3.b = null;
                    float f7 = bVar3.d;
                    float f10 = bVar3.e;
                    bVar3.f = f7;
                    bVar3.g = f10;
                    if (aVar2.ignoreHapticFeedbackSettings(f7, f10)) {
                        boolean forceEnableVibration = aVar2.forceEnableVibration();
                        if (view2 != null) {
                            view2.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view2.performHapticFeedback(0);
                    }
                    bVar3.c = (bVar3.c | 4) & (-11);
                    bVar3.b = null;
                    return;
                }
                return;
            case 20:
                ((VideoAds) this.b).lambda$showPremium$19((sg.y0) this.c);
                return;
            case 21:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 22:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                return;
            case 23:
                n41.U((Context) this.b, null, false, (bi.s0) this.c, null);
                return;
            case 24:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 25:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 26:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 27:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                return;
            case 28:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                return;
            default:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.m0) this.c);
                return;
        }
    }

    public /* synthetic */ v2(m4.e0 e0Var, m4.v vVar, Runnable runnable) {
        this.a = 12;
        this.b = e0Var;
        this.c = runnable;
    }
}
