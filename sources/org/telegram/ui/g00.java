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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g00 extends rg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public g00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return (i7 == 3 || i7 == 0 || i7 == 5 || i7 == 1) ? false : true;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.n.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        e00 e00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i7 < filtersSetupActivity.n.size() && (e00Var = (e00) filtersSetupActivity.n.get(i7)) != null) {
                return e00Var.a;
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        String str;
        long j3;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        e00 e00Var = (e00) arrayList.get(i7);
        if (e00Var == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z10 = i11 < arrayList.size() && ((e00) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.n4) view).setText(e00Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (TextUtils.isEmpty(e00Var.c)) {
                    y8Var.setText(null);
                    y8Var.setFixedSize(12);
                } else {
                    y8Var.setFixedSize(0);
                    y8Var.setText(e00Var.c);
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
                    q8Var.f(e00Var.c, filtersSetupActivity.getMessagesController().B7, z10);
                    q8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                    return;
                }
                h00 h00Var = (h00) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = e00Var.e;
                h00Var.d = z10;
                h00Var.e = tL_dialogFilterSuggested;
                h00Var.setWillNotDraw(!z10);
                h00Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                h00Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            i00 i00Var = (i00) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
            i00Var.a.l(((Object) e00Var.c) + "", false);
            i00Var.b.setImageDrawable(fqVar);
            return;
        }
        c00 c00Var = (c00) view;
        org.telegram.messenger.so soVar = e00Var.d;
        ImageView imageView = c00Var.h;
        org.telegram.ui.ActionBar.j5 j5Var = c00Var.a;
        ImageView imageView2 = c00Var.c;
        View view2 = c00Var.f;
        FiltersSetupActivity filtersSetupActivity2 = c00Var.I;
        org.telegram.messenger.so soVar2 = c00Var.y;
        int i13 = soVar2 == null ? -1 : soVar2.a;
        c00Var.y = soVar;
        int i14 = soVar == null ? -1 : soVar.a;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().B7 ? soVar.m : -1;
        if (i15 >= 0) {
            i10 = 0;
            if (soVar.m != c00Var.e) {
                int L = org.telegram.messenger.g0.L(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.j6.r8;
                c00Var.e = i15;
                ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length]));
                c00Var.e = i15;
                org.telegram.ui.ActionBar.q6.B(view2, L2, org.telegram.ui.ActionBar.q6.M(iArr[i15 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
        } else {
            i10 = 0;
        }
        if (i15 != c00Var.d) {
            ValueAnimator valueAnimator = c00Var.E;
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
                c00Var.E = ofFloat;
                ofFloat.addUpdateListener(new a3(c00Var, 11));
                c00Var.E.setInterpolator(org.telegram.ui.Components.er.h);
                c00Var.E.setDuration(340L);
                ValueAnimator valueAnimator2 = c00Var.E;
                if (i15 >= 0) {
                    max = Math.max(i10, filtersSetupActivity2.w - i7);
                    j3 = 27;
                } else {
                    j3 = 27;
                    max = Math.max(i10, i7 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j3);
                c00Var.E.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            c00Var.d = i15;
        }
        c00Var.n.setVisibility(soVar.d() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!soVar.e()) {
            int i16 = soVar.g;
            int i17 = org.telegram.messenger.np.E8;
            if ((i16 & i17) != i17) {
                if ((i16 & 1) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750791, null));
                }
                if ((soVar.g & 2) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750720, null));
                }
                if ((soVar.g & 4) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750774, null));
                }
                if ((soVar.g & 8) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750800, null));
                }
                if ((soVar.g & 16) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750801, null));
                }
                if (soVar.h.isEmpty() || !soVar.i.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.G(soVar.i.size() + soVar.h.size(), "Exception", new Object[0]));
                }
                if (sb2.length() != 0) {
                    str = null;
                    sb2.append(org.telegram.messenger.hd.M0(2131750726, null));
                } else {
                    str = null;
                }
                String str2 = soVar.b;
                if (soVar.e()) {
                    str2 = org.telegram.messenger.hd.M0(2131750807, str);
                }
                if (!z12) {
                    c00Var.x = c00Var.y.p ? 1.0f : 0.0f;
                }
                Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(str2, j5Var.getPaint().getFontMetricsInt(), false, null, 0), soVar.c, j5Var.getPaint().getFontMetricsInt(), false);
                j5Var.setEmojiCacheType(!soVar.n ? 26 : 0);
                j5Var.l(B5, false);
                c00Var.b.setText(sb2);
                c00Var.w = z10;
                if (soVar.e()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                c00Var.invalidate();
            }
        }
        sb2.append(org.telegram.messenger.hd.M0(2131750807, null));
        if (soVar.h.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(org.telegram.messenger.hd.G(soVar.i.size() + soVar.h.size(), "Exception", new Object[0]));
        if (sb2.length() != 0) {
        }
        String str22 = soVar.b;
        if (soVar.e()) {
        }
        if (!z12) {
        }
        Spannable B52 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(str22, j5Var.getPaint().getFontMetricsInt(), false, null, 0), soVar.c, j5Var.getPaint().getFontMetricsInt(), false);
        j5Var.setEmojiCacheType(!soVar.n ? 26 : 0);
        j5Var.l(B52, false);
        c00Var.b.setText(sb2);
        c00Var.w = z10;
        if (soVar.e()) {
        }
        c00Var.invalidate();
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.n4(context);
        } else if (i7 != 1) {
            int i10 = 6;
            if (i7 != 2) {
                if (i7 == 3) {
                    frameLayout = new org.telegram.ui.Cells.y8(context);
                } else if (i7 == 4) {
                    i00 i00Var = new i00(context);
                    org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                    i00Var.a = j5Var;
                    j5Var.setTextSize(16);
                    j5Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                    int i11 = org.telegram.ui.ActionBar.j6.o6;
                    org.telegram.ui.ActionBar.q6.X(j5Var, i11, null);
                    j5Var.setTag(Integer.valueOf(i11));
                    i00Var.addView(j5Var);
                    ImageView imageView = new ImageView(context);
                    i00Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    i00Var.addView(imageView);
                    frameLayout = i00Var;
                } else if (i7 != 6) {
                    h00 h00Var = new h00(context);
                    TextView textView = new TextView(context);
                    h00Var.a = textView;
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                    org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                    h00Var.addView(textView, c8.ja.d(-2, -2.0f, org.telegram.messenger.hd.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    h00Var.b = textView2;
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.z6, null);
                    org.telegram.messenger.i20.p(textView2, 1, 13.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                    h00Var.addView(textView2, c8.ja.d(-2, -2.0f, org.telegram.messenger.hd.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(context);
                    h00Var.c = dg0Var;
                    dg0Var.setText(org.telegram.messenger.hd.M0(2131754486, null));
                    org.telegram.ui.ActionBar.q6.U(dg0Var, org.telegram.ui.ActionBar.j6.Ji, null);
                    dg0Var.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ei, false));
                    int i12 = org.telegram.ui.ActionBar.j6.Fi;
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, i12, false);
                    org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
                    dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 14.0f));
                    Drawable background = dg0Var.getBackground();
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
                    dg0Var.setBackground(background);
                    org.telegram.ui.ActionBar.q6.j(dg0Var, background, M, null, null);
                    h00Var.addView(dg0Var, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    h00Var.setAddOnClickListener(new org.telegram.ui.Components.vv0(21, this, h00Var));
                    frameLayout = h00Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.q8(context);
                }
            } else {
                c00 c00Var = new c00(this.e, context);
                c00Var.setOnReorderButtonTouchListener(new hi.p1(i10, this, c00Var));
                c00Var.setOnOptionsClick(new a(this, 27));
                frameLayout = c00Var;
            }
        } else {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131751715, new Object[0]));
            d00 d00Var = new d00(context);
            org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
            d00Var.a = fh0Var;
            fh0Var.f(R.raw.filters, 90, 90, null);
            fh0Var.setScaleType(ImageView.ScaleType.CENTER);
            fh0Var.d();
            fh0Var.setImportantForAccessibility(2);
            d00Var.addView(fh0Var, c8.ja.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            fh0Var.setOnClickListener(new a(d00Var, 26));
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.B6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(X2);
            d00Var.addView(textView3, c8.ja.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = d00Var;
        }
        return new org.telegram.ui.Components.cj0(frameLayout);
    }
}
