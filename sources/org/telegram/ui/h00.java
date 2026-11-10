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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h00 extends rg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public h00(FiltersSetupActivity filtersSetupActivity, Context context) {
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
        f00 f00Var;
        if (i7 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i7 < filtersSetupActivity.n.size() && (f00Var = (f00) filtersSetupActivity.n.get(i7)) != null) {
                return f00Var.a;
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
        f00 f00Var = (f00) arrayList.get(i7);
        if (f00Var == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z9 = i11 < arrayList.size() && ((f00) arrayList.get(i11)).a != 3;
        boolean z10 = i11 >= arrayList.size();
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.n4) view).setText(f00Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (TextUtils.isEmpty(f00Var.c)) {
                    z8Var.setText(null);
                    z8Var.setFixedSize(12);
                } else {
                    z8Var.setFixedSize(0);
                    z8Var.setText(f00Var.c);
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
                    r8Var.f(f00Var.c, filtersSetupActivity.getMessagesController().A7, z9);
                    r8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                    return;
                }
                i00 i00Var = (i00) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = f00Var.e;
                i00Var.d = z9;
                i00Var.e = tL_dialogFilterSuggested;
                i00Var.setWillNotDraw(!z9);
                i00Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                i00Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            j00 j00Var = (j00) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k7, false), mode));
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
            j00Var.a.l(((Object) f00Var.c) + "", false);
            j00Var.b.setImageDrawable(xpVar);
            return;
        }
        d00 d00Var = (d00) view;
        org.telegram.messenger.vo voVar = f00Var.d;
        ImageView imageView = d00Var.h;
        org.telegram.ui.ActionBar.m5 m5Var = d00Var.a;
        ImageView imageView2 = d00Var.c;
        View view2 = d00Var.f;
        FiltersSetupActivity filtersSetupActivity2 = d00Var.H;
        org.telegram.messenger.vo voVar2 = d00Var.y;
        int i13 = voVar2 == null ? -1 : voVar2.a;
        d00Var.y = voVar;
        int i14 = voVar == null ? -1 : voVar.a;
        boolean z11 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().A7 ? voVar.m : -1;
        if (i15 >= 0) {
            i10 = 0;
            if (voVar.m != d00Var.e) {
                int L = org.telegram.messenger.g0.L(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.m6.r8;
                d00Var.e = i15;
                ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length]));
                d00Var.e = i15;
                org.telegram.ui.ActionBar.t6.B(view2, L2, org.telegram.ui.ActionBar.t6.M(iArr[i15 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
        } else {
            i10 = 0;
        }
        if (i15 != d00Var.d) {
            ValueAnimator valueAnimator = d00Var.D;
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
                d00Var.D = ofFloat;
                ofFloat.addUpdateListener(new a3(d00Var, 11));
                d00Var.D.setInterpolator(org.telegram.ui.Components.wq.h);
                d00Var.D.setDuration(340L);
                ValueAnimator valueAnimator2 = d00Var.D;
                if (i15 >= 0) {
                    max = Math.max(i10, filtersSetupActivity2.w - i7);
                    j3 = 27;
                } else {
                    j3 = 27;
                    max = Math.max(i10, i7 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j3);
                d00Var.D.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            d00Var.d = i15;
        }
        d00Var.n.setVisibility(voVar.d() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!voVar.e()) {
            int i16 = voVar.g;
            int i17 = org.telegram.messenger.qp.D8;
            if ((i16 & i17) != i17) {
                if ((i16 & 1) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.id.M0(2131750791, null));
                }
                if ((voVar.g & 2) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.id.M0(2131750720, null));
                }
                if ((voVar.g & 4) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.id.M0(2131750774, null));
                }
                if ((voVar.g & 8) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.id.M0(2131750800, null));
                }
                if ((voVar.g & 16) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.id.M0(2131750801, null));
                }
                if (voVar.h.isEmpty() || !voVar.i.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.id.G(voVar.i.size() + voVar.h.size(), "Exception", new Object[0]));
                }
                if (sb2.length() != 0) {
                    str = null;
                    sb2.append(org.telegram.messenger.id.M0(2131750726, null));
                } else {
                    str = null;
                }
                String str2 = voVar.b;
                if (voVar.e()) {
                    str2 = org.telegram.messenger.id.M0(2131750807, str);
                }
                if (!z11) {
                    d00Var.x = d00Var.y.p ? 1.0f : 0.0f;
                }
                Spannable B5 = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(str2, m5Var.getPaint().getFontMetricsInt(), false, null, 0), voVar.c, m5Var.getPaint().getFontMetricsInt(), false);
                m5Var.setEmojiCacheType(!voVar.n ? 26 : 0);
                m5Var.l(B5, false);
                d00Var.b.setText(sb2);
                d00Var.w = z9;
                if (voVar.e()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                d00Var.invalidate();
            }
        }
        sb2.append(org.telegram.messenger.id.M0(2131750807, null));
        if (voVar.h.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(org.telegram.messenger.id.G(voVar.i.size() + voVar.h.size(), "Exception", new Object[0]));
        if (sb2.length() != 0) {
        }
        String str22 = voVar.b;
        if (voVar.e()) {
        }
        if (!z11) {
        }
        Spannable B52 = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(str22, m5Var.getPaint().getFontMetricsInt(), false, null, 0), voVar.c, m5Var.getPaint().getFontMetricsInt(), false);
        m5Var.setEmojiCacheType(!voVar.n ? 26 : 0);
        m5Var.l(B52, false);
        d00Var.b.setText(sb2);
        d00Var.w = z9;
        if (voVar.e()) {
        }
        d00Var.invalidate();
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
                    j00 j00Var = new j00(context);
                    org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                    j00Var.a = m5Var;
                    m5Var.setTextSize(16);
                    m5Var.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
                    int i11 = org.telegram.ui.ActionBar.m6.o6;
                    org.telegram.ui.ActionBar.t6.X(m5Var, i11, null);
                    m5Var.setTag(Integer.valueOf(i11));
                    j00Var.addView(m5Var);
                    ImageView imageView = new ImageView(context);
                    j00Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    j00Var.addView(imageView);
                    frameLayout = j00Var;
                } else if (i7 != 6) {
                    i00 i00Var = new i00(context);
                    TextView textView = new TextView(context);
                    i00Var.a = textView;
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
                    i00Var.addView(textView, c8.ha.d(-2, -2.0f, org.telegram.messenger.id.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    i00Var.b = textView2;
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.z6, null);
                    org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
                    i00Var.addView(textView2, c8.ha.d(-2, -2.0f, org.telegram.messenger.id.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.ag0 ag0Var = new org.telegram.ui.Components.ag0(context);
                    i00Var.c = ag0Var;
                    ag0Var.setText(org.telegram.messenger.id.M0(2131754486, null));
                    org.telegram.ui.ActionBar.t6.U(ag0Var, org.telegram.ui.ActionBar.m6.Gi, null);
                    ag0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bi, false));
                    int i12 = org.telegram.ui.ActionBar.m6.Ci;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
                    org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false);
                    ag0Var.setBackground(org.telegram.ui.ActionBar.b6.e(x02, 14.0f));
                    Drawable background = ag0Var.getBackground();
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
                    ag0Var.setBackground(background);
                    org.telegram.ui.ActionBar.t6.j(ag0Var, background, M, null, null);
                    i00Var.addView(ag0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    i00Var.setAddOnClickListener(new org.telegram.ui.Components.u41(13, this, i00Var));
                    frameLayout = i00Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.r8(context);
                }
            } else {
                d00 d00Var = new d00(this.e, context);
                d00Var.setOnReorderButtonTouchListener(new fi.n1(i10, this, d00Var));
                d00Var.setOnOptionsClick(new a(this, 27));
                frameLayout = d00Var;
            }
        } else {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131751715, new Object[0]));
            e00 e00Var = new e00(context);
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
            e00Var.a = ch0Var;
            ch0Var.f(R.raw.filters, 90, 90, null);
            ch0Var.setScaleType(ImageView.ScaleType.CENTER);
            ch0Var.d();
            ch0Var.setImportantForAccessibility(2);
            e00Var.addView(ch0Var, c8.ha.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            ch0Var.setOnClickListener(new a(e00Var, 26));
            TextView textView3 = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.B6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(X2);
            e00Var.addView(textView3, c8.ha.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = e00Var;
        }
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
