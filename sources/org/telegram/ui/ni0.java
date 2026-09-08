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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ni0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni0(cj0 cj0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = cj0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                cj0 cj0Var = this.b;
                oi0 oi0Var = cj0Var.a0;
                oi0Var.e(canvas);
                ArrayList arrayList = oi0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    fz fzVar = (fz) i2.g.h(1, arrayList);
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
                    cj0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!oi0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                cj0 cj0Var2 = this.b;
                kb0 kb0Var = cj0Var2.d;
                if (kb0Var != null) {
                    kb0Var.a(cj0Var2.E == 1.0f && cj0Var2.n != null);
                }
                if (cj0Var2.E <= 0.0f || cj0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    cj0Var2.r.reset();
                    float width = getWidth() / cj0Var2.f.getWidth();
                    cj0Var2.r.postScale(width, width);
                    cj0Var2.h.setLocalMatrix(cj0Var2.r);
                    cj0Var2.n.setAlpha((int) (cj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), cj0Var2.n);
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
                cj0 cj0Var = this.b;
                if (!cj0Var.g0 || cj0Var.h0) {
                    ArrayList arrayList = cj0Var.N;
                    vi0 vi0Var = cj0Var.K;
                    if (cj0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.wl.D(6.0f, cj0Var.W.getWidth() - cj0Var.W.l(), r2), 0};
                        cj0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        cj0Var.X.setScaleX(cj0Var.W.getScaleX());
                        cj0Var.X.setScaleY(cj0Var.W.getScaleY());
                        int[] iArr2 = cj0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (vi0Var.getMeasuredHeight() - cj0Var.X.getHeight()) + (cj0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + cj0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = cj0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (cj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - cj0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (cj0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - cj0Var.W.getHeight();
                        }
                        cj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - cj0Var.X.l())));
                        cj0Var.X.setY(iArr[1]);
                        if (cj0Var.m0) {
                            iArr[0] = iArr[0] - (cj0Var.Y - cj0Var.W.l());
                        }
                        vi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - vi0Var.getMeasuredWidth());
                        if (cj0Var.g0) {
                            org.telegram.messenger.wl.q(vi0Var.animate().translationY(((cj0Var.X.getHeight() + iArr[1]) - vi0Var.getMeasuredHeight()) - vi0Var.getTop()), ki.o.V, 250L);
                        } else {
                            vi0Var.setY((cj0Var.X.getHeight() + iArr[1]) - vi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = cj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - cj0Var.Z.getMeasuredWidth());
                            cj0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : cj0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = cj0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(i2.g.f(6.0f, (cj0Var.X.l() + iArr[0]) - cj0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = cj0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = cj0Var.d0;
                                float max = Math.max(cj0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                cj0Var.c0 = max;
                                frameLayout2.setY(max);
                                qi0 qi0Var = cj0Var.e0;
                                if (qi0Var != null) {
                                    qi0Var.setY(Math.max(cj0Var.e.b, (cj0Var.l0.top - AndroidUtilities.dp(24.0f)) - cj0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (cj0Var.X.getHeight() + iArr[1]) - vi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = cj0Var.d0;
                                float max2 = Math.max(cj0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                cj0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                qi0 qi0Var2 = cj0Var.e0;
                                if (qi0Var2 != null) {
                                    qi0Var2.setY(Math.max(0.0f, (height - qi0Var2.getMeasuredHeight()) - cj0Var.c0));
                                }
                            }
                        }
                    }
                    cj0Var.g0 = true;
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
                cj0 cj0Var = this.b;
                hh.d.c(cj0Var.j0, cj0Var.F);
                ViewGroup viewGroup = cj0Var.Z;
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
