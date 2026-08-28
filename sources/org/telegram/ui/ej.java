package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ej implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.b6, ju0, cm {
    public final /* synthetic */ qn a;

    public /* synthetic */ ej(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.ju0
    public TextureView G() {
        return this.a.s8;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.v3;
    }

    @Override // org.telegram.ui.cm
    public void L(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int N0(int i9) {
        return this.a.getThemedColor(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Paint O(String str) {
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    @Override // org.telegram.ui.cm
    public void P0(int i9) {
        this.a.j(i9, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public boolean a() {
        return org.telegram.ui.ActionBar.f6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void d() {
        org.telegram.ui.Components.ll0.d(new re(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void o(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int p0(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int q1(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.ju0
    public void x0(MessageObject messageObject) {
        qn qnVar = this.a;
        qnVar.t0.I0(true);
        qnVar.t0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            qnVar.T0.removeView(qnVar.p8);
            qnVar.p8 = null;
            qnVar.s8 = null;
            qnVar.r8 = null;
        }
        for (int i9 = 0; i9 < qnVar.t0.getChildCount(); i9++) {
            if (qnVar.t0.getChildAt(i9) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) qnVar.t0.getChildAt(i9);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ju0
    public void y(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i9 = 0; i9 < this.a.t0.getChildCount(); i9++) {
                if (this.a.t0.getChildAt(i9) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.a.t0.getChildAt(i9);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.x5 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.X) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                jk jkVar = this.a.sa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                mu0 mu0Var = jkVar.d;
                                Bitmap bitmap = mu0Var == null ? null : mu0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                        }
                    }
                }
            }
            this.a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            qn qnVar = this.a;
            mediaController.setTextureView(qnVar.s8, qnVar.r8, qnVar.p8, true);
        }
        this.a.t0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void c() {
    }

    @Override // org.telegram.ui.cm
    public /* synthetic */ void D(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ void c1(int i9, int i10) {
    }
}
