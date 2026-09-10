package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ x10(FragmentContextView fragmentContextView, int i10) {
        this.a = i10;
        this.b = fragmentContextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                FragmentContextView fragmentContextView = this.b;
                AnimatorSet animatorSet = fragmentContextView.f;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    fragmentContextView.f = null;
                    break;
                }
                break;
            case 1:
                FragmentContextView fragmentContextView2 = this.b;
                AnimatorSet animatorSet2 = fragmentContextView2.f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fragmentContextView2.f = null;
                    break;
                }
                break;
            case 2:
                FragmentContextView fragmentContextView3 = this.b;
                fragmentContextView3.t0.unlock();
                AnimatorSet animatorSet3 = fragmentContextView3.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fragmentContextView3.setVisibility(8);
                    e20 e20Var = fragmentContextView3.o0;
                    if (e20Var != null) {
                        ((cr0) e20Var).a(false);
                    }
                    fragmentContextView3.f = null;
                    if (fragmentContextView3.w0) {
                        fragmentContextView3.e(false);
                    } else if (fragmentContextView3.v0) {
                        fragmentContextView3.a(false);
                    } else if (fragmentContextView3.x0) {
                        fragmentContextView3.g(false);
                    } else if (fragmentContextView3.y0) {
                        fragmentContextView3.c(false);
                    }
                    fragmentContextView3.w0 = false;
                    fragmentContextView3.v0 = false;
                    fragmentContextView3.x0 = false;
                    fragmentContextView3.y0 = false;
                    break;
                }
                break;
            case 3:
                FragmentContextView fragmentContextView4 = this.b;
                fragmentContextView4.t0.unlock();
                AnimatorSet animatorSet4 = fragmentContextView4.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    e20 e20Var2 = fragmentContextView4.o0;
                    if (e20Var2 != null) {
                        ((cr0) e20Var2).a(false);
                    }
                    fragmentContextView4.f = null;
                    if (fragmentContextView4.w0) {
                        fragmentContextView4.e(false);
                    } else if (fragmentContextView4.v0) {
                        fragmentContextView4.a(false);
                    } else if (fragmentContextView4.x0) {
                        fragmentContextView4.g(false);
                    } else if (fragmentContextView4.y0) {
                        fragmentContextView4.c(false);
                    }
                    fragmentContextView4.w0 = false;
                    fragmentContextView4.v0 = false;
                    fragmentContextView4.x0 = false;
                    fragmentContextView4.y0 = false;
                    break;
                }
                break;
            case 4:
                FragmentContextView fragmentContextView5 = this.b;
                fragmentContextView5.t0.unlock();
                AnimatorSet animatorSet5 = fragmentContextView5.f;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    fragmentContextView5.setVisibility(8);
                    fragmentContextView5.f = null;
                    if (fragmentContextView5.w0) {
                        fragmentContextView5.e(false);
                    } else if (fragmentContextView5.v0) {
                        fragmentContextView5.a(false);
                    } else if (fragmentContextView5.x0) {
                        fragmentContextView5.g(false);
                    } else if (fragmentContextView5.y0) {
                        fragmentContextView5.c(false);
                    }
                    fragmentContextView5.w0 = false;
                    fragmentContextView5.v0 = false;
                    fragmentContextView5.x0 = false;
                    fragmentContextView5.y0 = false;
                    break;
                }
                break;
            case 5:
                FragmentContextView fragmentContextView6 = this.b;
                fragmentContextView6.t0.unlock();
                AnimatorSet animatorSet6 = fragmentContextView6.f;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    e20 e20Var3 = fragmentContextView6.o0;
                    if (e20Var3 != null) {
                        ((cr0) e20Var3).a(false);
                    }
                    fragmentContextView6.f = null;
                    if (fragmentContextView6.w0) {
                        fragmentContextView6.e(false);
                    } else if (fragmentContextView6.v0) {
                        fragmentContextView6.a(false);
                    } else if (fragmentContextView6.x0) {
                        fragmentContextView6.g(false);
                    } else if (fragmentContextView6.y0) {
                        fragmentContextView6.c(false);
                    }
                    fragmentContextView6.w0 = false;
                    fragmentContextView6.v0 = false;
                    fragmentContextView6.x0 = false;
                    fragmentContextView6.y0 = false;
                    break;
                }
                break;
            case 6:
                FragmentContextView fragmentContextView7 = this.b;
                fragmentContextView7.t0.unlock();
                AnimatorSet animatorSet7 = fragmentContextView7.f;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    fragmentContextView7.setVisibility(8);
                    fragmentContextView7.f = null;
                    if (fragmentContextView7.w0) {
                        fragmentContextView7.e(false);
                    } else if (fragmentContextView7.v0) {
                        fragmentContextView7.a(false);
                    } else if (fragmentContextView7.x0) {
                        fragmentContextView7.g(false);
                    } else if (fragmentContextView7.y0) {
                        fragmentContextView7.c(false);
                    }
                    fragmentContextView7.w0 = false;
                    fragmentContextView7.v0 = false;
                    fragmentContextView7.x0 = false;
                    fragmentContextView7.y0 = false;
                    break;
                }
                break;
            case 7:
                FragmentContextView fragmentContextView8 = this.b;
                fragmentContextView8.t0.unlock();
                AnimatorSet animatorSet8 = fragmentContextView8.f;
                if (animatorSet8 != null && animatorSet8.equals(animator)) {
                    fragmentContextView8.S = false;
                    fragmentContextView8.f = null;
                    fragmentContextView8.e(false);
                    break;
                }
                break;
            case 8:
                FragmentContextView fragmentContextView9 = this.b;
                fragmentContextView9.u0.unlock();
                AnimatorSet animatorSet9 = fragmentContextView9.f;
                if (animatorSet9 != null && animatorSet9.equals(animator)) {
                    fragmentContextView9.f = null;
                }
                if (fragmentContextView9.w0) {
                    fragmentContextView9.e(false);
                } else if (fragmentContextView9.v0) {
                    fragmentContextView9.a(false);
                } else if (fragmentContextView9.x0) {
                    fragmentContextView9.g(false);
                } else if (fragmentContextView9.y0) {
                    fragmentContextView9.c(false);
                }
                fragmentContextView9.w0 = false;
                fragmentContextView9.v0 = false;
                fragmentContextView9.x0 = false;
                fragmentContextView9.y0 = false;
                fragmentContextView9.m();
                break;
            case 9:
                FragmentContextView fragmentContextView10 = this.b;
                fragmentContextView10.t0.unlock();
                AnimatorSet animatorSet10 = fragmentContextView10.f;
                if (animatorSet10 != null && animatorSet10.equals(animator)) {
                    fragmentContextView10.setVisibility(8);
                    fragmentContextView10.f = null;
                    if (fragmentContextView10.w0) {
                        fragmentContextView10.e(false);
                    } else if (fragmentContextView10.v0) {
                        fragmentContextView10.a(false);
                    } else if (fragmentContextView10.x0) {
                        fragmentContextView10.g(false);
                    } else if (fragmentContextView10.y0) {
                        fragmentContextView10.c(false);
                    }
                    fragmentContextView10.w0 = false;
                    fragmentContextView10.v0 = false;
                    fragmentContextView10.x0 = false;
                    fragmentContextView10.y0 = false;
                    break;
                }
                break;
            case 10:
                FragmentContextView fragmentContextView11 = this.b;
                fragmentContextView11.t0.unlock();
                AnimatorSet animatorSet11 = fragmentContextView11.f;
                if (animatorSet11 != null && animatorSet11.equals(animator)) {
                    fragmentContextView11.S = false;
                    fragmentContextView11.f = null;
                    fragmentContextView11.a(false);
                    break;
                }
                break;
            default:
                FragmentContextView fragmentContextView12 = this.b;
                fragmentContextView12.u0.unlock();
                AnimatorSet animatorSet12 = fragmentContextView12.f;
                if (animatorSet12 != null && animatorSet12.equals(animator)) {
                    fragmentContextView12.f = null;
                }
                if (fragmentContextView12.w0) {
                    fragmentContextView12.e(false);
                } else if (fragmentContextView12.v0) {
                    fragmentContextView12.a(false);
                } else if (fragmentContextView12.x0) {
                    fragmentContextView12.g(false);
                } else if (fragmentContextView12.y0) {
                    fragmentContextView12.c(false);
                }
                fragmentContextView12.w0 = false;
                fragmentContextView12.v0 = false;
                fragmentContextView12.x0 = false;
                fragmentContextView12.y0 = false;
                fragmentContextView12.m();
                break;
        }
    }
}
