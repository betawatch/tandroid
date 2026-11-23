package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pk extends org.telegram.ui.ActionBar.m5 {
    public final /* synthetic */ int N0;
    public final Object O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk(int i7, Context context, Object obj) {
        super(context);
        this.N0 = i7;
        this.O0 = obj;
    }

    @Override // org.telegram.ui.ActionBar.m5
    public boolean k(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m5 m5Var;
        switch (this.N0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (m5Var = (org.telegram.ui.ActionBar.m5) atomicReference.get()) != null) {
                    m5Var.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onAttachedToWindow() {
        switch (this.N0) {
            case 2:
                super.onAttachedToWindow();
                ((jm0) this.O0).s.a();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onDetachedFromWindow() {
        switch (this.N0) {
            case 2:
                super.onDetachedFromWindow();
                ((jm0) this.O0).s.b();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.N0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.O0).t5();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
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

    @Override // org.telegram.ui.ActionBar.m5
    public void setTextColor(int i7) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                profileActivity.J5 = i7;
                super.setTextColor(i0.a.f(profileActivity.G5, i7, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, profileActivity.A0)));
                break;
            default:
                super.setTextColor(i7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        org.telegram.ui.ActionBar.m5 m5Var;
        switch (this.N0) {
            case 0:
                super.setTranslationY(f10);
                bn bnVar = (bn) this.O0;
                if (this == bnVar.S2[0] && bnVar.W2[1] != null) {
                    if (bnVar.c5 && f10 < 0.0f) {
                        bnVar.O2.setTranslationY(f10 / 2.0f);
                        break;
                    } else {
                        bnVar.O2.setTranslationY(0.0f);
                        break;
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (m5Var = (org.telegram.ui.ActionBar.m5) atomicReference.get()) != null) {
                    m5Var.setTranslationY(f10);
                }
                super.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(Context context, AtomicReference atomicReference) {
        super(context);
        this.N0 = 1;
        this.O0 = atomicReference;
    }
}
