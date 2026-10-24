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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class bi0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi0(qi0 qi0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = qi0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                qi0 qi0Var = this.b;
                ci0 ci0Var = qi0Var.Z;
                ci0Var.e(canvas);
                ArrayList arrayList = ci0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    py pyVar = (py) i2.o1.i(1, arrayList);
                    ImageReceiver imageReceiver = pyVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (pyVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                pyVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                pyVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (pyVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(pyVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    qi0Var.W.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!ci0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                qi0 qi0Var2 = this.b;
                if (qi0Var2.y <= 0.0f || qi0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    qi0Var2.n.reset();
                    float width = getWidth() / qi0Var2.e.getWidth();
                    qi0Var2.n.postScale(width, width);
                    qi0Var2.f.setLocalMatrix(qi0Var2.n);
                    qi0Var2.h.setAlpha((int) (qi0Var2.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), qi0Var2.h);
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
                qi0 qi0Var = this.b;
                if (!qi0Var.f0 || qi0Var.g0) {
                    ArrayList arrayList = qi0Var.M;
                    ji0 ji0Var = qi0Var.J;
                    if (qi0Var.E.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.sl.D(6.0f, qi0Var.V.getWidth() - qi0Var.V.l(), r2), 0};
                        qi0Var.V.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        qi0Var.W.setScaleX(qi0Var.V.getScaleX());
                        qi0Var.W.setScaleY(qi0Var.V.getScaleY());
                        int[] iArr2 = qi0Var.n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (ji0Var.getMeasuredHeight() - qi0Var.W.getHeight()) + (qi0Var.d0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + qi0Var.d.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = qi0Var.Y;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (qi0Var.F.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - qi0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (qi0Var.V.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - qi0Var.V.getHeight();
                        }
                        qi0Var.W.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - qi0Var.W.l())));
                        qi0Var.W.setY(iArr[1]);
                        if (qi0Var.l0) {
                            iArr[0] = iArr[0] - (qi0Var.X - qi0Var.V.l());
                        }
                        ji0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ji0Var.getMeasuredWidth());
                        if (qi0Var.f0) {
                            org.telegram.messenger.sl.t(ji0Var.animate().translationY(((qi0Var.W.getHeight() + iArr[1]) - ji0Var.getMeasuredHeight()) - ji0Var.getTop()), li.m.V, 250L);
                        } else {
                            ji0Var.setY((qi0Var.W.getHeight() + iArr[1]) - ji0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = qi0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - qi0Var.Y.getMeasuredWidth());
                            qi0Var.Y.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : qi0Var.W.getHeight()));
                        }
                        FrameLayout frameLayout = qi0Var.c0;
                        if (frameLayout != null) {
                            frameLayout.setX(i2.o1.g(6.0f, (qi0Var.W.l() + iArr[0]) - qi0Var.c0.getMeasuredWidth(), 0));
                            RectF rectF = qi0Var.k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = qi0Var.c0;
                                float max = Math.max(qi0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                qi0Var.b0 = max;
                                frameLayout2.setY(max);
                                ei0 ei0Var = qi0Var.d0;
                                if (ei0Var != null) {
                                    ei0Var.setY(Math.max(qi0Var.d.b, (qi0Var.k0.top - AndroidUtilities.dp(24.0f)) - qi0Var.d0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (qi0Var.W.getHeight() + iArr[1]) - ji0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = qi0Var.c0;
                                float max2 = Math.max(qi0Var.d.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                qi0Var.b0 = max2;
                                frameLayout3.setY(max2);
                                ei0 ei0Var2 = qi0Var.d0;
                                if (ei0Var2 != null) {
                                    ei0Var2.setY(Math.max(0.0f, (height - ei0Var2.getMeasuredHeight()) - qi0Var.b0));
                                }
                            }
                        }
                    }
                    qi0Var.f0 = true;
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
                qi0 qi0Var = this.b;
                hh.d.c(qi0Var.i0, qi0Var.E);
                ViewGroup viewGroup = qi0Var.Y;
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
