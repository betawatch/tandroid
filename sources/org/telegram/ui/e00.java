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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e00 extends rg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public e00(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return (i7 == 3 || i7 == 0 || i7 == 5 || i7 == 1) ? false : true;
    }

    @Override // v4.g0
    public final int b() {
        return this.e.n.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        c00 c00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i7 < filtersSetupActivity.n.size() && (c00Var = (c00) filtersSetupActivity.n.get(i7)) != null) {
                return c00Var.a;
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        String str;
        long j3;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        c00 c00Var = (c00) arrayList.get(i7);
        if (c00Var == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z9 = i11 < arrayList.size() && ((c00) arrayList.get(i11)).a != 3;
        boolean z10 = i11 >= arrayList.size();
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.n4) view).setText(c00Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (TextUtils.isEmpty(c00Var.c)) {
                    z8Var.setText(null);
                    z8Var.setFixedSize(12);
                } else {
                    z8Var.setFixedSize(0);
                    z8Var.setText(c00Var.c);
                }
                z8Var.setBottomPadding(z10 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    r8Var.f(c00Var.c, filtersSetupActivity.getMessagesController().A7, z9);
                    r8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                    return;
                }
                f00 f00Var = (f00) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = c00Var.e;
                f00Var.d = z9;
                f00Var.e = tL_dialogFilterSuggested;
                f00Var.setWillNotDraw(!z9);
                f00Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                f00Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            g00 g00Var = (g00) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k7, false), mode));
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            g00Var.a.l(((Object) c00Var.c) + "", false);
            g00Var.b.setImageDrawable(xpVar);
            return;
        }
        a00 a00Var = (a00) view;
        org.telegram.messenger.vo voVar = c00Var.d;
        ImageView imageView = a00Var.h;
        org.telegram.ui.ActionBar.k5 k5Var = a00Var.a;
        ImageView imageView2 = a00Var.c;
        View view2 = a00Var.f;
        FiltersSetupActivity filtersSetupActivity2 = a00Var.H;
        org.telegram.messenger.vo voVar2 = a00Var.y;
        int i13 = voVar2 == null ? -1 : voVar2.a;
        a00Var.y = voVar;
        int i14 = voVar == null ? -1 : voVar.a;
        boolean z11 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().A7 ? voVar.m : -1;
        if (i15 >= 0) {
            i10 = 0;
            if (voVar.m != a00Var.e) {
                int L = org.telegram.messenger.g0.L(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.k6.r8;
                a00Var.e = i15;
                ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length]));
                a00Var.e = i15;
                org.telegram.ui.ActionBar.r6.C(view2, L2, org.telegram.ui.ActionBar.r6.N(iArr[i15 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
        } else {
            i10 = 0;
        }
        if (i15 != a00Var.d) {
            ValueAnimator valueAnimator = a00Var.D;
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
                a00Var.D = ofFloat;
                ofFloat.addUpdateListener(new a3(a00Var, 11));
                a00Var.D.setInterpolator(org.telegram.ui.Components.xq.h);
                a00Var.D.setDuration(340L);
                ValueAnimator valueAnimator2 = a00Var.D;
                if (i15 >= 0) {
                    max = Math.max(i10, filtersSetupActivity2.w - i7);
                    j3 = 27;
                } else {
                    j3 = 27;
                    max = Math.max(i10, i7 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j3);
                a00Var.D.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            a00Var.d = i15;
        }
        a00Var.n.setVisibility(voVar.d() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!voVar.e()) {
            int i16 = voVar.g;
            int i17 = org.telegram.messenger.qp.D8;
            if ((i16 & i17) != i17) {
                if ((i16 & 1) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750792, null));
                }
                if ((voVar.g & 2) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750721, null));
                }
                if ((voVar.g & 4) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750775, null));
                }
                if ((voVar.g & 8) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750801, null));
                }
                if ((voVar.g & 16) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.M0(2131750802, null));
                }
                if (voVar.h.isEmpty() || !voVar.i.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.hd.G(voVar.i.size() + voVar.h.size(), "Exception", new Object[0]));
                }
                if (sb2.length() != 0) {
                    str = null;
                    sb2.append(org.telegram.messenger.hd.M0(2131750727, null));
                } else {
                    str = null;
                }
                String str2 = voVar.b;
                if (voVar.e()) {
                    str2 = org.telegram.messenger.hd.M0(2131750808, str);
                }
                if (!z11) {
                    a00Var.x = a00Var.y.p ? 1.0f : 0.0f;
                }
                Spannable C5 = org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(str2, k5Var.getPaint().getFontMetricsInt(), false, null, 0), voVar.c, k5Var.getPaint().getFontMetricsInt(), false);
                k5Var.setEmojiCacheType(!voVar.n ? 26 : 0);
                k5Var.l(C5, false);
                a00Var.b.setText(sb2);
                a00Var.w = z9;
                if (voVar.e()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                a00Var.invalidate();
            }
        }
        sb2.append(org.telegram.messenger.hd.M0(2131750808, null));
        if (voVar.h.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(org.telegram.messenger.hd.G(voVar.i.size() + voVar.h.size(), "Exception", new Object[0]));
        if (sb2.length() != 0) {
        }
        String str22 = voVar.b;
        if (voVar.e()) {
        }
        if (!z11) {
        }
        Spannable C52 = org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(str22, k5Var.getPaint().getFontMetricsInt(), false, null, 0), voVar.c, k5Var.getPaint().getFontMetricsInt(), false);
        k5Var.setEmojiCacheType(!voVar.n ? 26 : 0);
        k5Var.l(C52, false);
        a00Var.b.setText(sb2);
        a00Var.w = z9;
        if (voVar.e()) {
        }
        a00Var.invalidate();
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.n4(context);
        } else if (i7 != 1) {
            int i10 = 6;
            if (i7 != 2) {
                if (i7 == 3) {
                    frameLayout = new org.telegram.ui.Cells.z8(context);
                } else if (i7 == 4) {
                    g00 g00Var = new g00(context);
                    org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                    g00Var.a = k5Var;
                    k5Var.setTextSize(16);
                    k5Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                    int i11 = org.telegram.ui.ActionBar.k6.o6;
                    org.telegram.ui.ActionBar.r6.Y(k5Var, i11, null);
                    k5Var.setTag(Integer.valueOf(i11));
                    g00Var.addView(k5Var);
                    ImageView imageView = new ImageView(context);
                    g00Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    g00Var.addView(imageView);
                    frameLayout = g00Var;
                } else if (i7 != 6) {
                    f00 f00Var = new f00(context);
                    TextView textView = new TextView(context);
                    f00Var.a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                    f00Var.addView(textView, c8.ha.d(-2, -2.0f, org.telegram.messenger.hd.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    f00Var.b = textView2;
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
                    org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                    f00Var.addView(textView2, c8.ha.d(-2, -2.0f, org.telegram.messenger.hd.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.ag0 ag0Var = new org.telegram.ui.Components.ag0(context);
                    f00Var.c = ag0Var;
                    ag0Var.setText(org.telegram.messenger.hd.M0(2131754486, null));
                    org.telegram.ui.ActionBar.r6.V(ag0Var, org.telegram.ui.ActionBar.k6.Gi, null);
                    ag0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
                    int i12 = org.telegram.ui.ActionBar.k6.Ci;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                    org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                    ag0Var.setBackground(org.telegram.ui.ActionBar.z5.e(x02, 14.0f));
                    Drawable background = ag0Var.getBackground();
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                    ag0Var.setBackground(background);
                    org.telegram.ui.ActionBar.r6.k(ag0Var, background, N, null, null);
                    f00Var.addView(ag0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    f00Var.setAddOnClickListener(new org.telegram.ui.Components.n41(13, this, f00Var));
                    frameLayout = f00Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.r8(context);
                }
            } else {
                a00 a00Var = new a00(this.e, context);
                a00Var.setOnReorderButtonTouchListener(new fi.n1(i10, this, a00Var));
                a00Var.setOnOptionsClick(new a(this, 27));
                frameLayout = a00Var;
            }
        } else {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131751716, new Object[0]));
            b00 b00Var = new b00(context);
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
            b00Var.a = ch0Var;
            ch0Var.f(R.raw.filters, 90, 90, null);
            ch0Var.setScaleType(ImageView.ScaleType.CENTER);
            ch0Var.d();
            ch0Var.setImportantForAccessibility(2);
            b00Var.addView(ch0Var, c8.ha.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            ch0Var.setOnClickListener(new a(b00Var, 26));
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.B6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(X2);
            b00Var.addView(textView3, c8.ha.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = b00Var;
        }
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
