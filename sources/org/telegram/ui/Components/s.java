package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.z1, bm0, qd0, rd0, sd0, ne.f, ImageReceiver.ImageReceiverDelegate, f5, r0.o, vh.a, t0.f, cm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, bi.ob, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, wh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // bi.ob
    public boolean H0(long j10, int i10, int i11, int i12, bi.pb pbVar) {
        no noVar = (no) ((org.telegram.ui.Cells.m6) this.b).T;
        ImageReceiver imageReceiver = noVar.a;
        pbVar.c = imageReceiver;
        pbVar.l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = noVar.G;
        pbVar.m = m6Var;
        boolean z10 = m6Var.w;
        no noVar2 = noVar.K.e;
        pbVar.a = noVar2;
        pbVar.k = noVar2.getAlpha();
        pbVar.h = 0.0f;
        pbVar.i = AndroidUtilities.displaySize.y;
        pbVar.g = (View) noVar.getParent();
        return true;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        ((r8) this.b).X0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        nb nbVar = (nb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        mb mbVar = nbVar.a;
        if (mbVar != null) {
            mbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        Object O;
        pk pkVar = (pk) this.b;
        s4.g0 adapter = pkVar.r.getAdapter();
        ik ikVar = pkVar.v;
        if (adapter == ikVar) {
            O = ikVar.E(i10);
        } else {
            ok okVar = pkVar.y;
            O = okVar.O(okVar.S(i10), okVar.Q(i10));
        }
        return pkVar.S(view, O);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        g0.Q((g0) this.b, view, i10, f7);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new n6((z6) obj, 1));
                duration.start();
                break;
            default:
                z9 z9Var = (z9) obj;
                z9Var.getClass();
                if (z10 && !z11) {
                    z9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.qd0
    public String e(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                y.T((y) this.b, a2Var);
                break;
            case 2:
                ((org.telegram.ui.p6) this.b).run();
                break;
            case 3:
                ((bi.g) this.b).run();
                break;
            case 4:
                ((bi.ma) this.b).run();
                break;
            case 5:
                ((u1) this.b).run();
                break;
            case 6:
                ((ms) this.b).run();
                break;
            case 8:
                ((r2) this.b).run();
                break;
            case 17:
                ((ig) this.b).a.U0.s();
                break;
            case 19:
                ((org.telegram.ui.rp) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((io) this.b).b.dismiss();
                break;
            case 24:
                ((kn) this.b).a.E.s();
                break;
            default:
                ((tu) this.b).a.d.s();
                break;
        }
    }

    @Override // ne.f
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // ne.f
    public /* synthetic */ boolean i(float f7) {
        return false;
    }

    @Override // t0.f
    public boolean j(t0.j jVar, int i10, Bundle bundle) {
        og ogVar = (og) this.b;
        ChatActivityEnterView chatActivityEnterView = ogVar.d;
        if (chatActivityEnterView.l5) {
            return true;
        }
        int i11 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                jVar.a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.a;
        if (!iVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            ogVar.m(iVar.c(), iVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new t2(6, ogVar, jVar), chatActivityEnterView.W3);
            return true;
        }
        ogVar.o(jVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.ui.Components.rd0
    public void k(int i10) {
        z2 z2Var = (z2) this.b;
        if (i10 == 0) {
            z2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void l(int i10) {
        yq yqVar = ((zq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            yqVar.k(i10 == 2);
        } else if (i10 == 3) {
            yqVar.y();
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((ks) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override // wh.k
    public void o(wh.g gVar, float f7, float f10) {
        ((pu) this.b).c(gVar, f7, f10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        fm fmVar = (fm) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = fmVar.e;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (fmVar.a == null || viVar.V || chatAttachAlertPhotoLayout.P == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.q1 = false;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i10 = options.outWidth;
            try {
                i11 = options.outHeight;
            } catch (Exception unused) {
                i11 = 0;
                int i12 = i10;
                int i13 = ChatAttachAlertPhotoLayout.u1;
                ChatAttachAlertPhotoLayout.u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, fmVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (j10 / 1000.0f);
                photoEntry.thumbPath = str;
                if (viVar.T0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
            }
        } catch (Exception unused2) {
            i10 = 0;
        }
        int i122 = i10;
        int i132 = ChatAttachAlertPhotoLayout.u1;
        ChatAttachAlertPhotoLayout.u1 = i132 - 1;
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, fmVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (viVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // bi.ob
    public void p(long j10, int i10, bi.r4 r4Var) {
        r4Var.run();
    }

    @Override // vh.a
    public void q(Canvas canvas, int i10) {
        ((wb) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.b;
        try {
            if (i10 == 0) {
                u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                u3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override // ne.f
    public void t() {
        i6 i6Var = (i6) this.b;
        i6Var.b();
        i6Var.e();
    }

    @Override // bi.ob
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // ne.f
    public /* synthetic */ void c() {
    }

    @Override // ne.f
    public /* synthetic */ void f(boolean z10) {
    }

    @Override // ne.f
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
