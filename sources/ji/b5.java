package ji;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.k41;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        m4.p1 p1Var;
        int i10 = this.a;
        int i11 = 4;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                d5 d5Var = (d5) obj2;
                TLObject tLObject = (TLObject) obj;
                boolean z10 = d5Var.e;
                boolean z11 = d5Var.d;
                c5 c5Var = d5Var.s;
                if (!d5Var.w) {
                    d5Var.y = 0;
                    if (!d5Var.c && !z11 && !z10) {
                        if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                            d5Var.x = true;
                            d5Var.e();
                            c5Var.b(photo);
                            break;
                        }
                    } else if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (!z10) {
                            if (!z11) {
                                d5Var.x = true;
                                d5Var.e();
                                c5Var.c(document);
                                break;
                            } else {
                                d5Var.x = true;
                                d5Var.e();
                                c5Var.e(document);
                                break;
                            }
                        } else {
                            int i14 = d5Var.a;
                            if (document.id != 0 && document.access_hash != 0) {
                                d5Var.x = true;
                                d5Var.e();
                                if (!TextUtils.isEmpty(d5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                                    FileLoader.getInstance(i14).setLocalPathTo(closestPhotoSizeWithSize, d5Var.F);
                                    AndroidUtilities.copyFileSafe(new File(d5Var.F), FileLoader.getInstance(i14).getPathToAttach(closestPhotoSizeWithSize, true));
                                }
                                c5Var.d(document);
                                break;
                            } else {
                                d5Var.x = true;
                                d5Var.e();
                                c5Var.onError();
                                break;
                            }
                        }
                    }
                    d5Var.x = true;
                    d5Var.e();
                    c5Var.onError();
                    break;
                }
                break;
            case 1:
                d5 d5Var2 = (d5) obj2;
                String str = (String) obj;
                if (!d5Var2.w && !d5Var2.x) {
                    d5Var2.a(str);
                    break;
                }
                break;
            case 2:
                v5 m10 = ((s5) obj2).v.m((TL_iv.pageTableCell) obj);
                if (m10 != null) {
                    h1 h1Var = m10.a;
                    h1Var.r();
                    h1Var.setSelection(h1Var.length());
                    break;
                }
                break;
            case 3:
                k2.j jVar = (k2.j) ((n4.y) obj2).c;
                String str2 = e2.d0.a;
                j2.f fVar = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1012, new j2.c(p5, (String) obj, 25));
                break;
            case 4:
                ((k2.n) obj2).O((k2.k) obj);
                break;
            case 5:
                ((i9.c0) obj).m(Boolean.valueOf(((m4.a0) obj2).o()));
                break;
            case 6:
                ((m4.a0) obj2).getClass();
                ((Runnable) obj).run();
                break;
            case 7:
                ((m4.a0) obj2).u(null, (m4.j1) obj);
                break;
            case 8:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    p1Var = (m4.p1) ((i9.u) obj2).a;
                    e2.d.e(p1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    p1Var = new m4.p1(-1);
                } catch (CancellationException e10) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e10);
                    p1Var = new m4.p1(1);
                } catch (ExecutionException e11) {
                    e = e11;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    p1Var = new m4.p1(-1);
                }
                resultReceiver.send(p1Var.a, p1Var.b);
                break;
            case 9:
                fg.f fVar2 = ((m4.f1) obj2).b;
                m4.r u10 = fVar2.u(((m4.i) obj).asBinder());
                if (u10 != null) {
                    fVar2.N(u10);
                    break;
                }
                break;
            case 10:
                ((m4.f1) obj2).b.o((m4.r) obj);
                break;
            case 11:
                me.b bVar = (me.b) obj2;
                View view = (View) obj;
                me.a aVar = bVar.a;
                if ((bVar.c & 2) != 0) {
                    if (!aVar.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
                        bVar.c |= 8;
                        break;
                    } else {
                        bVar.c &= -3;
                        bVar.b = null;
                        float f7 = bVar.d;
                        float f10 = bVar.e;
                        bVar.f = f7;
                        bVar.g = f10;
                        if (aVar.ignoreHapticFeedbackSettings(f7, f10)) {
                            boolean forceEnableVibration = aVar.forceEnableVibration();
                            if (view != null) {
                                view.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                            }
                        } else {
                            view.performHapticFeedback(0);
                        }
                        bVar.c = (bVar.c | 4) & (-11);
                        bVar.b = null;
                        break;
                    }
                }
                break;
            case 12:
                n2.d dVar = (n2.d) obj2;
                b2.s sVar = (b2.s) obj;
                n2.e eVar = dVar.d;
                if (eVar.E != 0 && !dVar.c) {
                    Looper looper = eVar.I;
                    looper.getClass();
                    dVar.b = eVar.a(looper, dVar.a, sVar, false);
                    eVar.x.add(dVar);
                    break;
                }
                break;
            case 13:
                ((p2.b) ((o2.k) ((o2.q) obj2).c.b).b.d.get(((o2.j) obj).x)).c(true);
                break;
            case 14:
                ((VideoAds) obj2).lambda$showPremium$19((sg.a1) obj);
                break;
            case 15:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                break;
            case 16:
                ((VideoAds) obj2).lambda$show$16((Utilities.Callback) obj);
                break;
            case 17:
                k41.T((Context) obj2, null, false, (bi.s0) obj, null);
                break;
            case 18:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                break;
            case 19:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                break;
            case 20:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                break;
            case 21:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                break;
            case 22:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                break;
            case 23:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) obj);
                break;
            case 24:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 25:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                break;
            case 26:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((zn0) obj).canScrollVertically(-1);
                boolean z12 = !canScrollVertically;
                if (kVar.q1 != z12) {
                    ValueAnimator valueAnimator = kVar.s1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f11 = kVar.r1;
                    kVar.q1 = z12;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, canScrollVertically ? 0.0f : 1.0f);
                    kVar.s1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, i11));
                    kVar.s1.addListener(new org.telegram.ui.ActionBar.c(kVar, z12, i13));
                    kVar.s1.setDuration(320L);
                    kVar.s1.setInterpolator(pr.h);
                    kVar.s1.start();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z13 = !canScrollVertically2;
                if (kVar2.q1 != z13) {
                    ValueAnimator valueAnimator2 = kVar2.s1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f12 = kVar2.r1;
                    kVar2.q1 = z13;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, canScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.s1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, 3));
                    kVar2.s1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z13, i12));
                    kVar2.s1.setDuration(320L);
                    kVar2.s1.setInterpolator(pr.h);
                    kVar2.s1.start();
                    break;
                }
                break;
            case 28:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.p1;
                actionBarLayout.b0((org.telegram.ui.ActionBar.n2) obj, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                Drawable drawable2 = ActionBarLayout.p1;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                break;
        }
    }

    public /* synthetic */ b5(m4.a0 a0Var, m4.r rVar, Runnable runnable) {
        this.a = 6;
        this.b = a0Var;
        this.c = runnable;
    }
}
