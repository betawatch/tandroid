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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class nj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.d6, dv0, org.telegram.ui.Components.f60, km {
    public final /* synthetic */ wn a;

    public /* synthetic */ nj(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.dv0
    public void E0(MessageObject messageObject) {
        wn wnVar = this.a;
        wnVar.x0.I0(true);
        wnVar.x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            wnVar.X0.removeView(wnVar.t8);
            wnVar.t8 = null;
            wnVar.w8 = null;
            wnVar.v8 = null;
        }
        for (int i10 = 0; i10 < wnVar.x0.getChildCount(); i10++) {
            if (wnVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) wnVar.x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.h6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int G0(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.dv0
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
                                sk skVar = this.a.wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                gv0 gv0Var = skVar.d;
                                Bitmap bitmap = gv0Var == null ? null : gv0Var.b.getBitmap(width, height);
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
            wn wnVar = this.a;
            mediaController.setTextureView(wnVar.w8, wnVar.v8, wnVar.t8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.km
    public void S0(int i10) {
        this.a.F(i10, 0, 0, 0, true, true);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
        org.telegram.ui.Components.mm0.d(new ze(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.dv0
    public TextureView j0() {
        return this.a.w8;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.km
    public void s0(String str) {
        this.a.da(str, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.v3;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void c() {
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }
}
