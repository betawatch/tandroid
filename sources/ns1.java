// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ns1 extends ema {
    public final /* synthetic */ byte N0;
    public final Object O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns1(Context context, AtomicReference atomicReference) {
        super(context);
        this.N0 = (byte) 1;
        this.O0 = atomicReference;
    }

    @Override // ema
    public final boolean k(CharSequence charSequence) {
        ema emaVar;
        switch (this.N0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (emaVar = (ema) atomicReference.get()) != null) {
                    emaVar.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // ema, android.view.View
    public final void onAttachedToWindow() {
        switch (this.N0) {
            case 2:
                super.onAttachedToWindow();
                ((f48) this.O0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // ema, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.N0) {
            case 2:
                super.onDetachedFromWindow();
                ((f48) this.O0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // ema, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.N0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.O0).K3();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // ema, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.n != null) {
                        StringBuilder sb = new StringBuilder(getText());
                        if (profileActivity.n != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(profileActivity.n);
                        }
                        if (profileActivity.h != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(profileActivity.h);
                        }
                        accessibilityNodeInfo.setText(sb);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // ema
    public final void setTextColor(int i) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                profileActivity.J5 = i;
                super.setTextColor(vm2.f(profileActivity.G5, i, aob.v0(aob.G6, profileActivity.A0)));
                break;
            default:
                super.setTextColor(i);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        ema emaVar;
        byte b = this.N0;
        Object obj = this.O0;
        switch (b) {
            case 0:
                super.setTranslationY(f);
                zu1 zu1Var = (zu1) obj;
                if (this == zu1Var.S2[0] && zu1Var.W2[1] != null) {
                    if (zu1Var.c5 && f < 0.0f) {
                        zu1Var.O2.setTranslationY(f / 2.0f);
                        break;
                    } else {
                        zu1Var.O2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference != null && (emaVar = (ema) atomicReference.get()) != null) {
                    emaVar.setTranslationY(f);
                }
                super.setTranslationY(f);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ns1(byte b, Context context, Object obj) {
        super(context);
        this.N0 = b;
        this.O0 = obj;
    }
}
