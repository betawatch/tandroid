package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fi0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi0(ui0 ui0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ui0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                ui0 ui0Var = this.b;
                gi0 gi0Var = ui0Var.X;
                gi0Var.e(canvas);
                ArrayList arrayList = gi0Var.C;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    cz czVar = (cz) kf.k0.i(1, arrayList);
                    ImageReceiver imageReceiver = czVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (czVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                czVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                czVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (czVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(czVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    ui0Var.U.h(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!gi0Var.C.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                ui0 ui0Var2 = this.b;
                kf.t0 t0Var = ui0Var2.d;
                if (t0Var != null) {
                    t0Var.a(ui0Var2.B == 1.0f && ui0Var2.n != null);
                }
                if (ui0Var2.B <= 0.0f || ui0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    ui0Var2.r.reset();
                    float width = getWidth() / ui0Var2.f.getWidth();
                    ui0Var2.r.postScale(width, width);
                    ui0Var2.h.setLocalMatrix(ui0Var2.r);
                    ui0Var2.n.setAlpha((int) (ui0Var2.B * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ui0Var2.n);
                }
                super.dispatchDraw(canvas2);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.b.onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                ui0 ui0Var = this.b;
                if (!ui0Var.d0 || ui0Var.e0) {
                    ArrayList arrayList = ui0Var.K;
                    ni0 ni0Var = ui0Var.H;
                    if (ui0Var.C.getWidth() > 0) {
                        int[] iArr = {b.C(6.0f, ui0Var.T.getWidth() - ui0Var.T.l(), r2), 0};
                        ui0Var.T.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        ui0Var.U.setScaleX(ui0Var.T.getScaleX());
                        ui0Var.U.setScaleY(ui0Var.T.getScaleY());
                        int[] iArr2 = ui0Var.l0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (ni0Var.getMeasuredHeight() - ui0Var.U.getHeight()) + (ui0Var.b0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + ui0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = ui0Var.W;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (ui0Var.D.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ui0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (ui0Var.T.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - ui0Var.T.getHeight();
                        }
                        ui0Var.U.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - ui0Var.U.l())));
                        ui0Var.U.setY(iArr[1]);
                        if (ui0Var.j0) {
                            iArr[0] = iArr[0] - (ui0Var.V - ui0Var.T.l());
                        }
                        ni0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ni0Var.getMeasuredWidth());
                        if (ui0Var.d0) {
                            b.p(ni0Var.animate().translationY(((ui0Var.U.getHeight() + iArr[1]) - ni0Var.getMeasuredHeight()) - ni0Var.getTop()), wh.n.V, 250L);
                        } else {
                            ni0Var.setY((ui0Var.U.getHeight() + iArr[1]) - ni0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ui0Var.W;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ui0Var.W.getMeasuredWidth());
                            ui0Var.W.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : ui0Var.U.getHeight()));
                        }
                        FrameLayout frameLayout = ui0Var.a0;
                        if (frameLayout != null) {
                            frameLayout.setX(kf.k0.c(6.0f, (ui0Var.U.l() + iArr[0]) - ui0Var.a0.getMeasuredWidth(), 0));
                            RectF rectF = ui0Var.i0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ui0Var.a0;
                                float max = Math.max(ui0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                ui0Var.Z = max;
                                frameLayout2.setY(max);
                                ii0 ii0Var = ui0Var.b0;
                                if (ii0Var != null) {
                                    ii0Var.setY(Math.max(ui0Var.e.b, (ui0Var.i0.top - AndroidUtilities.dp(24.0f)) - ui0Var.b0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (ui0Var.U.getHeight() + iArr[1]) - ni0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ui0Var.a0;
                                float max2 = Math.max(ui0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ui0Var.Z = max2;
                                frameLayout3.setY(max2);
                                ii0 ii0Var2 = ui0Var.b0;
                                if (ii0Var2 != null) {
                                    ii0Var2.setY(Math.max(0.0f, (height - ii0Var2.getMeasuredHeight()) - ui0Var.Z));
                                }
                            }
                        }
                    }
                    ui0Var.d0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ui0 ui0Var = this.b;
                tg.c.c(ui0Var.g0, ui0Var.C);
                ViewGroup viewGroup = ui0Var.W;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
