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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class oi0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi0(dj0 dj0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = dj0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                dj0 dj0Var = this.b;
                pi0 pi0Var = dj0Var.a0;
                pi0Var.e(canvas);
                ArrayList arrayList = pi0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    fz fzVar = (fz) hg.k0.g(1, arrayList);
                    ImageReceiver imageReceiver = fzVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (fzVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                fzVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                fzVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (fzVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(fzVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    dj0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!pi0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                dj0 dj0Var2 = this.b;
                mb0 mb0Var = dj0Var2.d;
                if (mb0Var != null) {
                    mb0Var.a(dj0Var2.E == 1.0f && dj0Var2.n != null);
                }
                if (dj0Var2.E <= 0.0f || dj0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    dj0Var2.r.reset();
                    float width = getWidth() / dj0Var2.f.getWidth();
                    dj0Var2.r.postScale(width, width);
                    dj0Var2.h.setLocalMatrix(dj0Var2.r);
                    dj0Var2.n.setAlpha((int) (dj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dj0Var2.n);
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                dj0 dj0Var = this.b;
                if (!dj0Var.g0 || dj0Var.h0) {
                    ArrayList arrayList = dj0Var.N;
                    wi0 wi0Var = dj0Var.K;
                    if (dj0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.rk.D(6.0f, dj0Var.W.getWidth() - dj0Var.W.l(), r2), 0};
                        dj0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        dj0Var.X.setScaleX(dj0Var.W.getScaleX());
                        dj0Var.X.setScaleY(dj0Var.W.getScaleY());
                        int[] iArr2 = dj0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (wi0Var.getMeasuredHeight() - dj0Var.X.getHeight()) + (dj0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + dj0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = dj0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (dj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - dj0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (dj0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - dj0Var.W.getHeight();
                        }
                        dj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - dj0Var.X.l())));
                        dj0Var.X.setY(iArr[1]);
                        if (dj0Var.m0) {
                            iArr[0] = iArr[0] - (dj0Var.Y - dj0Var.W.l());
                        }
                        wi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - wi0Var.getMeasuredWidth());
                        if (dj0Var.g0) {
                            org.telegram.messenger.rk.s(wi0Var.animate().translationY(((dj0Var.X.getHeight() + iArr[1]) - wi0Var.getMeasuredHeight()) - wi0Var.getTop()), ji.n.V, 250L);
                        } else {
                            wi0Var.setY((dj0Var.X.getHeight() + iArr[1]) - wi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = dj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - dj0Var.Z.getMeasuredWidth());
                            dj0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : dj0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = dj0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.l0.b(6.0f, (dj0Var.X.l() + iArr[0]) - dj0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = dj0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = dj0Var.d0;
                                float max = Math.max(dj0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                dj0Var.c0 = max;
                                frameLayout2.setY(max);
                                ri0 ri0Var = dj0Var.e0;
                                if (ri0Var != null) {
                                    ri0Var.setY(Math.max(dj0Var.e.b, (dj0Var.l0.top - AndroidUtilities.dp(24.0f)) - dj0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (dj0Var.X.getHeight() + iArr[1]) - wi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = dj0Var.d0;
                                float max2 = Math.max(dj0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                dj0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                ri0 ri0Var2 = dj0Var.e0;
                                if (ri0Var2 != null) {
                                    ri0Var2.setY(Math.max(0.0f, (height - ri0Var2.getMeasuredHeight()) - dj0Var.c0));
                                }
                            }
                        }
                    }
                    dj0Var.g0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                dj0 dj0Var = this.b;
                gh.d.c(dj0Var.j0, dj0Var.F);
                ViewGroup viewGroup = dj0Var.Z;
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
