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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ki0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki0(zi0 zi0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = zi0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                zi0 zi0Var = this.b;
                li0 li0Var = zi0Var.a0;
                li0Var.e(canvas);
                ArrayList arrayList = li0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    fz fzVar = (fz) hg.c.g(1, arrayList);
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
                    zi0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!li0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                zi0 zi0Var2 = this.b;
                ib0 ib0Var = zi0Var2.d;
                if (ib0Var != null) {
                    ib0Var.a(zi0Var2.E == 1.0f && zi0Var2.n != null);
                }
                if (zi0Var2.E <= 0.0f || zi0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    zi0Var2.r.reset();
                    float width = getWidth() / zi0Var2.f.getWidth();
                    zi0Var2.r.postScale(width, width);
                    zi0Var2.h.setLocalMatrix(zi0Var2.r);
                    zi0Var2.n.setAlpha((int) (zi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), zi0Var2.n);
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
                zi0 zi0Var = this.b;
                if (!zi0Var.g0 || zi0Var.h0) {
                    ArrayList arrayList = zi0Var.N;
                    si0 si0Var = zi0Var.K;
                    if (zi0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.bi.D(6.0f, zi0Var.W.getWidth() - zi0Var.W.l(), r2), 0};
                        zi0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        zi0Var.X.setScaleX(zi0Var.W.getScaleX());
                        zi0Var.X.setScaleY(zi0Var.W.getScaleY());
                        int[] iArr2 = zi0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (si0Var.getMeasuredHeight() - zi0Var.X.getHeight()) + (zi0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + zi0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = zi0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (zi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - zi0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (zi0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - zi0Var.W.getHeight();
                        }
                        zi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - zi0Var.X.l())));
                        zi0Var.X.setY(iArr[1]);
                        if (zi0Var.m0) {
                            iArr[0] = iArr[0] - (zi0Var.Y - zi0Var.W.l());
                        }
                        si0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - si0Var.getMeasuredWidth());
                        if (zi0Var.g0) {
                            org.telegram.messenger.bi.r(si0Var.animate().translationY(((zi0Var.X.getHeight() + iArr[1]) - si0Var.getMeasuredHeight()) - si0Var.getTop()), ji.n.V, 250L);
                        } else {
                            si0Var.setY((zi0Var.X.getHeight() + iArr[1]) - si0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = zi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - zi0Var.Z.getMeasuredWidth());
                            zi0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : zi0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = zi0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.q.b(6.0f, (zi0Var.X.l() + iArr[0]) - zi0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = zi0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = zi0Var.d0;
                                float max = Math.max(zi0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                zi0Var.c0 = max;
                                frameLayout2.setY(max);
                                ni0 ni0Var = zi0Var.e0;
                                if (ni0Var != null) {
                                    ni0Var.setY(Math.max(zi0Var.e.b, (zi0Var.l0.top - AndroidUtilities.dp(24.0f)) - zi0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (zi0Var.X.getHeight() + iArr[1]) - si0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = zi0Var.d0;
                                float max2 = Math.max(zi0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                zi0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                ni0 ni0Var2 = zi0Var.e0;
                                if (ni0Var2 != null) {
                                    ni0Var2.setY(Math.max(0.0f, (height - ni0Var2.getMeasuredHeight()) - zi0Var.c0));
                                }
                            }
                        }
                    }
                    zi0Var.g0 = true;
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
                zi0 zi0Var = this.b;
                gh.d.c(zi0Var.j0, zi0Var.F);
                ViewGroup viewGroup = zi0Var.Z;
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
