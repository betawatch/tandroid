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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mi0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi0(bj0 bj0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = bj0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                bj0 bj0Var = this.b;
                ni0 ni0Var = bj0Var.a0;
                ni0Var.e(canvas);
                ArrayList arrayList = ni0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    fz fzVar = (fz) hg.c.h(1, arrayList);
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
                    bj0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!ni0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                bj0 bj0Var2 = this.b;
                kb0 kb0Var = bj0Var2.d;
                if (kb0Var != null) {
                    kb0Var.a(bj0Var2.E == 1.0f && bj0Var2.n != null);
                }
                if (bj0Var2.E <= 0.0f || bj0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    bj0Var2.r.reset();
                    float width = getWidth() / bj0Var2.f.getWidth();
                    bj0Var2.r.postScale(width, width);
                    bj0Var2.h.setLocalMatrix(bj0Var2.r);
                    bj0Var2.n.setAlpha((int) (bj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), bj0Var2.n);
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
                bj0 bj0Var = this.b;
                if (!bj0Var.g0 || bj0Var.h0) {
                    ArrayList arrayList = bj0Var.N;
                    ui0 ui0Var = bj0Var.K;
                    if (bj0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.vl.D(6.0f, bj0Var.W.getWidth() - bj0Var.W.l(), r2), 0};
                        bj0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        bj0Var.X.setScaleX(bj0Var.W.getScaleX());
                        bj0Var.X.setScaleY(bj0Var.W.getScaleY());
                        int[] iArr2 = bj0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (ui0Var.getMeasuredHeight() - bj0Var.X.getHeight()) + (bj0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + bj0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = bj0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (bj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - bj0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (bj0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - bj0Var.W.getHeight();
                        }
                        bj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - bj0Var.X.l())));
                        bj0Var.X.setY(iArr[1]);
                        if (bj0Var.m0) {
                            iArr[0] = iArr[0] - (bj0Var.Y - bj0Var.W.l());
                        }
                        ui0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ui0Var.getMeasuredWidth());
                        if (bj0Var.g0) {
                            org.telegram.messenger.vl.r(ui0Var.animate().translationY(((bj0Var.X.getHeight() + iArr[1]) - ui0Var.getMeasuredHeight()) - ui0Var.getTop()), ji.n.V, 250L);
                        } else {
                            ui0Var.setY((bj0Var.X.getHeight() + iArr[1]) - ui0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = bj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - bj0Var.Z.getMeasuredWidth());
                            bj0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : bj0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = bj0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(hg.c.f(6.0f, (bj0Var.X.l() + iArr[0]) - bj0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = bj0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = bj0Var.d0;
                                float max = Math.max(bj0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                bj0Var.c0 = max;
                                frameLayout2.setY(max);
                                pi0 pi0Var = bj0Var.e0;
                                if (pi0Var != null) {
                                    pi0Var.setY(Math.max(bj0Var.e.b, (bj0Var.l0.top - AndroidUtilities.dp(24.0f)) - bj0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (bj0Var.X.getHeight() + iArr[1]) - ui0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = bj0Var.d0;
                                float max2 = Math.max(bj0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                bj0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                pi0 pi0Var2 = bj0Var.e0;
                                if (pi0Var2 != null) {
                                    pi0Var2.setY(Math.max(0.0f, (height - pi0Var2.getMeasuredHeight()) - bj0Var.c0));
                                }
                            }
                        }
                    }
                    bj0Var.g0 = true;
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
                bj0 bj0Var = this.b;
                gh.d.c(bj0Var.j0, bj0Var.F);
                ViewGroup viewGroup = bj0Var.Z;
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
