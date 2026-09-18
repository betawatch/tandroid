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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class pj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.e6, lv0, mm {
    public final /* synthetic */ zn a;

    public /* synthetic */ pj(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.lv0
    public void E0(MessageObject messageObject) {
        zn znVar = this.a;
        znVar.x0.J0(true);
        znVar.x0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            znVar.X0.removeView(znVar.t8);
            znVar.t8 = null;
            znVar.w8 = null;
            znVar.v8 = null;
        }
        for (int i10 = 0; i10 < znVar.x0.getChildCount(); i10++) {
            if (znVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) znVar.x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int G0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.lv0
    public void H(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.x0.getChildCount(); i10++) {
                if (this.a.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.a.x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.d6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                uk ukVar = this.a.wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                ov0 ov0Var = ukVar.d;
                                Bitmap bitmap = ov0Var == null ? null : ov0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            zn znVar = this.a;
            mediaController.setTextureView(znVar.w8, znVar.v8, znVar.t8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.mm
    public void S0(int i10) {
        this.a.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        org.telegram.ui.Components.nm0.d(new af(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.lv0
    public TextureView j0() {
        return this.a.w8;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.mm
    public void s0(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.mm
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }
}
