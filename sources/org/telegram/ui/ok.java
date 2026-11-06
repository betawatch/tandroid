package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.ActionBar.k5 {
    public final /* synthetic */ int M0;
    public final Object N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok(int i7, Context context, Object obj) {
        super(context);
        this.M0 = i7;
        this.N0 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.k5 k5Var;
        switch (this.M0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get()) != null) {
                    k5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public void onAttachedToWindow() {
        switch (this.M0) {
            case 2:
                super.onAttachedToWindow();
                ((fm0) this.N0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public void onDetachedFromWindow() {
        switch (this.M0) {
            case 2:
                super.onDetachedFromWindow();
                ((fm0) this.N0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.N0).q5();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
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

    @Override // org.telegram.ui.ActionBar.k5
    public void setTextColor(int i7) {
        switch (this.M0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.N0;
                profileActivity.D5 = i7;
                super.setTextColor(i0.a.f(profileActivity.A5, i7, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, profileActivity.z0)));
                break;
            default:
                super.setTextColor(i7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.k5 k5Var;
        switch (this.M0) {
            case 0:
                super.setTranslationY(f10);
                an anVar = (an) this.N0;
                if (this == anVar.R2[0] && anVar.V2[1] != null) {
                    if (anVar.a5 && f10 < 0.0f) {
                        anVar.N2.setTranslationY(f10 / 2.0f);
                        break;
                    } else {
                        anVar.N2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.N0;
                if (atomicReference != null && (k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get()) != null) {
                    k5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(Context context, AtomicReference atomicReference) {
        super(context);
        this.M0 = 1;
        this.N0 = atomicReference;
    }
}
