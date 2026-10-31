package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kl extends org.telegram.ui.ActionBar.u5 {
    public final /* synthetic */ int M0;
    public final Object N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl(Object obj, Context context, int i10) {
        super(context);
        this.M0 = i10;
        this.N0 = obj;
    }

    @Override // org.telegram.ui.ActionBar.u5
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.u5 u5Var;
        switch (this.M0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (u5Var = (org.telegram.ui.ActionBar.u5) atomicReference.get()) != null) {
                    u5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // org.telegram.ui.ActionBar.u5, android.view.View
    public void onAttachedToWindow() {
        switch (this.M0) {
            case 2:
                super.onAttachedToWindow();
                ((rn0) this.N0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u5, android.view.View
    public void onDetachedFromWindow() {
        switch (this.M0) {
            case 2:
                super.onDetachedFromWindow();
                ((rn0) this.N0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u5, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.N0).p5();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u5, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.M0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.N0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.n != null) {
                        StringBuilder sb2 = new StringBuilder(getText());
                        if (profileActivity.n != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.n);
                        }
                        if (profileActivity.h != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(profileActivity.h);
                        }
                        accessibilityNodeInfo.setText(sb2);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u5
    public void setTextColor(int i10) {
        switch (this.M0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.N0;
                profileActivity.D5 = i10;
                super.setTextColor(i0.b.f(profileActivity.A5, i10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, profileActivity.z0)));
                break;
            default:
                super.setTextColor(i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        org.telegram.ui.ActionBar.u5 u5Var;
        switch (this.M0) {
            case 0:
                super.setTranslationY(f7);
                un unVar = (un) this.N0;
                if (this == unVar.R2[0] && unVar.V2[1] != null) {
                    if (unVar.a5 && f7 < 0.0f) {
                        unVar.N2.setTranslationY(f7 / 2.0f);
                        break;
                    } else {
                        unVar.N2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (u5Var = (org.telegram.ui.ActionBar.u5) atomicReference.get()) != null) {
                    u5Var.setTranslationY(f7);
                }
                super.setTranslationY(f7);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(Context context, AtomicReference atomicReference) {
        super(context);
        this.M0 = 1;
        this.N0 = atomicReference;
    }
}
