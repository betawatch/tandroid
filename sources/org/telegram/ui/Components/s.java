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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.z1, nl0, cd0, dd0, ed0, le.g, ImageReceiver.ImageReceiverDelegate, d5, r0.n, uh.a, t0.e, ol0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.fc, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, vh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ((n8) this.b).U0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        lb lbVar = (lb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        kb kbVar = lbVar.a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.b;
    }

    @Override // ai.fc
    public void Z(long j3, int i10, ai.d5 d5Var) {
        d5Var.run();
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.b, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        Object O;
        qk qkVar = (qk) this.b;
        s4.h0 adapter = qkVar.r.getAdapter();
        jk jkVar = qkVar.v;
        if (adapter == jkVar) {
            O = jkVar.E(i10);
        } else {
            pk pkVar = qkVar.y;
            O = pkVar.O(pkVar.S(i10), pkVar.Q(i10));
        }
        return qkVar.P(view, O);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new k6((w6) obj, 1));
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
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                y.S((y) this.b, a2Var);
                break;
            case 2:
                ((org.telegram.ui.ActionBar.l5) this.b).run();
                break;
            case 3:
                ((ai.j) this.b).run();
                break;
            case 4:
                ((ai.cb) this.b).run();
                break;
            case 5:
                ((t1) this.b).run();
                break;
            case 6:
                ((bs) this.b).run();
                break;
            case 8:
                ((p2) this.b).run();
                break;
            case 17:
                ((hg) this.b).a.U0.r();
                break;
            case 19:
                ((kd) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((wn) this.b).b.dismiss();
                break;
            case 24:
                ((zm) this.b).a.E.r();
                break;
            default:
                ((ju) this.b).a.d.r();
                break;
        }
    }

    @Override // ai.fc
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        bo boVar = (bo) ((org.telegram.ui.Cells.m6) this.b).T;
        ImageReceiver imageReceiver = boVar.a;
        gcVar.c = imageReceiver;
        gcVar.l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = boVar.G;
        gcVar.m = m6Var;
        boolean z10 = m6Var.w;
        bo boVar2 = boVar.K.e;
        gcVar.a = boVar2;
        gcVar.k = boVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.i = AndroidUtilities.displaySize.y;
        gcVar.g = (View) boVar.getParent();
        return true;
    }

    @Override // le.g
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // le.g
    public /* synthetic */ boolean h(float f7) {
        return false;
    }

    @Override // org.telegram.ui.Components.cd0
    public String j(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // t0.e
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
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
            e5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new w2(3, ngVar, iVar), chatActivityEnterView.W3);
            return true;
        }
        ngVar.o(iVar, true, 0, 0);
        return true;
    }

    @Override // vh.k
    public void l(vh.g gVar, float f7, float f10) {
        ((fu) this.b).c(gVar, f7, f10);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void m(int i10) {
        nq nqVar = ((oq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            nqVar.l(i10 == 2);
        } else if (i10 == 3) {
            nqVar.y();
        }
    }

    @Override // org.telegram.ui.Components.dd0
    public void n(int i10) {
        x2 x2Var = (x2) this.b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override // uh.a
    public void o(Canvas canvas, int i10) {
        ((ub) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        tl tlVar = (tl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tlVar.e;
        wi wiVar = chatAttachAlertPhotoLayout.b;
        if (tlVar.a == null || wiVar.V || chatAttachAlertPhotoLayout.P == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.q1 = false;
        try {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i10 = options.outWidth;
        } catch (Exception unused) {
            i10 = 0;
        }
        try {
            i11 = options.outHeight;
        } catch (Exception unused2) {
            i11 = 0;
            int i12 = i10;
            int i13 = ChatAttachAlertPhotoLayout.u1;
            ChatAttachAlertPhotoLayout.u1 = i13 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, tlVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j3 / 1000.0f);
            photoEntry.thumbPath = str;
            if (wiVar.Q0 != 0) {
                MediaController.CropState cropState = new MediaController.CropState();
                photoEntry.cropState = cropState;
                cropState.mirrored = true;
                cropState.freeform = false;
                cropState.lockedAspectRatio = 1.0f;
            }
            chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
        }
        int i122 = i10;
        int i132 = ChatAttachAlertPhotoLayout.u1;
        ChatAttachAlertPhotoLayout.u1 = i132 - 1;
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, tlVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j3 / 1000.0f);
        photoEntry.thumbPath = str;
        if (wiVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((zr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override // org.telegram.ui.Components.ed0
    public void q(gd0 gd0Var, int i10) {
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

    @Override // le.g
    public void u() {
        g6 g6Var = (g6) this.b;
        g6Var.b();
        g6Var.e();
    }

    @Override // le.g
    public /* synthetic */ void a() {
    }

    @Override // ai.fc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // le.g
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // le.g
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
