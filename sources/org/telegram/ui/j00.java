package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class j00 extends rg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public j00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return (i7 == 3 || i7 == 0 || i7 == 5 || i7 == 1) ? false : true;
    }

    @Override // v4.i0
    public final int b() {
        return this.e.n.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        h00 h00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i7 < filtersSetupActivity.n.size() && (h00Var = (h00) filtersSetupActivity.n.get(i7)) != null) {
                return h00Var.a;
            }
            return 3;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02dd  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String str;
        long j3;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        h00 h00Var = (h00) arrayList.get(i7);
        if (h00Var == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z10 = i11 < arrayList.size() && ((h00) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.o4) view).setText(h00Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (TextUtils.isEmpty(h00Var.c)) {
                    a9Var.setText(null);
                    a9Var.setFixedSize(12);
                } else {
                    a9Var.setFixedSize(0);
                    a9Var.setText(h00Var.c);
                }
                a9Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    s8Var.f(h00Var.c, filtersSetupActivity.getMessagesController().D7, z10);
                    s8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                    return;
                }
                k00 k00Var = (k00) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = h00Var.e;
                k00Var.d = z10;
                k00Var.e = tL_dialogFilterSuggested;
                k00Var.setWillNotDraw(!z10);
                k00Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                k00Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            l00 l00Var = (l00) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k7, false), mode));
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(drawable, drawable2);
            l00Var.a.l(((Object) h00Var.c) + "", false);
            l00Var.b.setImageDrawable(oqVar);
            return;
        }
        f00 f00Var = (f00) view;
        org.telegram.messenger.ro roVar = h00Var.d;
        ImageView imageView = f00Var.h;
        org.telegram.ui.ActionBar.m5 m5Var = f00Var.a;
        ImageView imageView2 = f00Var.c;
        View view2 = f00Var.f;
        FiltersSetupActivity filtersSetupActivity2 = f00Var.I;
        org.telegram.messenger.ro roVar2 = f00Var.y;
        int i13 = roVar2 == null ? -1 : roVar2.a;
        f00Var.y = roVar;
        int i14 = roVar == null ? -1 : roVar.a;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().D7 ? roVar.m : -1;
        if (i15 >= 0) {
            i10 = 0;
            if (roVar.m != f00Var.e) {
                int L = org.telegram.messenger.g0.L(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.m6.r8;
                f00Var.e = i15;
                ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length]));
                f00Var.e = i15;
                org.telegram.ui.ActionBar.t6.B(view2, L2, org.telegram.ui.ActionBar.t6.M(iArr[i15 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
        } else {
            i10 = 0;
        }
        if (i15 != f00Var.d) {
            ValueAnimator valueAnimator = f00Var.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i13 == i14) {
                float alpha = imageView2.getAlpha();
                float f10 = i15 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[i10] = alpha;
                fArr[1] = f10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                f00Var.E = ofFloat;
                ofFloat.addUpdateListener(new a3(f00Var, 11));
                f00Var.E.setInterpolator(org.telegram.ui.Components.nr.h);
                f00Var.E.setDuration(340L);
                ValueAnimator valueAnimator2 = f00Var.E;
                if (i15 >= 0) {
                    max = Math.max(i10, filtersSetupActivity2.w - i7);
                    j3 = 27;
                } else {
                    j3 = 27;
                    max = Math.max(i10, i7 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j3);
                f00Var.E.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            f00Var.d = i15;
        }
        f00Var.n.setVisibility(roVar.c() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!roVar.d()) {
            int i16 = roVar.g;
            int i17 = org.telegram.messenger.mp.J8;
            if ((i16 & i17) != i17) {
                if ((i16 & 1) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.gd.N0(2131750779, null));
                }
                if ((roVar.g & 2) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.gd.N0(2131750706, null));
                }
                if ((roVar.g & 4) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.gd.N0(2131750762, null));
                }
                if ((roVar.g & 8) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.gd.N0(2131750788, null));
                }
                if ((roVar.g & 16) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.gd.N0(2131750789, null));
                }
                if (roVar.h.isEmpty() || !roVar.i.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.gd.G(roVar.i.size() + roVar.h.size(), "Exception", new Object[0]));
                }
                if (sb2.length() != 0) {
                    str = null;
                    sb2.append(org.telegram.messenger.gd.N0(2131750714, null));
                } else {
                    str = null;
                }
                String str2 = roVar.b;
                if (roVar.d()) {
                    str2 = org.telegram.messenger.gd.N0(2131750795, str);
                }
                if (!z12) {
                    f00Var.x = f00Var.y.p ? 1.0f : 0.0f;
                }
                Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(str2, m5Var.getPaint().getFontMetricsInt(), false, null, 0), roVar.c, m5Var.getPaint().getFontMetricsInt(), false);
                m5Var.setEmojiCacheType(!roVar.n ? 26 : 0);
                m5Var.l(B5, false);
                f00Var.b.setText(sb2);
                f00Var.w = z10;
                if (roVar.d()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                f00Var.invalidate();
            }
        }
        sb2.append(org.telegram.messenger.gd.N0(2131750795, null));
        if (roVar.h.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(org.telegram.messenger.gd.G(roVar.i.size() + roVar.h.size(), "Exception", new Object[0]));
        if (sb2.length() != 0) {
        }
        String str22 = roVar.b;
        if (roVar.d()) {
        }
        if (!z12) {
        }
        Spannable B52 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(str22, m5Var.getPaint().getFontMetricsInt(), false, null, 0), roVar.c, m5Var.getPaint().getFontMetricsInt(), false);
        m5Var.setEmojiCacheType(!roVar.n ? 26 : 0);
        m5Var.l(B52, false);
        f00Var.b.setText(sb2);
        f00Var.w = z10;
        if (roVar.d()) {
        }
        f00Var.invalidate();
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.o4(context);
        } else if (i7 != 1) {
            if (i7 == 2) {
                f00 f00Var = new f00(this.e, context);
                f00Var.setOnReorderButtonTouchListener(new hi.p1(r8, this, f00Var));
                f00Var.setOnOptionsClick(new a(this, 27));
                frameLayout = f00Var;
            } else if (i7 == 3) {
                frameLayout = new org.telegram.ui.Cells.a9(context);
            } else if (i7 == 4) {
                l00 l00Var = new l00(context);
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                l00Var.a = m5Var;
                m5Var.setTextSize(16);
                m5Var.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                int i10 = org.telegram.ui.ActionBar.m6.o6;
                org.telegram.ui.ActionBar.t6.X(m5Var, i10, null);
                m5Var.setTag(Integer.valueOf(i10));
                l00Var.addView(m5Var);
                ImageView imageView = new ImageView(context);
                l00Var.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                l00Var.addView(imageView);
                frameLayout = l00Var;
            } else if (i7 != 6) {
                k00 k00Var = new k00(context);
                TextView textView = new TextView(context);
                k00Var.a = textView;
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                k00Var.addView(textView, c8.ma.d(-2, -2.0f, org.telegram.messenger.gd.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                TextView textView2 = new TextView(context);
                k00Var.b = textView2;
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.z6, null);
                org.telegram.messenger.n10.q(textView2, 1, 13.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(truncateAt);
                textView2.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                k00Var.addView(textView2, c8.ma.d(-2, -2.0f, org.telegram.messenger.gd.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                org.telegram.ui.Components.pg0 pg0Var = new org.telegram.ui.Components.pg0(context);
                k00Var.c = pg0Var;
                pg0Var.setText(org.telegram.messenger.gd.N0(2131754483, null));
                org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, null);
                pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
                int i11 = org.telegram.ui.ActionBar.m6.Fi;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
                org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
                pg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(x02, 14.0f));
                Drawable background = pg0Var.getBackground();
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                pg0Var.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(pg0Var, background, M, null, null);
                k00Var.addView(pg0Var, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                k00Var.setAddOnClickListener(new org.telegram.ui.Components.q31(15, this, k00Var));
                frameLayout = k00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.s8(context);
            }
        } else {
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131751703, new Object[0]));
            g00 g00Var = new g00(context);
            org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
            g00Var.a = rh0Var;
            rh0Var.f(R.raw.filters, 90, 90, null);
            rh0Var.setScaleType(ImageView.ScaleType.CENTER);
            rh0Var.d();
            rh0Var.setImportantForAccessibility(2);
            g00Var.addView(rh0Var, c8.ma.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            rh0Var.setOnClickListener(new a(g00Var, 26));
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.B6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(W2);
            g00Var.addView(textView3, c8.ma.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = g00Var;
        }
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
