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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kf4 extends ka {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public kf4(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return (i == 3 || i == 0 || i == 5 || i == 1) ? false : true;
    }

    @Override // w39
    public final int b() {
        return this.e.n.size();
    }

    @Override // w39
    public final int d(int i) {
        hf4 hf4Var;
        ArrayList arrayList = this.e.n;
        if (i < 0 || i >= arrayList.size() || (hf4Var = (hf4) arrayList.get(i)) == null) {
            return 3;
        }
        return hf4Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c4  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        char c;
        boolean z;
        String str;
        boolean d;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        hf4 hf4Var = (hf4) arrayList.get(i);
        if (hf4Var != null) {
            int i2 = i + 1;
            boolean z2 = i2 < arrayList.size() && ((hf4) arrayList.get(i2)).a != 3;
            boolean z3 = i2 >= arrayList.size();
            int i3 = s49Var.f;
            View view = s49Var.a;
            if (i3 == 0) {
                ((ld5) view).setText(hf4Var.c);
                return;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    mhb mhbVar = (mhb) view;
                    if (TextUtils.isEmpty(hf4Var.c)) {
                        mhbVar.setText(null);
                        mhbVar.setFixedSize(12);
                    } else {
                        mhbVar.setFixedSize(0);
                        mhbVar.setText(hf4Var.c);
                    }
                    mhbVar.setBottomPadding(z3 ? 32 : 17);
                    return;
                }
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 != 6) {
                            return;
                        }
                        ahb ahbVar = (ahb) view;
                        ahbVar.f(hf4Var.c, filtersSetupActivity.getMessagesController().l4, z2);
                        ahbVar.setCheckBoxIcon(filtersSetupActivity.getUserConfig().p() ? 0 : R.drawable.permission_locked);
                        return;
                    }
                    lf4 lf4Var = (lf4) view;
                    TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = hf4Var.e;
                    lf4Var.d = z2;
                    lf4Var.e = tL_dialogFilterSuggested;
                    lf4Var.setWillNotDraw(!z2);
                    lf4Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                    lf4Var.b.setText(tL_dialogFilterSuggested.description);
                    return;
                }
                mf4 mf4Var = (mf4) view;
                Context context = this.d;
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int w0 = bkb.w0(null, bkb.M6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(w0, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.j7, false), mode));
                fm2 fm2Var = new fm2(drawable, drawable2);
                mf4Var.a.l(((Object) hf4Var.c) + "", false);
                mf4Var.b.setImageDrawable(fm2Var);
                return;
            }
            ff4 ff4Var = (ff4) view;
            t97 t97Var = hf4Var.d;
            ImageView imageView = ff4Var.c;
            jia jiaVar = ff4Var.a;
            View view2 = ff4Var.f;
            FiltersSetupActivity filtersSetupActivity2 = ff4Var.I;
            t97 t97Var2 = ff4Var.y;
            int i4 = t97Var2 == null ? -1 : t97Var2.a;
            ff4Var.y = t97Var;
            int i5 = t97Var == null ? -1 : t97Var.a;
            if (i4 != i5) {
                z = true;
                c = 1;
            } else {
                c = 1;
                z = false;
            }
            int i6 = filtersSetupActivity2.getMessagesController().l4 ? t97Var.m : -1;
            if (i6 >= 0 && t97Var.m != ff4Var.e) {
                int L = gl.L(22.0f);
                int[] iArr = bkb.q8;
                ff4Var.e = i6;
                ShapeDrawable K = bkb.K(L, filtersSetupActivity2.getThemedColor(iArr[i6 % iArr.length]));
                ff4Var.e = i6;
                zkb.B(view2, K, zkb.M(iArr[i6 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
            if (i6 != ff4Var.d) {
                ValueAnimator valueAnimator = ff4Var.E;
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
                    ff4Var.E = ofFloat;
                    ofFloat.addUpdateListener(new uz1(ff4Var, (byte) 28));
                    ff4Var.E.setInterpolator(s33.h);
                    ff4Var.E.setDuration(340L);
                    ff4Var.E.setStartDelay((i6 >= 0 ? Math.max(0, filtersSetupActivity2.w - i) : Math.max(0, i - filtersSetupActivity2.s)) * 27);
                    ff4Var.E.start();
                } else {
                    imageView.setScaleX(i6 >= 0 ? 0.5f : 1.0f);
                    imageView.setScaleY(i6 >= 0 ? 0.5f : 1.0f);
                    imageView.setAlpha(i6 >= 0 ? 0.0f : 1.0f);
                    view2.setScaleX(i6 >= 0 ? 1.0f : 0.5f);
                    view2.setScaleY(i6 >= 0 ? 1.0f : 0.5f);
                    view2.setAlpha(i6 >= 0 ? 1.0f : 0.0f);
                }
                ff4Var.d = i6;
            }
            ff4Var.n.setVisibility(t97Var.c() ? 0 : 8);
            StringBuilder sb = new StringBuilder();
            if (!t97Var.d()) {
                int i7 = t97Var.g;
                int i8 = na7.r5;
                if ((i7 & i8) != i8) {
                    if ((i7 & 1) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(k96.M0(2131750779, null));
                    }
                    if ((t97Var.g & 2) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(k96.M0(2131750706, null));
                    }
                    if ((t97Var.g & 4) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(k96.M0(2131750762, null));
                    }
                    if ((t97Var.g & 8) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(k96.M0(2131750788, null));
                    }
                    if ((t97Var.g & 16) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(k96.M0(2131750789, null));
                    }
                    if (t97Var.h.isEmpty() || !t97Var.i.isEmpty()) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(k96.G(t97Var.i.size() + t97Var.h.size(), "Exception", new Object[0]));
                    }
                    if (sb.length() != 0) {
                        str = null;
                        sb.append(k96.M0(2131750714, null));
                    } else {
                        str = null;
                    }
                    String str2 = t97Var.b;
                    if (t97Var.d()) {
                        str2 = k96.M0(2131750795, str);
                    }
                    if (!z) {
                        ff4Var.x = ff4Var.y.p ? 1.0f : 0.0f;
                    }
                    Spannable A5 = k27.A5(b00.e(jiaVar, str2, false, null, 0), t97Var.c, jiaVar.getPaint().getFontMetricsInt(), false);
                    jiaVar.setEmojiCacheType(!t97Var.n ? 26 : 0);
                    jiaVar.l(A5, false);
                    ff4Var.b.setText(sb);
                    ff4Var.w = z2;
                    d = t97Var.d();
                    ImageView imageView2 = ff4Var.h;
                    if (d) {
                        imageView2.setVisibility(0);
                    } else {
                        imageView2.setVisibility(8);
                    }
                    ff4Var.invalidate();
                }
            }
            sb.append(k96.M0(2131750795, null));
            if (t97Var.h.isEmpty()) {
            }
            if (sb.length() != 0) {
            }
            sb.append(k96.G(t97Var.i.size() + t97Var.h.size(), "Exception", new Object[0]));
            if (sb.length() != 0) {
            }
            String str22 = t97Var.b;
            if (t97Var.d()) {
            }
            if (!z) {
            }
            Spannable A52 = k27.A5(b00.e(jiaVar, str22, false, null, 0), t97Var.c, jiaVar.getPaint().getFontMetricsInt(), false);
            jiaVar.setEmojiCacheType(!t97Var.n ? 26 : 0);
            jiaVar.l(A52, false);
            ff4Var.b.setText(sb);
            ff4Var.w = z2;
            d = t97Var.d();
            ImageView imageView22 = ff4Var.h;
            if (d) {
            }
            ff4Var.invalidate();
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i == 0) {
            frameLayout = new ld5(context);
        } else if (i != 1) {
            byte b = 16;
            if (i == 2) {
                ff4 ff4Var = new ff4(this.e, context);
                ff4Var.setOnReorderButtonTouchListener(new f8(this, ff4Var, r9));
                ff4Var.setOnOptionsClick(new yj3(this, b));
                frameLayout = ff4Var;
            } else if (i == 3) {
                frameLayout = new mhb(context);
            } else if (i == 4) {
                mf4 mf4Var = new mf4(context);
                jia jiaVar = new jia(context);
                mf4Var.a = jiaVar;
                jiaVar.setTextSize(16);
                jiaVar.setGravity(k96.a0 ? (byte) 5 : (byte) 3);
                int i2 = bkb.n6;
                zkb.W(jiaVar, i2, null);
                jiaVar.setTag(Integer.valueOf(i2));
                mf4Var.addView(jiaVar);
                ImageView imageView = new ImageView(context);
                mf4Var.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                mf4Var.addView(imageView);
                frameLayout = mf4Var;
            } else if (i != 6) {
                lf4 lf4Var = new lf4(context);
                TextView textView = new TextView(context);
                lf4Var.a = textView;
                zkb.X(textView, bkb.F6, null);
                ug8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity(k96.a0 ? 5 : 3);
                lf4Var.addView(textView, nme.d(-2, -2.0f, k96.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                TextView textView2 = new TextView(context);
                lf4Var.b = textView2;
                zkb.X(textView2, bkb.y6, null);
                ug8.w(textView2, 1, 13.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(truncateAt);
                textView2.setGravity(k96.a0 ? 5 : 3);
                lf4Var.addView(textView2, nme.d(-2, -2.0f, k96.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                ls8 ls8Var = new ls8(context);
                lf4Var.c = ls8Var;
                ls8Var.setText(k96.M0(2131754483, null));
                zkb.X(ls8Var, bkb.Ii, null);
                ls8Var.setProgressColor(bkb.w0(null, bkb.Di, false));
                int i3 = bkb.Ei;
                int w0 = bkb.w0(null, i3, false);
                bkb.w0(null, bkb.Gi, false);
                ls8Var.setBackground(sjb.e(w0, 14.0f));
                Drawable background = ls8Var.getBackground();
                vkb M = zkb.M(i3);
                ls8Var.setBackground(background);
                zkb.j(ls8Var, background, M, null, null);
                lf4Var.addView(ls8Var, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                lf4Var.setAddOnClickListener(new xf3((Object) this, (Object) lf4Var, (byte) 9));
                frameLayout = lf4Var;
            } else {
                frameLayout = new ahb(context);
            }
        } else {
            SpannableStringBuilder T2 = gl.T2(k96.a0(null, null, 2131751703, new Object[0]));
            gf4 gf4Var = new gf4(context);
            ry8 ry8Var = new ry8(context);
            gf4Var.a = ry8Var;
            ry8Var.f(R.raw.filters, 90, 90, null);
            ry8Var.setScaleType(ImageView.ScaleType.CENTER);
            ry8Var.d();
            ry8Var.setImportantForAccessibility(2);
            gf4Var.addView(ry8Var, nme.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            ry8Var.setOnClickListener(new yj3(gf4Var, (byte) 15));
            TextView textView3 = new TextView(context);
            zkb.X(textView3, bkb.A6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(T2);
            gf4Var.addView(textView3, nme.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = gf4Var;
        }
        return new y29(frameLayout);
    }
}
