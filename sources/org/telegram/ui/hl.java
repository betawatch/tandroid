package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class hl extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ int M0;
    public final Object N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl(Object obj, Context context, int i10) {
        super(context);
        this.M0 = i10;
        this.N0 = obj;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.i5 i5Var;
        switch (this.M0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (i5Var = (org.telegram.ui.ActionBar.i5) atomicReference.get()) != null) {
                    i5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // org.telegram.ui.ActionBar.i5, android.view.View
    public void onAttachedToWindow() {
        switch (this.M0) {
            case 2:
                super.onAttachedToWindow();
                ((up0) this.N0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5, android.view.View
    public void onDetachedFromWindow() {
        switch (this.M0) {
            case 2:
                super.onDetachedFromWindow();
                ((up0) this.N0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.N0).V4();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i5, android.view.View
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

    @Override // android.view.View
    public void setTranslationY(float f7) {
        org.telegram.ui.ActionBar.i5 i5Var;
        switch (this.M0) {
            case 0:
                super.setTranslationY(f7);
                yn ynVar = (yn) this.N0;
                if (this == ynVar.B2[0] && ynVar.F2[1] != null) {
                    if (ynVar.M4 && f7 < 0.0f) {
                        ynVar.x2.setTranslationY(f7 / 2.0f);
                        break;
                    } else {
                        ynVar.x2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (i5Var = (org.telegram.ui.ActionBar.i5) atomicReference.get()) != null) {
                    i5Var.setTranslationY(f7);
                }
                super.setTranslationY(f7);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(Context context, AtomicReference atomicReference) {
        super(context);
        this.M0 = 1;
        this.N0 = atomicReference;
    }
}
