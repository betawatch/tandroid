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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p7 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int G1;
    public final /* synthetic */ Object H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7(int i3, Context context, Object obj) {
        super(context, null);
        this.G1 = i3;
        this.H1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void D(int i3, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                super.D(i3, z10);
                if (!z10) {
                    profileActivity.D5 = i3;
                    profileActivity.A5();
                }
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.J0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.D(i3, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean N(View view) {
        switch (this.G1) {
            case 3:
                return super.N(view) || view == ((org.telegram.ui.uw) this.H1).n0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.G1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.uw) this.H1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.H1;
                org.telegram.ui.iw iwVar = uwVar.Y;
                if (iwVar == null || iwVar.getAlpha() <= 0.0f || !uwVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void l(boolean z10) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.H1;
                uwVar.Y.r.getText().clear();
                if (z10 && uwVar.Y.r.isFocused()) {
                    org.telegram.messenger.g0.v1(uwVar.Y.r);
                }
                uwVar.Y.r.clearFocus();
                uwVar.Z.b(false);
                break;
            default:
                super.l(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.G1) {
            case 5:
                super.onLayout(z10, i3, i10, i11, i12);
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                RectF rectF = ProfileActivity.T6;
                profileActivity.L5(false);
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                org.telegram.ui.l0 l0Var = profileActivity.Y;
                Rect rect = profileActivity.L2;
                l0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.G1) {
            case 0:
                super.setAlpha(f10);
                ((z7) this.H1).b.invalidate();
                break;
            case 1:
                bi biVar = (bi) this.H1;
                ah ahVar = biVar.y2;
                TextView textView = biVar.e3;
                ah ahVar2 = biVar.s3;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    bi.I0(biVar);
                    biVar.b.invalidate();
                    if (ahVar != null && ahVar2 != null) {
                        if (ahVar.getTag() != null) {
                            if (biVar.t2 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (ahVar2.getAlpha() != f12) {
                                    ahVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            th thVar = biVar.t2;
                            if (thVar == null || thVar.M()) {
                                ahVar2.setAlpha(1.0f - f10);
                                ahVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            ahVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f10);
                ((se0) this.H1).b.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                break;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.H1).f0.invalidate();
                break;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.H1;
                secretMediaViewer.r.setAlpha(f10);
                secretMediaViewer.n.setAlpha(f10);
                break;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((vg.v0) this.H1).b.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.G1) {
            case 7:
                super.setTag(obj);
                vg.v0 v0Var = (vg.v0) this.H1;
                p7 p7Var = v0Var.F1;
                if (p7Var != null && p7Var.getTag() != null) {
                    org.telegram.messenger.g0.q3(v0Var, i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, v0Var.J0)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.d2 d2Var = v0Var.j1;
                    if (d2Var != null) {
                        org.telegram.messenger.g0.q3(v0Var, d2Var.isLightStatusBar());
                        break;
                    }
                }
                break;
            default:
                super.setTag(obj);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public void setTranslationY(float f10) {
        View view;
        switch (this.G1) {
            case 3:
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.uw) this.H1).fragmentView) != null) {
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
    public void setVisibility(int i3) {
        switch (this.G1) {
            case 1:
                super.setVisibility(i3);
                bi.I0((bi) this.H1);
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void u() {
        switch (this.G1) {
            case 3:
                super.u();
                ((org.telegram.ui.uw) this.H1).h.a(false, true);
                break;
            default:
                super.u();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean x() {
        switch (this.G1) {
            case 3:
                org.telegram.ui.pv pvVar = ((org.telegram.ui.uw) this.H1).G3;
                return pvVar != null && pvVar.c();
            default:
                return super.x();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void y(boolean z10) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.pv pvVar = ((org.telegram.ui.uw) this.H1).G3;
                if (pvVar != null && pvVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z10 ? 1.0f : 0.0f).start();
                }
                super.y(z10);
                break;
            default:
                super.y(z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7(org.telegram.messenger.cs csVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.G1 = i3;
        this.H1 = csVar;
    }
}
