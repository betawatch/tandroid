package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bg0 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ PipRoundVideoView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(PipRoundVideoView pipRoundVideoView, Activity activity) {
        super(activity);
        this.e = pipRoundVideoView;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.i5 i5Var = org.telegram.ui.ActionBar.j6.k3;
        if (i5Var != null) {
            i5Var.setAlpha((int) (getAlpha() * 255.0f));
            org.telegram.ui.ActionBar.j6.k3.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
            org.telegram.ui.ActionBar.j6.k3.draw(canvas);
            org.telegram.ui.ActionBar.j6.S1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ra, false));
            org.telegram.ui.ActionBar.j6.S1.setAlpha((int) (getAlpha() * 255.0f));
            canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), org.telegram.ui.ActionBar.j6.S1);
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

    /* JADX WARN: Removed duplicated region for block: B:69:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b8 A[ORIG_RETURN, RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z4;
        ArrayList arrayList;
        boolean z10;
        char c3;
        MessageObject playingMessageObject;
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
                if (Math.abs(f12) < AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(f13) < AndroidUtilities.getPixelsInCM(0.3f, false)) {
                    return true;
                }
                this.c = true;
                this.d = false;
                return true;
            }
            if (!this.c) {
                return true;
            }
            WindowManager.LayoutParams layoutParams = pipRoundVideoView.v;
            int i10 = (int) (layoutParams.x + f12);
            layoutParams.x = i10;
            layoutParams.y = (int) (layoutParams.y + f13);
            int i11 = pipRoundVideoView.h / 2;
            int i12 = -i11;
            if (i10 < i12) {
                layoutParams.x = i12;
            } else {
                int i13 = (AndroidUtilities.displaySize.x - layoutParams.width) + i11;
                if (i10 > i13) {
                    layoutParams.x = i13;
                }
            }
            int i14 = layoutParams.x;
            if (i14 < 0) {
                f11 = vh.v2.c(i14, i11, 0.5f, 1.0f);
            } else {
                if (i14 > AndroidUtilities.displaySize.x - layoutParams.width) {
                    f11 = org.telegram.messenger.y3.A((i14 - r11) + r10, i11, 0.5f, 1.0f);
                }
            }
            if (pipRoundVideoView.a.getAlpha() != f11) {
                pipRoundVideoView.a.setAlpha(f11);
            }
            WindowManager.LayoutParams layoutParams2 = pipRoundVideoView.v;
            int i15 = layoutParams2.y;
            if (i15 < 0) {
                layoutParams2.y = 0;
            } else {
                int i16 = AndroidUtilities.displaySize.y - layoutParams2.height;
                if (i15 > i16) {
                    layoutParams2.y = i16;
                }
            }
            pipRoundVideoView.w.updateViewLayout(pipRoundVideoView.a, layoutParams2);
            this.a = rawX;
            this.b = rawY;
            return true;
        }
        if (motionEvent.getAction() != 1) {
            return true;
        }
        if (this.d && !this.c && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(playingMessageObject);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(playingMessageObject);
            }
        }
        this.c = false;
        this.d = false;
        int b10 = PipRoundVideoView.b(true, 0, 0.0f, pipRoundVideoView.h);
        int b11 = PipRoundVideoView.b(true, 1, 0.0f, pipRoundVideoView.h);
        int b12 = PipRoundVideoView.b(false, 0, 0.0f, pipRoundVideoView.n);
        int b13 = PipRoundVideoView.b(false, 1, 0.0f, pipRoundVideoView.n);
        SharedPreferences.Editor edit = pipRoundVideoView.x.edit();
        int dp = AndroidUtilities.dp(20.0f);
        int abs = Math.abs(b10 - pipRoundVideoView.v.x);
        Property property = View.ALPHA;
        if (abs > dp) {
            int i17 = pipRoundVideoView.v.x;
            f10 = 1.0f;
            if (i17 >= 0 || i17 <= (-pipRoundVideoView.h) / 4) {
                if (Math.abs(b11 - i17) > dp) {
                    int i18 = pipRoundVideoView.v.x;
                    int i19 = AndroidUtilities.displaySize.x;
                    c3 = 0;
                    int i20 = pipRoundVideoView.h;
                    if (i18 <= i19 - i20 || i18 >= i19 - ((i20 / 4) * 3)) {
                        if (pipRoundVideoView.a.getAlpha() != 1.0f) {
                            arrayList = new ArrayList();
                            if (pipRoundVideoView.v.x < 0) {
                                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", -pipRoundVideoView.h));
                            } else {
                                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", AndroidUtilities.displaySize.x));
                            }
                            z4 = true;
                            if (!z4) {
                                if (Math.abs(b12 - pipRoundVideoView.v.y) <= dp || pipRoundVideoView.v.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    edit.putInt("sidey", 0);
                                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", b12));
                                } else if (Math.abs(b13 - pipRoundVideoView.v.y) <= dp) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    edit.putInt("sidey", 1);
                                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", b13));
                                } else {
                                    edit.putFloat("py", (pipRoundVideoView.v.y - b12) / (b13 - b12));
                                    edit.putInt("sidey", 2);
                                }
                                edit.commit();
                            }
                            if (arrayList != null) {
                                return true;
                            }
                            if (pipRoundVideoView.y == null) {
                                pipRoundVideoView.y = new DecelerateInterpolator();
                            }
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.setInterpolator(pipRoundVideoView.y);
                            animatorSet.setDuration(150L);
                            if (z4) {
                                z10 = true;
                                arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.a, (Property<bg0, Float>) property, 0.0f));
                                animatorSet.addListener(new dg0(pipRoundVideoView, 1));
                            } else {
                                z10 = true;
                            }
                            animatorSet.playTogether(arrayList);
                            animatorSet.start();
                            return z10;
                        }
                        edit.putFloat("px", (pipRoundVideoView.v.x - b10) / (b11 - b10));
                        edit.putInt("sidex", 2);
                        arrayList = null;
                        z4 = false;
                        if (!z4) {
                        }
                        if (arrayList != null) {
                        }
                    }
                } else {
                    c3 = 0;
                }
                arrayList = new ArrayList();
                edit.putInt("sidex", 1);
                if (pipRoundVideoView.a.getAlpha() != 1.0f) {
                    bg0 bg0Var = pipRoundVideoView.a;
                    float[] fArr = new float[1];
                    fArr[c3] = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(bg0Var, (Property<bg0, Float>) property, fArr));
                }
                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", b11));
                z4 = false;
                if (!z4) {
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
            arrayList2.add(ObjectAnimator.ofFloat(pipRoundVideoView.a, (Property<bg0, Float>) property, f10));
        }
        arrayList2.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", b10));
        arrayList = arrayList2;
        z4 = false;
        if (!z4) {
        }
        if (arrayList != null) {
        }
    }
}
