package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ThemeEditorView.EditorAlert;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i01 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x008a, code lost:
    
        if (r15.getFragmentStack().isEmpty() != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0407 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.z4 z4Var;
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        int i10;
        float f7;
        ThemeEditorView themeEditorView = this.d;
        int i11 = themeEditorView.g;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        int i12 = 4;
        Property property = View.ALPHA;
        int i13 = 0;
        boolean z13 = true;
        if (action == 0) {
            this.a = rawX;
            this.b = rawY;
        } else if (motionEvent.getAction() != 2 || this.c) {
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.n == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.d;
                if (org.telegram.messenger.i0.Q1()) {
                    z4Var = launchActivity.r0;
                    if (z4Var != null && z4Var.getFragmentStack().isEmpty()) {
                        z4Var = null;
                    }
                    if (z4Var == null) {
                        z4Var = launchActivity.s0;
                        if (z4Var != null) {
                        }
                    }
                    if (z4Var == null) {
                        z4Var = launchActivity.M();
                    }
                    if (z4Var != null) {
                        org.telegram.ui.ActionBar.k2 k2Var = !z4Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.k2) z4Var.getFragmentStack().get(z4Var.getFragmentStack().size() - 1) : null;
                        if (k2Var != null) {
                            ArrayList arrayList3 = new ArrayList();
                            HashSet hashSet = new HashSet();
                            try {
                                arrayList = k2Var.getThemeDescriptions();
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                    org.telegram.ui.ActionBar.c7 c7Var = arrayList.get(i14);
                                    if (c7Var != null) {
                                        arrayList3.add(c7Var);
                                        hashSet.add(Integer.valueOf(c7Var.e));
                                    }
                                }
                            }
                            HashSet<Integer> s10 = org.telegram.ui.ActionBar.a7.s();
                            try {
                                k2Var.addThemeColorKeys(s10);
                            } catch (Exception e10) {
                                org.telegram.messenger.f8.g(e10, true);
                            }
                            ArrayList arrayList4 = new ArrayList(s10);
                            Collections.sort(arrayList4, new org.telegram.ui.f6(20));
                            int i15 = 0;
                            while (i15 < arrayList4.size()) {
                                Integer num = (Integer) arrayList4.get(i15);
                                int intValue = num.intValue();
                                boolean z14 = z13;
                                if (intValue >= 0 && intValue < org.telegram.ui.ActionBar.t6.f5 && hashSet.add(num)) {
                                    arrayList3.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, intValue));
                                }
                                i15++;
                                z13 = z14;
                            }
                            z10 = z13;
                            if (!arrayList3.isEmpty()) {
                                ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.d, arrayList3);
                                themeEditorView.n = editorAlert;
                                editorAlert.setOnDismissListener(new jg.z(i12));
                                themeEditorView.n.setOnDismissListener(new r0(this, 10));
                                themeEditorView.n.show();
                                if (themeEditorView.d != null) {
                                    try {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(themeEditorView.c, (Property<i01, Float>) property, 1.0f, 0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(themeEditorView.c, (Property<i01, Float>) View.SCALE_X, 1.0f, 0.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(themeEditorView.c, (Property<i01, Float>) View.SCALE_Y, 1.0f, 0.0f);
                                        Animator[] animatorArr = new Animator[3];
                                        animatorArr[0] = ofFloat;
                                        animatorArr[z10 ? 1 : 0] = ofFloat2;
                                        animatorArr[2] = ofFloat3;
                                        animatorSet.playTogether(animatorArr);
                                        animatorSet.setInterpolator(themeEditorView.k);
                                        animatorSet.setDuration(150L);
                                        animatorSet.addListener(new k01(themeEditorView, i13));
                                        animatorSet.start();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (this.c) {
                                float f10 = 1.0f;
                                if (motionEvent.getAction() == 2) {
                                    float f11 = rawX - this.a;
                                    float f12 = rawY - this.b;
                                    WindowManager.LayoutParams layoutParams = themeEditorView.i;
                                    int i16 = (int) (layoutParams.x + f11);
                                    layoutParams.x = i16;
                                    layoutParams.y = (int) (layoutParams.y + f12);
                                    int i17 = i11 / 2;
                                    int i18 = -i17;
                                    if (i16 < i18) {
                                        layoutParams.x = i18;
                                    } else {
                                        int i19 = (org.telegram.messenger.i0.q.x - layoutParams.width) + i17;
                                        if (i16 > i19) {
                                            layoutParams.x = i19;
                                        }
                                    }
                                    int i20 = layoutParams.x;
                                    if (i20 < 0) {
                                        f10 = a1.g.c(i20, i17, 0.5f, 1.0f);
                                    } else {
                                        if (i20 > org.telegram.messenger.i0.q.x - layoutParams.width) {
                                            f10 = org.telegram.messenger.z20.v((i20 - r9) + r7, i17, 0.5f, 1.0f);
                                        }
                                    }
                                    if (themeEditorView.c.getAlpha() != f10) {
                                        themeEditorView.c.setAlpha(f10);
                                    }
                                    WindowManager.LayoutParams layoutParams2 = themeEditorView.i;
                                    int i21 = layoutParams2.y;
                                    if (i21 < 0) {
                                        layoutParams2.y = 0;
                                    } else {
                                        int i22 = org.telegram.messenger.i0.q.y - layoutParams2.height;
                                        if (i21 > i22) {
                                            layoutParams2.y = i22;
                                        }
                                    }
                                    themeEditorView.j.updateViewLayout(themeEditorView.c, layoutParams2);
                                    this.a = rawX;
                                    this.b = rawY;
                                } else {
                                    boolean z15 = z10;
                                    if (motionEvent.getAction() != z15) {
                                        return z15;
                                    }
                                    this.c = false;
                                    int c10 = ThemeEditorView.c(0.0f, 0, i11, z15);
                                    int c11 = ThemeEditorView.c(0.0f, z15 ? 1 : 0, i11, z15);
                                    int i23 = themeEditorView.h;
                                    int c12 = ThemeEditorView.c(0.0f, 0, i23, false);
                                    int c13 = ThemeEditorView.c(0.0f, z15 ? 1 : 0, i23, false);
                                    SharedPreferences.Editor edit = themeEditorView.l.edit();
                                    int L = org.telegram.messenger.i0.L(20.0f);
                                    if (Math.abs(c10 - themeEditorView.i.x) <= L || ((i10 = themeEditorView.i.x) < 0 && i10 > (-i11) / 4)) {
                                        arrayList2 = new ArrayList();
                                        edit.putInt("sidex", 0);
                                        if (themeEditorView.c.getAlpha() != 1.0f) {
                                            arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<i01, Float>) property, 1.0f));
                                        }
                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", c10));
                                    } else {
                                        if (Math.abs(c11 - i10) > L) {
                                            int i24 = themeEditorView.i.x;
                                            Point point = org.telegram.messenger.i0.q;
                                            f7 = 1.0f;
                                            int i25 = point.x;
                                            if (i24 <= i25 - i11 || i24 >= i25 - ((i11 / 4) * 3)) {
                                                if (themeEditorView.c.getAlpha() != 1.0f) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    if (themeEditorView.i.x < 0) {
                                                        arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", -i11));
                                                    } else {
                                                        arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", point.x));
                                                    }
                                                    arrayList2 = arrayList5;
                                                    z11 = true;
                                                } else {
                                                    edit.putFloat("px", (themeEditorView.i.x - c10) / (c11 - c10));
                                                    edit.putInt("sidex", 2);
                                                    z11 = false;
                                                    arrayList2 = null;
                                                }
                                                if (!z11) {
                                                    if (Math.abs(c12 - themeEditorView.i.y) <= L || themeEditorView.i.y <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                        }
                                                        edit.putInt("sidey", 0);
                                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", c12));
                                                    } else if (Math.abs(c13 - themeEditorView.i.y) <= L) {
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                        }
                                                        edit.putInt("sidey", 1);
                                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", c13));
                                                    } else {
                                                        edit.putFloat("py", (themeEditorView.i.y - c12) / (c13 - c12));
                                                        edit.putInt("sidey", 2);
                                                    }
                                                    edit.commit();
                                                }
                                                if (arrayList2 != null) {
                                                    return true;
                                                }
                                                if (themeEditorView.k == null) {
                                                    themeEditorView.k = new DecelerateInterpolator();
                                                }
                                                AnimatorSet animatorSet2 = new AnimatorSet();
                                                animatorSet2.setInterpolator(themeEditorView.k);
                                                animatorSet2.setDuration(150L);
                                                if (z11) {
                                                    z12 = true;
                                                    arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<i01, Float>) property, 0.0f));
                                                    animatorSet2.addListener(new k01(themeEditorView, 1 == true ? 1 : 0));
                                                } else {
                                                    z12 = true;
                                                }
                                                animatorSet2.playTogether(arrayList2);
                                                animatorSet2.start();
                                                return z12;
                                            }
                                        } else {
                                            f7 = 1.0f;
                                        }
                                        arrayList2 = new ArrayList();
                                        edit.putInt("sidex", 1);
                                        if (themeEditorView.c.getAlpha() != f7) {
                                            arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<i01, Float>) property, f7));
                                        }
                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", c11));
                                    }
                                    z11 = false;
                                    if (!z11) {
                                    }
                                    if (arrayList2 != null) {
                                    }
                                }
                            }
                            return z10;
                        }
                    }
                }
                z4Var = null;
                if (z4Var == null) {
                }
                if (z4Var != null) {
                }
            }
        } else if (Math.abs(this.a - rawX) >= org.telegram.messenger.i0.a1(true, 0.3f) || Math.abs(this.b - rawY) >= org.telegram.messenger.i0.a1(false, 0.3f)) {
            this.c = true;
            this.a = rawX;
            this.b = rawY;
        }
        z10 = true;
        if (this.c) {
        }
        return z10;
    }
}
