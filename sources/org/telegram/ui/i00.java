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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i00 extends rg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public i00(FiltersSetupActivity filtersSetupActivity, Context context) {
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
        g00 g00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i7 < filtersSetupActivity.n.size() && (g00Var = (g00) filtersSetupActivity.n.get(i7)) != null) {
                return g00Var.a;
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
        g00 g00Var = (g00) arrayList.get(i7);
        if (g00Var == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z10 = i11 < arrayList.size() && ((g00) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.o4) view).setText(g00Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (TextUtils.isEmpty(g00Var.c)) {
                    z8Var.setText(null);
                    z8Var.setFixedSize(12);
                } else {
                    z8Var.setFixedSize(0);
                    z8Var.setText(g00Var.c);
                }
                z8Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    r8Var.f(g00Var.c, filtersSetupActivity.getMessagesController().D7, z10);
                    r8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                    return;
                }
                j00 j00Var = (j00) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = g00Var.e;
                j00Var.d = z10;
                j00Var.e = tL_dialogFilterSuggested;
                j00Var.setWillNotDraw(!z10);
                j00Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                j00Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            k00 k00Var = (k00) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.k7, false), mode));
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(drawable, drawable2);
            k00Var.a.l(((Object) g00Var.c) + "", false);
            k00Var.b.setImageDrawable(lqVar);
            return;
        }
        e00 e00Var = (e00) view;
        org.telegram.messenger.ro roVar = g00Var.d;
        ImageView imageView = e00Var.h;
        org.telegram.ui.ActionBar.n5 n5Var = e00Var.a;
        ImageView imageView2 = e00Var.c;
        View view2 = e00Var.f;
        FiltersSetupActivity filtersSetupActivity2 = e00Var.I;
        org.telegram.messenger.ro roVar2 = e00Var.y;
        int i13 = roVar2 == null ? -1 : roVar2.a;
        e00Var.y = roVar;
        int i14 = roVar == null ? -1 : roVar.a;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().D7 ? roVar.m : -1;
        if (i15 >= 0) {
            i10 = 0;
            if (roVar.m != e00Var.e) {
                int L = org.telegram.messenger.g0.L(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.n6.r8;
                e00Var.e = i15;
                ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length]));
                e00Var.e = i15;
                org.telegram.ui.ActionBar.u6.B(view2, L2, org.telegram.ui.ActionBar.u6.M(iArr[i15 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
        } else {
            i10 = 0;
        }
        if (i15 != e00Var.d) {
            ValueAnimator valueAnimator = e00Var.E;
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
                e00Var.E = ofFloat;
                ofFloat.addUpdateListener(new a3(e00Var, 11));
                e00Var.E.setInterpolator(org.telegram.ui.Components.kr.h);
                e00Var.E.setDuration(340L);
                ValueAnimator valueAnimator2 = e00Var.E;
                if (i15 >= 0) {
                    max = Math.max(i10, filtersSetupActivity2.w - i7);
                    j3 = 27;
                } else {
                    j3 = 27;
                    max = Math.max(i10, i7 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j3);
                e00Var.E.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            e00Var.d = i15;
        }
        e00Var.n.setVisibility(roVar.c() ? 0 : 8);
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
                    e00Var.x = e00Var.y.p ? 1.0f : 0.0f;
                }
                Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(str2, n5Var.getPaint().getFontMetricsInt(), false, null, 0), roVar.c, n5Var.getPaint().getFontMetricsInt(), false);
                n5Var.setEmojiCacheType(!roVar.n ? 26 : 0);
                n5Var.l(B5, false);
                e00Var.b.setText(sb2);
                e00Var.w = z10;
                if (roVar.d()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                e00Var.invalidate();
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
        Spannable B52 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(str22, n5Var.getPaint().getFontMetricsInt(), false, null, 0), roVar.c, n5Var.getPaint().getFontMetricsInt(), false);
        n5Var.setEmojiCacheType(!roVar.n ? 26 : 0);
        n5Var.l(B52, false);
        e00Var.b.setText(sb2);
        e00Var.w = z10;
        if (roVar.d()) {
        }
        e00Var.invalidate();
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.o4(context);
        } else if (i7 != 1) {
            if (i7 == 2) {
                e00 e00Var = new e00(this.e, context);
                e00Var.setOnReorderButtonTouchListener(new hi.x1(r8, this, e00Var));
                e00Var.setOnOptionsClick(new a(this, 27));
                frameLayout = e00Var;
            } else if (i7 == 3) {
                frameLayout = new org.telegram.ui.Cells.z8(context);
            } else if (i7 == 4) {
                k00 k00Var = new k00(context);
                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
                k00Var.a = n5Var;
                n5Var.setTextSize(16);
                n5Var.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                int i10 = org.telegram.ui.ActionBar.n6.o6;
                org.telegram.ui.ActionBar.u6.X(n5Var, i10, null);
                n5Var.setTag(Integer.valueOf(i10));
                k00Var.addView(n5Var);
                ImageView imageView = new ImageView(context);
                k00Var.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                k00Var.addView(imageView);
                frameLayout = k00Var;
            } else if (i7 != 6) {
                j00 j00Var = new j00(context);
                TextView textView = new TextView(context);
                j00Var.a = textView;
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                org.telegram.messenger.m10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                j00Var.addView(textView, c8.na.d(-2, -2.0f, org.telegram.messenger.gd.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                TextView textView2 = new TextView(context);
                j00Var.b = textView2;
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, null);
                org.telegram.messenger.m10.q(textView2, 1, 13.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(truncateAt);
                textView2.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                j00Var.addView(textView2, c8.na.d(-2, -2.0f, org.telegram.messenger.gd.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(context);
                j00Var.c = og0Var;
                og0Var.setText(org.telegram.messenger.gd.N0(2131754483, null));
                org.telegram.ui.ActionBar.u6.U(og0Var, org.telegram.ui.ActionBar.n6.Ji, null);
                og0Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
                int i11 = org.telegram.ui.ActionBar.n6.Fi;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
                org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
                og0Var.setBackground(org.telegram.ui.ActionBar.b6.e(x02, 14.0f));
                Drawable background = og0Var.getBackground();
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                og0Var.setBackground(background);
                org.telegram.ui.ActionBar.u6.j(og0Var, background, M, null, null);
                j00Var.addView(og0Var, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                j00Var.setAddOnClickListener(new org.telegram.ui.Components.p31(15, this, j00Var));
                frameLayout = j00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.r8(context);
            }
        } else {
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131751703, new Object[0]));
            f00 f00Var = new f00(context);
            org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(context);
            f00Var.a = qh0Var;
            qh0Var.f(R.raw.filters, 90, 90, null);
            qh0Var.setScaleType(ImageView.ScaleType.CENTER);
            qh0Var.d();
            qh0Var.setImportantForAccessibility(2);
            f00Var.addView(qh0Var, c8.na.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            qh0Var.setOnClickListener(new a(f00Var, 26));
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.B6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(W2);
            f00Var.addView(textView3, c8.na.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = f00Var;
        }
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
