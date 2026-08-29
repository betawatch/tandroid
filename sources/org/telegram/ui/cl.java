package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cl extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ int I0;
    public final Object J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl(Object obj, Context context, int i10) {
        super(context);
        this.I0 = i10;
        this.J0 = obj;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.I0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.J0;
                if (atomicReference != null && (h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get()) != null) {
                    h5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public void onAttachedToWindow() {
        switch (this.I0) {
            case 2:
                super.onAttachedToWindow();
                ((xo0) this.J0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public void onDetachedFromWindow() {
        switch (this.I0) {
            case 2:
                super.onDetachedFromWindow();
                ((xo0) this.J0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.I0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.J0).V4();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.I0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.J0;
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
    public void setTranslationY(float f9) {
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.I0) {
            case 0:
                super.setTranslationY(f9);
                tn tnVar = (tn) this.J0;
                if (this == tnVar.z2[0] && tnVar.D2[1] != null) {
                    if (tnVar.K4 && f9 < 0.0f) {
                        tnVar.v2.setTranslationY(f9 / 2.0f);
                        break;
                    } else {
                        tnVar.v2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.J0;
                if (atomicReference != null && (h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get()) != null) {
                    h5Var.setTranslationY(f9);
                }
                super.setTranslationY(f9);
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(Context context, AtomicReference atomicReference) {
        super(context);
        this.I0 = 1;
        this.J0 = atomicReference;
    }
}
