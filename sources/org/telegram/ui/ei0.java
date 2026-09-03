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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ei0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei0(ti0 ti0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ti0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                ti0 ti0Var = this.b;
                fi0 fi0Var = ti0Var.X;
                fi0Var.e(canvas);
                ArrayList arrayList = fi0Var.C;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    bz bzVar = (bz) l.d.i(1, arrayList);
                    ImageReceiver imageReceiver = bzVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (bzVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                bzVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                bzVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (bzVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(bzVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    ti0Var.U.h(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!fi0Var.C.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                ti0 ti0Var2 = this.b;
                lf.s0 s0Var = ti0Var2.d;
                if (s0Var != null) {
                    s0Var.a(ti0Var2.B == 1.0f && ti0Var2.n != null);
                }
                if (ti0Var2.B <= 0.0f || ti0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    ti0Var2.r.reset();
                    float width = getWidth() / ti0Var2.f.getWidth();
                    ti0Var2.r.postScale(width, width);
                    ti0Var2.h.setLocalMatrix(ti0Var2.r);
                    ti0Var2.n.setAlpha((int) (ti0Var2.B * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ti0Var2.n);
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
                ti0 ti0Var = this.b;
                if (!ti0Var.d0 || ti0Var.e0) {
                    ArrayList arrayList = ti0Var.K;
                    mi0 mi0Var = ti0Var.H;
                    if (ti0Var.C.getWidth() > 0) {
                        int[] iArr = {b.C(6.0f, ti0Var.T.getWidth() - ti0Var.T.l(), r2), 0};
                        ti0Var.T.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        ti0Var.U.setScaleX(ti0Var.T.getScaleX());
                        ti0Var.U.setScaleY(ti0Var.T.getScaleY());
                        int[] iArr2 = ti0Var.l0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (mi0Var.getMeasuredHeight() - ti0Var.U.getHeight()) + (ti0Var.b0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + ti0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = ti0Var.W;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (ti0Var.D.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ti0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (ti0Var.T.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - ti0Var.T.getHeight();
                        }
                        ti0Var.U.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - ti0Var.U.l())));
                        ti0Var.U.setY(iArr[1]);
                        if (ti0Var.j0) {
                            iArr[0] = iArr[0] - (ti0Var.V - ti0Var.T.l());
                        }
                        mi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - mi0Var.getMeasuredWidth());
                        if (ti0Var.d0) {
                            b.p(mi0Var.animate().translationY(((ti0Var.U.getHeight() + iArr[1]) - mi0Var.getMeasuredHeight()) - mi0Var.getTop()), xh.n.V, 250L);
                        } else {
                            mi0Var.setY((ti0Var.U.getHeight() + iArr[1]) - mi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ti0Var.W;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ti0Var.W.getMeasuredWidth());
                            ti0Var.W.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : ti0Var.U.getHeight()));
                        }
                        FrameLayout frameLayout = ti0Var.a0;
                        if (frameLayout != null) {
                            frameLayout.setX(l.d.c(6.0f, (ti0Var.U.l() + iArr[0]) - ti0Var.a0.getMeasuredWidth(), 0));
                            RectF rectF = ti0Var.i0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ti0Var.a0;
                                float max = Math.max(ti0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                ti0Var.Z = max;
                                frameLayout2.setY(max);
                                hi0 hi0Var = ti0Var.b0;
                                if (hi0Var != null) {
                                    hi0Var.setY(Math.max(ti0Var.e.b, (ti0Var.i0.top - AndroidUtilities.dp(24.0f)) - ti0Var.b0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (ti0Var.U.getHeight() + iArr[1]) - mi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ti0Var.a0;
                                float max2 = Math.max(ti0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ti0Var.Z = max2;
                                frameLayout3.setY(max2);
                                hi0 hi0Var2 = ti0Var.b0;
                                if (hi0Var2 != null) {
                                    hi0Var2.setY(Math.max(0.0f, (height - hi0Var2.getMeasuredHeight()) - ti0Var.Z));
                                }
                            }
                        }
                    }
                    ti0Var.d0 = true;
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
                ti0 ti0Var = this.b;
                ug.c.c(ti0Var.g0, ti0Var.C);
                ViewGroup viewGroup = ti0Var.W;
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
