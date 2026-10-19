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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.a2, xl0, kd0, ld0, md0, ne.f, ImageReceiver.ImageReceiverDelegate, e5, r0.n, vh.a, t0.e, yl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, ci.w9, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, wh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        lb lbVar = (lb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        kb kbVar = lbVar.a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        ((o8) this.b).H0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // ne.f
    public void F() {
        h6 h6Var = (h6) this.b;
        h6Var.b();
        h6Var.e();
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // ci.w9
    public boolean Q0(long j10, int i10, int i11, int i12, ci.x9 x9Var) {
        ko koVar = (ko) ((org.telegram.ui.Cells.l6) this.b).T;
        ImageReceiver imageReceiver = koVar.a;
        x9Var.c = imageReceiver;
        x9Var.l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = koVar.G;
        x9Var.m = l6Var;
        boolean z10 = l6Var.w;
        ko koVar2 = koVar.K.e;
        x9Var.a = koVar2;
        x9Var.k = koVar2.getAlpha();
        x9Var.h = 0.0f;
        x9Var.i = AndroidUtilities.displaySize.y;
        x9Var.g = (View) koVar.getParent();
        return true;
    }

    @Override // ci.w9
    public void X0(long j10, int i10, ci.t3 t3Var) {
        t3Var.run();
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        Object O;
        nk nkVar = (nk) this.b;
        s4.g0 adapter = nkVar.r.getAdapter();
        gk gkVar = nkVar.v;
        if (adapter == gkVar) {
            O = gkVar.E(i10);
        } else {
            mk mkVar = nkVar.y;
            O = mkVar.O(mkVar.S(i10), mkVar.Q(i10));
        }
        return nkVar.S(view, O);
    }

    @Override // org.telegram.ui.Components.xl0
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
                duration.addUpdateListener(new l6((x6) obj, 1));
                duration.start();
                break;
            default:
                w9 w9Var = (w9) obj;
                w9Var.getClass();
                if (z10 && !z11) {
                    w9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.kd0
    public String e(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // t0.e
    public boolean f(t0.i iVar, int i10, Bundle bundle) {
        ng ngVar = (ng) this.b;
        ChatActivityEnterView chatActivityEnterView = ngVar.d;
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
            ngVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            f5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new q2(7, ngVar, iVar), chatActivityEnterView.W3);
            return true;
        }
        ngVar.o(iVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                y.T((y) this.b, b2Var);
                break;
            case 2:
                ((org.telegram.messenger.camera.i) this.b).run();
                break;
            case 3:
                ((ai.v3) this.b).run();
                break;
            case 4:
                ((ai.vb) this.b).run();
                break;
            case 5:
                ((u1) this.b).run();
                break;
            case 6:
                ((js) this.b).run();
                break;
            case 8:
                ((r2) this.b).run();
                break;
            case 17:
                ((gg) this.b).a.U0.s();
                break;
            case 19:
                ((ee) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((fo) this.b).b.dismiss();
                break;
            case 24:
                ((hn) this.b).a.E.s();
                break;
            default:
                ((ou) this.b).a.d.s();
                break;
        }
    }

    @Override // ne.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
        vq vqVar = ((wq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            vqVar.k(i10 == 2);
        } else if (i10 == 3) {
            vqVar.u();
        }
    }

    @Override // ne.f
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // org.telegram.ui.Components.ld0
    public void l(int i10) {
        y2 y2Var = (y2) this.b;
        if (i10 == 0) {
            y2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((hs) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override // wh.k
    public void o(wh.g gVar, float f7, float f10) {
        ((ku) this.b).c(gVar, f7, f10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.k5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        cm cmVar = (cm) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.e;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (cmVar.a == null || tiVar.V || chatAttachAlertPhotoLayout.P == null) {
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
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, cmVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (j10 / 1000.0f);
                photoEntry.thumbPath = str;
                if (tiVar.T0 != 0) {
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
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, cmVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (tiVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // vh.a
    public void p(Canvas canvas, int i10) {
        ((ub) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.md0
    public void q(od0 od0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.b;
        try {
            if (i10 == 0) {
                t3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                t3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override // ci.w9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // ne.f
    public /* synthetic */ void c() {
    }

    @Override // ne.f
    public /* synthetic */ void h(boolean z10) {
    }

    @Override // ne.f
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
