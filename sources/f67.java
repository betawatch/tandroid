// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f67 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q67 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f67(q67 q67Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = q67Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        byte b = this.a;
        q67 q67Var = this.b;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                g67 g67Var = q67Var.a0;
                g67Var.e(canvas);
                ArrayList arrayList = g67Var.G;
                float f = -1.0f;
                if (!arrayList.isEmpty()) {
                    sv3 sv3Var = (sv3) c00.g(1, arrayList);
                    ImageReceiver imageReceiver = sv3Var.r;
                    jn5 jn5Var = imageReceiver.g0;
                    if (jn5Var == null) {
                        jn5Var = imageReceiver.P;
                    }
                    if (jn5Var == null) {
                        jn5Var = imageReceiver.X;
                    }
                    if (jn5Var != null) {
                        String str = sv3Var.s;
                        if (str == null) {
                            TLRPC.Document document = jn5Var.i;
                            if (document != null) {
                                str = xb4.r("tgs", document);
                                sv3Var.s = str;
                            } else {
                                str = xb4.r("tgs", jn5Var.f);
                                sv3Var.s = str;
                            }
                        }
                        if (str != null) {
                            Float s = in5.z().s(sv3Var.s);
                            if (s == null) {
                                s = Float.valueOf(1.0f);
                            }
                            f = (s.floatValue() * 0.55f) + 0.15f + (s.floatValue() * 0.3f);
                        }
                    }
                }
                if (f != -2.0f) {
                    q67Var.X.h(f >= 0.0f && f < 1.0f);
                }
                if (!g67Var.G.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                if (q67Var.E <= 0.0f || q67Var.h == null) {
                    canvas2 = canvas;
                } else {
                    q67Var.n.reset();
                    float width = getWidth() / q67Var.e.getWidth();
                    q67Var.n.postScale(width, width);
                    q67Var.f.setLocalMatrix(q67Var.n);
                    q67Var.h.setAlpha((int) (q67Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), q67Var.h);
                }
                super.dispatchDraw(canvas2);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                q67 q67Var = this.b;
                if (!q67Var.g0 || q67Var.h0) {
                    ArrayList arrayList = q67Var.N;
                    m67 m67Var = q67Var.K;
                    if (q67Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        q67Var.b(iArr);
                        q67Var.X.setScaleX(q67Var.W.getScaleX());
                        q67Var.X.setScaleY(q67Var.W.getScaleY());
                        int[] iArr2 = q67Var.r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (m67Var.getMeasuredHeight() - q67Var.X.getHeight()) + (q67Var.e0 != null ? hl.L(320.0f) : 0);
                        int L = hl.L(8.0f) + q67Var.d.b;
                        int L2 = hl.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = q67Var.Z;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (q67Var.G.getMeasuredHeight() - hl.L(8.0f)) - q67Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (q67Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - q67Var.W.getHeight();
                        }
                        q67Var.X.setX(hl.L(6.0f) + (iArr[0] - (r11.getWidth() - q67Var.X.l())));
                        q67Var.X.setY(iArr[1]);
                        if (q67Var.p0) {
                            iArr[0] = iArr[0] - (q67Var.Y - q67Var.W.l());
                        }
                        m67Var.setX((hl.L(7.0f) + iArr[0]) - m67Var.getMeasuredWidth());
                        if (q67Var.g0) {
                            ik8.t(m67Var.animate().translationY(((q67Var.X.getHeight() + iArr[1]) - m67Var.getMeasuredHeight()) - m67Var.getTop()), bb2.V, 250L);
                        } else {
                            m67Var.setY((q67Var.X.getHeight() + iArr[1]) - m67Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = q67Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((hl.L(7.0f) + iArr[0]) - q67Var.Z.getMeasuredWidth());
                            q67Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -hl.L(6.0f) : q67Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = q67Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(c00.d(6.0f, (q67Var.X.l() + iArr[0]) - q67Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = q67Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = q67Var.d0;
                                float max = Math.max(q67Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                q67Var.c0 = max;
                                frameLayout2.setY(max);
                                i67 i67Var = q67Var.e0;
                                if (i67Var != null) {
                                    i67Var.setY(Math.max(q67Var.d.b, (q67Var.l0.top - hl.L(24.0f)) - q67Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (q67Var.X.getHeight() + iArr[1]) - m67Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = q67Var.d0;
                                float max2 = Math.max(q67Var.d.b, height - frameLayout3.getMeasuredHeight()) + hl.L(24.0f);
                                q67Var.c0 = max2;
                                frameLayout3.setY(max2);
                                i67 i67Var2 = q67Var.e0;
                                if (i67Var2 != null) {
                                    i67Var2.setY(Math.max(0.0f, (height - i67Var2.getMeasuredHeight()) - q67Var.c0));
                                }
                            }
                        }
                    }
                    q67Var.g0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i, i2, i3, i4);
                q67 q67Var = this.b;
                uk0.c(q67Var.j0, q67Var.F);
                ViewGroup viewGroup = q67Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }
}
