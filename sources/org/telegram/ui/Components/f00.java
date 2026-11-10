package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ f00(FragmentContextView fragmentContextView, int i7) {
        this.a = i7;
        this.b = fragmentContextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                FragmentContextView fragmentContextView = this.b;
                AnimatorSet animatorSet = fragmentContextView.f;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fragmentContextView.f = null;
                    break;
                }
                break;
            case 1:
                FragmentContextView fragmentContextView2 = this.b;
                fragmentContextView2.u0.e();
                AnimatorSet animatorSet2 = fragmentContextView2.f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fragmentContextView2.setVisibility(8);
                    m00 m00Var = fragmentContextView2.p0;
                    if (m00Var != null) {
                        ((uo0) m00Var).b(false);
                    }
                    fragmentContextView2.f = null;
                    if (fragmentContextView2.x0) {
                        fragmentContextView2.e(false);
                    } else if (fragmentContextView2.w0) {
                        fragmentContextView2.a(false);
                    } else if (fragmentContextView2.y0) {
                        fragmentContextView2.g(false);
                    } else if (fragmentContextView2.z0) {
                        fragmentContextView2.c(false);
                    }
                    fragmentContextView2.x0 = false;
                    fragmentContextView2.w0 = false;
                    fragmentContextView2.y0 = false;
                    fragmentContextView2.z0 = false;
                    break;
                }
                break;
            case 2:
                FragmentContextView fragmentContextView3 = this.b;
                fragmentContextView3.u0.e();
                AnimatorSet animatorSet3 = fragmentContextView3.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m00 m00Var2 = fragmentContextView3.p0;
                    if (m00Var2 != null) {
                        ((uo0) m00Var2).b(false);
                    }
                    fragmentContextView3.f = null;
                    if (fragmentContextView3.x0) {
                        fragmentContextView3.e(false);
                    } else if (fragmentContextView3.w0) {
                        fragmentContextView3.a(false);
                    } else if (fragmentContextView3.y0) {
                        fragmentContextView3.g(false);
                    } else if (fragmentContextView3.z0) {
                        fragmentContextView3.c(false);
                    }
                    fragmentContextView3.x0 = false;
                    fragmentContextView3.w0 = false;
                    fragmentContextView3.y0 = false;
                    fragmentContextView3.z0 = false;
                    break;
                }
                break;
            case 3:
                FragmentContextView fragmentContextView4 = this.b;
                fragmentContextView4.u0.e();
                AnimatorSet animatorSet4 = fragmentContextView4.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    fragmentContextView4.setVisibility(8);
                    fragmentContextView4.f = null;
                    if (fragmentContextView4.x0) {
                        fragmentContextView4.e(false);
                    } else if (fragmentContextView4.w0) {
                        fragmentContextView4.a(false);
                    } else if (fragmentContextView4.y0) {
                        fragmentContextView4.g(false);
                    } else if (fragmentContextView4.z0) {
                        fragmentContextView4.c(false);
                    }
                    fragmentContextView4.x0 = false;
                    fragmentContextView4.w0 = false;
                    fragmentContextView4.y0 = false;
                    fragmentContextView4.z0 = false;
                    break;
                }
                break;
            case 4:
                FragmentContextView fragmentContextView5 = this.b;
                fragmentContextView5.u0.e();
                AnimatorSet animatorSet5 = fragmentContextView5.f;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    m00 m00Var3 = fragmentContextView5.p0;
                    if (m00Var3 != null) {
                        ((uo0) m00Var3).b(false);
                    }
                    fragmentContextView5.f = null;
                    if (fragmentContextView5.x0) {
                        fragmentContextView5.e(false);
                    } else if (fragmentContextView5.w0) {
                        fragmentContextView5.a(false);
                    } else if (fragmentContextView5.y0) {
                        fragmentContextView5.g(false);
                    } else if (fragmentContextView5.z0) {
                        fragmentContextView5.c(false);
                    }
                    fragmentContextView5.x0 = false;
                    fragmentContextView5.w0 = false;
                    fragmentContextView5.y0 = false;
                    fragmentContextView5.z0 = false;
                    break;
                }
                break;
            case 5:
                FragmentContextView fragmentContextView6 = this.b;
                fragmentContextView6.u0.e();
                AnimatorSet animatorSet6 = fragmentContextView6.f;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    fragmentContextView6.setVisibility(8);
                    fragmentContextView6.f = null;
                    if (fragmentContextView6.x0) {
                        fragmentContextView6.e(false);
                    } else if (fragmentContextView6.w0) {
                        fragmentContextView6.a(false);
                    } else if (fragmentContextView6.y0) {
                        fragmentContextView6.g(false);
                    } else if (fragmentContextView6.z0) {
                        fragmentContextView6.c(false);
                    }
                    fragmentContextView6.x0 = false;
                    fragmentContextView6.w0 = false;
                    fragmentContextView6.y0 = false;
                    fragmentContextView6.z0 = false;
                    break;
                }
                break;
            case 6:
                FragmentContextView fragmentContextView7 = this.b;
                fragmentContextView7.u0.e();
                AnimatorSet animatorSet7 = fragmentContextView7.f;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    fragmentContextView7.T = false;
                    fragmentContextView7.f = null;
                    fragmentContextView7.e(false);
                    break;
                }
                break;
            case 7:
                FragmentContextView fragmentContextView8 = this.b;
                fragmentContextView8.v0.e();
                AnimatorSet animatorSet8 = fragmentContextView8.f;
                if (animatorSet8 != null && animatorSet8.equals(animator)) {
                    fragmentContextView8.f = null;
                }
                if (fragmentContextView8.x0) {
                    fragmentContextView8.e(false);
                } else if (fragmentContextView8.w0) {
                    fragmentContextView8.a(false);
                } else if (fragmentContextView8.y0) {
                    fragmentContextView8.g(false);
                } else if (fragmentContextView8.z0) {
                    fragmentContextView8.c(false);
                }
                fragmentContextView8.x0 = false;
                fragmentContextView8.w0 = false;
                fragmentContextView8.y0 = false;
                fragmentContextView8.z0 = false;
                fragmentContextView8.n();
                break;
            case 8:
                FragmentContextView fragmentContextView9 = this.b;
                fragmentContextView9.u0.e();
                AnimatorSet animatorSet9 = fragmentContextView9.f;
                if (animatorSet9 != null && animatorSet9.equals(animator)) {
                    fragmentContextView9.setVisibility(8);
                    fragmentContextView9.f = null;
                    if (fragmentContextView9.x0) {
                        fragmentContextView9.e(false);
                    } else if (fragmentContextView9.w0) {
                        fragmentContextView9.a(false);
                    } else if (fragmentContextView9.y0) {
                        fragmentContextView9.g(false);
                    } else if (fragmentContextView9.z0) {
                        fragmentContextView9.c(false);
                    }
                    fragmentContextView9.x0 = false;
                    fragmentContextView9.w0 = false;
                    fragmentContextView9.y0 = false;
                    fragmentContextView9.z0 = false;
                    break;
                }
                break;
            case 9:
                FragmentContextView fragmentContextView10 = this.b;
                fragmentContextView10.u0.e();
                AnimatorSet animatorSet10 = fragmentContextView10.f;
                if (animatorSet10 != null && animatorSet10.equals(animator)) {
                    fragmentContextView10.T = false;
                    fragmentContextView10.f = null;
                    fragmentContextView10.a(false);
                    break;
                }
                break;
            case 10:
                FragmentContextView fragmentContextView11 = this.b;
                fragmentContextView11.v0.e();
                AnimatorSet animatorSet11 = fragmentContextView11.f;
                if (animatorSet11 != null && animatorSet11.equals(animator)) {
                    fragmentContextView11.f = null;
                }
                if (fragmentContextView11.x0) {
                    fragmentContextView11.e(false);
                } else if (fragmentContextView11.w0) {
                    fragmentContextView11.a(false);
                } else if (fragmentContextView11.y0) {
                    fragmentContextView11.g(false);
                } else if (fragmentContextView11.z0) {
                    fragmentContextView11.c(false);
                }
                fragmentContextView11.x0 = false;
                fragmentContextView11.w0 = false;
                fragmentContextView11.y0 = false;
                fragmentContextView11.z0 = false;
                fragmentContextView11.n();
                break;
            default:
                FragmentContextView fragmentContextView12 = this.b;
                AnimatorSet animatorSet12 = fragmentContextView12.f;
                if (animatorSet12 != null && animatorSet12.equals(animator)) {
                    fragmentContextView12.setVisibility(8);
                    fragmentContextView12.f = null;
                    break;
                }
                break;
        }
    }
}
