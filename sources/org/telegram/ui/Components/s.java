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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.a2, fm0, qd0, rd0, sd0, me.f, ImageReceiver.ImageReceiverDelegate, f5, r0.n, uh.a, t0.e, gm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.gc, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, vh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        ((p8) this.b).Q0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        ob obVar = (ob) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        nb nbVar = obVar.a;
        if (nbVar != null) {
            nbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // ai.gc
    public void Z(long j3, int i10, ai.e5 e5Var) {
        e5Var.run();
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        g0.Q((g0) this.b, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        Object O;
        sk skVar = (sk) this.b;
        s4.i0 adapter = skVar.r.getAdapter();
        lk lkVar = skVar.v;
        if (adapter == lkVar) {
            O = lkVar.E(i10);
        } else {
            rk rkVar = skVar.y;
            O = rkVar.O(rkVar.S(i10), rkVar.Q(i10));
        }
        return skVar.S(view, O);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new m6((y6) obj, 1));
                duration.start();
                break;
            default:
                y9 y9Var = (y9) obj;
                y9Var.getClass();
                if (z10 && !z11) {
                    y9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // ai.gc
    public boolean e1(long j3, int i10, int i11, int i12, ai.hc hcVar) {
        qo qoVar = (qo) ((org.telegram.ui.Cells.m6) this.b).T;
        ImageReceiver imageReceiver = qoVar.a;
        hcVar.c = imageReceiver;
        hcVar.l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = qoVar.G;
        hcVar.m = m6Var;
        boolean z10 = m6Var.w;
        qo qoVar2 = qoVar.K.e;
        hcVar.a = qoVar2;
        hcVar.k = qoVar2.getAlpha();
        hcVar.h = 0.0f;
        hcVar.i = AndroidUtilities.displaySize.y;
        hcVar.g = (View) qoVar.getParent();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                y.T((y) this.b, b2Var);
                break;
            case 2:
                ((org.telegram.ui.ActionBar.n5) this.b).run();
                break;
            case 3:
                ((ai.j) this.b).run();
                break;
            case 4:
                ((ai.db) this.b).run();
                break;
            case 5:
                ((u1) this.b).run();
                break;
            case 6:
                ((ps) this.b).run();
                break;
            case 8:
                ((r2) this.b).run();
                break;
            case 17:
                ((jg) this.b).a.U0.s();
                break;
            case 19:
                ((ea) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((lo) this.b).b.dismiss();
                break;
            case 24:
                ((nn) this.b).a.E.s();
                break;
            default:
                ((xu) this.b).a.d.s();
                break;
        }
    }

    @Override // me.f
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // me.f
    public /* synthetic */ boolean h(float f7) {
        return false;
    }

    @Override // org.telegram.ui.Components.qd0
    public String i(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // t0.e
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
        pg pgVar = (pg) this.b;
        ChatActivityEnterView chatActivityEnterView = pgVar.d;
        if (chatActivityEnterView.l5) {
            return true;
        }
        int i11 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            pgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new y2(3, pgVar, iVar), chatActivityEnterView.W3);
            return true;
        }
        pgVar.o(iVar, true, 0, 0);
        return true;
    }

    @Override // vh.k
    public void l(vh.g gVar, float f7, float f10) {
        ((tu) this.b).c(gVar, f7, f10);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        br brVar = ((cr) this.b).a;
        if (i10 == 1 || i10 == 2) {
            brVar.l(i10 == 2);
        } else if (i10 == 3) {
            brVar.y();
        }
    }

    @Override // org.telegram.ui.Components.rd0
    public void n(int i10) {
        z2 z2Var = (z2) this.b;
        if (i10 == 0) {
            z2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((ns) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        im imVar = (im) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.e;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (imVar.a == null || yiVar.V || chatAttachAlertPhotoLayout.P == null) {
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
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, imVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (j3 / 1000.0f);
                photoEntry.thumbPath = str;
                if (yiVar.T0 != 0) {
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
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, imVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j3 / 1000.0f);
        photoEntry.thumbPath = str;
        if (yiVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // me.f
    public void p() {
        i6 i6Var = (i6) this.b;
        i6Var.b();
        i6Var.e();
    }

    @Override // uh.a
    public void q(Canvas canvas, int i10) {
        ((xb) this.b).dispatchDrawImplBlur(canvas, i10);
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

    @Override // me.f
    public /* synthetic */ void a() {
    }

    @Override // ai.gc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // me.f
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // me.f
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }
}
