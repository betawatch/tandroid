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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class jj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.d6, ru0, org.telegram.ui.Components.p60, em {
    public final /* synthetic */ qn a;

    public /* synthetic */ jj(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.em
    public void D0(int i10) {
        this.a.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int G(int i10) {
        return w(i10);
    }

    @Override // org.telegram.ui.ru0
    public TextureView U() {
        return this.a.w8;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override // org.telegram.ui.em
    public void b0(String str) {
        this.a.ia(str, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void d(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void f() {
        org.telegram.ui.Components.zm0.d(new we(this.a, 2));
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.v3;
    }

    @Override // org.telegram.ui.ru0
    public void m0(MessageObject messageObject) {
        qn qnVar = this.a;
        qnVar.x0.I0(true);
        qnVar.x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            qnVar.X0.removeView(qnVar.t8);
            qnVar.t8 = null;
            qnVar.w8 = null;
            qnVar.v8 = null;
        }
        for (int i10 = 0; i10 < qnVar.x0.getChildCount(); i10++) {
            if (qnVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) qnVar.x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint n(String str) {
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int r(int i10) {
        return w(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int w(int i10) {
        return this.a.getThemedColor(i10);
    }

    @Override // org.telegram.ui.ru0
    public void z(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.x0.getChildCount(); i10++) {
                if (this.a.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.a.x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.e6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                ok okVar = this.a.wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                uu0 uu0Var = okVar.d;
                                Bitmap bitmap = uu0Var == null ? null : uu0Var.b.getBitmap(width, height);
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            qn qnVar = this.a;
            mediaController.setTextureView(qnVar.w8, qnVar.v8, qnVar.t8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void e() {
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void B(int i10, int i11) {
    }

    @Override // org.telegram.ui.em
    public /* synthetic */ void J(boolean z10, boolean z11) {
    }
}
