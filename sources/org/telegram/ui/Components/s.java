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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.b2, bl0, qc0, rc0, sc0, le.f, ImageReceiver.ImageReceiverDelegate, b5, r0.n, uh.a, t0.f, cl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, ai.fc, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.m1, vh.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.f
    public void E() {
        e6 e6Var = (e6) this.b;
        e6Var.b();
        e6Var.e();
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        ((l8) this.b).U0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        jb jbVar = (jb) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ib ibVar = jbVar.a;
        if (ibVar != null) {
            ibVar.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.b;
    }

    @Override // ai.fc
    public void Z(long j3, int i10, ai.e5 e5Var) {
        e5Var.run();
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.b, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        Object O;
        ok okVar = (ok) this.b;
        s4.h0 adapter = okVar.r.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.y;
            O = nkVar.O(nkVar.S(i10), nkVar.Q(i10));
        }
        return okVar.P(view, O);
    }

    @Override // org.telegram.ui.Components.bl0
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
                duration.addUpdateListener(new i6((u6) obj, 1));
                duration.start();
                break;
            default:
                u9 u9Var = (u9) obj;
                u9Var.getClass();
                if (z10 && !z11) {
                    u9Var.a();
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

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                y.S((y) this.b, c2Var);
                break;
            case 2:
                ((org.telegram.ui.ActionBar.o5) this.b).run();
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
                ((zr) this.b).run();
                break;
            case 8:
                ((p2) this.b).run();
                break;
            case 17:
                ((fg) this.b).a.U0.r();
                break;
            case 19:
                ((org.telegram.ui.wh) this.b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((un) this.b).b.dismiss();
                break;
            default:
                ((xm) this.b).a.E.r();
                break;
        }
    }

    @Override // ai.fc
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        zn znVar = (zn) ((org.telegram.ui.Cells.l6) this.b).T;
        ImageReceiver imageReceiver = znVar.a;
        gcVar.c = imageReceiver;
        gcVar.l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = znVar.G;
        gcVar.m = l6Var;
        boolean z10 = l6Var.w;
        zn znVar2 = znVar.K.e;
        gcVar.a = znVar2;
        gcVar.k = znVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.i = AndroidUtilities.displaySize.y;
        gcVar.g = (View) znVar.getParent();
        return true;
    }

    @Override // t0.f
    public boolean h(t0.j jVar, int i10, Bundle bundle) {
        lg lgVar = (lg) this.b;
        ChatActivityEnterView chatActivityEnterView = lgVar.d;
        int i11 = 1;
        if (chatActivityEnterView.l5) {
            return true;
        }
        int i12 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                jVar.a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.a;
        if (!iVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            lgVar.m(iVar.c(), iVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            c5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new mf(i11, lgVar, jVar), chatActivityEnterView.V3);
            return true;
        }
        lgVar.o(jVar, true, 0, 0);
        return true;
    }

    @Override // le.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // vh.l
    public void j(vh.h hVar, float f7, float f10) {
        ((du) this.b).c(hVar, f7, f10);
    }

    @Override // le.f
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        lq lqVar = ((mq) this.b).a;
        if (i10 == 1 || i10 == 2) {
            lqVar.l(i10 == 2);
        } else if (i10 == 3) {
            lqVar.y();
        }
    }

    @Override // org.telegram.ui.Components.rc0
    public void n(int i10) {
        w2 w2Var = (w2) this.b;
        if (i10 == 0) {
            w2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var = ((xr) this.b).a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && o1Var != null && o1Var.isShowing()) {
            o1Var.d(true);
        }
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
        rl rlVar = (rl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.e;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (rlVar.a == null || viVar.V || chatAttachAlertPhotoLayout.P == null) {
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
            photoEntry = new MediaController.PhotoEntry(0, i13, 0L, rlVar.a.getAbsolutePath(), 0, true, i12, i11, 0L);
            photoEntry.duration = (int) (j3 / 1000.0f);
            photoEntry.thumbPath = str;
            if (viVar.Q0 != 0) {
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
        photoEntry = new MediaController.PhotoEntry(0, i132, 0L, rlVar.a.getAbsolutePath(), 0, true, i122, i11, 0L);
        photoEntry.duration = (int) (j3 / 1000.0f);
        photoEntry.thumbPath = str;
        if (viVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            MediaController.CropState cropState2 = new MediaController.CropState();
            photoEntry.cropState = cropState2;
            cropState2.mirrored = true;
            cropState2.freeform = false;
            cropState2.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override // uh.a
    public void p(Canvas canvas, int i10) {
        ((sb) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(uc0 uc0Var, int i10) {
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

    @Override // le.f
    public /* synthetic */ void a() {
    }

    @Override // ai.fc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // le.f
    public /* synthetic */ void g(boolean z10) {
    }

    @Override // le.f
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
