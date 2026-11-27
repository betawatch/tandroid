package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class r extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0088, code lost:
    
        if (r14.getFragmentStack().isEmpty() != false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03f3 A[ORIG_RETURN, RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wk5 wk5Var;
        ArrayList<apb> arrayList;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        ThemeEditorView themeEditorView = this.d;
        int i3 = themeEditorView.g;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        Property property = View.ALPHA;
        Object[] objArr = 0;
        if (action == 0) {
            this.a = rawX;
            this.b = rawY;
        } else if (motionEvent.getAction() != 2 || this.c) {
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.n == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.d;
                if (hl.O1()) {
                    wk5Var = launchActivity.q0;
                    if (wk5Var != null && wk5Var.getFragmentStack().isEmpty()) {
                        wk5Var = null;
                    }
                    if (wk5Var == null) {
                        wk5Var = launchActivity.r0;
                        if (wk5Var != null) {
                        }
                    }
                    if (wk5Var == null) {
                        wk5Var = launchActivity.N();
                    }
                    if (wk5Var != null) {
                        org.telegram.ui.ActionBar.e eVar = !wk5Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.e) wk5Var.getFragmentStack().get(wk5Var.getFragmentStack().size() - 1) : null;
                        if (eVar != null) {
                            ArrayList arrayList3 = new ArrayList();
                            HashSet hashSet = new HashSet();
                            try {
                                arrayList = eVar.getThemeDescriptions();
                            } catch (Exception e) {
                                cc4.g(e, true);
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                    apb apbVar = arrayList.get(i4);
                                    if (apbVar != null) {
                                        arrayList3.add(apbVar);
                                        hashSet.add(Integer.valueOf(apbVar.e));
                                    }
                                }
                            }
                            HashSet<Integer> r = yob.r();
                            try {
                                eVar.addThemeColorKeys(r);
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            ArrayList arrayList4 = new ArrayList(r);
                            Collections.sort(arrayList4, new fna((byte) 8));
                            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                                Integer num = (Integer) arrayList4.get(i5);
                                int intValue = num.intValue();
                                if (intValue >= 0 && intValue < aob.f5 && hashSet.add(num)) {
                                    arrayList3.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, intValue));
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.d, arrayList3);
                                themeEditorView.n = editorAlert;
                                editorAlert.setOnDismissListener(new h5((byte) 6));
                                themeEditorView.n.setOnDismissListener(new dl8(this, (byte) 12));
                                themeEditorView.n.show();
                                if (themeEditorView.d != null) {
                                    try {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) View.SCALE_Y, 1.0f, 0.0f));
                                        animatorSet.setInterpolator(themeEditorView.k);
                                        animatorSet.setDuration(150L);
                                        animatorSet.addListener(new bpb(themeEditorView, objArr == true ? 1 : 0));
                                        animatorSet.start();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                }
                wk5Var = null;
                if (wk5Var == null) {
                }
                if (wk5Var != null) {
                }
            }
        } else if (Math.abs(this.a - rawX) >= hl.Z0(true, 0.3f) || Math.abs(this.b - rawY) >= hl.Z0(false, 0.3f)) {
            this.c = true;
            this.a = rawX;
            this.b = rawY;
        }
        if (this.c) {
            float f2 = 1.0f;
            if (motionEvent.getAction() == 2) {
                float f3 = rawX - this.a;
                float f4 = rawY - this.b;
                WindowManager.LayoutParams layoutParams = themeEditorView.i;
                int i6 = (int) (layoutParams.x + f3);
                layoutParams.x = i6;
                layoutParams.y = (int) (layoutParams.y + f4);
                int i7 = i3 / 2;
                int i8 = -i7;
                if (i6 < i8) {
                    layoutParams.x = i8;
                } else {
                    i8 = (hl.q.x - layoutParams.width) + i7;
                    if (i6 > i8) {
                        layoutParams.x = i8;
                    }
                    if (i6 >= 0) {
                        f2 = c00.B(i6, i7, 0.5f, 1.0f);
                    } else {
                        if (i6 > hl.q.x - layoutParams.width) {
                            f2 = uh9.x((i6 - r9) + r8, i7, 0.5f, 1.0f);
                        }
                    }
                    if (themeEditorView.c.getAlpha() != f2) {
                        themeEditorView.c.setAlpha(f2);
                    }
                    WindowManager.LayoutParams layoutParams2 = themeEditorView.i;
                    i2 = layoutParams2.y;
                    if (i2 >= 0) {
                        layoutParams2.y = 0;
                    } else {
                        int i9 = hl.q.y - layoutParams2.height;
                        if (i2 > i9) {
                            layoutParams2.y = i9;
                        }
                    }
                    themeEditorView.j.updateViewLayout(themeEditorView.c, layoutParams2);
                    this.a = rawX;
                    this.b = rawY;
                }
                i6 = i8;
                if (i6 >= 0) {
                }
                if (themeEditorView.c.getAlpha() != f2) {
                }
                WindowManager.LayoutParams layoutParams22 = themeEditorView.i;
                i2 = layoutParams22.y;
                if (i2 >= 0) {
                }
                themeEditorView.j.updateViewLayout(themeEditorView.c, layoutParams22);
                this.a = rawX;
                this.b = rawY;
            } else if (motionEvent.getAction() == 1) {
                this.c = false;
                int b = ThemeEditorView.b(0.0f, 0, i3, true);
                int b2 = ThemeEditorView.b(0.0f, 1, i3, true);
                int i10 = themeEditorView.h;
                int b3 = ThemeEditorView.b(0.0f, 0, i10, false);
                int b4 = ThemeEditorView.b(0.0f, 1, i10, false);
                SharedPreferences.Editor edit = themeEditorView.l.edit();
                int L = hl.L(20.0f);
                if (Math.abs(b - themeEditorView.i.x) <= L || ((i = themeEditorView.i.x) < 0 && i > (-i3) / 4)) {
                    ArrayList arrayList5 = new ArrayList();
                    edit.putInt("sidex", 0);
                    if (themeEditorView.c.getAlpha() != 1.0f) {
                        arrayList5.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) property, 1.0f));
                    }
                    arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", b));
                    arrayList2 = arrayList5;
                } else {
                    if (Math.abs(b2 - i) > L) {
                        int i11 = themeEditorView.i.x;
                        Point point = hl.q;
                        f = 1.0f;
                        int i12 = point.x;
                        if (i11 <= i12 - i3 || i11 >= i12 - ((i3 / 4) * 3)) {
                            if (themeEditorView.c.getAlpha() != 1.0f) {
                                arrayList2 = new ArrayList();
                                if (themeEditorView.i.x < 0) {
                                    arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", -i3));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", point.x));
                                }
                                z = true;
                            } else {
                                edit.putFloat("px", (themeEditorView.i.x - b) / (b2 - b));
                                edit.putInt("sidex", 2);
                                z = false;
                                arrayList2 = null;
                            }
                            if (!z) {
                                if (Math.abs(b3 - themeEditorView.i.y) <= L || themeEditorView.i.y <= org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    edit.putInt("sidey", 0);
                                    arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", b3));
                                } else if (Math.abs(b4 - themeEditorView.i.y) <= L) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    edit.putInt("sidey", 1);
                                    arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", b4));
                                } else {
                                    edit.putFloat("py", (themeEditorView.i.y - b3) / (b4 - b3));
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
                            if (z) {
                                z2 = true;
                                arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) property, 0.0f));
                                animatorSet2.addListener(new bpb(themeEditorView, 1 == true ? 1 : 0));
                            } else {
                                z2 = true;
                            }
                            animatorSet2.playTogether(arrayList2);
                            animatorSet2.start();
                            return z2;
                        }
                    } else {
                        f = 1.0f;
                    }
                    arrayList2 = new ArrayList();
                    edit.putInt("sidex", 1);
                    if (themeEditorView.c.getAlpha() != f) {
                        arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) property, f));
                    }
                    arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", b2));
                }
                z = false;
                if (!z) {
                }
                if (arrayList2 != null) {
                }
            }
        }
        return true;
    }
}
