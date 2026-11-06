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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class ThemeEditorView {
    public static volatile ThemeEditorView p;
    public boolean a;
    public dz0 c;
    public Activity d;
    public ArrayList e;
    public int f;
    public WindowManager.LayoutParams i;
    public WindowManager j;
    public DecelerateInterpolator k;
    public SharedPreferences l;
    public a8.r7 m;
    public EditorAlert n;
    public org.telegram.ui.ActionBar.j6 o;
    public final dt b = new dt(this, 16);
    public final int g = org.telegram.messenger.g0.L(54.0f);
    public final int h = org.telegram.messenger.g0.L(54.0f);

    /* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
    public class EditorAlert extends org.telegram.ui.ActionBar.v2 {
        public static final /* synthetic */ int D1 = 0;
        public boolean A1;
        public boolean B1;
        public final oz0 i1;
        public final iz0 j1;
        public final FrameLayout k1;
        public final iy l1;
        public final uz0 m1;
        public final v4.b0 n1;
        public final pz0 o1;
        public final qz0 p1;
        public final FrameLayout q1;
        public final FrameLayout r1;
        public final View[] s1;
        public final AnimatorSet[] t1;
        public final Drawable u1;
        public int v1;
        public int w1;
        public int x1;
        public boolean y1;
        public AnimatorSet z1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditorAlert(Context context, ArrayList arrayList) {
            super(context, true);
            final int i7 = 1;
            this.s1 = new View[2];
            this.t1 = new AnimatorSet[2];
            this.u1 = jg.g.h(context, R.drawable.sheet_shadow_round);
            hz0 hz0Var = new hz0(this, context);
            this.b = hz0Var;
            final int i10 = 0;
            hz0Var.setWillNotDraw(false);
            ViewGroup viewGroup = this.b;
            int i11 = this.t0;
            viewGroup.setPadding(i11, 0, i11, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.k1 = frameLayout;
            frameLayout.setBackgroundColor(-1);
            uz0 uz0Var = new uz0(this, context);
            this.m1 = uz0Var;
            frameLayout.addView(uz0Var, c8.ha.e(-1, -1, 51));
            iz0 iz0Var = new iz0(this, context);
            this.j1 = iz0Var;
            iz0Var.setSelectorDrawableColor(251658240);
            float f10 = 48.0f;
            iz0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
            iz0Var.setClipToPadding(false);
            getContext();
            v4.b0 b0Var = new v4.b0();
            this.n1 = b0Var;
            iz0Var.setLayoutManager(b0Var);
            iz0Var.setHorizontalScrollBarEnabled(false);
            iz0Var.setVerticalScrollBarEnabled(false);
            this.b.addView(iz0Var, c8.ha.e(-1, -1, 51));
            pz0 pz0Var = new pz0();
            pz0Var.d = new ArrayList();
            pz0Var.c = context;
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) arrayList.get(i12);
                int i13 = t6Var.e;
                float f11 = f10;
                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(i13));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(Integer.valueOf(i13), arrayList2);
                    pz0Var.d.add(arrayList2);
                }
                arrayList2.add(t6Var);
                i12++;
                f10 = f11;
            }
            float f12 = f10;
            if (Build.VERSION.SDK_INT >= 26) {
                int i14 = org.telegram.ui.ActionBar.k6.a7;
                if (!hashMap.containsKey(Integer.valueOf(i14))) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                    pz0Var.d.add(arrayList3);
                }
            }
            this.o1 = pz0Var;
            iz0Var.setAdapter(pz0Var);
            this.p1 = new qz0(this, context);
            this.j1.setGlowColor(-657673);
            this.j1.setItemAnimator(null);
            this.j1.setLayoutAnimation(null);
            this.j1.setOnItemClickListener(new k(this, 18));
            this.j1.setOnScrollListener(new jz0(this));
            iy iyVar = new iy(context, null);
            this.l1 = iyVar;
            iyVar.setShowAtCenter(true);
            iyVar.c();
            iyVar.setText(org.telegram.messenger.hd.M0(2131748166, null));
            this.j1.setEmptyView(iyVar);
            this.b.addView(iyVar, c8.ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
            layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
            this.s1[0] = new View(context);
            this.s1[0].setBackgroundColor(301989888);
            this.s1[0].setAlpha(0.0f);
            this.s1[0].setTag(1);
            this.b.addView(this.s1[0], layoutParams);
            this.b.addView(this.k1, c8.ha.e(-1, 58, 51));
            oz0 oz0Var = new oz0(this, context);
            this.i1 = oz0Var;
            oz0Var.setVisibility(8);
            this.b.addView(oz0Var, c8.ha.e(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(f12);
            this.s1[1] = new View(context);
            this.s1[1].setBackgroundColor(301989888);
            this.b.addView(this.s1[1], layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.q1 = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            this.b.addView(frameLayout2, c8.ha.e(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setText(org.telegram.messenger.hd.M0(2131752040, null).toUpperCase());
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView, c8.ha.e(-2, -1, 51));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gz0
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
                            int i16 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.o, true, false, false);
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
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i17);
                                t6Var2.e(t6Var2.h, t6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i18);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView2.setText(org.telegram.messenger.hd.M0(2131745933, null).toUpperCase());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            frameLayout2.addView(textView2, c8.ha.e(-2, -1, 53));
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gz0
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
                            int i16 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.o, true, false, false);
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
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i17);
                                t6Var2.e(t6Var2.h, t6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i18);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.r1 = frameLayout3;
            frameLayout3.setVisibility(8);
            frameLayout3.setBackgroundColor(-1);
            this.b.addView(frameLayout3, c8.ha.e(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView3.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
            textView3.setTypeface(org.telegram.messenger.g0.o());
            frameLayout3.addView(textView3, c8.ha.e(-2, -1, 51));
            final int i15 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gz0
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
                            int i16 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.o, true, false, false);
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
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i17);
                                t6Var2.e(t6Var2.h, t6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i18);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            frameLayout3.addView(linearLayout, c8.ha.e(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView4.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView4.setText(org.telegram.messenger.hd.M0(2131751601, null).toUpperCase());
            textView4.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView4, c8.ha.e(-2, -1, 51));
            final int i16 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gz0
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
                            int i162 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.o, true, false, false);
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
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i17);
                                t6Var2.e(t6Var2.h, t6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i18);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(788529152, 0, -1));
            textView5.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView5.setText(org.telegram.messenger.hd.M0(2131745947, null).toUpperCase());
            textView5.setTypeface(org.telegram.messenger.g0.o());
            linearLayout.addView(textView5, c8.ha.e(-2, -1, 51));
            final int i17 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gz0
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
                            int i162 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.dismiss();
                            break;
                        case 1:
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            org.telegram.ui.ActionBar.k6.x1(themeEditorView.o, true, false, false);
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
                                org.telegram.ui.ActionBar.t6 t6Var2 = (org.telegram.ui.ActionBar.t6) themeEditorView2.e.get(i172);
                                t6Var2.e(t6Var2.h, t6Var2.i[0], true);
                            }
                            ThemeEditorView.a(themeEditorView2);
                            editorAlert.L0(false);
                            break;
                        case 3:
                            ThemeEditorView themeEditorView3 = ThemeEditorView.this;
                            for (int i18 = 0; i18 < themeEditorView3.e.size(); i18++) {
                                org.telegram.ui.ActionBar.t6 t6Var3 = (org.telegram.ui.ActionBar.t6) themeEditorView3.e.get(i18);
                                t6Var3.e(org.telegram.ui.ActionBar.k6.F0(t6Var3.e), true, true);
                            }
                            ThemeEditorView.a(themeEditorView3);
                            editorAlert.L0(false);
                            break;
                        default:
                            int i19 = ThemeEditorView.EditorAlert.D1;
                            editorAlert.L0(false);
                            break;
                    }
                }
            });
        }

        public static void I0(EditorAlert editorAlert) {
            iz0 iz0Var = editorAlert.j1;
            if (iz0Var.getChildCount() <= 0 || iz0Var.getVisibility() != 0 || editorAlert.y1) {
                return;
            }
            int i7 = 0;
            View childAt = iz0Var.getChildAt(0);
            xi0 xi0Var = (xi0) iz0Var.G(childAt);
            int paddingTop = (iz0Var.getVisibility() != 0 || editorAlert.y1) ? iz0Var.getPaddingTop() : childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
            if (paddingTop <= (-org.telegram.messenger.g0.L(1.0f)) || xi0Var == null || xi0Var.b() != 0) {
                editorAlert.K0(true);
            } else {
                editorAlert.K0(false);
                i7 = paddingTop;
            }
            if (editorAlert.v1 != i7) {
                editorAlert.setScrollOffsetY(i7);
            }
        }

        public static int J0(EditorAlert editorAlert) {
            iz0 iz0Var = editorAlert.j1;
            if (iz0Var.getChildCount() == 0) {
                return -1000;
            }
            int i7 = 0;
            View childAt = iz0Var.getChildAt(0);
            xi0 xi0Var = (xi0) iz0Var.G(childAt);
            if (xi0Var == null) {
                return -1000;
            }
            int paddingTop = iz0Var.getPaddingTop();
            if (xi0Var.b() == 0 && childAt.getTop() >= 0) {
                i7 = childAt.getTop();
            }
            return paddingTop - i7;
        }

        @Override // org.telegram.ui.ActionBar.v2
        public final boolean G() {
            return false;
        }

        @Override // org.telegram.ui.ActionBar.v2
        public final void K() {
            super.K();
            uz0 uz0Var = this.m1;
            if (uz0Var.b.isFocused()) {
                org.telegram.messenger.g0.v1(uz0Var.b);
            }
        }

        public final void K0(boolean z9) {
            View[] viewArr = this.s1;
            if ((!z9 || viewArr[0].getTag() == null) && (z9 || viewArr[0].getTag() != null)) {
                return;
            }
            viewArr[0].setTag(z9 ? null : 1);
            if (z9) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.t1;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new kz0(this, z9));
            animatorSetArr[0].start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v5 */
        public final void L0(boolean z9) {
            ?? r62;
            iy iyVar = this.l1;
            View[] viewArr = this.s1;
            FrameLayout frameLayout = this.k1;
            FrameLayout frameLayout2 = this.q1;
            FrameLayout frameLayout3 = this.r1;
            oz0 oz0Var = this.i1;
            ThemeEditorView themeEditorView = ThemeEditorView.this;
            iz0 iz0Var = this.j1;
            if (z9) {
                this.y1 = true;
                oz0Var.setVisibility(0);
                frameLayout3.setVisibility(0);
                oz0Var.setAlpha(0.0f);
                frameLayout3.setAlpha(0.0f);
                this.x1 = this.v1;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(oz0Var, (Property<oz0, Float>) property, 1.0f), ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(iz0Var, (Property<iz0, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(iyVar, (Property<iy, Float>) property, 0.0f), ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", iz0Var.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(themeEditorView.k);
                animatorSet.addListener(new lz0(this));
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
            org.telegram.ui.ActionBar.k6.x1(themeEditorView.o, r62, r62, r62);
            if (iz0Var.getAdapter() == this.o1) {
                org.telegram.messenger.g0.v1(getCurrentFocus());
            }
            this.y1 = true;
            iz0Var.setVisibility(r62);
            frameLayout2.setVisibility(r62);
            this.m1.setVisibility(r62);
            iz0Var.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r62] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oz0Var, (Property<oz0, Float>) property2, fArr);
            float[] fArr2 = new float[1];
            fArr2[r62] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, fArr2);
            float[] fArr3 = new float[1];
            fArr3[r62] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iz0Var, (Property<iz0, Float>) property2, fArr3);
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
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(iyVar, (Property<iy, Float>) property2, fArr6);
            float[] fArr7 = new float[1];
            fArr7[c10] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, fArr7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollOffsetY", this.x1);
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
            animatorSet2.addListener(new mz0(this));
            animatorSet2.start();
            iz0Var.getAdapter().g(themeEditorView.f);
        }

        public int getScrollOffsetY() {
            return this.v1;
        }

        public void setScrollOffsetY(int i7) {
            this.v1 = i7;
            this.j1.setTopGlowOffset(i7);
            this.k1.setTranslationY(this.v1);
            this.i1.setTranslationY(this.v1);
            this.l1.setTranslationY(this.v1);
            this.b.invalidate();
        }
    }

    public static void a(ThemeEditorView themeEditorView) {
        if (themeEditorView.a) {
            return;
        }
        themeEditorView.a = true;
        org.telegram.messenger.g0.h3(themeEditorView.b);
    }

    public static int c(float f10, int i7, int i10, boolean z9) {
        int i11;
        if (z9) {
            i11 = org.telegram.messenger.g0.q.x;
        } else {
            i11 = org.telegram.messenger.g0.q.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int L = i7 == 0 ? org.telegram.messenger.g0.L(10.0f) : i7 == 1 ? (i11 - i10) - org.telegram.messenger.g0.L(10.0f) : Math.round((r0 - org.telegram.messenger.g0.L(20.0f)) * f10) + org.telegram.messenger.g0.L(10.0f);
        return !z9 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + L : L;
    }

    public final void b() {
        dz0 dz0Var;
        this.m.getClass();
        if (this.d == null || (dz0Var = this.c) == null) {
            return;
        }
        try {
            this.j.removeViewImmediate(dz0Var);
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

    public final void d(Activity activity, org.telegram.ui.ActionBar.j6 j6Var) {
        if (p != null) {
            p.b();
        }
        this.o = j6Var;
        this.c = new dz0(this, activity);
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
            org.telegram.messenger.g0.y3(this.j, this.c, layoutParams2);
            this.j.addView(this.c, this.i);
            this.m = new a8.r7(activity, (WallpapersListActivity) null, new ez0(this));
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.c, (Property<dz0, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c, (Property<dz0, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c, (Property<dz0, Float>) View.SCALE_Y, 0.0f, 1.0f));
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
