// default package

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
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lh4 extends ka {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public lh4(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return (i == 3 || i == 0 || i == 5 || i == 1) ? false : true;
    }

    @Override // y59
    public final int b() {
        return this.e.n.size();
    }

    @Override // y59
    public final int d(int i) {
        jh4 jh4Var;
        ArrayList arrayList = this.e.n;
        if (i < 0 || i >= arrayList.size() || (jh4Var = (jh4) arrayList.get(i)) == null) {
            return 3;
        }
        return jh4Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c2  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        char c;
        boolean z;
        String str;
        boolean d;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        jh4 jh4Var = (jh4) arrayList.get(i);
        if (jh4Var != null) {
            int i2 = i + 1;
            boolean z2 = i2 < arrayList.size() && ((jh4) arrayList.get(i2)).a != 3;
            boolean z3 = i2 >= arrayList.size();
            int i3 = u69Var.f;
            View view = u69Var.a;
            if (i3 == 0) {
                ((jf5) view).setText(jh4Var.c);
                return;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    njb njbVar = (njb) view;
                    if (TextUtils.isEmpty(jh4Var.c)) {
                        njbVar.setText(null);
                        njbVar.setFixedSize(12);
                    } else {
                        njbVar.setFixedSize(0);
                        njbVar.setText(jh4Var.c);
                    }
                    njbVar.setBottomPadding(z3 ? 32 : 17);
                    return;
                }
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 != 6) {
                            return;
                        }
                        bjb bjbVar = (bjb) view;
                        bjbVar.f(jh4Var.c, filtersSetupActivity.getMessagesController().m4, z2);
                        bjbVar.setCheckBoxIcon(filtersSetupActivity.getUserConfig().p() ? (byte) 0 : (byte) 2131232530);
                        return;
                    }
                    mh4 mh4Var = (mh4) view;
                    TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = jh4Var.e;
                    mh4Var.d = z2;
                    mh4Var.e = tL_dialogFilterSuggested;
                    mh4Var.setWillNotDraw(!z2);
                    mh4Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                    mh4Var.b.setText(tL_dialogFilterSuggested.description);
                    return;
                }
                nh4 nh4Var = (nh4) view;
                Context context = this.d;
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int w0 = cmb.w0(null, cmb.M6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(w0, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.j7, false), mode));
                sn2 sn2Var = new sn2(drawable, drawable2);
                nh4Var.a.l(((Object) jh4Var.c) + "", false);
                nh4Var.b.setImageDrawable(sn2Var);
                return;
            }
            hh4 hh4Var = (hh4) view;
            ub7 ub7Var = jh4Var.d;
            ImageView imageView = hh4Var.c;
            lka lkaVar = hh4Var.a;
            View view2 = hh4Var.f;
            FiltersSetupActivity filtersSetupActivity2 = hh4Var.I;
            ub7 ub7Var2 = hh4Var.y;
            int i4 = ub7Var2 == null ? -1 : ub7Var2.a;
            hh4Var.y = ub7Var;
            int i5 = ub7Var == null ? -1 : ub7Var.a;
            if (i4 != i5) {
                z = true;
                c = 1;
            } else {
                c = 1;
                z = false;
            }
            int i6 = filtersSetupActivity2.getMessagesController().m4 ? ub7Var.m : -1;
            if (i6 >= 0 && ub7Var.m != hh4Var.e) {
                int L = gm.L(22.0f);
                int[] iArr = cmb.q8;
                hh4Var.e = i6;
                ShapeDrawable K = cmb.K(L, filtersSetupActivity2.getThemedColor(iArr[i6 % iArr.length]));
                hh4Var.e = i6;
                anb.B(view2, K, anb.M(iArr[i6 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
            if (i6 != hh4Var.d) {
                ValueAnimator valueAnimator = hh4Var.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (i4 == i5) {
                    float alpha = imageView.getAlpha();
                    float f = i6 >= 0 ? 0.0f : 1.0f;
                    float[] fArr = new float[2];
                    fArr[0] = alpha;
                    fArr[c] = f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    hh4Var.E = ofFloat;
                    ofFloat.addUpdateListener(new fh4(hh4Var, r10));
                    hh4Var.E.setInterpolator(d53.h);
                    hh4Var.E.setDuration(340L);
                    hh4Var.E.setStartDelay((i6 >= 0 ? Math.max(0, filtersSetupActivity2.w - i) : Math.max(0, i - filtersSetupActivity2.s)) * 27);
                    hh4Var.E.start();
                } else {
                    imageView.setScaleX(i6 >= 0 ? 0.5f : 1.0f);
                    imageView.setScaleY(i6 >= 0 ? 0.5f : 1.0f);
                    imageView.setAlpha(i6 >= 0 ? 0.0f : 1.0f);
                    view2.setScaleX(i6 >= 0 ? 1.0f : 0.5f);
                    view2.setScaleY(i6 >= 0 ? 1.0f : 0.5f);
                    view2.setAlpha(i6 >= 0 ? 1.0f : 0.0f);
                }
                hh4Var.d = i6;
            }
            hh4Var.n.setVisibility(ub7Var.c() ? 0 : 8);
            StringBuilder sb = new StringBuilder();
            if (!ub7Var.d()) {
                int i7 = ub7Var.g;
                int i8 = oc7.t5;
                if ((i7 & i8) != i8) {
                    if ((i7 & 1) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.M0(2131750728, null));
                    }
                    if ((ub7Var.g & 2) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.M0(2131750655, null));
                    }
                    if ((ub7Var.g & 4) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.M0(2131750711, null));
                    }
                    if ((ub7Var.g & 8) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.M0(2131750737, null));
                    }
                    if ((ub7Var.g & 16) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.M0(2131750738, null));
                    }
                    if (ub7Var.h.isEmpty() || !ub7Var.i.isEmpty()) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.G(ub7Var.i.size() + ub7Var.h.size(), "Exception", new Object[0]));
                    }
                    if (sb.length() != 0) {
                        str = null;
                        sb.append(jb6.M0(2131750663, null));
                    } else {
                        str = null;
                    }
                    String str2 = ub7Var.b;
                    if (ub7Var.d()) {
                        str2 = jb6.M0(2131750744, str);
                    }
                    if (!z) {
                        hh4Var.x = hh4Var.y.p ? 1.0f : 0.0f;
                    }
                    Spannable A5 = k47.A5(b10.e(lkaVar, str2, false, null, 0), ub7Var.c, lkaVar.getPaint().getFontMetricsInt(), false);
                    lkaVar.setEmojiCacheType(!ub7Var.n ? 26 : 0);
                    lkaVar.l(A5, false);
                    hh4Var.b.setText(sb);
                    hh4Var.w = z2;
                    d = ub7Var.d();
                    ImageView imageView2 = hh4Var.h;
                    if (d) {
                        imageView2.setVisibility(0);
                    } else {
                        imageView2.setVisibility(8);
                    }
                    hh4Var.invalidate();
                }
            }
            sb.append(jb6.M0(2131750744, null));
            if (ub7Var.h.isEmpty()) {
            }
            if (sb.length() != 0) {
            }
            sb.append(jb6.G(ub7Var.i.size() + ub7Var.h.size(), "Exception", new Object[0]));
            if (sb.length() != 0) {
            }
            String str22 = ub7Var.b;
            if (ub7Var.d()) {
            }
            if (!z) {
            }
            Spannable A52 = k47.A5(b10.e(lkaVar, str22, false, null, 0), ub7Var.c, lkaVar.getPaint().getFontMetricsInt(), false);
            lkaVar.setEmojiCacheType(!ub7Var.n ? 26 : 0);
            lkaVar.l(A52, false);
            hh4Var.b.setText(sb);
            hh4Var.w = z2;
            d = ub7Var.d();
            ImageView imageView22 = hh4Var.h;
            if (d) {
            }
            hh4Var.invalidate();
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i == 0) {
            frameLayout = new jf5(context);
        } else if (i != 1) {
            if (i == 2) {
                hh4 hh4Var = new hh4(this.e, context);
                hh4Var.setOnReorderButtonTouchListener(new f8(this, hh4Var, r8));
                hh4Var.setOnOptionsClick(new sf3(this, (byte) 19));
                frameLayout = hh4Var;
            } else if (i == 3) {
                frameLayout = new njb(context);
            } else if (i == 4) {
                nh4 nh4Var = new nh4(context);
                lka lkaVar = new lka(context);
                nh4Var.a = lkaVar;
                lkaVar.setTextSize(16);
                lkaVar.setGravity(jb6.a0 ? (byte) 5 : (byte) 3);
                int i2 = cmb.n6;
                anb.W(lkaVar, i2, null);
                lkaVar.setTag(Integer.valueOf(i2));
                nh4Var.addView(lkaVar);
                ImageView imageView = new ImageView(context);
                nh4Var.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                nh4Var.addView(imageView);
                frameLayout = nh4Var;
            } else if (i != 6) {
                mh4 mh4Var = new mh4(context);
                TextView textView = new TextView(context);
                mh4Var.a = textView;
                anb.X(textView, cmb.F6, null);
                wi8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity(jb6.a0 ? 5 : 3);
                mh4Var.addView(textView, qoe.d(-2, -2.0f, jb6.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                TextView textView2 = new TextView(context);
                mh4Var.b = textView2;
                anb.X(textView2, cmb.y6, null);
                wi8.w(textView2, 1, 13.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(truncateAt);
                textView2.setGravity(jb6.a0 ? 5 : 3);
                mh4Var.addView(textView2, qoe.d(-2, -2.0f, jb6.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                mu8 mu8Var = new mu8(context);
                mh4Var.c = mu8Var;
                mu8Var.setText(jb6.M0(2131754483, null));
                anb.X(mu8Var, cmb.Ii, null);
                mu8Var.setProgressColor(cmb.w0(null, cmb.Di, false));
                int i3 = cmb.Ei;
                int w0 = cmb.w0(null, i3, false);
                cmb.w0(null, cmb.Gi, false);
                mu8Var.setBackground(ulb.e(w0, 14.0f));
                Drawable background = mu8Var.getBackground();
                wmb M = anb.M(i3);
                mu8Var.setBackground(background);
                anb.j(mu8Var, background, M, null, null);
                mh4Var.addView(mu8Var, qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                mh4Var.setAddOnClickListener(new tf3(this, mh4Var, (byte) 10));
                frameLayout = mh4Var;
            } else {
                frameLayout = new bjb(context);
            }
        } else {
            SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, 2131751652, new Object[0]));
            ih4 ih4Var = new ih4(context);
            s09 s09Var = new s09(context);
            ih4Var.a = s09Var;
            s09Var.f(R.raw.filters, 90, 90, null);
            s09Var.setScaleType(ImageView.ScaleType.CENTER);
            s09Var.d();
            s09Var.setImportantForAccessibility(2);
            ih4Var.addView(s09Var, qoe.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            s09Var.setOnClickListener(new sf3(ih4Var, (byte) 18));
            TextView textView3 = new TextView(context);
            anb.X(textView3, cmb.A6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(S2);
            ih4Var.addView(textView3, qoe.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = ih4Var;
        }
        return new b59(frameLayout);
    }
}
