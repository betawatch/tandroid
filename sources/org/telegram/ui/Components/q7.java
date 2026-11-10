package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q7 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ int F1;
    public final /* synthetic */ Object G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(int i7, Context context, Object obj) {
        super(context, null);
        this.F1 = i7;
        this.G1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.l
    public void A(boolean z9) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.vv vvVar = ((org.telegram.ui.zw) this.G1).G3;
                if (vvVar != null && vvVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z9 ? 1.0f : 0.0f).start();
                }
                super.A(z9);
                break;
            default:
                super.A(z9);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void G(int i7, boolean z9) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.F1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                super.G(i7, z9);
                if (!z9) {
                    profileActivity.E5 = i7;
                    profileActivity.D5();
                }
                if (!z9 && (imageView2 = profileActivity.X0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.G(i7, z9);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public boolean P(View view) {
        switch (this.F1) {
            case 3:
                return super.P(view) || view == ((org.telegram.ui.zw) this.G1).m0;
            default:
                return super.P(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void Q(View[] viewArr, boolean[] zArr) {
        switch (this.F1) {
            case 3:
                super.Q(viewArr, zArr);
                ((org.telegram.ui.zw) this.G1).h.a(true, true);
                break;
            default:
                super.Q(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.G1;
                org.telegram.ui.ow owVar = zwVar.X;
                if (owVar == null || owVar.getAlpha() <= 0.0f || !zwVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.l
    public void n(boolean z9) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.G1;
                zwVar.X.r.getText().clear();
                if (z9 && zwVar.X.r.isFocused()) {
                    org.telegram.messenger.g0.v1(zwVar.X.r);
                }
                zwVar.X.r.clearFocus();
                zwVar.Y.b(false);
                break;
            default:
                super.n(z9);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.F1) {
            case 5:
                super.onLayout(z9, i7, i10, i11, i12);
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                RectF rectF = ProfileActivity.V6;
                profileActivity.O5(false);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.F1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                org.telegram.ui.k0 k0Var = profileActivity.X;
                Rect rect = profileActivity.K2;
                k0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.F1) {
            case 0:
                super.setAlpha(f10);
                ((a8) this.G1).b.invalidate();
                break;
            case 1:
                ci ciVar = (ci) this.G1;
                ch chVar = ciVar.A2;
                TextView textView = ciVar.g3;
                ch chVar2 = ciVar.u3;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    ci.I0(ciVar);
                    ciVar.b.invalidate();
                    if (chVar != null && chVar2 != null) {
                        if (chVar.getTag() != null) {
                            if (ciVar.v2 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (chVar2.getAlpha() != f12) {
                                    chVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            uh uhVar = ciVar.v2;
                            if (uhVar == null || uhVar.M()) {
                                chVar2.setAlpha(1.0f - f10);
                                chVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            chVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f10);
                ((qe0) this.G1).b.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                break;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.G1).e0.invalidate();
                break;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.G1;
                secretMediaViewer.r.setAlpha(f10);
                secretMediaViewer.n.setAlpha(f10);
                break;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((ug.w0) this.G1).b.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.F1) {
            case 7:
                super.setTag(obj);
                ug.w0 w0Var = (ug.w0) this.G1;
                q7 q7Var = w0Var.H1;
                if (q7Var != null && q7Var.getTag() != null) {
                    org.telegram.messenger.g0.q3(w0Var, i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, w0Var.I0)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.f2 f2Var = w0Var.l1;
                    if (f2Var != null) {
                        org.telegram.messenger.g0.q3(w0Var, f2Var.isLightStatusBar());
                        break;
                    }
                }
                break;
            default:
                super.setTag(obj);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.View
    public void setTranslationY(float f10) {
        View view;
        switch (this.F1) {
            case 3:
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.zw) this.G1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.F1) {
            case 1:
                super.setVisibility(i7);
                ci.I0((ci) this.G1);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void w() {
        switch (this.F1) {
            case 3:
                super.w();
                ((org.telegram.ui.zw) this.G1).h.a(false, true);
                break;
            default:
                super.w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public boolean z() {
        switch (this.F1) {
            case 3:
                org.telegram.ui.vv vvVar = ((org.telegram.ui.zw) this.G1).G3;
                return vvVar != null && vvVar.c();
            default:
                return super.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(org.telegram.messenger.ls lsVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.F1 = i7;
        this.G1 = lsVar;
    }
}
