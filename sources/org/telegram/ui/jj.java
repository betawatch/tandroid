package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jj implements org.telegram.ui.ActionBar.r0, uu0, org.telegram.ui.Components.q60, fm {
    public final /* synthetic */ sn a;

    public /* synthetic */ jj(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.ui.fm
    public void D0(int i10) {
        this.a.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.uu0
    public TextureView U() {
        return this.a.I8;
    }

    @Override // org.telegram.ui.fm
    public void b0(String str) {
        this.a.ia(str, false);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void d() {
        org.telegram.ui.Components.cn0.d(new we(this.a, 2));
    }

    @Override // org.telegram.ui.uu0
    public void m0(MessageObject messageObject) {
        sn snVar = this.a;
        snVar.x0.I0(true);
        snVar.x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            snVar.j1.removeView(snVar.F8);
            snVar.F8 = null;
            snVar.I8 = null;
            snVar.H8 = null;
        }
        for (int i10 = 0; i10 < snVar.x0.getChildCount(); i10++) {
            if (snVar.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) snVar.x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.uu0
    public void z(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.a.x0.getChildCount(); i10++) {
                if (this.a.x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.a.x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.e6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                pk pkVar = this.a.Ia;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                xu0 xu0Var = pkVar.d;
                                Bitmap bitmap = xu0Var == null ? null : xu0Var.b.getBitmap(width, height);
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
            sn snVar = this.a;
            mediaController.setTextureView(snVar.I8, snVar.H8, snVar.F8, true);
        }
        this.a.x0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void c() {
    }

    @Override // org.telegram.ui.fm
    public /* synthetic */ void J(boolean z10, boolean z11) {
    }
}
