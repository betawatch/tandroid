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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class gi0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi0(vi0 vi0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = vi0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                vi0 vi0Var = this.b;
                hi0 hi0Var = vi0Var.a0;
                hi0Var.e(canvas);
                ArrayList arrayList = hi0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    bz bzVar = (bz) hg.c.g(1, arrayList);
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
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    vi0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!hi0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                vi0 vi0Var2 = this.b;
                eb0 eb0Var = vi0Var2.d;
                if (eb0Var != null) {
                    eb0Var.a(vi0Var2.E == 1.0f && vi0Var2.n != null);
                }
                if (vi0Var2.E <= 0.0f || vi0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    vi0Var2.r.reset();
                    float width = getWidth() / vi0Var2.f.getWidth();
                    vi0Var2.r.postScale(width, width);
                    vi0Var2.h.setLocalMatrix(vi0Var2.r);
                    vi0Var2.n.setAlpha((int) (vi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), vi0Var2.n);
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
                vi0 vi0Var = this.b;
                if (!vi0Var.g0 || vi0Var.h0) {
                    ArrayList arrayList = vi0Var.N;
                    oi0 oi0Var = vi0Var.K;
                    if (vi0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.ok.D(6.0f, vi0Var.W.getWidth() - vi0Var.W.l(), r2), 0};
                        vi0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        vi0Var.X.setScaleX(vi0Var.W.getScaleX());
                        vi0Var.X.setScaleY(vi0Var.W.getScaleY());
                        int[] iArr2 = vi0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (oi0Var.getMeasuredHeight() - vi0Var.X.getHeight()) + (vi0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + vi0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = vi0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (vi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - vi0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (vi0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - vi0Var.W.getHeight();
                        }
                        vi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - vi0Var.X.l())));
                        vi0Var.X.setY(iArr[1]);
                        if (vi0Var.m0) {
                            iArr[0] = iArr[0] - (vi0Var.Y - vi0Var.W.l());
                        }
                        oi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - oi0Var.getMeasuredWidth());
                        if (vi0Var.g0) {
                            org.telegram.messenger.ok.s(oi0Var.animate().translationY(((vi0Var.X.getHeight() + iArr[1]) - oi0Var.getMeasuredHeight()) - oi0Var.getTop()), ji.n.V, 250L);
                        } else {
                            oi0Var.setY((vi0Var.X.getHeight() + iArr[1]) - oi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = vi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - vi0Var.Z.getMeasuredWidth());
                            vi0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : vi0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = vi0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.f0.b(6.0f, (vi0Var.X.l() + iArr[0]) - vi0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = vi0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = vi0Var.d0;
                                float max = Math.max(vi0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                vi0Var.c0 = max;
                                frameLayout2.setY(max);
                                ji0 ji0Var = vi0Var.e0;
                                if (ji0Var != null) {
                                    ji0Var.setY(Math.max(vi0Var.e.b, (vi0Var.l0.top - AndroidUtilities.dp(24.0f)) - vi0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (vi0Var.X.getHeight() + iArr[1]) - oi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = vi0Var.d0;
                                float max2 = Math.max(vi0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                vi0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                ji0 ji0Var2 = vi0Var.e0;
                                if (ji0Var2 != null) {
                                    ji0Var2.setY(Math.max(0.0f, (height - ji0Var2.getMeasuredHeight()) - vi0Var.c0));
                                }
                            }
                        }
                    }
                    vi0Var.g0 = true;
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
                vi0 vi0Var = this.b;
                gh.d.c(vi0Var.j0, vi0Var.F);
                ViewGroup viewGroup = vi0Var.Z;
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
