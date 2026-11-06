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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ee0 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ PipRoundVideoView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(PipRoundVideoView pipRoundVideoView, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = pipRoundVideoView;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        fi.l3 l3Var = org.telegram.ui.ActionBar.k6.k3;
        if (l3Var != null) {
            l3Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.k6.k3.setBounds(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(125.0f), org.telegram.messenger.g0.L(125.0f));
            org.telegram.ui.ActionBar.k6.k3.draw(canvas);
            org.telegram.ui.ActionBar.k6.S1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ra, false));
            org.telegram.ui.ActionBar.k6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(59.5f), org.telegram.ui.ActionBar.k6.S1);
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
        float f10;
        boolean z9;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        org.telegram.messenger.ij ijVar;
        if (!this.d && !this.c) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        float f11 = 1.0f;
        PipRoundVideoView pipRoundVideoView = this.e;
        if (action == 2) {
            float f12 = rawX - this.a;
            float f13 = rawY - this.b;
            if (this.d) {
                if (Math.abs(f12) >= org.telegram.messenger.g0.a1(true, 0.3f) || Math.abs(f13) >= org.telegram.messenger.g0.a1(false, 0.3f)) {
                    this.c = true;
                    this.d = false;
                    return true;
                }
            } else if (this.c) {
                WindowManager.LayoutParams layoutParams = pipRoundVideoView.w;
                int i7 = (int) (layoutParams.x + f12);
                layoutParams.x = i7;
                layoutParams.y = (int) (layoutParams.y + f13);
                int i10 = pipRoundVideoView.h / 2;
                int i11 = -i10;
                if (i7 < i11) {
                    layoutParams.x = i11;
                } else {
                    int i12 = (org.telegram.messenger.g0.q.x - layoutParams.width) + i10;
                    if (i7 > i12) {
                        layoutParams.x = i12;
                    }
                }
                int i13 = layoutParams.x;
                if (i13 < 0) {
                    f11 = com.google.android.recaptcha.internal.a.c(i13, i10, 0.5f, 1.0f);
                } else {
                    if (i13 > org.telegram.messenger.g0.q.x - layoutParams.width) {
                        f11 = org.telegram.messenger.camera.q.v((i13 - r11) + r10, i10, 0.5f, 1.0f);
                    }
                }
                if (pipRoundVideoView.a.getAlpha() != f11) {
                    pipRoundVideoView.a.setAlpha(f11);
                }
                WindowManager.LayoutParams layoutParams2 = pipRoundVideoView.w;
                int i14 = layoutParams2.y;
                if (i14 < 0) {
                    layoutParams2.y = 0;
                } else {
                    int i15 = org.telegram.messenger.g0.q.y - layoutParams2.height;
                    if (i14 > i15) {
                        layoutParams2.y = i15;
                    }
                }
                pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, layoutParams2);
                this.a = rawX;
                this.b = rawY;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.d && !this.c && (ijVar = MediaController.B().u0) != null) {
                if (MediaController.B().H()) {
                    MediaController.B().S(ijVar);
                } else {
                    MediaController.B().R(ijVar, true);
                }
            }
            this.c = false;
            this.d = false;
            int b10 = PipRoundVideoView.b(0.0f, 0, pipRoundVideoView.h, true);
            int b11 = PipRoundVideoView.b(0.0f, 1, pipRoundVideoView.h, true);
            int b12 = PipRoundVideoView.b(0.0f, 0, pipRoundVideoView.n, false);
            int b13 = PipRoundVideoView.b(0.0f, 1, pipRoundVideoView.n, false);
            SharedPreferences.Editor edit = pipRoundVideoView.y.edit();
            int L = org.telegram.messenger.g0.L(20.0f);
            int abs = Math.abs(b10 - pipRoundVideoView.w.x);
            Property property = View.ALPHA;
            if (abs > L) {
                int i16 = pipRoundVideoView.w.x;
                f10 = 1.0f;
                if (i16 >= 0 || i16 <= (-pipRoundVideoView.h) / 4) {
                    if (Math.abs(b11 - i16) > L) {
                        int i17 = pipRoundVideoView.w.x;
                        Point point = org.telegram.messenger.g0.q;
                        z11 = false;
                        int i18 = point.x;
                        int i19 = pipRoundVideoView.h;
                        if (i17 <= i18 - i19 || i17 >= i18 - ((i19 / 4) * 3)) {
                            if (pipRoundVideoView.a.getAlpha() != 1.0f) {
                                arrayList = new ArrayList();
                                if (pipRoundVideoView.w.x < 0) {
                                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", -pipRoundVideoView.h));
                                } else {
                                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", point.x));
                                }
                                z9 = true;
                                if (!z9) {
                                    if (Math.abs(b12 - pipRoundVideoView.w.y) <= L || pipRoundVideoView.w.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
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
                                if (z9) {
                                    z10 = true;
                                    arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.a, (Property<ee0, Float>) property, 0.0f));
                                    animatorSet.addListener(new ge0(pipRoundVideoView, 1));
                                } else {
                                    z10 = true;
                                }
                                animatorSet.playTogether(arrayList);
                                animatorSet.start();
                                return z10;
                            }
                            edit.putFloat("px", (pipRoundVideoView.w.x - b10) / (b11 - b10));
                            edit.putInt("sidex", 2);
                            arrayList = null;
                            z9 = z11;
                            if (!z9) {
                            }
                            if (arrayList != null) {
                            }
                        }
                    } else {
                        z11 = false;
                    }
                    arrayList = new ArrayList();
                    edit.putInt("sidex", 1);
                    if (pipRoundVideoView.a.getAlpha() != 1.0f) {
                        ee0 ee0Var = pipRoundVideoView.a;
                        float[] fArr = new float[1];
                        fArr[z11 ? 1 : 0] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(ee0Var, (Property<ee0, Float>) property, fArr));
                    }
                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", b11));
                    z9 = z11;
                    if (!z9) {
                    }
                    if (arrayList != null) {
                    }
                }
            } else {
                f10 = 1.0f;
            }
            ArrayList arrayList2 = new ArrayList();
            edit.putInt("sidex", 0);
            if (pipRoundVideoView.a.getAlpha() != f10) {
                arrayList2.add(ObjectAnimator.ofFloat(pipRoundVideoView.a, (Property<ee0, Float>) property, f10));
            }
            arrayList2.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", b10));
            arrayList = arrayList2;
            z9 = false;
            if (!z9) {
            }
            if (arrayList != null) {
            }
        }
        return true;
    }
}
