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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e10 extends hg.c {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public e10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // s4.g0
    public final int b() {
        return this.e.n.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        c10 c10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (c10Var = (c10) filtersSetupActivity.n.get(i10)) != null) {
                return c10Var.a;
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        String str;
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        c10 c10Var = (c10) arrayList.get(i10);
        if (c10Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = i12 < arrayList.size() && ((c10) arrayList.get(i12)).a != 3;
        boolean z11 = i12 >= arrayList.size();
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.p4) view).setText(c10Var.c);
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (TextUtils.isEmpty(c10Var.c)) {
                    b9Var.setText(null);
                    b9Var.setFixedSize(12);
                } else {
                    b9Var.setFixedSize(0);
                    b9Var.setText(c10Var.c);
                }
                b9Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i13 != 4) {
                if (i13 != 5) {
                    if (i13 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    t8Var.f(c10Var.c, filtersSetupActivity.getMessagesController().B7, z10);
                    t8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                    return;
                }
                f10 f10Var = (f10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = c10Var.e;
                f10Var.d = z10;
                f10Var.e = tL_dialogFilterSuggested;
                f10Var.setWillNotDraw(!z10);
                f10Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                f10Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            g10 g10Var = (g10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k7, false), mode));
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(drawable, drawable2);
            g10Var.a.l(((Object) c10Var.c) + "", false);
            g10Var.b.setImageDrawable(eqVar);
            return;
        }
        a10 a10Var = (a10) view;
        org.telegram.messenger.bp bpVar = c10Var.d;
        ImageView imageView = a10Var.h;
        org.telegram.ui.ActionBar.u5 u5Var = a10Var.a;
        ImageView imageView2 = a10Var.c;
        View view2 = a10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = a10Var.H;
        org.telegram.messenger.bp bpVar2 = a10Var.y;
        int i14 = bpVar2 == null ? -1 : bpVar2.a;
        a10Var.y = bpVar;
        int i15 = bpVar == null ? -1 : bpVar.a;
        boolean z12 = i14 != i15;
        int i16 = filtersSetupActivity2.getMessagesController().B7 ? bpVar.m : -1;
        if (i16 >= 0) {
            i11 = 0;
            if (bpVar.m != a10Var.e) {
                int L = org.telegram.messenger.i0.L(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.t6.r8;
                a10Var.e = i16;
                ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, filtersSetupActivity2.getThemedColor(iArr[i16 % iArr.length]));
                a10Var.e = i16;
                org.telegram.ui.ActionBar.a7.C(view2, L2, org.telegram.ui.ActionBar.a7.N(iArr[i16 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
        } else {
            i11 = 0;
        }
        if (i16 != a10Var.d) {
            ValueAnimator valueAnimator = a10Var.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i14 == i15) {
                float alpha = imageView2.getAlpha();
                float f7 = i16 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[i11] = alpha;
                fArr[1] = f7;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                a10Var.D = ofFloat;
                ofFloat.addUpdateListener(new a3(a10Var, 11));
                a10Var.D.setInterpolator(org.telegram.ui.Components.gr.h);
                a10Var.D.setDuration(340L);
                ValueAnimator valueAnimator2 = a10Var.D;
                if (i16 >= 0) {
                    max = Math.max(i11, filtersSetupActivity2.w - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(i11, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                a10Var.D.start();
            } else {
                imageView2.setScaleX(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i16 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i16 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i16 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i16 >= 0 ? 1.0f : 0.0f);
            }
            a10Var.d = i16;
        }
        a10Var.n.setVisibility(bpVar.d() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!bpVar.e()) {
            int i17 = bpVar.g;
            int i18 = org.telegram.messenger.wp.E8;
            if ((i17 & i18) != i18) {
                if ((i17 & 1) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.dd.L0(2131750792, null));
                }
                if ((bpVar.g & 2) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.dd.L0(2131750721, null));
                }
                if ((bpVar.g & 4) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.dd.L0(2131750775, null));
                }
                if ((bpVar.g & 8) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.dd.L0(2131750801, null));
                }
                if ((bpVar.g & 16) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.dd.L0(2131750802, null));
                }
                if (bpVar.h.isEmpty() || !bpVar.i.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.dd.G(bpVar.i.size() + bpVar.h.size(), "Exception", new Object[0]));
                }
                if (sb2.length() != 0) {
                    str = null;
                    sb2.append(org.telegram.messenger.dd.L0(2131750727, null));
                } else {
                    str = null;
                }
                String str2 = bpVar.b;
                if (bpVar.e()) {
                    str2 = org.telegram.messenger.dd.L0(2131750808, str);
                }
                if (!z12) {
                    a10Var.x = a10Var.y.p ? 1.0f : 0.0f;
                }
                Spannable A5 = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(str2, u5Var.getPaint().getFontMetricsInt(), false, null, 0), bpVar.c, u5Var.getPaint().getFontMetricsInt(), false);
                u5Var.setEmojiCacheType(!bpVar.n ? 26 : 0);
                u5Var.l(A5, false);
                a10Var.b.setText(sb2);
                a10Var.w = z10;
                if (bpVar.e()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                a10Var.invalidate();
            }
        }
        sb2.append(org.telegram.messenger.dd.L0(2131750808, null));
        if (bpVar.h.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(org.telegram.messenger.dd.G(bpVar.i.size() + bpVar.h.size(), "Exception", new Object[0]));
        if (sb2.length() != 0) {
        }
        String str22 = bpVar.b;
        if (bpVar.e()) {
        }
        if (!z12) {
        }
        Spannable A52 = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(str22, u5Var.getPaint().getFontMetricsInt(), false, null, 0), bpVar.c, u5Var.getPaint().getFontMetricsInt(), false);
        u5Var.setEmojiCacheType(!bpVar.n ? 26 : 0);
        u5Var.l(A52, false);
        a10Var.b.setText(sb2);
        a10Var.w = z10;
        if (bpVar.e()) {
        }
        a10Var.invalidate();
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.p4(context);
        } else if (i10 != 1) {
            if (i10 == 2) {
                a10 a10Var = new a10(this.e, context);
                a10Var.setOnReorderButtonTouchListener(new org.telegram.ui.ActionBar.d1(r8, this, a10Var));
                a10Var.setOnOptionsClick(new a(this, 27));
                frameLayout = a10Var;
            } else if (i10 == 3) {
                frameLayout = new org.telegram.ui.Cells.b9(context);
            } else if (i10 != 4) {
                int i11 = 6;
                if (i10 != 6) {
                    f10 f10Var = new f10(context);
                    TextView textView = new TextView(context);
                    f10Var.a = textView;
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                    org.telegram.messenger.a30.o(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(org.telegram.messenger.dd.X ? 5 : 3);
                    f10Var.addView(textView, w7.b6.d(-2, -2.0f, org.telegram.messenger.dd.X ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    f10Var.b = textView2;
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, null);
                    org.telegram.messenger.a30.o(textView2, 1, 13.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(org.telegram.messenger.dd.X ? 5 : 3);
                    f10Var.addView(textView2, w7.b6.d(-2, -2.0f, org.telegram.messenger.dd.X ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
                    f10Var.c = dh0Var;
                    dh0Var.setText(org.telegram.messenger.dd.L0(2131754486, null));
                    org.telegram.ui.ActionBar.a7.V(dh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
                    dh0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
                    int i12 = org.telegram.ui.ActionBar.t6.Ci;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
                    org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
                    dh0Var.setBackground(org.telegram.ui.ActionBar.j6.e(x02, 14.0f));
                    Drawable background = dh0Var.getBackground();
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                    dh0Var.setBackground(background);
                    org.telegram.ui.ActionBar.a7.k(dh0Var, background, N, null, null);
                    f10Var.addView(dh0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    f10Var.setAddOnClickListener(new vu(i11, this, f10Var));
                    frameLayout = f10Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.t8(context);
                }
            } else {
                g10 g10Var = new g10(context);
                org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
                g10Var.a = u5Var;
                u5Var.setTextSize(16);
                u5Var.setGravity(org.telegram.messenger.dd.X ? 5 : 3);
                int i13 = org.telegram.ui.ActionBar.t6.o6;
                org.telegram.ui.ActionBar.a7.Y(u5Var, i13, null);
                u5Var.setTag(Integer.valueOf(i13));
                g10Var.addView(u5Var);
                ImageView imageView = new ImageView(context);
                g10Var.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                g10Var.addView(imageView);
                frameLayout = g10Var;
            }
        } else {
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131751716, new Object[0]));
            b10 b10Var = new b10(context);
            org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
            b10Var.a = fi0Var;
            fi0Var.f(R.raw.filters, 90, 90, null);
            fi0Var.setScaleType(ImageView.ScaleType.CENTER);
            fi0Var.d();
            fi0Var.setImportantForAccessibility(2);
            b10Var.addView(fi0Var, w7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            fi0Var.setOnClickListener(new a(b10Var, 26));
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.B6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(W2);
            b10Var.addView(textView3, w7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = b10Var;
        }
        return new org.telegram.ui.Components.dk0(frameLayout);
    }
}
