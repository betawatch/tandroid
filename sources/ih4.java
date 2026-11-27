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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ih4 extends la {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public ih4(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return (i == 3 || i == 0 || i == 5 || i == 1) ? false : true;
    }

    @Override // j79
    public final int b() {
        return this.e.n.size();
    }

    @Override // j79
    public final int d(int i) {
        gh4 gh4Var;
        ArrayList arrayList = this.e.n;
        if (i < 0 || i >= arrayList.size() || (gh4Var = (gh4) arrayList.get(i)) == null) {
            return 3;
        }
        return gh4Var.a;
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
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        char c;
        boolean z;
        String str;
        boolean d;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        gh4 gh4Var = (gh4) arrayList.get(i);
        if (gh4Var != null) {
            int i2 = i + 1;
            boolean z2 = i2 < arrayList.size() && ((gh4) arrayList.get(i2)).a != 3;
            boolean z3 = i2 >= arrayList.size();
            int i3 = f89Var.f;
            View view = f89Var.a;
            if (i3 == 0) {
                ((mf5) view).setText(gh4Var.c);
                return;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    ilb ilbVar = (ilb) view;
                    if (TextUtils.isEmpty(gh4Var.c)) {
                        ilbVar.setText(null);
                        ilbVar.setFixedSize(12);
                    } else {
                        ilbVar.setFixedSize(0);
                        ilbVar.setText(gh4Var.c);
                    }
                    ilbVar.setBottomPadding(z3 ? 32 : 17);
                    return;
                }
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 != 6) {
                            return;
                        }
                        wkb wkbVar = (wkb) view;
                        wkbVar.f(gh4Var.c, filtersSetupActivity.getMessagesController().l4, z2);
                        wkbVar.setCheckBoxIcon(filtersSetupActivity.getUserConfig().p() ? (byte) 0 : (byte) 2131232529);
                        return;
                    }
                    jh4 jh4Var = (jh4) view;
                    TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = gh4Var.e;
                    jh4Var.d = z2;
                    jh4Var.e = tL_dialogFilterSuggested;
                    jh4Var.setWillNotDraw(!z2);
                    jh4Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                    jh4Var.b.setText(tL_dialogFilterSuggested.description);
                    return;
                }
                kh4 kh4Var = (kh4) view;
                Context context = this.d;
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int w0 = aob.w0(null, aob.N6, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(w0, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.k7, false), mode));
                zm2 zm2Var = new zm2(drawable, drawable2);
                kh4Var.a.l(((Object) gh4Var.c) + "", false);
                kh4Var.b.setImageDrawable(zm2Var);
                return;
            }
            eh4 eh4Var = (eh4) view;
            ac7 ac7Var = gh4Var.d;
            ImageView imageView = eh4Var.c;
            ema emaVar = eh4Var.a;
            View view2 = eh4Var.f;
            FiltersSetupActivity filtersSetupActivity2 = eh4Var.I;
            ac7 ac7Var2 = eh4Var.y;
            int i4 = ac7Var2 == null ? -1 : ac7Var2.a;
            eh4Var.y = ac7Var;
            int i5 = ac7Var == null ? -1 : ac7Var.a;
            if (i4 != i5) {
                z = true;
                c = 1;
            } else {
                c = 1;
                z = false;
            }
            int i6 = filtersSetupActivity2.getMessagesController().l4 ? ac7Var.m : -1;
            if (i6 >= 0 && ac7Var.m != eh4Var.e) {
                int L = hl.L(22.0f);
                int[] iArr = aob.r8;
                eh4Var.e = i6;
                ShapeDrawable K = aob.K(L, filtersSetupActivity2.getThemedColor(iArr[i6 % iArr.length]));
                eh4Var.e = i6;
                yob.B(view2, K, yob.M(iArr[i6 % iArr.length]), filtersSetupActivity2.getResourceProvider());
            }
            if (i6 != eh4Var.d) {
                ValueAnimator valueAnimator = eh4Var.E;
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
                    eh4Var.E = ofFloat;
                    ofFloat.addUpdateListener(new ch4(eh4Var, r10));
                    eh4Var.E.setInterpolator(k43.h);
                    eh4Var.E.setDuration(340L);
                    eh4Var.E.setStartDelay((i6 >= 0 ? Math.max(0, filtersSetupActivity2.w - i) : Math.max(0, i - filtersSetupActivity2.s)) * 27);
                    eh4Var.E.start();
                } else {
                    imageView.setScaleX(i6 >= 0 ? 0.5f : 1.0f);
                    imageView.setScaleY(i6 >= 0 ? 0.5f : 1.0f);
                    imageView.setAlpha(i6 >= 0 ? 0.0f : 1.0f);
                    view2.setScaleX(i6 >= 0 ? 1.0f : 0.5f);
                    view2.setScaleY(i6 >= 0 ? 1.0f : 0.5f);
                    view2.setAlpha(i6 >= 0 ? 1.0f : 0.0f);
                }
                eh4Var.d = i6;
            }
            eh4Var.n.setVisibility(ac7Var.c() ? 0 : 8);
            StringBuilder sb = new StringBuilder();
            if (!ac7Var.d()) {
                int i7 = ac7Var.g;
                int i8 = uc7.s5;
                if ((i7 & i8) != i8) {
                    if ((i7 & 1) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(ob6.M0(2131750756, null));
                    }
                    if ((ac7Var.g & 2) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(ob6.M0(2131750683, null));
                    }
                    if ((ac7Var.g & 4) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(ob6.M0(2131750739, null));
                    }
                    if ((ac7Var.g & 8) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(ob6.M0(2131750765, null));
                    }
                    if ((ac7Var.g & 16) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(ob6.M0(2131750766, null));
                    }
                    if (ac7Var.h.isEmpty() || !ac7Var.i.isEmpty()) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(ob6.G(ac7Var.i.size() + ac7Var.h.size(), "Exception", new Object[0]));
                    }
                    if (sb.length() != 0) {
                        str = null;
                        sb.append(ob6.M0(2131750691, null));
                    } else {
                        str = null;
                    }
                    String str2 = ac7Var.b;
                    if (ac7Var.d()) {
                        str2 = ob6.M0(2131750772, str);
                    }
                    if (!z) {
                        eh4Var.x = eh4Var.y.p ? 1.0f : 0.0f;
                    }
                    Spannable A5 = r47.A5(c00.f(emaVar, str2, false, null, 0), ac7Var.c, emaVar.getPaint().getFontMetricsInt(), false);
                    emaVar.setEmojiCacheType(!ac7Var.n ? 26 : 0);
                    emaVar.l(A5, false);
                    eh4Var.b.setText(sb);
                    eh4Var.w = z2;
                    d = ac7Var.d();
                    ImageView imageView2 = eh4Var.h;
                    if (d) {
                        imageView2.setVisibility(0);
                    } else {
                        imageView2.setVisibility(8);
                    }
                    eh4Var.invalidate();
                }
            }
            sb.append(ob6.M0(2131750772, null));
            if (ac7Var.h.isEmpty()) {
            }
            if (sb.length() != 0) {
            }
            sb.append(ob6.G(ac7Var.i.size() + ac7Var.h.size(), "Exception", new Object[0]));
            if (sb.length() != 0) {
            }
            String str22 = ac7Var.b;
            if (ac7Var.d()) {
            }
            if (!z) {
            }
            Spannable A52 = r47.A5(c00.f(emaVar, str22, false, null, 0), ac7Var.c, emaVar.getPaint().getFontMetricsInt(), false);
            emaVar.setEmojiCacheType(!ac7Var.n ? 26 : 0);
            emaVar.l(A52, false);
            eh4Var.b.setText(sb);
            eh4Var.w = z2;
            d = ac7Var.d();
            ImageView imageView22 = eh4Var.h;
            if (d) {
            }
            eh4Var.invalidate();
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i == 0) {
            frameLayout = new mf5(context);
        } else if (i != 1) {
            if (i == 2) {
                eh4 eh4Var = new eh4(this.e, context);
                eh4Var.setOnReorderButtonTouchListener(new g8(this, eh4Var, r8));
                eh4Var.setOnOptionsClick(new mh3(this, (byte) 18));
                frameLayout = eh4Var;
            } else if (i == 3) {
                frameLayout = new ilb(context);
            } else if (i == 4) {
                kh4 kh4Var = new kh4(context);
                ema emaVar = new ema(context);
                kh4Var.a = emaVar;
                emaVar.setTextSize(16);
                emaVar.setGravity(ob6.a0 ? (byte) 5 : (byte) 3);
                int i2 = aob.o6;
                yob.W(emaVar, i2, null);
                emaVar.setTag(Integer.valueOf(i2));
                kh4Var.addView(emaVar);
                ImageView imageView = new ImageView(context);
                kh4Var.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                kh4Var.addView(imageView);
                frameLayout = kh4Var;
            } else if (i != 6) {
                jh4 jh4Var = new jh4(context);
                TextView textView = new TextView(context);
                jh4Var.a = textView;
                yob.X(textView, aob.G6, null);
                ik8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity(ob6.a0 ? 5 : 3);
                jh4Var.addView(textView, tre.d(-2, -2.0f, ob6.a0 ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                TextView textView2 = new TextView(context);
                jh4Var.b = textView2;
                yob.X(textView2, aob.z6, null);
                ik8.w(textView2, 1, 13.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(truncateAt);
                textView2.setGravity(ob6.a0 ? 5 : 3);
                jh4Var.addView(textView2, tre.d(-2, -2.0f, ob6.a0 ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                uv8 uv8Var = new uv8(context);
                jh4Var.c = uv8Var;
                uv8Var.setText(ob6.M0(2131754479, null));
                yob.X(uv8Var, aob.Ji, null);
                uv8Var.setProgressColor(aob.w0(null, aob.Ei, false));
                int i3 = aob.Fi;
                int w0 = aob.w0(null, i3, false);
                aob.w0(null, aob.Hi, false);
                uv8Var.setBackground(rnb.e(w0, 14.0f));
                Drawable background = uv8Var.getBackground();
                uob M = yob.M(i3);
                uv8Var.setBackground(background);
                yob.j(uv8Var, background, M, null, null);
                jh4Var.addView(uv8Var, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                jh4Var.setAddOnClickListener(new je3(this, jh4Var, (byte) 12));
                frameLayout = jh4Var;
            } else {
                frameLayout = new wkb(context);
            }
        } else {
            SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, 2131751680, new Object[0]));
            fh4 fh4Var = new fh4(context);
            e29 e29Var = new e29(context);
            fh4Var.a = e29Var;
            e29Var.f(R.raw.filters, 90, 90, null);
            e29Var.setScaleType(ImageView.ScaleType.CENTER);
            e29Var.d();
            e29Var.setImportantForAccessibility(2);
            fh4Var.addView(e29Var, tre.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            e29Var.setOnClickListener(new mh3(fh4Var, (byte) 17));
            TextView textView3 = new TextView(context);
            yob.X(textView3, aob.B6, null);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(S2);
            fh4Var.addView(textView3, tre.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = fh4Var;
        }
        return new n69(frameLayout);
    }
}
