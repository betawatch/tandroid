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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hi0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi0(wi0 wi0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = wi0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                wi0 wi0Var = this.b;
                ii0 ii0Var = wi0Var.a0;
                ii0Var.e(canvas);
                ArrayList arrayList = ii0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    cz czVar = (cz) hg.c.h(1, arrayList);
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
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    wi0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!ii0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                wi0 wi0Var2 = this.b;
                fb0 fb0Var = wi0Var2.d;
                if (fb0Var != null) {
                    fb0Var.a(wi0Var2.E == 1.0f && wi0Var2.n != null);
                }
                if (wi0Var2.E <= 0.0f || wi0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    wi0Var2.r.reset();
                    float width = getWidth() / wi0Var2.f.getWidth();
                    wi0Var2.r.postScale(width, width);
                    wi0Var2.h.setLocalMatrix(wi0Var2.r);
                    wi0Var2.n.setAlpha((int) (wi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), wi0Var2.n);
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
                wi0 wi0Var = this.b;
                if (!wi0Var.g0 || wi0Var.h0) {
                    ArrayList arrayList = wi0Var.N;
                    pi0 pi0Var = wi0Var.K;
                    if (wi0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.ul.D(6.0f, wi0Var.W.getWidth() - wi0Var.W.l(), r2), 0};
                        wi0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        wi0Var.X.setScaleX(wi0Var.W.getScaleX());
                        wi0Var.X.setScaleY(wi0Var.W.getScaleY());
                        int[] iArr2 = wi0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (pi0Var.getMeasuredHeight() - wi0Var.X.getHeight()) + (wi0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + wi0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = wi0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (wi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - wi0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (wi0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - wi0Var.W.getHeight();
                        }
                        wi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - wi0Var.X.l())));
                        wi0Var.X.setY(iArr[1]);
                        if (wi0Var.m0) {
                            iArr[0] = iArr[0] - (wi0Var.Y - wi0Var.W.l());
                        }
                        pi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - pi0Var.getMeasuredWidth());
                        if (wi0Var.g0) {
                            org.telegram.messenger.ul.r(pi0Var.animate().translationY(((wi0Var.X.getHeight() + iArr[1]) - pi0Var.getMeasuredHeight()) - pi0Var.getTop()), ji.n.V, 250L);
                        } else {
                            pi0Var.setY((wi0Var.X.getHeight() + iArr[1]) - pi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = wi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - wi0Var.Z.getMeasuredWidth());
                            wi0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : wi0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = wi0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(hg.c.f(6.0f, (wi0Var.X.l() + iArr[0]) - wi0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = wi0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = wi0Var.d0;
                                float max = Math.max(wi0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                wi0Var.c0 = max;
                                frameLayout2.setY(max);
                                ki0 ki0Var = wi0Var.e0;
                                if (ki0Var != null) {
                                    ki0Var.setY(Math.max(wi0Var.e.b, (wi0Var.l0.top - AndroidUtilities.dp(24.0f)) - wi0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (wi0Var.X.getHeight() + iArr[1]) - pi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = wi0Var.d0;
                                float max2 = Math.max(wi0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                wi0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                ki0 ki0Var2 = wi0Var.e0;
                                if (ki0Var2 != null) {
                                    ki0Var2.setY(Math.max(0.0f, (height - ki0Var2.getMeasuredHeight()) - wi0Var.c0));
                                }
                            }
                        }
                    }
                    wi0Var.g0 = true;
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
                wi0 wi0Var = this.b;
                gh.d.c(wi0Var.j0, wi0Var.F);
                ViewGroup viewGroup = wi0Var.Z;
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
