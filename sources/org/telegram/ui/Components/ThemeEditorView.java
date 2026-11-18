package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class ThemeEditorView {
    public static volatile ThemeEditorView p;
    public boolean a;
    public nz0 c;
    public Activity d;
    public ArrayList e;
    public int f;
    public WindowManager.LayoutParams i;
    public WindowManager j;
    public DecelerateInterpolator k;
    public SharedPreferences l;
    public a8.r7 m;
    public EditorAlert n;
    public org.telegram.ui.ActionBar.m6 o;
    public final gk b = new gk(this, 19);
    public final int g = org.telegram.messenger.g0.L(54.0f);
    public final int h = org.telegram.messenger.g0.L(54.0f);

    /* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
    public class EditorAlert extends org.telegram.ui.ActionBar.x2 {
        public static final /* synthetic */ int H1 = 0;
        public int A1;
        public int B1;
        public boolean C1;
        public AnimatorSet D1;
        public boolean E1;
        public boolean F1;
        public final yz0 m1;
        public final sz0 n1;
        public final FrameLayout o1;
        public final ty p1;
        public final e01 q1;
        public final v4.c0 r1;
        public final zz0 s1;
        public final a01 t1;
        public final FrameLayout u1;
        public final FrameLayout v1;
        public final View[] w1;
        public final AnimatorSet[] x1;
        public final Drawable y1;
        public int z1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            final int i7 = 1;
            this.w1 = new View[2];
            this.x1 = new AnimatorSet[2];
            this.y1 = i5.c.g(context, R.drawable.sheet_shadow_round);
            rz0 rz0Var = new rz0(this, context);
            this.b = rz0Var;
            final int i10 = 0;
            rz0Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.b;
            int i11 = this.u0;
            viewGroup.setPadding(i11, 0, i11, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.o1 = frameLayout;
            frameLayout.setBackgroundColor(-1);
            e01 e01Var = new e01(this, context);
            this.q1 = e01Var;
            frameLayout.addView(e01Var, c8.ma.e(-1, -1, 51));
            sz0 sz0Var = new sz0(this, context);
            this.n1 = sz0Var;
            sz0Var.setSelectorDrawableColor(251658240);
            float f10 = 48.0f;
            sz0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
            sz0Var.setClipToPadding(false);
            getContext();
            v4.c0 c0Var = new v4.c0();
            this.r1 = c0Var;
            sz0Var.setLayoutManager(c0Var);
            sz0Var.setHorizontalScrollBarEnabled(false);
            sz0Var.setVerticalScrollBarEnabled(false);
            this.b.addView(sz0Var, c8.ma.e(-1, -1, 51));
            zz0 zz0Var = new zz0();
            zz0Var.d = new ArrayList();
            zz0Var.c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) arrayList.get(i12);
                int i13 = w6Var.e;
                float f11 = f10;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i13));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i13), arrayList2);
                    zz0Var.d.add(arrayList2);
                }
                arrayList2.add(w6Var);
                i12++;
                f10 = f11;
            }
            float f12 = f10;
            if (Build.VERSION.SDK_INT >= 26) {
                int i14 = org.telegram.ui.ActionBar.n6.a7;
                if (!hashMap.containsKey(Integer.valueOf(i14))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
                    zz0Var.d.add(arrayList3);
                }
            }
            this.s1 = zz0Var;
            sz0Var.setAdapter(zz0Var);
            this.t1 = new a01(this, context);
            this.n1.setGlowColor(-657673);
            this.n1.setItemAnimator(null);
            this.n1.setLayoutAnimation(null);
            this.n1.setOnItemClickListener(new n(this, 18));
            this.n1.setOnScrollListener(new tz0(this));
            ty tyVar = new ty(context, null);
            this.p1 = tyVar;
            tyVar.setShowAtCenter(true);
            tyVar.c();
            tyVar.setText(org.telegram.messenger.gd.M0(2131747975, null));
            this.n1.setEmptyView(tyVar);
            this.b.addView(tyVar, c8.ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
            layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
            this.w1[0] = new View(context);
            this.w1[0].setBackgroundColor(301989888);
            this.w1[0].setAlpha(0.0f);
            this.w1[0].setTag(1);
            this.b.addView(this.w1[0], layoutParams);
            this.b.addView(this.o1, c8.ma.e(-1, 58, 51));
            yz0 yz0Var = new yz0(this, context);
            this.m1 = yz0Var;
            yz0Var.setVisibility(8);
            this.b.addView(yz0Var, c8.ma.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(f12);
            this.w1[1] = new View(context);
            this.w1[1].setBackgroundColor(301989888);
            this.b.addView(this.w1[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.u1 = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.b.addView(frameLayout2, c8.ma.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setText(org.telegram.messenger.gd.M0(2131752029, null).toUpperCase());
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView, c8.ma.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qz0
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i10;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i15) {
                        case 0:
                            int i16 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView2.e.size(); i17++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.e.get(i17);
                                w6Var2.e(w6Var2.h, w6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.e.get(i18);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            break;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView2.setText(org.telegram.messenger.gd.M0(2131745737, null).toUpperCase());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView2, c8.ma.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qz0
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i7;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i15) {
                        case 0:
                            int i16 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView2.e.size(); i17++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.e.get(i17);
                                w6Var2.e(w6Var2.h, w6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.e.get(i18);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.v1 = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.b.addView(frameLayout3, c8.ma.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView3.setText(org.telegram.messenger.gd.M0(2131752578, null).toUpperCase());
            textView3.setTypeface(org.telegram.messenger.g0.o());
            frameLayout3.addView(textView3, c8.ma.e(-2, -1, 51));
            final int i15 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qz0
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i15;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i152) {
                        case 0:
                            int i16 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView2.e.size(); i17++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.e.get(i17);
                                w6Var2.e(w6Var2.h, w6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.e.get(i18);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, c8.ma.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView4.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView4.setText(org.telegram.messenger.gd.M0(2131751589, null).toUpperCase());
            textView4.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView4, c8.ma.e(-2, -1, 51));
            final int i16 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qz0
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i16;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i152) {
                        case 0:
                            int i162 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i17 = 0; i17 < themeEditorView2.e.size(); i17++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.e.get(i17);
                                w6Var2.e(w6Var2.h, w6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.e.get(i18);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            break;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(788529152, 0, -1));
            textView5.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView5.setText(org.telegram.messenger.gd.M0(2131745751, null).toUpperCase());
            textView5.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView5, c8.ma.e(-2, -1, 51));
            final int i17 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qz0
                public final /* synthetic */ ThemeEditorView.EditorAlert b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i17;
                    ThemeEditorView.EditorAlert editorAlert = this.b;
                    switch (i152) {
                        case 0:
                            int i162 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.n6.x1(themeEditorView.o, true, false, false);
                            editorAlert.setOnDismissListener(null);
                            editorAlert.dismiss();
                            try {
                                themeEditorView.j.removeView(themeEditorView.c);
                            } catch (Exception unused) {
                            }
                            themeEditorView.d = null;
                            break;
                        case 2:
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            for (int i172 = 0; i172 < themeEditorView2.e.size(); i172++) {
                                org.telegram.ui.ActionBar.w6 w6Var2 = (org.telegram.ui.ActionBar.w6) themeEditorView2.e.get(i172);
                                w6Var2.e(w6Var2.h, w6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.M0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.w6 w6Var3 = (org.telegram.ui.ActionBar.w6) themeEditorView3.e.get(i18);
                                w6Var3.e(org.telegram.ui.ActionBar.n6.F0(w6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.M0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.H1;
                            editorAlert.M0(false);
                            break;
                    }
                }
            });
        }

        public static void J0(EditorAlert editorAlert) {
            sz0 sz0Var = editorAlert.n1;
            if (sz0Var.getChildCount() <= 0 || sz0Var.getVisibility() != 0 || editorAlert.C1) {
                return;
            }
            int i7 = 0;
            View childAt = sz0Var.getChildAt(0);
            kj0 kj0Var = (kj0) sz0Var.G(childAt);
            int paddingTop = (sz0Var.getVisibility() != 0 || editorAlert.C1) ? sz0Var.getPaddingTop() : childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
            if (paddingTop <= (-org.telegram.messenger.g0.L(1.0f)) || kj0Var == null || kj0Var.b() != 0) {
                editorAlert.L0(true);
            } else {
                editorAlert.L0(false);
                i7 = paddingTop;
            }
            if (editorAlert.z1 != i7) {
                editorAlert.setScrollOffsetY(i7);
            }
        }

        public static int K0(EditorAlert editorAlert) {
            sz0 sz0Var = editorAlert.n1;
            if (sz0Var.getChildCount() == 0) {
                return -1000;
            }
            int i7 = 0;
            View childAt = sz0Var.getChildAt(0);
            kj0 kj0Var = (kj0) sz0Var.G(childAt);
            if (kj0Var == null) {
                return -1000;
            }
            int paddingTop = sz0Var.getPaddingTop();
            if (kj0Var.b() == 0 && childAt.getTop() >= 0) {
                i7 = childAt.getTop();
            }
            return paddingTop - i7;
        }

        @Override // org.telegram.ui.ActionBar.x2
        public final boolean G() {
            return false;
        }

        @Override // org.telegram.ui.ActionBar.x2
        public final void L() {
            super.L();
            e01 e01Var = this.q1;
            if (e01Var.b.isFocused()) {
                org.telegram.messenger.g0.v1(e01Var.b);
            }
        }

        public final void L0(boolean z10) {
            View[] viewArr = this.w1;
            if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
                return;
            }
            viewArr[0].setTag(z10 ? null : 1);
            if (z10) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.x1;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new uz0(this, z10));
            animatorSetArr[0].start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v5 */
        public final void M0(boolean z10) {
            ?? r62;
            ty tyVar = this.p1;
            View[] viewArr = this.w1;
            FrameLayout frameLayout = this.o1;
            FrameLayout frameLayout2 = this.u1;
            FrameLayout frameLayout3 = this.v1;
            yz0 yz0Var = this.m1;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            sz0 sz0Var = this.n1;
            if (z10) {
                this.C1 = true;
                yz0Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                yz0Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.B1 = this.z1;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(yz0Var, (Property<yz0, Float>) property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(sz0Var, (Property<sz0, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(tyVar, (Property<ty, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", sz0Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.k);
                animatorSet.addListener(new vz0(this));
                animatorSet.start();
                return;
            }
            float f10 = 0.0f;
            Activity activity = themeEditorView.d;
            if (activity != null) {
                r62 = 0;
                ((LaunchActivity) activity).y0(false);
            } else {
                r62 = 0;
            }
            org.telegram.ui.ActionBar.n6.x1(themeEditorView.o, r62, r62, r62);
            if (sz0Var.getAdapter() == this.s1) {
                org.telegram.messenger.g0.v1(getCurrentFocus());
            }
            this.C1 = true;
            sz0Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.q1.setVisibility(r62);
            sz0Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yz0Var, (Property<yz0, Float>) property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(sz0Var, (Property<sz0, Float>) property2, fArr3);
            char c10 = r62;
            float[] fArr4 = new float[1];
            fArr4[c10] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, fArr4);
            View view = viewArr[c10];
            if (view.getTag() == null) {
                f10 = 1.0f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f10;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr5);
            float[] fArr6 = new float[1];
            fArr6[c10] = 1.0f;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tyVar, (Property<ty, Float>) property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c10] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.B1);
            Animator[] animatorArr = new Animator[8];
            animatorArr[c10] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofInt;
            animatorSet2.playTogether(animatorArr);
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(themeEditorView.k);
            animatorSet2.addListener(new wz0(this));
            animatorSet2.start();
            sz0Var.getAdapter().g(themeEditorView.f);
        }

        public int getScrollOffsetY() {
            return this.z1;
        }

        public void setScrollOffsetY(int i7) {
            this.z1 = i7;
            this.n1.setTopGlowOffset(i7);
            this.o1.setTranslationY(this.z1);
            this.m1.setTranslationY(this.z1);
            this.p1.setTranslationY(this.z1);
            this.b.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (themeEditorView.a) {
            return;
        }
        themeEditorView.a = true;
        org.telegram.messenger.g0.g3(themeEditorView.b);
    }

    public static int c(float f10, int i7, int i10, boolean z10) {
        int i11;
        if (z10) {
            i11 = org.telegram.messenger.g0.q.x;
        } else {
            i11 = org.telegram.messenger.g0.q.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int L = i7 == 0 ? org.telegram.messenger.g0.L(10.0f) : i7 == 1 ? (i11 - i10) - org.telegram.messenger.g0.L(10.0f) : Math.round((r0 - org.telegram.messenger.g0.L(20.0f)) * f10) + org.telegram.messenger.g0.L(10.0f);
        return !z10 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + L : L;
    }

    public final void b() {
        nz0 nz0Var;
        this.m.getClass();
        if (this.d == null || (nz0Var = this.c) == null) {
            return;
        }
        try {
            this.j.removeViewImmediate(nz0Var);
            this.c = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, false);
        }
        try {
            EditorAlert editorAlert = this.n;
            if (editorAlert != null) {
                editorAlert.dismiss();
                this.n = null;
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.d = null;
        p = null;
    }

    public final void d(Activity activity, org.telegram.ui.ActionBar.m6 m6Var) {
        if (p != null) {
            p.b();
        }
        this.o = m6Var;
        this.c = new nz0(this, activity);
        this.j = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        this.l = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.l.getInt("sidey", 0);
        float f10 = this.l.getFloat("px", 0.0f);
        float f11 = this.l.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.i = layoutParams;
            int i11 = this.g;
            layoutParams.width = i11;
            layoutParams.height = this.h;
            layoutParams.x = c(f10, i7, i11, true);
            this.i.y = c(f11, i10, this.h, false);
            WindowManager.LayoutParams layoutParams2 = this.i;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.w3(this.j, this.c, layoutParams2);
            this.j.addView(this.c, this.i);
            this.m = new a8.r7(activity, (WallpapersListActivity) null, new oz0(this));
            p = this;
            this.d = activity;
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void e() {
        this.c.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.c, (Property<nz0, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c, (Property<nz0, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c, (Property<nz0, Float>) View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.k);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public int getX() {
        return this.i.x;
    }

    public int getY() {
        return this.i.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.i;
        layoutParams.x = i7;
        this.j.updateViewLayout(this.c, layoutParams);
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.i;
        layoutParams.y = i7;
        this.j.updateViewLayout(this.c, layoutParams);
    }
}
