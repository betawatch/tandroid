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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dz0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(ThemeEditorView themeEditorView, Activity activity) {
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
        org.telegram.ui.ActionBar.q4 q4Var;
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        int i3;
        float f10;
        ThemeEditorView themeEditorView = this.d;
        int i10 = themeEditorView.g;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        int i11 = 4;
        Property property = View.ALPHA;
        int i12 = 0;
        boolean z13 = true;
        if (action == 0) {
            this.a = rawX;
            this.b = rawY;
        } else if (motionEvent.getAction() != 2 || this.c) {
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.n == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.d;
                if (org.telegram.messenger.g0.Q1()) {
                    q4Var = launchActivity.s0;
                    if (q4Var != null && q4Var.getFragmentStack().isEmpty()) {
                        q4Var = null;
                    }
                    if (q4Var == null) {
                        q4Var = launchActivity.t0;
                        if (q4Var != null) {
                        }
                    }
                    if (q4Var == null) {
                        q4Var = launchActivity.M();
                    }
                    if (q4Var != null) {
                        org.telegram.ui.ActionBar.d2 d2Var = !q4Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.d2) q4Var.getFragmentStack().get(q4Var.getFragmentStack().size() - 1) : null;
                        if (d2Var != null) {
                            ArrayList arrayList3 = new ArrayList();
                            HashSet hashSet = new HashSet();
                            try {
                                arrayList = d2Var.getThemeDescriptions();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    org.telegram.ui.ActionBar.t6 t6Var = arrayList.get(i13);
                                    if (t6Var != null) {
                                        arrayList3.add(t6Var);
                                        hashSet.add(Integer.valueOf(t6Var.e));
                                    }
                                }
                            }
                            HashSet<Integer> s6 = org.telegram.ui.ActionBar.r6.s();
                            try {
                                d2Var.addThemeColorKeys(s6);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            ArrayList arrayList4 = new ArrayList(s6);
                            Collections.sort(arrayList4, new d80(8));
                            int i14 = 0;
                            while (i14 < arrayList4.size()) {
                                Integer num = (Integer) arrayList4.get(i14);
                                int intValue = num.intValue();
                                boolean z14 = z13;
                                if (intValue >= 0 && intValue < org.telegram.ui.ActionBar.k6.f5 && hashSet.add(num)) {
                                    arrayList3.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, intValue));
                                }
                                i14++;
                                z13 = z14;
                            }
                            z10 = z13;
                            if (!arrayList3.isEmpty()) {
                                ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.d, arrayList3);
                                themeEditorView.n = editorAlert;
                                editorAlert.setOnDismissListener(new gi.d1(i11));
                                themeEditorView.n.setOnDismissListener(new p0(this, 10));
                                themeEditorView.n.show();
                                if (themeEditorView.d != null) {
                                    try {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) property, 1.0f, 0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) View.SCALE_X, 1.0f, 0.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) View.SCALE_Y, 1.0f, 0.0f);
                                        Animator[] animatorArr = new Animator[3];
                                        animatorArr[0] = ofFloat;
                                        animatorArr[z10 ? 1 : 0] = ofFloat2;
                                        animatorArr[2] = ofFloat3;
                                        animatorSet.playTogether(animatorArr);
                                        animatorSet.setInterpolator(themeEditorView.k);
                                        animatorSet.setDuration(150L);
                                        animatorSet.addListener(new fz0(themeEditorView, i12));
                                        animatorSet.start();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (this.c) {
                                float f11 = 1.0f;
                                if (motionEvent.getAction() == 2) {
                                    float f12 = rawX - this.a;
                                    float f13 = rawY - this.b;
                                    WindowManager.LayoutParams layoutParams = themeEditorView.i;
                                    int i15 = (int) (layoutParams.x + f12);
                                    layoutParams.x = i15;
                                    layoutParams.y = (int) (layoutParams.y + f13);
                                    int i16 = i10 / 2;
                                    int i17 = -i16;
                                    if (i15 < i17) {
                                        layoutParams.x = i17;
                                    } else {
                                        int i18 = (org.telegram.messenger.g0.q.x - layoutParams.width) + i16;
                                        if (i15 > i18) {
                                            layoutParams.x = i18;
                                        }
                                    }
                                    int i19 = layoutParams.x;
                                    if (i19 < 0) {
                                        f11 = a1.g.A(i19, i16, 0.5f, 1.0f);
                                    } else {
                                        if (i19 > org.telegram.messenger.g0.q.x - layoutParams.width) {
                                            f11 = org.telegram.messenger.camera.q.v((i19 - r9) + r7, i16, 0.5f, 1.0f);
                                        }
                                    }
                                    if (themeEditorView.c.getAlpha() != f11) {
                                        themeEditorView.c.setAlpha(f11);
                                    }
                                    WindowManager.LayoutParams layoutParams2 = themeEditorView.i;
                                    int i20 = layoutParams2.y;
                                    if (i20 < 0) {
                                        layoutParams2.y = 0;
                                    } else {
                                        int i21 = org.telegram.messenger.g0.q.y - layoutParams2.height;
                                        if (i20 > i21) {
                                            layoutParams2.y = i21;
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
                                    int c2 = ThemeEditorView.c(0.0f, 0, i10, z15);
                                    int c10 = ThemeEditorView.c(0.0f, z15 ? 1 : 0, i10, z15);
                                    int i22 = themeEditorView.h;
                                    int c11 = ThemeEditorView.c(0.0f, 0, i22, false);
                                    int c12 = ThemeEditorView.c(0.0f, z15 ? 1 : 0, i22, false);
                                    SharedPreferences.Editor edit = themeEditorView.l.edit();
                                    int L = org.telegram.messenger.g0.L(20.0f);
                                    if (Math.abs(c2 - themeEditorView.i.x) <= L || ((i3 = themeEditorView.i.x) < 0 && i3 > (-i10) / 4)) {
                                        arrayList2 = new ArrayList();
                                        edit.putInt("sidex", 0);
                                        if (themeEditorView.c.getAlpha() != 1.0f) {
                                            arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) property, 1.0f));
                                        }
                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", c2));
                                    } else {
                                        if (Math.abs(c10 - i3) > L) {
                                            int i23 = themeEditorView.i.x;
                                            Point point = org.telegram.messenger.g0.q;
                                            f10 = 1.0f;
                                            int i24 = point.x;
                                            if (i23 <= i24 - i10 || i23 >= i24 - ((i10 / 4) * 3)) {
                                                if (themeEditorView.c.getAlpha() != 1.0f) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    if (themeEditorView.i.x < 0) {
                                                        arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", -i10));
                                                    } else {
                                                        arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", point.x));
                                                    }
                                                    arrayList2 = arrayList5;
                                                    z11 = true;
                                                } else {
                                                    edit.putFloat("px", (themeEditorView.i.x - c2) / (c10 - c2));
                                                    edit.putInt("sidex", 2);
                                                    z11 = false;
                                                    arrayList2 = null;
                                                }
                                                if (!z11) {
                                                    if (Math.abs(c11 - themeEditorView.i.y) <= L || themeEditorView.i.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                        }
                                                        edit.putInt("sidey", 0);
                                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", c11));
                                                    } else if (Math.abs(c12 - themeEditorView.i.y) <= L) {
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                        }
                                                        edit.putInt("sidey", 1);
                                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", c12));
                                                    } else {
                                                        edit.putFloat("py", (themeEditorView.i.y - c11) / (c12 - c11));
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
                                                    arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) property, 0.0f));
                                                    animatorSet2.addListener(new fz0(themeEditorView, 1 == true ? 1 : 0));
                                                } else {
                                                    z12 = true;
                                                }
                                                animatorSet2.playTogether(arrayList2);
                                                animatorSet2.start();
                                                return z12;
                                            }
                                        } else {
                                            f10 = 1.0f;
                                        }
                                        arrayList2 = new ArrayList();
                                        edit.putInt("sidex", 1);
                                        if (themeEditorView.c.getAlpha() != f10) {
                                            arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) property, f10));
                                        }
                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", c10));
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
                q4Var = null;
                if (q4Var == null) {
                }
                if (q4Var != null) {
                }
            }
        } else if (Math.abs(this.a - rawX) >= org.telegram.messenger.g0.a1(true, 0.3f) || Math.abs(this.b - rawY) >= org.telegram.messenger.g0.a1(false, 0.3f)) {
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
