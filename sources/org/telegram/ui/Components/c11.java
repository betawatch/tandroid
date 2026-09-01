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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c11 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x008e, code lost:
    
        if (r15.getFragmentStack().isEmpty() != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0143  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var;
        ArrayList<org.telegram.ui.ActionBar.m6> themeDescriptions;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        int i10;
        ThemeEditorView themeEditorView = this.d;
        int i11 = themeEditorView.e;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        int i12 = 4;
        Property property = View.ALPHA;
        if (action == 0) {
            this.a = rawX;
            this.b = rawY;
        } else if (motionEvent.getAction() != 2 || this.c) {
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.l == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.b;
                if (AndroidUtilities.isTablet()) {
                    f5Var = launchActivity.o0;
                    if (f5Var != null && f5Var.getFragmentStack().isEmpty()) {
                        f5Var = null;
                    }
                    if (f5Var == null) {
                        f5Var = launchActivity.p0;
                        if (f5Var != null) {
                        }
                    }
                    if (f5Var == null) {
                        f5Var = launchActivity.O();
                    }
                    if (f5Var != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = !f5Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.p2) f5Var.getFragmentStack().get(f5Var.getFragmentStack().size() - 1) : null;
                        if (p2Var != null && (themeDescriptions = p2Var.getThemeDescriptions()) != null) {
                            ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.b, themeDescriptions);
                            themeEditorView.l = editorAlert;
                            editorAlert.setOnDismissListener(new eg.c0(i12));
                            themeEditorView.l.setOnDismissListener(new b1(this, 9));
                            themeEditorView.l.show();
                            if (themeEditorView.b != null) {
                                try {
                                    animatorSet = new AnimatorSet();
                                    try {
                                    } catch (Exception unused) {
                                        if (this.c) {
                                        }
                                        return true;
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(themeEditorView.a, (Property<c11, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.a, (Property<c11, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.a, (Property<c11, Float>) View.SCALE_Y, 1.0f, 0.0f));
                                    animatorSet.setInterpolator(themeEditorView.i);
                                    animatorSet.setDuration(150L);
                                    animatorSet.addListener(new e11(themeEditorView, 0));
                                    animatorSet.start();
                                } catch (Exception unused3) {
                                    if (this.c) {
                                    }
                                    return true;
                                }
                                if (this.c) {
                                    float f10 = 1.0f;
                                    if (motionEvent.getAction() == 2) {
                                        float f11 = rawX - this.a;
                                        float f12 = rawY - this.b;
                                        WindowManager.LayoutParams layoutParams = themeEditorView.g;
                                        int i13 = (int) (layoutParams.x + f11);
                                        layoutParams.x = i13;
                                        layoutParams.y = (int) (layoutParams.y + f12);
                                        int i14 = i11 / 2;
                                        int i15 = -i14;
                                        if (i13 < i15) {
                                            layoutParams.x = i15;
                                        } else {
                                            int i16 = (AndroidUtilities.displaySize.x - layoutParams.width) + i14;
                                            if (i13 > i16) {
                                                layoutParams.x = i16;
                                            }
                                        }
                                        int i17 = layoutParams.x;
                                        if (i17 < 0) {
                                            f10 = w.c.c(i17, i14, 0.5f, 1.0f);
                                        } else {
                                            if (i17 > AndroidUtilities.displaySize.x - layoutParams.width) {
                                                f10 = org.telegram.messenger.y3.A((i17 - r9) + r8, i14, 0.5f, 1.0f);
                                            }
                                        }
                                        if (themeEditorView.a.getAlpha() != f10) {
                                            themeEditorView.a.setAlpha(f10);
                                        }
                                        WindowManager.LayoutParams layoutParams2 = themeEditorView.g;
                                        int i18 = layoutParams2.y;
                                        if (i18 < 0) {
                                            layoutParams2.y = 0;
                                        } else {
                                            int i19 = AndroidUtilities.displaySize.y - layoutParams2.height;
                                            if (i18 > i19) {
                                                layoutParams2.y = i19;
                                            }
                                        }
                                        themeEditorView.h.updateViewLayout(themeEditorView.a, layoutParams2);
                                        this.a = rawX;
                                        this.b = rawY;
                                    } else {
                                        if (motionEvent.getAction() != 1) {
                                            return true;
                                        }
                                        this.c = false;
                                        int b10 = ThemeEditorView.b(true, 0, 0.0f, i11);
                                        int b11 = ThemeEditorView.b(true, 1, 0.0f, i11);
                                        int i20 = themeEditorView.f;
                                        int b12 = ThemeEditorView.b(false, 0, 0.0f, i20);
                                        int b13 = ThemeEditorView.b(false, 1, 0.0f, i20);
                                        SharedPreferences.Editor edit = themeEditorView.j.edit();
                                        int dp = AndroidUtilities.dp(20.0f);
                                        if (Math.abs(b10 - themeEditorView.g.x) <= dp || ((i10 = themeEditorView.g.x) < 0 && i10 > (-i11) / 4)) {
                                            arrayList = new ArrayList();
                                            edit.putInt("sidex", 0);
                                            if (themeEditorView.a.getAlpha() != 1.0f) {
                                                arrayList.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<c11, Float>) property, 1.0f));
                                            }
                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", b10));
                                        } else {
                                            if (Math.abs(b11 - i10) > dp) {
                                                int i21 = themeEditorView.g.x;
                                                int i22 = AndroidUtilities.displaySize.x;
                                                if (i21 <= i22 - i11 || i21 >= i22 - ((i11 / 4) * 3)) {
                                                    if (themeEditorView.a.getAlpha() != 1.0f) {
                                                        arrayList = new ArrayList();
                                                        if (themeEditorView.g.x < 0) {
                                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", -i11));
                                                        } else {
                                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", AndroidUtilities.displaySize.x));
                                                        }
                                                        z4 = true;
                                                    } else {
                                                        edit.putFloat("px", (themeEditorView.g.x - b10) / (b11 - b10));
                                                        edit.putInt("sidex", 2);
                                                        z4 = false;
                                                        arrayList = null;
                                                    }
                                                    if (!z4) {
                                                        if (Math.abs(b12 - themeEditorView.g.y) <= dp || themeEditorView.g.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                                                            if (arrayList == null) {
                                                                arrayList = new ArrayList();
                                                            }
                                                            edit.putInt("sidey", 0);
                                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", b12));
                                                        } else if (Math.abs(b13 - themeEditorView.g.y) <= dp) {
                                                            if (arrayList == null) {
                                                                arrayList = new ArrayList();
                                                            }
                                                            edit.putInt("sidey", 1);
                                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", b13));
                                                        } else {
                                                            edit.putFloat("py", (themeEditorView.g.y - b12) / (b13 - b12));
                                                            edit.putInt("sidey", 2);
                                                        }
                                                        edit.commit();
                                                    }
                                                    if (arrayList != null) {
                                                        if (themeEditorView.i == null) {
                                                            themeEditorView.i = new DecelerateInterpolator();
                                                        }
                                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                                        animatorSet2.setInterpolator(themeEditorView.i);
                                                        animatorSet2.setDuration(150L);
                                                        if (z4) {
                                                            z10 = true;
                                                            arrayList.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<c11, Float>) property, 0.0f));
                                                            animatorSet2.addListener(new e11(themeEditorView, 1 == true ? 1 : 0));
                                                        } else {
                                                            z10 = true;
                                                        }
                                                        animatorSet2.playTogether(arrayList);
                                                        animatorSet2.start();
                                                        return z10;
                                                    }
                                                }
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            edit.putInt("sidex", 1);
                                            if (themeEditorView.a.getAlpha() != 1.0f) {
                                                arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<c11, Float>) property, 1.0f));
                                            }
                                            arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", b11));
                                            arrayList = arrayList2;
                                        }
                                        z4 = false;
                                        if (!z4) {
                                        }
                                        if (arrayList != null) {
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
                f5Var = null;
                if (f5Var == null) {
                }
                if (f5Var != null) {
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
