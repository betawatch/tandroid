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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c00 extends sg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public c00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return (i3 == 3 || i3 == 0 || i3 == 5 || i3 == 1) ? false : true;
    }

    @Override // u4.h0
    public final int b() {
        return this.e.n.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        a00 a00Var;
        if (i3 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i3 < filtersSetupActivity.n.size() && (a00Var = (a00) filtersSetupActivity.n.get(i3)) != null) {
                return a00Var.a;
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        String str;
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        a00 a00Var = (a00) arrayList.get(i3);
        if (a00Var == null) {
            return;
        }
        int i11 = i3 + 1;
        boolean z10 = i11 < arrayList.size() && ((a00) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.n4) view).setText(a00Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (TextUtils.isEmpty(a00Var.c)) {
                    y8Var.setText(null);
                    y8Var.setFixedSize(12);
                } else {
                    y8Var.setFixedSize(0);
                    y8Var.setText(a00Var.c);
                }
                y8Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    q8Var.f(a00Var.c, filtersSetupActivity.getMessagesController().A7, z10);
                    q8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                    return;
                }
                d00 d00Var = (d00) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = a00Var.e;
                d00Var.d = z10;
                d00Var.e = tL_dialogFilterSuggested;
                d00Var.setWillNotDraw(!z10);
                d00Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                d00Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            e00 e00Var = (e00) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k7, false), mode));
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            e00Var.a.l(((Object) a00Var.c) + "", false);
            e00Var.b.setImageDrawable(xpVar);
            return;
        }
        yz yzVar = (yz) view;
        org.telegram.messenger.mo moVar = a00Var.d;
        ImageView imageView = yzVar.h;
        org.telegram.ui.ActionBar.k5 k5Var = yzVar.a;
        ImageView imageView2 = yzVar.c;
        View view2 = yzVar.f;
        FiltersSetupActivity filtersSetupActivity2 = yzVar.I;
        org.telegram.messenger.mo moVar2 = yzVar.y;
        int i13 = moVar2 == null ? -1 : moVar2.a;
        yzVar.y = moVar;
        int i14 = moVar == null ? -1 : moVar.a;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().A7 ? moVar.m : -1;
        if (i15 >= 0) {
            i10 = 0;
            if (moVar.m != yzVar.e) {
                int L = org.telegram.messenger.g0.L(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.k6.r8;
                yzVar.e = i15;
                ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length]));
                yzVar.e = i15;
                org.telegram.ui.ActionBar.r6.C(view2, L2, org.telegram.ui.ActionBar.r6.N(iArr[i15 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
        } else {
            i10 = 0;
        }
        if (i15 != yzVar.d) {
            ValueAnimator valueAnimator = yzVar.E;
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
                yzVar.E = ofFloat;
                ofFloat.addUpdateListener(new b3(yzVar, 11));
                yzVar.E.setInterpolator(org.telegram.ui.Components.xq.h);
                yzVar.E.setDuration(340L);
                ValueAnimator valueAnimator2 = yzVar.E;
                if (i15 >= 0) {
                    max = Math.max(i10, filtersSetupActivity2.w - i3);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(i10, i3 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                yzVar.E.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            yzVar.d = i15;
        }
        yzVar.n.setVisibility(moVar.d() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!moVar.e()) {
            int i16 = moVar.g;
            int i17 = org.telegram.messenger.hp.D8;
            if ((i16 & i17) != i17) {
                if ((i16 & 1) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.bd.M0(2131750792, null));
                }
                if ((moVar.g & 2) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.bd.M0(2131750721, null));
                }
                if ((moVar.g & 4) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.bd.M0(2131750775, null));
                }
                if ((moVar.g & 8) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.bd.M0(2131750801, null));
                }
                if ((moVar.g & 16) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.bd.M0(2131750802, null));
                }
                if (moVar.h.isEmpty() || !moVar.i.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.bd.G(moVar.i.size() + moVar.h.size(), "Exception", new Object[0]));
                }
                if (sb2.length() != 0) {
                    str = null;
                    sb2.append(org.telegram.messenger.bd.M0(2131750727, null));
                } else {
                    str = null;
                }
                String str2 = moVar.b;
                if (moVar.e()) {
                    str2 = org.telegram.messenger.bd.M0(2131750808, str);
                }
                if (!z12) {
                    yzVar.x = yzVar.y.p ? 1.0f : 0.0f;
                }
                Spannable C5 = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(str2, k5Var.getPaint().getFontMetricsInt(), false, null, 0), moVar.c, k5Var.getPaint().getFontMetricsInt(), false);
                k5Var.setEmojiCacheType(!moVar.n ? 26 : 0);
                k5Var.l(C5, false);
                yzVar.b.setText(sb2);
                yzVar.w = z10;
                if (moVar.e()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                yzVar.invalidate();
            }
        }
        sb2.append(org.telegram.messenger.bd.M0(2131750808, null));
        if (moVar.h.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(org.telegram.messenger.bd.G(moVar.i.size() + moVar.h.size(), "Exception", new Object[0]));
        if (sb2.length() != 0) {
        }
        String str22 = moVar.b;
        if (moVar.e()) {
        }
        if (!z12) {
        }
        Spannable C52 = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(str22, k5Var.getPaint().getFontMetricsInt(), false, null, 0), moVar.c, k5Var.getPaint().getFontMetricsInt(), false);
        k5Var.setEmojiCacheType(!moVar.n ? 26 : 0);
        k5Var.l(C52, false);
        yzVar.b.setText(sb2);
        yzVar.w = z10;
        if (moVar.e()) {
        }
        yzVar.invalidate();
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i3 == 0) {
            frameLayout = new org.telegram.ui.Cells.n4(context);
        } else if (i3 != 1) {
            int i10 = 6;
            if (i3 != 2) {
                if (i3 == 3) {
                    frameLayout = new org.telegram.ui.Cells.y8(context);
                } else if (i3 == 4) {
                    e00 e00Var = new e00(context);
                    org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                    e00Var.a = k5Var;
                    k5Var.setTextSize(16);
                    k5Var.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                    int i11 = org.telegram.ui.ActionBar.k6.o6;
                    org.telegram.ui.ActionBar.r6.Y(k5Var, i11, null);
                    k5Var.setTag(Integer.valueOf(i11));
                    e00Var.addView(k5Var);
                    ImageView imageView = new ImageView(context);
                    e00Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    e00Var.addView(imageView);
                    frameLayout = e00Var;
                } else if (i3 != 6) {
                    d00 d00Var = new d00(context);
                    TextView textView = new TextView(context);
                    d00Var.a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                    d00Var.addView(textView, b8.mf.d(-2, -2.0f, org.telegram.messenger.bd.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    d00Var.b = textView2;
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
                    org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                    d00Var.addView(textView2, b8.mf.d(-2, -2.0f, org.telegram.messenger.bd.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(context);
                    d00Var.c = dg0Var;
                    dg0Var.setText(org.telegram.messenger.bd.M0(2131754486, null));
                    org.telegram.ui.ActionBar.r6.V(dg0Var, org.telegram.ui.ActionBar.k6.Gi, null);
                    dg0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
                    int i12 = org.telegram.ui.ActionBar.k6.Ci;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                    org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                    dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 14.0f));
                    Drawable background = dg0Var.getBackground();
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                    dg0Var.setBackground(background);
                    org.telegram.ui.ActionBar.r6.k(dg0Var, background, N, null, null);
                    d00Var.addView(dg0Var, b8.mf.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    d00Var.setAddOnClickListener(new org.telegram.ui.Components.ux0(19, this, d00Var));
                    frameLayout = d00Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.q8(context);
                }
            } else {
                yz yzVar = new yz(this.e, context);
                yzVar.setOnReorderButtonTouchListener(new gi.n1(i10, this, yzVar));
                yzVar.setOnOptionsClick(new a(this, 27));
                frameLayout = yzVar;
            }
        } else {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131751716, new Object[0]));
            zz zzVar = new zz(context);
            org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
            zzVar.a = fh0Var;
            fh0Var.f(R.raw.filters, 90, 90, null);
            fh0Var.setScaleType(ImageView.ScaleType.CENTER);
            fh0Var.d();
            fh0Var.setImportantForAccessibility(2);
            zzVar.addView(fh0Var, b8.mf.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            fh0Var.setOnClickListener(new a(zzVar, 26));
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.B6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(X2);
            zzVar.addView(textView3, b8.mf.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = zzVar;
        }
        return new org.telegram.ui.Components.bj0(frameLayout);
    }
}
