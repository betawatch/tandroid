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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class di0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ si0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di0(si0 si0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = si0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                si0 si0Var = this.b;
                ei0 ei0Var = si0Var.X;
                ei0Var.e(canvas);
                ArrayList arrayList = ei0Var.C;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    az azVar = (az) kh.a2.i(1, arrayList);
                    ImageReceiver imageReceiver = azVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (azVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                azVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                azVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (azVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(azVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    si0Var.U.h(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!ei0Var.C.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                si0 si0Var2 = this.b;
                lf.s0 s0Var = si0Var2.d;
                if (s0Var != null) {
                    s0Var.a(si0Var2.B == 1.0f && si0Var2.n != null);
                }
                if (si0Var2.B <= 0.0f || si0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    si0Var2.r.reset();
                    float width = getWidth() / si0Var2.f.getWidth();
                    si0Var2.r.postScale(width, width);
                    si0Var2.h.setLocalMatrix(si0Var2.r);
                    si0Var2.n.setAlpha((int) (si0Var2.B * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), si0Var2.n);
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
                si0 si0Var = this.b;
                if (!si0Var.d0 || si0Var.e0) {
                    ArrayList arrayList = si0Var.K;
                    li0 li0Var = si0Var.H;
                    if (si0Var.C.getWidth() > 0) {
                        int[] iArr = {b.C(6.0f, si0Var.T.getWidth() - si0Var.T.l(), r2), 0};
                        si0Var.T.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        si0Var.U.setScaleX(si0Var.T.getScaleX());
                        si0Var.U.setScaleY(si0Var.T.getScaleY());
                        int[] iArr2 = si0Var.l0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (li0Var.getMeasuredHeight() - si0Var.U.getHeight()) + (si0Var.b0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + si0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = si0Var.W;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (si0Var.D.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - si0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (si0Var.T.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - si0Var.T.getHeight();
                        }
                        si0Var.U.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - si0Var.U.l())));
                        si0Var.U.setY(iArr[1]);
                        if (si0Var.j0) {
                            iArr[0] = iArr[0] - (si0Var.V - si0Var.T.l());
                        }
                        li0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - li0Var.getMeasuredWidth());
                        if (si0Var.d0) {
                            b.p(li0Var.animate().translationY(((si0Var.U.getHeight() + iArr[1]) - li0Var.getMeasuredHeight()) - li0Var.getTop()), wh.n.V, 250L);
                        } else {
                            li0Var.setY((si0Var.U.getHeight() + iArr[1]) - li0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = si0Var.W;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - si0Var.W.getMeasuredWidth());
                            si0Var.W.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : si0Var.U.getHeight()));
                        }
                        FrameLayout frameLayout = si0Var.a0;
                        if (frameLayout != null) {
                            frameLayout.setX(kh.a2.c(6.0f, (si0Var.U.l() + iArr[0]) - si0Var.a0.getMeasuredWidth(), 0));
                            RectF rectF = si0Var.i0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = si0Var.a0;
                                float max = Math.max(si0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                si0Var.Z = max;
                                frameLayout2.setY(max);
                                gi0 gi0Var = si0Var.b0;
                                if (gi0Var != null) {
                                    gi0Var.setY(Math.max(si0Var.e.b, (si0Var.i0.top - AndroidUtilities.dp(24.0f)) - si0Var.b0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (si0Var.U.getHeight() + iArr[1]) - li0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = si0Var.a0;
                                float max2 = Math.max(si0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                si0Var.Z = max2;
                                frameLayout3.setY(max2);
                                gi0 gi0Var2 = si0Var.b0;
                                if (gi0Var2 != null) {
                                    gi0Var2.setY(Math.max(0.0f, (height - gi0Var2.getMeasuredHeight()) - si0Var.Z));
                                }
                            }
                        }
                    }
                    si0Var.d0 = true;
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
                si0 si0Var = this.b;
                tg.c.c(si0Var.g0, si0Var.C);
                ViewGroup viewGroup = si0Var.W;
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
