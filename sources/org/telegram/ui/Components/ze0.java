package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ze0 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ PipRoundVideoView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = pipRoundVideoView;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        jg.x0 x0Var = org.telegram.ui.ActionBar.t6.k3;
        if (x0Var != null) {
            x0Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.t6.k3.setBounds(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(125.0f), org.telegram.messenger.i0.L(125.0f));
            org.telegram.ui.ActionBar.t6.k3.draw(canvas);
            org.telegram.ui.ActionBar.t6.S1.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ra, false));
            org.telegram.ui.ActionBar.t6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.i0.L(63.0f), org.telegram.messenger.i0.L(63.0f), org.telegram.messenger.i0.L(59.5f), org.telegram.ui.ActionBar.t6.S1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.a = motionEvent.getRawX();
            this.b = motionEvent.getRawY();
            this.d = true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bc A[ORIG_RETURN, RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f7;
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        org.telegram.messenger.jj jjVar;
        if (!this.d && !this.c) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        float f10 = 1.0f;
        PipRoundVideoView pipRoundVideoView = this.e;
        if (action == 2) {
            float f11 = rawX - this.a;
            float f12 = rawY - this.b;
            if (this.d) {
                if (Math.abs(f11) >= org.telegram.messenger.i0.a1(true, 0.3f) || Math.abs(f12) >= org.telegram.messenger.i0.a1(false, 0.3f)) {
                    this.c = true;
                    this.d = false;
                    return true;
                }
            } else if (this.c) {
                WindowManager.LayoutParams layoutParams = pipRoundVideoView.w;
                int i10 = (int) (layoutParams.x + f11);
                layoutParams.x = i10;
                layoutParams.y = (int) (layoutParams.y + f12);
                int i11 = pipRoundVideoView.h / 2;
                int i12 = -i11;
                if (i10 < i12) {
                    layoutParams.x = i12;
                } else {
                    int i13 = (org.telegram.messenger.i0.q.x - layoutParams.width) + i11;
                    if (i10 > i13) {
                        layoutParams.x = i13;
                    }
                }
                int i14 = layoutParams.x;
                if (i14 < 0) {
                    f10 = a1.g.c(i14, i11, 0.5f, 1.0f);
                } else {
                    if (i14 > org.telegram.messenger.i0.q.x - layoutParams.width) {
                        f10 = org.telegram.messenger.z20.v((i14 - r11) + r10, i11, 0.5f, 1.0f);
                    }
                }
                if (pipRoundVideoView.a.getAlpha() != f10) {
                    pipRoundVideoView.a.setAlpha(f10);
                }
                WindowManager.LayoutParams layoutParams2 = pipRoundVideoView.w;
                int i15 = layoutParams2.y;
                if (i15 < 0) {
                    layoutParams2.y = 0;
                } else {
                    int i16 = org.telegram.messenger.i0.q.y - layoutParams2.height;
                    if (i15 > i16) {
                        layoutParams2.y = i16;
                    }
                }
                pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, layoutParams2);
                this.a = rawX;
                this.b = rawY;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.d && !this.c && (jjVar = MediaController.B().u0) != null) {
                if (MediaController.B().H()) {
                    MediaController.B().S(jjVar);
                } else {
                    MediaController.B().R(jjVar, true);
                }
            }
            this.c = false;
            this.d = false;
            int b10 = PipRoundVideoView.b(0.0f, 0, pipRoundVideoView.h, true);
            int b11 = PipRoundVideoView.b(0.0f, 1, pipRoundVideoView.h, true);
            int b12 = PipRoundVideoView.b(0.0f, 0, pipRoundVideoView.n, false);
            int b13 = PipRoundVideoView.b(0.0f, 1, pipRoundVideoView.n, false);
            SharedPreferences.Editor edit = pipRoundVideoView.y.edit();
            int L = org.telegram.messenger.i0.L(20.0f);
            int abs = Math.abs(b10 - pipRoundVideoView.w.x);
            Property property = View.ALPHA;
            if (abs > L) {
                int i17 = pipRoundVideoView.w.x;
                f7 = 1.0f;
                if (i17 >= 0 || i17 <= (-pipRoundVideoView.h) / 4) {
                    if (Math.abs(b11 - i17) > L) {
                        int i18 = pipRoundVideoView.w.x;
                        Point point = org.telegram.messenger.i0.q;
                        z12 = false;
                        int i19 = point.x;
                        int i20 = pipRoundVideoView.h;
                        if (i18 <= i19 - i20 || i18 >= i19 - ((i20 / 4) * 3)) {
                            if (pipRoundVideoView.a.getAlpha() != 1.0f) {
                                arrayList = new ArrayList();
                                if (pipRoundVideoView.w.x < 0) {
                                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", -pipRoundVideoView.h));
                                } else {
                                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", point.x));
                                }
                                z10 = true;
                                if (!z10) {
                                    if (Math.abs(b12 - pipRoundVideoView.w.y) <= L || pipRoundVideoView.w.y <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        edit.putInt("sidey", 0);
                                        arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", b12));
                                    } else if (Math.abs(b13 - pipRoundVideoView.w.y) <= L) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        edit.putInt("sidey", 1);
                                        arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", b13));
                                    } else {
                                        edit.putFloat("py", (pipRoundVideoView.w.y - b12) / (b13 - b12));
                                        edit.putInt("sidey", 2);
                                    }
                                    edit.commit();
                                }
                                if (arrayList != null) {
                                    return true;
                                }
                                if (pipRoundVideoView.D == null) {
                                    pipRoundVideoView.D = new DecelerateInterpolator();
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.setInterpolator(pipRoundVideoView.D);
                                animatorSet.setDuration(150L);
                                if (z10) {
                                    z11 = true;
                                    arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.a, (Property<ze0, Float>) property, 0.0f));
                                    animatorSet.addListener(new bf0(pipRoundVideoView, 1));
                                } else {
                                    z11 = true;
                                }
                                animatorSet.playTogether(arrayList);
                                animatorSet.start();
                                return z11;
                            }
                            edit.putFloat("px", (pipRoundVideoView.w.x - b10) / (b11 - b10));
                            edit.putInt("sidex", 2);
                            arrayList = null;
                            z10 = z12;
                            if (!z10) {
                            }
                            if (arrayList != null) {
                            }
                        }
                    } else {
                        z12 = false;
                    }
                    arrayList = new ArrayList();
                    edit.putInt("sidex", 1);
                    if (pipRoundVideoView.a.getAlpha() != 1.0f) {
                        ze0 ze0Var = pipRoundVideoView.a;
                        float[] fArr = new float[1];
                        fArr[z12 ? 1 : 0] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(ze0Var, (Property<ze0, Float>) property, fArr));
                    }
                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", b11));
                    z10 = z12;
                    if (!z10) {
                    }
                    if (arrayList != null) {
                    }
                }
            } else {
                f7 = 1.0f;
            }
            ArrayList arrayList2 = new ArrayList();
            edit.putInt("sidex", 0);
            if (pipRoundVideoView.a.getAlpha() != f7) {
                arrayList2.add(ObjectAnimator.ofFloat(pipRoundVideoView.a, (Property<ze0, Float>) property, f7));
            }
            arrayList2.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", b10));
            arrayList = arrayList2;
            z10 = false;
            if (!z10) {
            }
            if (arrayList != null) {
            }
        }
        return true;
    }
}
