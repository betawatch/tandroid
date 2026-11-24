// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mt1 extends lka {
    public final /* synthetic */ byte N0;
    public final Object O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt1(Context context, AtomicReference atomicReference) {
        super(context);
        this.N0 = (byte) 1;
        this.O0 = atomicReference;
    }

    @Override // lka
    public final boolean k(CharSequence charSequence) {
        lka lkaVar;
        switch (this.N0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (lkaVar = (lka) atomicReference.get()) != null) {
                    lkaVar.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // lka, android.view.View
    public final void onAttachedToWindow() {
        switch (this.N0) {
            case 2:
                super.onAttachedToWindow();
                ((b38) this.O0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // lka, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.N0) {
            case 2:
                super.onDetachedFromWindow();
                ((b38) this.O0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // lka, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.N0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.O0).N3();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // lka, android.view.View
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

    @Override // lka
    public final void setTextColor(int i) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                profileActivity.O5 = i;
                super.setTextColor(on2.f(profileActivity.L5, i, cmb.v0(cmb.F6, profileActivity.A0)));
                break;
            default:
                super.setTextColor(i);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        lka lkaVar;
        byte b = this.N0;
        Object obj = this.O0;
        switch (b) {
            case 0:
                super.setTranslationY(f);
                yv1 yv1Var = (yv1) obj;
                if (this == yv1Var.S2[0] && yv1Var.W2[1] != null) {
                    if (yv1Var.c5 && f < 0.0f) {
                        yv1Var.O2.setTranslationY(f / 2.0f);
                        break;
                    } else {
                        yv1Var.O2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference != null && (lkaVar = (lka) atomicReference.get()) != null) {
                    lkaVar.setTranslationY(f);
                }
                super.setTranslationY(f);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt1(byte b, Context context, Object obj) {
        super(context);
        this.N0 = b;
        this.O0 = obj;
    }
}
