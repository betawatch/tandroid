package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class il extends org.telegram.ui.ActionBar.l5 {
    public final /* synthetic */ int J0;
    public final Object K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il(Object obj, Context context, int i10) {
        super(context);
        this.J0 = i10;
        this.K0 = obj;
    }

    @Override // org.telegram.ui.ActionBar.l5
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.l5 l5Var;
        switch (this.J0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.K0;
                if (atomicReference != null && (l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get()) != null) {
                    l5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // org.telegram.ui.ActionBar.l5, android.view.View
    public void onAttachedToWindow() {
        switch (this.J0) {
            case 2:
                super.onAttachedToWindow();
                ((hp0) this.K0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l5, android.view.View
    public void onDetachedFromWindow() {
        switch (this.J0) {
            case 2:
                super.onDetachedFromWindow();
                ((hp0) this.K0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l5, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.J0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.K0).V4();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l5, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.J0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.K0;
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

    @Override // android.view.View
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.l5 l5Var;
        switch (this.J0) {
            case 0:
                super.setTranslationY(f10);
                xn xnVar = (xn) this.K0;
                if (this == xnVar.A2[0] && xnVar.E2[1] != null) {
                    if (xnVar.L4 && f10 < 0.0f) {
                        xnVar.w2.setTranslationY(f10 / 2.0f);
                        break;
                    } else {
                        xnVar.w2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.K0;
                if (atomicReference != null && (l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get()) != null) {
                    l5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(Context context, AtomicReference atomicReference) {
        super(context);
        this.J0 = 1;
        this.K0 = atomicReference;
    }
}
