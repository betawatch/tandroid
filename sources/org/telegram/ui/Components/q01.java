package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ThemeEditorView.EditorAlert;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q01 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x008b, code lost:
    
        if (r14.getFragmentStack().isEmpty() != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        ArrayList arrayList3;
        boolean z11;
        ArrayList arrayList4;
        int i10;
        ThemeEditorView themeEditorView = this.d;
        int i11 = themeEditorView.e;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        Property property = View.ALPHA;
        if (action == 0) {
            this.a = rawX;
            this.b = rawY;
        } else if (motionEvent.getAction() != 2 || this.c) {
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.l == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.b;
                if (AndroidUtilities.isTablet()) {
                    b5Var = launchActivity.n0;
                    if (b5Var != null && b5Var.getFragmentStack().isEmpty()) {
                        b5Var = null;
                    }
                    if (b5Var == null) {
                        b5Var = launchActivity.o0;
                        if (b5Var != null) {
                        }
                    }
                    if (b5Var == null) {
                        b5Var = launchActivity.O();
                    }
                    if (b5Var != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = !b5Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.o2) b5Var.getFragmentStack().get(b5Var.getFragmentStack().size() - 1) : null;
                        if (o2Var != null && (themeDescriptions = o2Var.getThemeDescriptions()) != null) {
                            ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.b, themeDescriptions);
                            themeEditorView.l = editorAlert;
                            editorAlert.setOnDismissListener(new bg.f0(5));
                            themeEditorView.l.setOnDismissListener(new d1(this, 9));
                            themeEditorView.l.show();
                            if (themeEditorView.b != null) {
                                try {
                                    animatorSet = new AnimatorSet();
                                } catch (Exception unused) {
                                }
                                try {
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(themeEditorView.a, (Property<q01, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.a, (Property<q01, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.a, (Property<q01, Float>) View.SCALE_Y, 1.0f, 0.0f));
                                    animatorSet.setInterpolator(themeEditorView.i);
                                    animatorSet.setDuration(150L);
                                    animatorSet.addListener(new s01(themeEditorView, 0));
                                    animatorSet.start();
                                } catch (Exception unused2) {
                                    if (this.c) {
                                    }
                                    return true;
                                }
                                if (this.c) {
                                    float f9 = 1.0f;
                                    if (motionEvent.getAction() == 2) {
                                        float f10 = rawX - this.a;
                                        float f11 = rawY - this.b;
                                        WindowManager.LayoutParams layoutParams = themeEditorView.g;
                                        int i12 = (int) (layoutParams.x + f10);
                                        layoutParams.x = i12;
                                        layoutParams.y = (int) (layoutParams.y + f11);
                                        int i13 = i11 / 2;
                                        int i14 = -i13;
                                        if (i12 < i14) {
                                            layoutParams.x = i14;
                                        } else {
                                            int i15 = (AndroidUtilities.displaySize.x - layoutParams.width) + i13;
                                            if (i12 > i15) {
                                                layoutParams.x = i15;
                                            }
                                        }
                                        int i16 = layoutParams.x;
                                        if (i16 < 0) {
                                            f9 = u3.c.c(i16, i13, 0.5f, 1.0f);
                                        } else {
                                            if (i16 > AndroidUtilities.displaySize.x - layoutParams.width) {
                                                f9 = org.telegram.messenger.x3.A((i16 - r8) + r7, i13, 0.5f, 1.0f);
                                            }
                                        }
                                        if (themeEditorView.a.getAlpha() != f9) {
                                            themeEditorView.a.setAlpha(f9);
                                        }
                                        WindowManager.LayoutParams layoutParams2 = themeEditorView.g;
                                        int i17 = layoutParams2.y;
                                        if (i17 < 0) {
                                            layoutParams2.y = 0;
                                        } else {
                                            int i18 = AndroidUtilities.displaySize.y - layoutParams2.height;
                                            if (i17 > i18) {
                                                layoutParams2.y = i18;
                                            }
                                        }
                                        themeEditorView.h.updateViewLayout(themeEditorView.a, layoutParams2);
                                        this.a = rawX;
                                        this.b = rawY;
                                    } else if (motionEvent.getAction() == 1) {
                                        this.c = false;
                                        int b10 = ThemeEditorView.b(true, 0, 0.0f, i11);
                                        int b11 = ThemeEditorView.b(true, 1, 0.0f, i11);
                                        int i19 = themeEditorView.f;
                                        int b12 = ThemeEditorView.b(false, 0, 0.0f, i19);
                                        int b13 = ThemeEditorView.b(false, 1, 0.0f, i19);
                                        SharedPreferences.Editor edit = themeEditorView.j.edit();
                                        int dp = AndroidUtilities.dp(20.0f);
                                        if (Math.abs(b10 - themeEditorView.g.x) <= dp || ((i10 = themeEditorView.g.x) < 0 && i10 > (-i11) / 4)) {
                                            arrayList = new ArrayList();
                                            edit.putInt("sidex", 0);
                                            if (themeEditorView.a.getAlpha() != 1.0f) {
                                                arrayList.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<q01, Float>) property, 1.0f));
                                            }
                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", b10));
                                        } else {
                                            if (Math.abs(b11 - i10) > dp) {
                                                int i20 = themeEditorView.g.x;
                                                int i21 = AndroidUtilities.displaySize.x;
                                                if (i20 <= i21 - i11 || i20 >= i21 - ((i11 / 4) * 3)) {
                                                    if (themeEditorView.a.getAlpha() != 1.0f) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        if (themeEditorView.g.x < 0) {
                                                            arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", -i11));
                                                        } else {
                                                            arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", AndroidUtilities.displaySize.x));
                                                        }
                                                        arrayList2 = arrayList5;
                                                        z10 = true;
                                                    } else {
                                                        edit.putFloat("px", (themeEditorView.g.x - b10) / (b11 - b10));
                                                        edit.putInt("sidex", 2);
                                                        z10 = false;
                                                        arrayList2 = null;
                                                    }
                                                    if (!z10) {
                                                        if (Math.abs(b12 - themeEditorView.g.y) <= dp || themeEditorView.g.y <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                                                            if (arrayList2 == null) {
                                                                arrayList2 = new ArrayList();
                                                            }
                                                            arrayList4 = arrayList2;
                                                            edit.putInt("sidey", 0);
                                                            arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", b12));
                                                        } else if (Math.abs(b13 - themeEditorView.g.y) <= dp) {
                                                            if (arrayList2 == null) {
                                                                arrayList2 = new ArrayList();
                                                            }
                                                            arrayList4 = arrayList2;
                                                            edit.putInt("sidey", 1);
                                                            arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", b13));
                                                        } else {
                                                            edit.putFloat("py", (themeEditorView.g.y - b12) / (b13 - b12));
                                                            edit.putInt("sidey", 2);
                                                            edit.commit();
                                                        }
                                                        arrayList2 = arrayList4;
                                                        edit.commit();
                                                    }
                                                    arrayList3 = arrayList2;
                                                    if (arrayList3 != null) {
                                                        if (themeEditorView.i == null) {
                                                            themeEditorView.i = new DecelerateInterpolator();
                                                        }
                                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                                        animatorSet2.setInterpolator(themeEditorView.i);
                                                        animatorSet2.setDuration(150L);
                                                        if (z10) {
                                                            z11 = true;
                                                            arrayList3.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<q01, Float>) property, 0.0f));
                                                            animatorSet2.addListener(new s01(themeEditorView, 1 == true ? 1 : 0));
                                                        } else {
                                                            z11 = true;
                                                        }
                                                        animatorSet2.playTogether(arrayList3);
                                                        animatorSet2.start();
                                                        return z11;
                                                    }
                                                }
                                            }
                                            arrayList = new ArrayList();
                                            edit.putInt("sidex", 1);
                                            if (themeEditorView.a.getAlpha() != 1.0f) {
                                                arrayList.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<q01, Float>) property, 1.0f));
                                            }
                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", b11));
                                        }
                                        arrayList2 = arrayList;
                                        z10 = false;
                                        if (!z10) {
                                        }
                                        arrayList3 = arrayList2;
                                        if (arrayList3 != null) {
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
                b5Var = null;
                if (b5Var == null) {
                }
                if (b5Var != null) {
                }
            }
        } else if (Math.abs(this.a - rawX) >= AndroidUtilities.getPixelsInCM(0.3f, true) || Math.abs(this.b - rawY) >= AndroidUtilities.getPixelsInCM(0.3f, false)) {
            this.c = true;
            this.a = rawX;
            this.b = rawY;
        }
        if (this.c) {
        }
        return true;
    }
}
